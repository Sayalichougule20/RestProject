package com.symbiosis.RestProject.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symbiosis.RestProject.model.Podcast;

@Repository
@Qualifier("podRepo")
public interface PodcastRepository extends JpaRepository<Podcast, Integer>{

}
