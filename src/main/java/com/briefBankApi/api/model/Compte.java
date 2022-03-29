/**
 * 
 */
package com.briefBankApi.api.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author marvin
 *
 */
@Data
@Entity
@Table(name = "compte")
public class Compte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	
	@Column(name = "numeroCompte")
	protected Integer numCompte;
	
	@Column(name = "solde")
	protected float solde;
	
	@Column(name = "soldeInitial")
	protected float soldeInitial;

	@Column(name = "cloture")
	protected boolean cloture;
	
	@Column(name = "typeCompte")
	protected boolean typeCompte;
	
	@Column(name = "id_Client")
	protected int idClient;
	
	public Compte(int numCompte, float solde, float soldeInitial, boolean cloture, boolean typeCompte, int idClient) {
		this.numCompte = numCompte;
		this.solde = solde;
		this.soldeInitial = soldeInitial;
		this.cloture = cloture;
		this.typeCompte = typeCompte;
		this.idClient = idClient;
	}
}
