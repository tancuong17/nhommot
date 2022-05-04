package com.oneteam.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oneteam.model.SanPham;

@Repository
public class ProductDAOImpl implements ProductDAO{
	@Autowired
	private SessionFactory sessionFactory;
	public List<SanPham> getAllProduct() {
		Session session = sessionFactory.getCurrentSession();
		List<SanPham> list = session.createQuery("from SanPham", SanPham.class).getResultList();
		return list;
	}
	public boolean addProduct(SanPham sanPham) {
		Session session = sessionFactory.getCurrentSession();
		session.save(sanPham);
		return true;
	}
	public int getQuantityProduct() {
		Session session = sessionFactory.getCurrentSession();
		int count = (Integer) session.createNativeQuery("select count(*) from SanPham").uniqueResult();
		return count;
	}
}
