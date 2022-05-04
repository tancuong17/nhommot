package com.oneteam.dao;

import java.util.List;

import com.oneteam.model.SanPham;

public interface ProductDAO {
	public List<SanPham> getAllProduct();
	public boolean addProduct(SanPham sanPham);
	public int getQuantityProduct();
}
