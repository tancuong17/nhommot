package com.oneteam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oneteam.dao.OrderDAO;
import com.oneteam.model.DonHang;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderDAO orderDAO;
	@Transactional
	public List<DonHang> getAllOrder() {
		return orderDAO.getAllOrder();
	}
	@Transactional
	public int getQuantityOrder() {
		return orderDAO.getQuantityOrder();
	}
	@Transactional
	public int getQuantityBill() {
		return orderDAO.getQuantityBill();
	}
	@Transactional
	public List<DonHang> getAllBill() {
		return orderDAO.getAllBill();
	}
}
