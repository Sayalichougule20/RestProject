package com.symbiosis.RestProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.RestProject.model.Contact;
import com.symbiosis.RestProject.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{
	@Autowired
	@Qualifier("contRepo")
	private ContactRepository contRepo;
	
	@Override
	public Contact insertrecord(Contact r) {
		// TODO Auto-generated method stub
		return contRepo.save(r);
	}

	@Override
	public List<Contact> getAll() {
		// TODO Auto-generated method stub
		return contRepo.findAll();
	}

	@Override
	public void del(int ri) {
		// TODO Auto-generated method stub
		contRepo.deleteById(ri);
		
	}

	@Override
	public Contact updaterecord(int i, Contact r) {
		// TODO Auto-generated method stub
		Optional<Contact> opt = contRepo.findById(i);
		if (opt.isPresent()) 
		{
			Contact rold=opt.get();
			rold.setEmailid(r.getEmailid());
			rold.setMessage(r.getMessage());
			return contRepo.save(rold);
		}
		return null;
	
	}
	
}
