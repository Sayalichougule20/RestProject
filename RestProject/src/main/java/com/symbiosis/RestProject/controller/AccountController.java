package com.symbiosis.RestProject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.symbiosis.RestProject.model.Account;
import com.symbiosis.RestProject.service.AccountService;


@RestController
public class AccountController {
	
	@Autowired
	private AccountService accserv;
	
	  @PostMapping("/accounts")
	    public ResponseEntity<Account> register(@RequestBody Account a) {
	        Account registeredUser = accserv.registerUser(a);
	        return ResponseEntity.ok(registeredUser);
	    }

	    @PostMapping("/login/email")
	    public ResponseEntity<String> loginWithEmail(@RequestBody Account a) {
	        Optional<Account> loggedInUser = accserv.loginWithEmail(a.getEmail(), a.getPassword());
	        return loggedInUser.isPresent()
	                ? ResponseEntity.ok("Login successful")
	                : ResponseEntity.status(401).body("Invalid email or password");
	    }
	    
	   @PostMapping("/login/facebook")
	   public ResponseEntity<String>loginWithFacebook(@RequestBody Account a){
		   Optional<Account>loggedInUser=accserv.loginWithFacebook(a.getFacebook());
		   return loggedInUser.isPresent()
	                ? ResponseEntity.ok("Login successful")
	                : ResponseEntity.status(401).body("Invalid facbook Id");
	   }
	    
}
