/**
 * 
 */
package com.briefBankApi.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.briefBankApi.api.model.Compte;

//@NoRepositoryBean
@Repository
public interface CompteRepository extends JpaRepository<Compte, Integer> {

	public List<Compte> findByCloture(boolean statut);

	public Compte findTopByOrderByIdDesc();
}
