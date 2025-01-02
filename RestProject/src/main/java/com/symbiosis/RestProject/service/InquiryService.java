package com.symbiosis.RestProject.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.symbiosis.RestProject.model.Inquiry;

@Service
public interface InquiryService {

	Inquiry insertrecord(Inquiry i); //for post request
	List<Inquiry>getAll(); // for get request 
	void del(int iq); //for delete request 
}