package com.symbiosis.RestProject.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symbiosis.RestProject.model.Premium;

@Repository
@Qualifier("preRepo")
public interface PremiumRepository extends JpaRepository<Premium, Integer>{

}
