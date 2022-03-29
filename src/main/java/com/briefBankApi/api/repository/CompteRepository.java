/**
 * 
 */
package com.briefBankApi.api.repository;

import java.util.List;

/**
 * @author marvin
 *
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.briefBankApi.api.model.Compte;

@Repository
public interface CompteRepository extends CrudRepository<Compte, Integer> {

	public List<Compte> findByCloture(boolean statut);
	
	public Compte findTopByOrderByIdDesc();
}
