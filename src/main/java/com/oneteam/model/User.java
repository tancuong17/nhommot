package com.oneteam.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NguoiDung")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private String tenTaiKhoan;
	private String matKhau;
	private boolean trangThai;
	private int tenSoHuu;
	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}
	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public boolean isTrangThai() {
		return trangThai;
	}
	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}
	public int getTenSoHuu() {
		return tenSoHuu;
	}
	public void setTenSoHuu(int tenSoHuu) {
		this.tenSoHuu = tenSoHuu;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String tenTaiKhoan, String matKhau, boolean trangThai, int tenSoHuu) {
		super();
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
		this.trangThai = trangThai;
		this.tenSoHuu = tenSoHuu;
	}
	@Override
	public String toString() {
		return "User [tenTaiKhoan=" + tenTaiKhoan + ", matKhau=" + matKhau + ", trangThai=" + trangThai + ", tenSoHuu="
				+ tenSoHuu + "]";
	}
}
