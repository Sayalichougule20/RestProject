package com.symbiosis.RestProject.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.symbiosis.RestProject.model.LikeLib;

@Service
public interface LikeLibService {
	LikeLib insertrecord(LikeLib l); //for post request
	List<LikeLib>getAll(); // for get request 
	void del(int li); //for delete request 
}
