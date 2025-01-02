package com.symbiosis.RestProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Podcast {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int podid;
	
	private String name;
	private String emailid;
	private String phoneNo;
	private String audio;
	public Podcast() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Podcast(String name, String emailid, String phoneNo, String audio) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.phoneNo = phoneNo;
		this.audio = audio;
	}
	public int getPodid() {
		return podid;
	}
	public void setPodid(int podid) {
		this.podid = podid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAudio() {
		return audio;
	}
	public void setAudio(String audio) {
		this.audio = audio;
	}
	@Override
	public String toString() {
		return "Podcast [podid=" + podid + ", name=" + name + ", emailid=" + emailid + ", phoneNo=" + phoneNo
				+ ", audio=" + audio + "]";
	}
	
	
}
