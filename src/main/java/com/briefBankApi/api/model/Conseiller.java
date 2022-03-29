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
			String nomConseiller,
			String prenomConseiller, String login,
			String password) {
		super();
		this.id = id;
		this.nomConseiller = nomConseiller;
		this.prenomConseiller = prenomConseiller;
		this.login = login;
		this.password = password;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomConseiller() {
		return nomConseiller;
	}

	public void
			setNomConseiller(String nomConseiller) {
		this.nomConseiller = nomConseiller;
	}

	public String getPrenomConseiller() {
		return prenomConseiller;
	}

	public void setPrenomConseiller(
			String prenomConseiller) {
		this.prenomConseiller = prenomConseiller;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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
	@Column(name="nomConseiller")
	private String nomConseiller;
	
	@Column (name="prenomConseiller")
	private String prenomConseiller;
	
	@Column (name="login")
	private String login;
	
	@Column (name="password")
	private String password;

}
