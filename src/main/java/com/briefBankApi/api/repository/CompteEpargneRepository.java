/**
 * 
 */
package com.briefBankApi.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.briefBankApi.api.model.Compte;

/**
 * @author marvin
 *
 */
@NoRepositoryBean
@Repository
public interface CompteEpargneRepository extends CrudRepository<Compte, Long>{

}
