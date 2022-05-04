package com.oneteam.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oneteam.model.DonHang;

@Repository
public class OrderDAOimpl implements OrderDAO{
	@Autowired
	private SessionFactory sessionFactory;
	public List<DonHang> getAllOrder() {
		Session session = sessionFactory.getCurrentSession();
		List<DonHang> dsDonHang = new ArrayList<DonHang>();
		List<?> list = session.createNativeQuery("select * from DonHang where trangThai = 0").getResultList();
		for (Object object : list) {
			Object[] o = (Object[]) object;
			DonHang donHang = new DonHang(Integer.parseInt(o[0].toString()));
			dsDonHang.add(donHang);
		}
		return dsDonHang;
	}
	public int getQuantityOrder() {
		Session session = sessionFactory.getCurrentSession();
		int count = (Integer) session.createNativeQuery("select count(*) from DonHang where trangThai = 0").uniqueResult();
		return count;
	}
	public int getQuantityBill() {
		Session session = sessionFactory.getCurrentSession();
		int count = (Integer) session.createNativeQuery("select count(*) from DonHang where trangThai = 1").uniqueResult();
		return count;
	}
	public List<DonHang> getAllBill() {
		Session session = sessionFactory.getCurrentSession();
		List<DonHang> dsDonHang = new ArrayList<DonHang>();
		List<?> list = session.createNativeQuery("select * from DonHang where trangThai = 1").getResultList();
		for (Object object : list) {
			Object[] o = (Object[]) object;
			DonHang donHang = new DonHang(Integer.parseInt(o[0].toString()));
			dsDonHang.add(donHang);
		}
		return dsDonHang;
	}
}
