package com.oneteam.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ChiTietDonHangPK implements Serializable{
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name = "maDonHang")
	private DonHang maDonHang;
	@ManyToOne
	@JoinColumn(name = "maSanPham")
	private SanPham maSanPham;
	public DonHang getMaDonHang() {
		return maDonHang;
	}
	public void setMaDonHang(DonHang maDonHang) {
		this.maDonHang = maDonHang;
	}
	public SanPham getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(SanPham maSanPham) {
		this.maSanPham = maSanPham;
	}
}
