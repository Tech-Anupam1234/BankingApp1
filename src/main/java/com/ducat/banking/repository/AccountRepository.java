package com.ducat.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ducat.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Long> {
	
	

}
