package com.oneteam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LoaiSanPham")
public class LoaiSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maLoai;
	@Column(columnDefinition = "nvarchar(255)")
	private String tenLoai;
	public int getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(int maLoai) {
		this.maLoai = maLoai;
	}
	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public LoaiSanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoaiSanPham(int maLoai, String tenLoai) {
		super();
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
	}
	public LoaiSanPham(int maLoai) {
		super();
		this.maLoai = maLoai;
	}
	@Override
	public String toString() {
		return "LoaiSanPham [maLoai=" + maLoai + ", tenLoai=" + tenLoai + "]";
	}
}
