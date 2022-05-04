package com.oneteam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SanPham")
public class SanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maSanPham;
	@Column(columnDefinition = "nvarchar(255)")
	private String ten;
	private double gia;
	private int soLuong;
	private String hinhAnh;
	@Column(columnDefinition = "nvarchar(500)")
	private String khuyenMai;
	@Column(columnDefinition = "nvarchar(500)")
	private String moTa;
	private int danhGia;
	@ManyToOne
	@JoinColumn(name = "maLoai")
	private LoaiSanPham maLoai;
	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public String getKhuyenMai() {
		return khuyenMai;
	}
	public void setKhuyenMai(String khuyenMai) {
		this.khuyenMai = khuyenMai;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public int getDanhGia() {
		return danhGia;
	}
	public void setDanhGia(int danhGia) {
		this.danhGia = danhGia;
	}
	public LoaiSanPham getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(LoaiSanPham maLoai) {
		this.maLoai = maLoai;
	}
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SanPham(int ma, String ten, double gia, int soLuong, String hinhAnh, String khuyenMai, String moTa,
			int danhGia, LoaiSanPham maLoai) {
		super();
		this.maSanPham = ma;
		this.ten = ten;
		this.gia = gia;
		this.soLuong = soLuong;
		this.hinhAnh = hinhAnh;
		this.khuyenMai = khuyenMai;
		this.moTa = moTa;
		this.danhGia = danhGia;
		this.maLoai = maLoai;
	}
	@Override
	public String toString() {
		return "SanPham [ma=" + maSanPham + ", ten=" + ten + ", gia=" + gia + ", soLuong=" + soLuong + ", hinhAnh=" + hinhAnh
				+ ", khuyenMai=" + khuyenMai + ", moTa=" + moTa + ", danhGia=" + danhGia + ", maLoai=" + maLoai + "]";
	}
}
