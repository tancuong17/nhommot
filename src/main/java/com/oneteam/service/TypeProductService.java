package com.oneteam.service;

import java.util.List;

import com.oneteam.model.LoaiSanPham;

public interface TypeProductService {
	public boolean addTypeProduct(LoaiSanPham loaiSanPham);
	public List<LoaiSanPham> getAllTypeProduct();
}
