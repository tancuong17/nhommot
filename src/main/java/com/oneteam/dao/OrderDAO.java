package com.oneteam.dao;

import java.util.List;

import com.oneteam.model.DonHang;

public interface OrderDAO {
	public List<DonHang> getAllOrder();
	public List<DonHang> getAllBill();
	public int getQuantityOrder();
	public int getQuantityBill();
}
