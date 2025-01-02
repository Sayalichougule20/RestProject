package com.symbiosis.RestProject.repository;

import com.symbiosis.RestProject.model.Inquiry;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("inqRepo")
public interface InquiryRepository extends JpaRepository<Inquiry, Integer> {
    
}
