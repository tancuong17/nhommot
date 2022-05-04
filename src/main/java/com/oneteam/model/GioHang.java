package com.oneteam.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(GioHangPK.class)
@Table(name = "GioHang")
public class GioHang {
	@Id
	private String maGioHang;
	public String getMaGioHang() {
		return maGioHang;
	}
	public void setMaGioHang(String maGioHang) {
		this.maGioHang = maGioHang;
	}
	public GioHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GioHang(String maGioHang) {
		super();
		this.maGioHang = maGioHang;
	}
	@Override
	public String toString() {
		return "GioHang [maGioHang=" + maGioHang + "]";
	}
}
