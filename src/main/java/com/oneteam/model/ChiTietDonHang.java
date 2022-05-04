package com.oneteam.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(ChiTietDonHangPK.class)
@Table(name = "ChiTietDonHang")
public class ChiTietDonHang {
	@Id
	private int maDonHang;
	@Id
	private int maSanPham;
	private int soLuong;
	public int getMaHoaDon() {
		return maDonHang;
	}
	public void setMaHoaDon(int maHoaDon) {
		this.maDonHang = maHoaDon;
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
	public ChiTietDonHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChiTietDonHang(int maHoaDon, int maSanPham, int soLuong) {
		super();
		this.maDonHang = maHoaDon;
		this.maSanPham = maSanPham;
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return "ChiTietDonHang [maHoaDon=" + maDonHang + ", maSanPham=" + maSanPham + ", soLuong=" + soLuong + "]";
	}
}
