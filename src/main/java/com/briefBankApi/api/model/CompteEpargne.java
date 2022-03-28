/**
 * 
 */
package com.briefBankApi.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author marvin
 *
 */
@Data
@Entity
@Table(name = "comptecourant")
public class CompteEpargne extends Compte {

	@Column(name = "plafond")
	private float plafond;
	
	@Column(name = "tauxInteret")
	private float tauxInteret;
	
	/**
	 * Constructeur de CompteEpargne, hérite des propriétés du parent pour l'instancier avec toutes les informations
	 * @param id
	 * @param numCompte
	 * @param solde
	 * @param soldeInitial
	 * @param cloture
	 * @param typeCompte
	 * @param plafond
	 * @param tauxInteret
	 */
	public CompteEpargne(int numCompte, float solde, float soldeInitial, boolean cloture, boolean typeCompte, int idClient, float plafond, float tauxInteret) {
		super(numCompte, solde, soldeInitial, cloture, typeCompte, idClient);
		this.plafond = plafond;
		this.tauxInteret = tauxInteret;
	}
}
