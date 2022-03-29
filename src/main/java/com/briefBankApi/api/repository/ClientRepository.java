package com.briefBankApi.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.briefBankApi.api.model.Client;

@NoRepositoryBean
@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
	

}
