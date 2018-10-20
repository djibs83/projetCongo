package com.edugroupe.congo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CLIENT")
public class Client implements Serializable{
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClient;
	
	private String prenomClient;
	private String nomClient;
	private String adresseClient;
	private String codePostalClient;
	private String villeClient;
	private String paysClient;
	private double latitudeClient;
	private double longitudeClient;
	private String emailClient;
	
	@OneToMany(mappedBy="client")
	private Collection<Colis> listColis;
	
	
	@OneToMany(mappedBy="client")
	private Collection<Commande> commandes;
	
	
	public Client() {
		
	}


	public Client(String prenomClient, String nomClient, String adresseClient, String codePostalClient,
			String villeClient, String paysClient, double latitudeClient, double longitudeClient, String emailClient) {
		
		this.prenomClient = prenomClient;
		this.nomClient = nomClient;
		this.adresseClient = adresseClient;
		this.codePostalClient = codePostalClient;
		this.villeClient = villeClient;
		this.paysClient = paysClient;
		this.latitudeClient = latitudeClient;
		this.longitudeClient = longitudeClient;
		this.emailClient = emailClient;
	}


	public Long getIdClient() {
		return idClient;
	}


	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}


	public Collection<Colis> getlistColis() {
		return listColis;
	}


	public void setColis(Collection<Colis> listColis) {
		this.listColis = listColis;
	}


	public Collection<Commande> getCommandes() {
		return commandes;
	}


	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}


	public String getPrenomClient() {
		return prenomClient;
	}


	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}


	public String getNomClient() {
		return nomClient;
	}


	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	public String getAdresseClient() {
		return adresseClient;
	}


	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}


	public String getCodePostalClient() {
		return codePostalClient;
	}


	public void setCodePostalClient(String codePostalClient) {
		this.codePostalClient = codePostalClient;
	}


	public String getVilleClient() {
		return villeClient;
	}


	public void setVilleClient(String villeClient) {
		this.villeClient = villeClient;
	}


	public String getPaysClient() {
		return paysClient;
	}


	public void setPaysClient(String paysClient) {
		this.paysClient = paysClient;
	}


	public double getLatitudeClient() {
		return latitudeClient;
	}


	public void setLatitudeClient(double latitudeClient) {
		this.latitudeClient = latitudeClient;
	}


	public double getLongitudeClient() {
		return longitudeClient;
	}


	public void setLongitudeClient(double longitudeClient) {
		this.longitudeClient = longitudeClient;
	}


	public String getEmailClient() {
		return emailClient;
	}


	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}
	
	
	

}
