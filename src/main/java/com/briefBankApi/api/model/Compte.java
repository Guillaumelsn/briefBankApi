/**
 * 
 */
package com.briefBankApi.api.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Compte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	
	@Column(name = "numero_compte")
	protected Integer numCompte;
	
	@Column(name = "solde")
	protected float solde;
	
	@Column(name = "solde_initial")
	protected float soldeInitial;

	@Column(name = "cloture")
	protected boolean cloture;
	
	@Column(name = "type_compte")
	protected boolean typeCompte;
	
	@ManyToOne
	@JoinColumn( name="id_client" )
	private Client client;
}
