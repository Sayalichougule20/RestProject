package com.symbiosis.RestProject.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.symbiosis.RestProject.model.Feedback;

@Service
public interface FeedbackService {
	Feedback insertrecord(Feedback r); //for post request
	List<Feedback>getAll(); // for get request 
	void del(int ri); //for delete request 
	Feedback updaterecord(int i, Feedback r); //for update request 

}
