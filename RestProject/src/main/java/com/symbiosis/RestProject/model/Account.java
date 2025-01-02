package com.symbiosis.RestProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int accid;
	
	private String email;
	private String facebook;
	private String password;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String email, String facebook, String password) {
		super();
		this.email = email;
		this.facebook = facebook;
		this.password = password;
	}
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Account [accid=" + accid + ", email=" + email + ", facebook=" + facebook + ", password=" + password
				+ "]";
	}

}
