package com.briefBankApi.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "raison_sociale")
	private String raisonSociale;

	@Column(name = "libelle_client")
	private String libelleClient;

	@Column(name = "numero_tel")
	private String numeroTel;

	@Column(name = "mail")
	private String mail;

	@Column(name = "adresse")
	private String adresse;

	@Column(name = "civilite")
	private String civilite;

	@Column(name = "date_naissance")
	private Date dateNaissance;
	
	@ManyToOne
	@JoinColumn( name="id_conseiller" )
	private Conseiller conseiller;

}
