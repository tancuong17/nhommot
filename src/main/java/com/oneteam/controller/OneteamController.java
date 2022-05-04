package com.oneteam.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.imgix.URLBuilder;
import com.oneteam.model.DonHang;
import com.oneteam.model.LoaiSanPham;
import com.oneteam.model.SanPham;
import com.oneteam.service.CustomerService;
import com.oneteam.service.OrderService;
import com.oneteam.service.ProductService;
import com.oneteam.service.TypeProductService;


@Controller
public class OneteamController {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private ProductService productService;
	@Autowired
	private TypeProductService typeProductService;
	@GetMapping("/")
	public String mainPage(ModelMap modelMap) {
		List<LoaiSanPham> list = typeProductService.getAllTypeProduct();
		List<SanPham> dsSanPham = productService.getAllProduct();
		List<DonHang> dsDonHang = orderService.getAllOrder();
		List<Object[]> dsKhachHang = customerService.getAllCustomer();
		List<DonHang> dsHoaDon = orderService.getAllBill();
		int countOrder = orderService.getQuantityOrder();
		int countBill = orderService.getQuantityBill();
		int countProduct = productService.getQuantityProduct();
		int countCustomer = customerService.getCountCustomer();
	    modelMap.addAttribute("listTypeProduct", list);
	    modelMap.addAttribute("listProduct", dsSanPham);
	    modelMap.addAttribute("listOrder", dsDonHang);
	    modelMap.addAttribute("listBill", dsHoaDon);
	    modelMap.addAttribute("listCustomer", dsKhachHang);
	    modelMap.addAttribute("countOrder", countOrder);
	    modelMap.addAttribute("countBill", countBill);
	    modelMap.addAttribute("countProduct", countProduct);
	    modelMap.addAttribute("countCustomer", countCustomer);
	    System.out.println(countOrder);
		return "index";
	}
	@RequestMapping(value="/addTypeProduct",method=RequestMethod.POST) 
	public String typeProductPage(@RequestParam("tenLoai")String tenLoai) {
		LoaiSanPham loaiSanPham = new LoaiSanPham();
		loaiSanPham.setTenLoai(tenLoai);
		typeProductService.addTypeProduct(loaiSanPham);
		return "redirect:/";
	}
	@GetMapping("/uploadForm")
	public ModelAndView uploadPage() {
		return new ModelAndView("uploadForm");
	}
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)  
	public String uploadFile(@RequestParam("ten")String ten,@RequestParam("gia")Double gia, 
			@RequestParam("soLuong")Integer soLuong, @RequestParam("moTa")String moTa, @RequestParam("khuyenMai")String khuyenMai,
			@RequestParam("maLoai")Integer loai,@RequestParam CommonsMultipartFile file, HttpServletRequest request) throws IOException{
		String path = request.getServletContext().getRealPath("/images");  
	    String filename = file.getOriginalFilename();          
	    byte[] bytes = file.getBytes();  
	    BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(  
	         new File(path + File.separator + filename))); 
	    System.out.println(path + "" + filename);
	    stream.write(bytes);  
	    stream.flush();  
	    stream.close();
	    SanPham sanPham = new SanPham();
	    sanPham.setTen(ten);
	    sanPham.setGia(gia);
	    sanPham.setMaLoai(new LoaiSanPham(loai));
	    sanPham.setSoLuong(soLuong);
	    sanPham.setMoTa(moTa);
	    sanPham.setKhuyenMai(khuyenMai);
	    productService.addProduct(sanPham);
	    URLBuilder builder = new URLBuilder("demos.imgix.net");
        builder.setUseHttps(false); // use http
        Map<String, String> params = new HashMap<String, String>();
        params.put("w", "100");
        params.put("h", "100");
        System.out.println(builder.createURL(filename, params));
        sanPham.setHinhAnh(builder.createURL(filename, params));
	    return "redirect:/";  
	}
}
