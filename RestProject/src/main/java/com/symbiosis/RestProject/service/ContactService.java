package com.symbiosis.RestProject.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.symbiosis.RestProject.model.Contact;

@Service
public interface ContactService {
	Contact insertrecord(Contact r); //for post request
	List<Contact>getAll(); // for get request 
	void del(int ri); //for delete request 
	Contact updaterecord(int i, Contact r); //for update request 

}
