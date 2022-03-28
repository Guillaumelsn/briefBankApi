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

import org.hibernate.Criteria;
import org.hibernate.Metamodel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.EntityType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.briefBankApi.api.model.Compte;
import com.briefBankApi.api.model.CompteStatut;
import com.briefBankApi.api.model.TypeCompte;

/**
 * @author marvin
 *
 */
@Component // Must be @Component !!
public class CompteRepositoryCustomized{
	
	private static SessionFactory factory;
	
	public CompteRepositoryCustomized() {
	    try {
	        factory = new Configuration().buildSessionFactory();
	     } catch (Throwable ex) { 
	        System.err.println("Failed to create sessionFactory object." + ex);
	        throw new ExceptionInInitializerError(ex); 
	     }
	}
    
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private CompteRepository compteRepository;
	
    public List<Compte> getActiveComptes(){
    	Session session = factory.openSession();
    	
        /** create  a Criteria Builder **/
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        /** create a CriteriaQuery which returns student Objects **/
        CriteriaQuery<Compte> cq = builder.createQuery(Compte.class);
				
        /** fetch the Compte Entity **/
        Root<Compte> comptes = cq.from(Compte.class);
        
        /** select the Compte entity**/
        cq.select(comptes);
        
        /** add a restriction to fetch only compte with cloture = 0 **/
        cq.where(builder.equal(comptes.get("cloture"), CompteStatut.ACTIF.getStatut()));
        
        /** fetch the compte result **/
        List<Compte> list = entityManager.createQuery(cq).getResultList();

		return list;
    }
}
