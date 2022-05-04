package com.oneteam.dao;

import java.util.List;

import com.oneteam.model.LoaiSanPham;

public interface TypeProductDAO {
	public boolean addTypeProduct(LoaiSanPham loaiSanPham);
	public List<LoaiSanPham> getAllTypeProduct();
}
