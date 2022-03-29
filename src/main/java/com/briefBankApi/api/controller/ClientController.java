
package com.briefBankApi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briefBankApi.api.model.Client;
import com.briefBankApi.api.service.ClientService;


@CrossOrigin
@RestController
@RequestMapping("/")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/clients")
	public Iterable<Client> getClients() {
		return clientService.getClients();
	}
}
