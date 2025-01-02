package com.symbiosis.RestProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Premium {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int premiumid;
	
	private String name;
	private String phoneNo;
	private String email;
	private String prePack;
	public Premium() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Premium(int premiumid, String name, String phoneNo, String email, String prePack) {
		super();
		this.premiumid = premiumid;
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.prePack = prePack;
	}
	public int getPremiumid() {
		return premiumid;
	}
	public void setPremiumid(int premiumid) {
		this.premiumid = premiumid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPrePack() {
		return prePack;
	}
	public void setPrePack(String prePack) {
		this.prePack = prePack;
	}
	@Override
	public String toString() {
		return "Premium [premiumid=" + premiumid + ", name=" + name + ", phoneNo=" + phoneNo + ", email=" + email
				+ ", prePack=" + prePack + "]";
	}
	
	
}
