package com.symbiosis.RestProject.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.symbiosis.RestProject.model.Podcast;

@Service
public interface PodcastService {
	Podcast insertrecord(Podcast p); //for post request
	List<Podcast>getAll(); // for get request 
	void del(int pi); //for delete request 
	Podcast updaterecord(int i, Podcast p); //for update request 
}
