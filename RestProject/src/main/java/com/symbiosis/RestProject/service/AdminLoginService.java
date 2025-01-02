package com.symbiosis.RestProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.symbiosis.RestProject.model.AdminLogin;

@Service
public interface AdminLoginService {
List<AdminLogin>login(String email,String password);
}
