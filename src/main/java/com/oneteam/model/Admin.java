package com.oneteam.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(AdminPK.class)
@Table(name = "Admin")
public class Admin {
	@Id
	private String tenAdmin;
	private String email;
	public String getTenAdmin() {
		return tenAdmin;
	}
	public void setTenAdmin(String tenAdmin) {
		this.tenAdmin = tenAdmin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String tenAdmin, String email) {
		super();
		this.tenAdmin = tenAdmin;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Admin [tenAdmin=" + tenAdmin + ", email=" + email + "]";
	}
}
