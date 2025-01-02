package com.symbiosis.RestProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.symbiosis.RestProject.model.Inquiry;
import com.symbiosis.RestProject.service.InquiryService;

@RestController
public class InquiryController {

	@Autowired
	private InquiryService is;
	
	@GetMapping("/Inquiries")
	public List<Inquiry>handleget()
	{
		return is.getAll();
		
	}

	@PostMapping("/addinq")
	public Inquiry add(@RequestBody Inquiry i)
	{
		return is.insertrecord(i);
	}

	@DeleteMapping("/delinq/{iid}")
	public void deli(@PathVariable("iid")int i) 
	{
		is.del(i);
	}
}