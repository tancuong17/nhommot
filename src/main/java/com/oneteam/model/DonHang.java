package com.oneteam.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DonHang")
public class DonHang implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maDonHang;
	private Date ngayDat;
	private Date ngayGiao;
	private double tongTien;
	private int trangThai;
	private int thanhToan;
	@ManyToOne
	@JoinColumn(name = "ma")
	private KhachHang maKhachHang;
	public int getMaDonHang() {
		return maDonHang;
	}
	public void setMaDonHang(int maDonHang) {
		this.maDonHang = maDonHang;
	}
	public Date getNgayDat() {
		return ngayDat;
	}
	public void setNgayDat(Date ngayDat) {
		this.ngayDat = ngayDat;
	}
	public Date getNgayGiao() {
		return ngayGiao;
	}
	public void setNgayGiao(Date ngayGiao) {
		this.ngayGiao = ngayGiao;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	public int getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	public int getThanhToan() {
		return thanhToan;
	}
	public void setThanhToan(int thanhToan) {
		this.thanhToan = thanhToan;
	}
	public KhachHang getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(KhachHang maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public DonHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DonHang(int maDonHang) {
		super();
		this.maDonHang = maDonHang;
	}
	public DonHang(int ma, Date ngayDat, Date ngayGiao, double tongTien, int trangThai, int thanhToan,
			KhachHang maKhachHang) {
		super();
		this.maDonHang = ma;
		this.ngayDat = ngayDat;
		this.ngayGiao = ngayGiao;
		this.tongTien = tongTien;
		this.trangThai = trangThai;
		this.thanhToan = thanhToan;
		this.maKhachHang = maKhachHang;
	}
	@Override
	public String toString() {
		return "DonHang [ma=" + maDonHang + ", ngayDat=" + ngayDat + ", ngayGiao=" + ngayGiao + ", tongTien=" + tongTien
				+ ", trangThai=" + trangThai + ", thanhToan=" + thanhToan + ", maKhachHang=" + maKhachHang + "]";
	}
}
