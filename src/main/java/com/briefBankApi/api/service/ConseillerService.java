package com.briefBankApi.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briefBankApi.api.model.Conseiller;
import com.briefBankApi.api.repository.ConseillerRepository;

import lombok.Data;

	@Data
	@Service
	public class ConseillerService {

	    @Autowired
	    private ConseillerRepository conseillerRepository;

	    public Optional<Conseiller> getConseillers(final Long id) {
	        return conseillerRepository.findById(id);
	    }

	    public Iterable<Conseiller> getConseillers() {
	        return conseillerRepository.findAll();
	    }

	    public void deleteConseillers(final Long id) {
	    	conseillerRepository.deleteById(id);
	    }

	    public Conseiller saveConseiller(Conseiller conseiller) {
	    	Conseiller savedConseiller = conseillerRepository.save(conseiller);
	        return savedConseiller;
	    }

	}