package com.symbiosis.RestProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.symbiosis.RestProject.model.AdminLogin;
import com.symbiosis.RestProject.service.AdminLoginService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/admin/")
public class AdminLoginController {

	@Autowired
	AdminLoginService admserv;
	@GetMapping("/login/{email}/{password}")
	public List<AdminLogin> login(@PathVariable("email")String email, @PathVariable("password") String password)
	{
		return admserv.login(email, password);
	}
}
