/**
 * 
 */
package com.briefBankApi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briefBankApi.api.model.Compte;
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
}
