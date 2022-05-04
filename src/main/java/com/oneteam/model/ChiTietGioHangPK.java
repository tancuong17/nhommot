package com.oneteam.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ChiTietGioHangPK implements Serializable{
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name = "maGioHang")
	private GioHang maGioHang;
	@ManyToOne
	@JoinColumn(name = "maSanPham")
	private SanPham maSanPham;
	public GioHang getMaGioHang() {
		return maGioHang;
	}
	public void setMaGioHang(GioHang maGioHang) {
		this.maGioHang = maGioHang;
	}
	public SanPham getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(SanPham maSanPham) {
		this.maSanPham = maSanPham;
	}
}
