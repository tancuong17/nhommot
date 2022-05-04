package com.oneteam.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(ChiTietGioHangPK.class)
@Table(name = "ChiTietGioHang")
public class ChiTietGioHang {
	@Id
	private String maGioHang;
	@Id
	private int maSanPham;
	private int soLuong;
	public String getMaGioHang() {
		return maGioHang;
	}
	public void setMaGioHang(String maGioHang) {
		this.maGioHang = maGioHang;
	}
	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public ChiTietGioHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChiTietGioHang(String maGioHang, int maSanPham, int soLuong) {
		super();
		this.maGioHang = maGioHang;
		this.maSanPham = maSanPham;
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return "ChiTietGioHang [maGioHang=" + maGioHang + ", maSanPham=" + maSanPham + ", soLuong=" + soLuong + "]";
	}
}
