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
public class CompteCourant extends Compte {
	// Variables de classe CompteCourant
	
	@Column(name = "soldeMinimum")
	private float soldeMinimum;
	
	@Column(name = "fraisTransfert")
	private float fraisTransfert;
	
	/**
	 * Constructeur de CompteCourant, hérite des propriétés du parent pour l'instancier avec toutes les informations
	 * @param id
	 * @param numCompte
	 * @param solde
	 * @param soldeInitial
	 * @param cloture
	 * @param typeCompte
	 * @param soldeMinimum
	 * @param fraisTransfert
	 */
	public CompteCourant(int numCompte, float solde, float soldeInitial, boolean cloture, boolean typeCompte, int idClient, float soldeMinimum, float fraisTransfert) {
		super(numCompte, solde, soldeInitial, cloture, typeCompte, idClient);
		this.soldeMinimum = soldeMinimum;
		this.fraisTransfert = fraisTransfert;
	}
}
