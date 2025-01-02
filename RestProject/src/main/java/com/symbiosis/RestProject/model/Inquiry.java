package com.symbiosis.RestProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Inquiry {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int feedbackid;
	
    private String name;
    private String email;
    private String phoneNumber;
    private String message;
   

    public Inquiry() {}
    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

	
	@Override
	public String toString() {
		return "Inquiry [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + 
				" message=" + message +"]";
	}
	

}