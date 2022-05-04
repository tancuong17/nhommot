package com.oneteam.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
public class GioHangPK implements Serializable{
	private static final long serialVersionUID = 1L;
	@OneToOne
	@JoinColumn(name = "maKhachHang")
	private KhachHang maGioHang;
	public KhachHang getMaGioHang() {
		return maGioHang;
	}
	public void setMaGioHang(KhachHang maGioHang) {
		this.maGioHang = maGioHang;
	}
}
