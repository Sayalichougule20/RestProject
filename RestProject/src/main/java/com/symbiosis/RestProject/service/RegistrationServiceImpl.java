package com.symbiosis.RestProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.RestProject.model.AdminLogin;
import com.symbiosis.RestProject.model.Registration;
import com.symbiosis.RestProject.repository.RegistrationRepository;
@Service
public class RegistrationServiceImpl implements  RegistrationService{

	@Autowired
	@Qualifier("regRepo")
	private RegistrationRepository regRepo;
	
	@Override
	public Registration insertrecord(Registration r) {
		// to save and insert record
		return regRepo.save(r);
	}

	@Override
	public List<Registration>getAll()
	{
		// to find a record 
		return regRepo.findAll();
	}

	@Override
	public void del(int ri) {
		// to delete record
		regRepo.deleteById(ri);
	}

	@Override
	public Registration updaterecord(int i,Registration r) {
		// to update record
		Optional<Registration> opt = regRepo.findById(i);
		if (opt.isPresent()) 
		{
			Registration rold=opt.get();
			rold.setName(r.getName());
			rold.setGender(r.getGender());
			rold.setAge(r.getAge());
			rold.setContact(r.getContact());
			rold.setEmailid(r.getEmailid());
			rold.setPassword(r.getPassword());
			return regRepo.save(rold);
		}
		return null;
	}

	@Override
	public List<Registration> login(String emailid, String password) {
		// TODO Auto-generated method stub
		return regRepo.findAllByEmailidAndPassword(emailid, password);
	}

}
