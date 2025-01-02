package com.symbiosis.RestProject.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symbiosis.RestProject.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{
Optional<Account>findByEmail(String email);
Optional<Account>findByFacebook(String facebook);

}
