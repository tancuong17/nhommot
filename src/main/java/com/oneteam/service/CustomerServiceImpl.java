package com.oneteam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oneteam.dao.CustomerDAO;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerDAO customerDAO;
	@Transactional
	public List<Object[]> getAllCustomer() {
		return customerDAO.getAllCustomer();
	}
	@Transactional
	public int getCountCustomer() {
		return customerDAO.getCountCustomer();
	}
}
