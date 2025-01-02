package com.symbiosis.RestProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.RestProject.model.LikeLib;
import com.symbiosis.RestProject.repository.LikeLibRepository;

@Service
public class LikeLibServiceImpl implements  LikeLibService{
	@Autowired
	@Qualifier("likeRepo")
	private LikeLibRepository likeRepo;
	
	@Override
	public LikeLib insertrecord(LikeLib l) {
		// TODO Auto-generated method stub
		return likeRepo.save(l);
	}

	@Override
	public List<LikeLib> getAll() {
		// TODO Auto-generated method stub
		return likeRepo.findAll();
	}

	@Override
	public void del(int li) {
		// TODO Auto-generated method stub
		likeRepo.deleteById(li);
	}

}
