package com.oneteam.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oneteam.model.LoaiSanPham;

@Repository
public class TypeProductDAOImpl implements TypeProductDAO{
	@Autowired
	private SessionFactory sessionFactory;
	public boolean addTypeProduct(LoaiSanPham loaiSanPham) {
		Session session = sessionFactory.getCurrentSession();
		session.save(loaiSanPham);
		return true;
	}
	public List<LoaiSanPham> getAllTypeProduct() {
		Session session = sessionFactory.getCurrentSession();
		List<LoaiSanPham> list = session.createQuery("from LoaiSanPham", LoaiSanPham.class).getResultList();
		return list;
	}
}
