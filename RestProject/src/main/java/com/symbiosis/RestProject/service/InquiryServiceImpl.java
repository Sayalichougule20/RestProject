package com.symbiosis.RestProject.service;

import com.symbiosis.RestProject.model.Inquiry;
import com.symbiosis.RestProject.repository.InquiryRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class InquiryServiceImpl implements InquiryService {

	@Autowired
	@Qualifier("inqRepo")
	private InquiryRepository inqRepo;
	
	@Override
	public Inquiry insertrecord(Inquiry i) {
		// TODO Auto-generated method stub
		return inqRepo.save(i);
	}

	@Override
	public List<Inquiry> getAll() {
		// TODO Auto-generated method stub
		return inqRepo.findAll();
	}

	@Override
	public void del(int iq) {
		// TODO Auto-generated method stub
		inqRepo.deleteById(iq);
		
	}


}