package com.briefBankApi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.briefBankApi.api.model.Client;

@NoRepositoryBean
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
	

}
