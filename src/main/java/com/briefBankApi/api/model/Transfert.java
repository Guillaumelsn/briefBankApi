/**
 * 
 */
package com.briefBankApi.api.model;

import java.util.Date;

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
@Table(name = "transferer")
public class Transfert {
	
	@Column (name="idCompteDebiteur")
	private int idCompteDebiteur;
	
	@Column (name="idCompteCredite")
	private int idCompteCredite;
	
	@Column (name="montant")
	private float montant;
	
	@Column (name="dateTransfert")
	private Date dateTransfert;

	public Transfert(int idCompteDebiteur, int idCompteCredite, float montant, Date dateTransfert) {
		this.idCompteDebiteur = idCompteDebiteur;
		this.idCompteCredite = idCompteCredite;
		this.montant = montant;
		this.dateTransfert = dateTransfert;
	}
}
