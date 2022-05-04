package com.oneteam.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
public class KhachHangPK implements Serializable{
	private static final long serialVersionUID = 1L;
	@OneToOne
	@JoinColumn(name = "tenTaiKhoan")
	private User maKhachHang;
	public User getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(User maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
}
