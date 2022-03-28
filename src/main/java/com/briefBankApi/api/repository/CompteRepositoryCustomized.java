/**
 * 
 */
package com.briefBankApi.api.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.briefBankApi.api.model.Compte;
import com.briefBankApi.api.model.CompteStatut;

/**
 * @author marvin
 *
 */
@Component // Must be @Component !!
public class CompteRepositoryCustomized{
	
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Autowired
//    private CompteRepository compteRepository;
//	
//    public List<Compte> getActiveComptes(){
//    	
//        /** create  a Criteria Builder **/
//        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//        /** create a CriteriaQuery which returns student Objects **/
//        CriteriaQuery<Compte> cq = builder.createQuery(Compte.class);
//		
//        List<Compte> test = (List<Compte>) compteRepository.findAll();
//        /** fetch the Compte Entity **/
//        Root<Compte> comptes = cq.from(Compte.class);
//        
//        /** select the Compte entity**/
//        cq.select(comptes);
//        
//        /** add a restriction to fetch only compte with cloture = 0 **/
//        cq.where(builder.equal(comptes.get("cloture"), CompteStatut.ACTIF.getStatut()));
//        
//        /** fetch the compte result **/
//        List<Compte> list = entityManager.createQuery(cq).getResultList();
//
//		return list;
//    }
}
