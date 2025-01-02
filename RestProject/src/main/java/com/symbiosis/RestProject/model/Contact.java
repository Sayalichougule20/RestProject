package com.symbiosis.RestProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int contactid;

	private String emailid,message;

	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact( String emailid, String message) {
		super();
		this.emailid = emailid;
		this.message = message;
	}

	public int getContactid() {
		return contactid;
	}

	public void setContactid(int contactid) {
		this.contactid = contactid;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String toString() {
		return "Contact [contactid=" + contactid + ", emailid=" + emailid + ", message=" + message + "]";
	}
	
	
}
