package com.oneteam.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	@Autowired
	private SessionFactory sessionFactory;
	public List<Object[]> getAllCustomer() {
		Session session = sessionFactory.getCurrentSession();
		List<Object[]> dsKhachHang = new ArrayList<Object[]>();
		List<?> list = session.createNativeQuery("SELECT KhachHang.tenTaiKhoan, KhachHang.ten, KhachHang.sdt, SUM(ChiTietDonHang.soLuong) FROM DonHang INNER JOIN KhachHang ON DonHang.ma = KhachHang.tenTaiKhoan INNER JOIN ChiTietDonHang ON DonHang.maDonHang = ChiTietDonHang.maDonHang group by KhachHang.tenTaiKhoan, KhachHang.ten, KhachHang.sdt").getResultList();
		for (Object object : list) {
			Object[] o = (Object[]) object;
			dsKhachHang.add(o);
		}
		return dsKhachHang;
	}
	public int getCountCustomer() {
		Session session = sessionFactory.getCurrentSession();
		int count = (Integer) session.createNativeQuery("select count(*) from KhachHang").uniqueResult();
		return count;
	}
}
