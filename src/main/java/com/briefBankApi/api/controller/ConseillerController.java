package com.briefBankApi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.briefBankApi.api.model.Conseiller;

import com.briefBankApi.api.service.ConseillerService;


@CrossOrigin

@RestController
@RequestMapping("/")
public class ConseillerController {

    @Autowired
    private ConseillerService conseillerService;

    /**
    * Read - Get all employees
    * @return - An Iterable object of Employee full filled
    */
    @GetMapping("/conseiller")
    public Iterable<Conseiller> getConseillers() {
        return conseillerService.getConseillers();
    }

}