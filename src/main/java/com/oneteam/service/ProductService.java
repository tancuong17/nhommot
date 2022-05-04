package com.oneteam.service;

import java.util.List;

import com.oneteam.model.SanPham;

public interface ProductService {
	public List<SanPham> getAllProduct();
	public boolean addProduct(SanPham sanPham);
	public int getQuantityProduct();
}
