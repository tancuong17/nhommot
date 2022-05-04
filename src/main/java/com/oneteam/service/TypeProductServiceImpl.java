package com.oneteam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneteam.dao.TypeProductDAO;
import com.oneteam.model.LoaiSanPham;

@Service
public class TypeProductServiceImpl implements TypeProductService{
	@Autowired
	private TypeProductDAO typeProductDAO;
	@Transactional
	public boolean addTypeProduct(LoaiSanPham loaiSanPham) {
		return typeProductDAO.addTypeProduct(loaiSanPham);
	}
	@Transactional
	public List<LoaiSanPham> getAllTypeProduct() {
		return typeProductDAO.getAllTypeProduct();
	}
}
