/**
 * 
 */
package com.briefBankApi.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author marvin
 *
 */
@Data
@Entity
@Table(name = "comptecourant")
@PrimaryKeyJoinColumn(name = "id")
public class CompteCourant extends Compte {
	// Variables de classe CompteCourant
	
	private static final long serialVersionUID = 1L;

	@Column(name = "solde_minimum")
	private float soldeMinimum;
	
	@Column(name = "frais_transfert")
	private float fraisTransfert;
}
