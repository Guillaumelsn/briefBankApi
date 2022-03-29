/**
 * 
 */
package com.briefBankApi.api.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @author marvin
 *
 */
@Data
@Entity
@Table(name = "transferer")
public class Transfert implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column (name="idCompteDebiteur")
	private Integer idCompteDebiteur;
	
	@Id
	@Column (name="idCompteCredite")
	private Integer idCompteCredite;
	
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
