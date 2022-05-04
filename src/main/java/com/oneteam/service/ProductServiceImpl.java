package com.oneteam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneteam.dao.ProductDAO;
import com.oneteam.model.SanPham;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDAO productDAO;
	@Transactional
	public List<SanPham> getAllProduct() {
		return productDAO.getAllProduct();
	}
	@Transactional
	public boolean addProduct(SanPham sanPham) {
		return productDAO.addProduct(sanPham);
	}
	@Transactional
	public int getQuantityProduct() {
		return productDAO.getQuantityProduct();
	}
	
}
