package com.briefBankApi.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "clients")

public class Client {

	

	public Client(int id, String raison_Sociale, String libelle_Client, String numero_Tel, String mail,
			String adresse, int id_Conseiller) {

		this.id = id;
		this.raison_Sociale = raison_Sociale;
		this.libelle_Client = libelle_Client;
		this.numero_Tel = numero_Tel;
		this.mail = mail;
		this.adresse = adresse;
		this.id_Conseiller = id_Conseiller;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRaison_Sociale() {
		return raison_Sociale;
	}

	public void setRaison_Sociale(String raison_Sociale) {
		this.raison_Sociale = raison_Sociale;
	}

	public String getLibelle_Client() {
		return libelle_Client;
	}

	public void setLibelle_Client(String libelle_Client) {
		this.libelle_Client = libelle_Client;
	}

	public String getNumero_Tel() {
		return numero_Tel;
	}

	public void setNumero_Tel(String numero_Tel) {
		this.numero_Tel = numero_Tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Integer getId_Conseiller() {
		return id_Conseiller;
	}

	public void setId_Conseiller(Integer id_Conseiller) {
		this.id_Conseiller = id_Conseiller;
	}

	public Client() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "raison_Sociale")
	private String raison_Sociale;

	@Column(name = "libelle_Client")
	private String libelle_Client;

	private String numero_Tel;

	private String mail;

	private String adresse;
	
	@Column(name = "id_Conseiller")
	private Integer id_Conseiller;

}
