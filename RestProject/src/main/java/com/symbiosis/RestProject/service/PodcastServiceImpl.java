package com.symbiosis.RestProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.RestProject.model.Podcast;
import com.symbiosis.RestProject.repository.PodcastRepository;

@Service
public class PodcastServiceImpl implements PodcastService{
	@Autowired
	@Qualifier("podRepo")
	private PodcastRepository podRepo;

	@Override
	public Podcast insertrecord(Podcast p) {
		// TODO Auto-generated method stub
		return podRepo.save(p);
	}

	@Override
	public List<Podcast> getAll() {
		// TODO Auto-generated method stub
		return podRepo.findAll();
	}

	@Override
	public void del(int pi) {
		// TODO Auto-generated method stub
		podRepo.deleteById(pi);
	}

	@Override
	public Podcast updaterecord(int i, Podcast p) {
		Optional<Podcast> opt = podRepo.findById(i);
		if(opt.isPresent())
		{
			Podcast rold=opt.get();
			rold.setName(p.getName());
			rold.setEmailid(p.getEmailid());
			rold.setPhoneNo(p.getPhoneNo());
			rold.setAudio(p.getAudio());
			return podRepo.save(rold);
		}
		return null;
	}
	
	
	
}
