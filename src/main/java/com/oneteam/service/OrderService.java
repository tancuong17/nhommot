package com.oneteam.service;

import java.util.List;

import com.oneteam.model.DonHang;

public interface OrderService {
	public List<DonHang> getAllOrder();
	public List<DonHang> getAllBill();
	public int getQuantityOrder();
	public int getQuantityBill();
}
