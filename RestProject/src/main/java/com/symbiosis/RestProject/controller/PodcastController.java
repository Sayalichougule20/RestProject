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

import com.symbiosis.RestProject.model.Podcast;
import com.symbiosis.RestProject.service.PodcastService;

@RestController
public class PodcastController {
	@Autowired
	private PodcastService ps;

	@GetMapping("/Podcasts")
	public List<Podcast>handleget()
	{
		return ps.getAll();
	}

	@PostMapping("/addpod")
	public Podcast add(@RequestBody Podcast p)
	{
		return ps.insertrecord(p);
	}

	@DeleteMapping("/delpod/{pid}")
	public void delr(@PathVariable("pid")int p) 
	{
		ps.del(p);
	}

	@PutMapping("/uppod/{pid}")
	public Podcast update(@PathVariable("pid")int i,@RequestBody Podcast p)
	{
	return ps.updaterecord(i, p);	
	}


}
