/**
 * 
 */
package com.briefBankApi.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.briefBankApi.api.model.Compte;

/**
 * @author marvin
 *
 */
@Repository
public interface CompteEpargneRepository extends CrudRepository<Compte, Integer>{

}
