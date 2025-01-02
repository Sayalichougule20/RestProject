package com.symbiosis.RestProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.symbiosis.RestProject.model.Registration;
@Service
public interface RegistrationService {
Registration insertrecord(Registration r); //for post request
List<Registration>getAll(); // for get request 
void del(int ri); //for delete request 
Registration updaterecord(int i, Registration r); //for update request 
List<Registration>login(String emailid, String password);
}
