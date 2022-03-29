
package com.briefBankApi.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briefBankApi.api.model.Client;
import com.briefBankApi.api.repository.ClientRepository;

import lombok.Data;

@Data
@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public Optional<Client> getClientById (final Long id) {
		return clientRepository.findById(id);
		
	}
	
	public Iterable<Client> getClients() {
		return clientRepository.findAll();
	}
	
	 public Client saveClient(Client client) {
	        Client savedClient = clientRepository.save(client);
	        return savedClient;
	    }

}
