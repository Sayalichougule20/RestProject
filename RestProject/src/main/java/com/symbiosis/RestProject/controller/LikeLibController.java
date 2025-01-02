package com.symbiosis.RestProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.symbiosis.RestProject.model.LikeLib;
import com.symbiosis.RestProject.service.LikeLibService;

@RestController
public class LikeLibController {
	
	@Autowired
	private LikeLibService ls;
	
	@GetMapping("/LikedLibrary")
	public List<LikeLib>handleget()
	{
		return ls.getAll();
		
	}

	@PostMapping("/addlib")
	public LikeLib add(@RequestBody LikeLib l)
	{
		return ls.insertrecord(l);
	}

	@DeleteMapping("/dellib/{lid}")
	public void delr(@PathVariable("lid")int l) 
	{
		ls.del(l);
	}

}
