package com.briefBankApi.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "client")

public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "raisonSociale")
	private String raisonSociale;

	@Column(name = "libelleClient")
	private String libelleClient;

	@Column(name = "numeroTel")
	private String numeroTel;

	@Column(name = "mail")
	private String mail;

	@Column(name = "adresse")
	private String adresse;

	@Column(name = "civilite")
	private String civilite;

	@Column(name = "dateNaissance")
	private Date dateNaissance;
	
	@Column(name = "id_Conseiller")
	private Integer idConseiller;

}
