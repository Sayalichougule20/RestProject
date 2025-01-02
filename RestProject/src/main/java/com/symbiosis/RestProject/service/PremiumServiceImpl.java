package com.symbiosis.RestProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.RestProject.model.Premium;
import com.symbiosis.RestProject.repository.PremiumRepository;

@Service
public class PremiumServiceImpl implements PremiumService{
	@Autowired
	@Qualifier("preRepo")
	private PremiumRepository preRepo;
	
	@Override
	public Premium insertrecord(Premium p) {
		// to save and insert record
		return preRepo.save(p);
	}

	@Override
	public List<Premium> getAll() {
		// TODO Auto-generated method stub
		return preRepo.findAll();
	}

	@Override
	public void del(int pi) {
		// TODO Auto-generated method stub
		preRepo.deleteById(pi);
	}
}
