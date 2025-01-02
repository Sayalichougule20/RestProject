package com.symbiosis.RestProject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symbiosis.RestProject.model.Account;
import com.symbiosis.RestProject.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountRepository accRepo;

	@Override
	public Optional<Account> loginWithEmail(String email, String password) {
		 Optional<Account> a = accRepo.findByEmail(email);
	        if (a.isPresent() && a.get().getPassword().equals(password)) {
	            return a;
	        }
	        return Optional.empty();
	}

	@Override
	public Optional<Account> loginWithFacebook(String facebook) {
		// TODO Auto-generated method stub
		 return accRepo.findByFacebook(facebook);
	}

	@Override
	public Account registerUser(Account a) {
		// TODO Auto-generated method stub
		 return accRepo.save(a);
	}
	
	
}
