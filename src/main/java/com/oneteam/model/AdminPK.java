package com.oneteam.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
public class AdminPK implements Serializable{
	private static final long serialVersionUID = 1L;
	@OneToOne
	@JoinColumn(name = "tenTaiKhoan")
	private User tenAdmin;
	public User getTenAdmin() {
		return tenAdmin;
	}
	public void setTenAdmin(User tenAdmin) {
		this.tenAdmin = tenAdmin;
	}
}
