
package com.briefBankApi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.briefBankApi.api.service.ClientService;

import ch.qos.logback.core.net.server.Client;


@RestController
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/clients")
	public Iterable<Client> getClients() {
		return clientService.getClients();
	}
	
	@PostMapping("/client")
	public Client createClient(@RequestBody Client client) {
		return clientService.saveClient(client);
	}
	
}
