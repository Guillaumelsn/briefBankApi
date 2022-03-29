/**
 * 
 */
package com.briefBankApi.api.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

/**
 * @author marvin
 *
 */
@Data
@Entity
@Table(name = "transferer", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "id_compte_debite", "id_compte_credite" }) })
public abstract class Transfert implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "id_compte_credite", referencedColumnName = "id")
	private Compte compteDebite;

	@Id
	@ManyToOne
	@JoinColumn(name = "id_compte_debite", referencedColumnName = "id")
	private Compte compteCredite;

	@Column(name = "montant")
	private float montant;

	@Column(name = "date_transfert")
	private Date dateTransfert;
}
