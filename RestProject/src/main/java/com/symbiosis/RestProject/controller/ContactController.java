package com.symbiosis.RestProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.symbiosis.RestProject.model.Contact;
import com.symbiosis.RestProject.service.ContactService;

@RestController
public class ContactController {
	@Autowired
	private ContactService cs;
	
	@GetMapping("/contacts")
	public List<Contact>handleget()
	{
		return cs.getAll();
		
	}

	@PostMapping("/addcont")
	public Contact add(@RequestBody Contact r)
	{
		return cs.insertrecord(r);
	}

	@DeleteMapping("/delcont/{rid}")
	public void delr(@PathVariable("rid")int r) 
	{
		cs.del(r);
	}

	@PutMapping("/upcont/{rid}")
	public Contact update(@PathVariable("rid")int i,@RequestBody Contact r)
	{
	return cs.updaterecord(i, r);	
	}
}
