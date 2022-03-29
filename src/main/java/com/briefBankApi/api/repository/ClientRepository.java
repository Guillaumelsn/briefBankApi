package com.briefBankApi.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.briefBankApi.api.model.Client;


@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
	

}
