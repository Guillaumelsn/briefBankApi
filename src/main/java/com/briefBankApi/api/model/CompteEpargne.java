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
@Table(name = "compteepargne")
@PrimaryKeyJoinColumn(name = "id")
public class CompteEpargne extends Compte {

	private static final long serialVersionUID = 1L;

	@Column(name = "plafond")
	private float plafond;
	
	@Column(name = "taux_interet")
	private float tauxInteret;
}
