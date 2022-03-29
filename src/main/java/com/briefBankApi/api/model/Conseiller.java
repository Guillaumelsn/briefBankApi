package com.briefBankApi.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name= "conseillers")
public class Conseiller {
	public Conseiller() {
		
	}
	

	public Conseiller(int id,
			String nom_Conseiller,
			String prenom_Conseiller, String login,
			String password) {
		super();
		this.id = id;
		this.nom_Conseiller = nom_Conseiller;
		this.prenom_Conseiller = prenom_Conseiller;
		this.login = login;
		this.password = password;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getNom_Conseiller() {
		return nom_Conseiller;
	}


	public void
			setNom_Conseiller(String nom_Conseiller) {
		this.nom_Conseiller = nom_Conseiller;
	}


	public String getPrenom_Conseiller() {
		return prenom_Conseiller;
	}


	public void setPrenom_Conseiller(
			String prenom_Conseiller) {
		this.prenom_Conseiller = prenom_Conseiller;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="nom_Conseiller")
	private String nom_Conseiller;
	
	@Column (name="prenom_Conseiller")
	private String prenom_Conseiller;
	
	@Column (name="login")
	private String login;
	
	@Column (name="password")
  
	private String password;
}
