package com.briefBankApi.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briefBankApi.api.model.Compte;
import com.briefBankApi.api.model.CompteCourant;
import com.briefBankApi.api.model.CompteEpargne;
import com.briefBankApi.api.model.CompteStatut;
import com.briefBankApi.api.repository.CompteCourantRepository;
import com.briefBankApi.api.repository.CompteEpargneRepository;
import com.briefBankApi.api.repository.CompteRepository;

import lombok.Data;

@Data
@Service
public class CompteService {
    @Autowired
    private CompteRepository compteRepository;
    
    @Autowired
    private CompteCourantRepository compteCourantRepository;
    
    @Autowired
    private CompteEpargneRepository compteEpargneRepository;

    public Optional<Compte> getCompte(final Integer id) {
        return compteRepository.findById(id);
    }

    public Iterable<Compte> getCompte() {
        return compteRepository.findAll();
    }

    public void deleteCompte(final Integer id) {
    	compteRepository.deleteById(id);
    }

    public Compte saveCompte(Compte compte) {
        Compte savedCompte = compteRepository.save(compte);
        return savedCompte;
    }
    
    public Compte saveCompteCourant(CompteCourant compte) {
        CompteCourant savedCompte = compteCourantRepository.save(compte);
        return savedCompte;
    }
    
    public Compte saveCompteEpargne(CompteEpargne compte) {
        CompteEpargne savedCompte = compteEpargneRepository.save(compte);
        return savedCompte;
    }
    
    public List<Compte> getAllActiveComptes(){
    	return compteRepository.findByCloture(CompteStatut.ACTIF.getStatut());
    }
    
    public Compte getLastCompte() {
    	return compteRepository.findTopByOrderByIdDesc();
    }
}
