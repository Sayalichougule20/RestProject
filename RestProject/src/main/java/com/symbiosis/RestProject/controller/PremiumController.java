package com.symbiosis.RestProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.symbiosis.RestProject.model.Premium;
import com.symbiosis.RestProject.service.PremiumService;

@RestController
public class PremiumController {
	@Autowired
	private PremiumService ps;
	
	@GetMapping("/premiums")
	public List<Premium> handleget()
	{
		return ps.getAll();
	}

	@PostMapping("/addpre")
	public Premium add(@RequestBody Premium p)
	{
		return ps.insertrecord(p);
	}

	@DeleteMapping("/delpre/{pid}")
	public void deli(@PathVariable("pid")int p) 
	{
		ps.del(p);
	}
}
