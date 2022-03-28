package com.briefBankApi.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ch.qos.logback.core.net.server.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {
	

}
