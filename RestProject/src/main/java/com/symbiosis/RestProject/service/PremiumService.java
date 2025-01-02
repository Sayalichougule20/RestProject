package com.symbiosis.RestProject.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.symbiosis.RestProject.model.Premium;

@Service
public interface PremiumService {
	Premium insertrecord(Premium p); //for post request
	List<Premium>getAll(); // for get request 
	void del(int pi); //for delete request 
}
