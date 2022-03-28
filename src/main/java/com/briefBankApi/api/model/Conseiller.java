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
	private int id;
	@Column(name="nomConseiller")
	private String nomConseiller;
	@Column (name="prenomConseiller")
	private String prenomConseiller;
	@Column (name= "numeroTel")
	private String numeroTel;
	@Column (name= "adresse")
	private String adresse;
	@Column (name= "civilite")
	private String civilite;
	@Column (name= "login")
	private String login;
	@Column (name= "password")
	private String password;

}
