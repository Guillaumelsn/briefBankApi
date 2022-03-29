package com.briefBankApi.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "conseiller")
public class Conseiller {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nom_conseiller")
	private String nomConseiller;

	@Column(name = "prenom_conseiller")
	private String prenomConseiller;

	@Column(name = "numero_tel")
	private String numeroTel;

	@Column(name = "adresse")
	private String adresse;

	@Column(name = "civilite")
	private String civilite;

	@Column(name = "login")
	private String login;

	@Column(name = "password")
	private String password;
}
