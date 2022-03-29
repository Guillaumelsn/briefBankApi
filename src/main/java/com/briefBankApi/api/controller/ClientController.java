
package com.briefBankApi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briefBankApi.api.model.Client;
import com.briefBankApi.api.service.ClientService;


@CrossOrigin(origins = "http://localhost:3309")
@RestController
@RequestMapping("/api")
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
