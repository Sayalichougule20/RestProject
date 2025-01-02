package com.symbiosis.RestProject.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.symbiosis.RestProject.model.Account;

@Service
public interface AccountService {
	Optional<Account>loginWithEmail(String email, String password);
	Optional<Account>loginWithFacebook(String facebook);
	Account registerUser(Account a);
}
