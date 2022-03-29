/**
 * 
 */
package com.briefBankApi.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briefBankApi.api.model.Compte;
import com.briefBankApi.api.model.CompteCourant;
import com.briefBankApi.api.model.CompteEpargne;
import com.briefBankApi.api.service.CompteService;

/**
 * @author marvin
 *
 */
@RestController
public class CompteController {
    @Autowired
    private CompteService compteService;

    /**
    * Read - Get all employees
    * @return - An Iterable object of comptes full filled
    */
    @GetMapping("/comptes")
    public Iterable<Compte> getComptes() {
        return compteService.getAllActiveComptes();
    }
    
    @GetMapping("/lastCompte")
    public Compte getLastCompte() {
    	return compteService.getLastCompte();
    }
    
    @GetMapping("/compte/{id}")
    public Optional<Compte> getCompteById(@PathVariable("id") Integer id) {
    	return compteService.getCompte(id);
    }
    
    @PutMapping("/updateCompte")
    public void updateCompte(@RequestBody Compte compte) {
    	compteService.saveCompte(compte);
    }
    
    @PostMapping("/addCompte")
    public Compte createCompte(@RequestBody Compte compte){
    	compteService.saveCompte(compte);
    	return compte;
    }
    
    @PostMapping("/addCompteCourant")
    public Compte createCompteCourant(@RequestBody CompteCourant compte){
    	compteService.saveCompte(compte);
    	return compte;
    }
    
    @PostMapping("/addCompteEpargne")
    public Compte createCompteEpargne(@RequestBody CompteEpargne compte){
    	compteService.saveCompte(compte);
    	return compte;
    }
}
