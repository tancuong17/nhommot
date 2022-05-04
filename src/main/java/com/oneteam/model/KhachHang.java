package com.oneteam.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(KhachHangPK.class)
@Table(name = "KhachHang")
public class KhachHang implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private int maKhachHang;
	@Column(columnDefinition = "nvarchar(255)")
	private String ten;
	@Column(columnDefinition = "nvarchar(255)")
	private String diaChi;
	private String sdt;
	private String email;
	public int getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(int maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhachHang(int maKhachHang) {
		super();
		this.maKhachHang = maKhachHang;
	}
	public KhachHang(int maKhachHang, String ten, String diaChi, String sdt, String email) {
		super();
		this.maKhachHang = maKhachHang;
		this.ten = ten;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.email = email;
	}
	@Override
	public String toString() {
		return "KhachHang [maKhachHang=" + maKhachHang + ", ten=" + ten + ", diaChi=" + diaChi + ", sdt=" + sdt
				+ ", email=" + email + "]";
	}
}
