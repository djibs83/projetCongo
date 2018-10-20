package com.edugroupe.congo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
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

@Entity
@Table(name="EMPLOYE")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) 
@DiscriminatorColumn(name="FONCTION", discriminatorType=DiscriminatorType.STRING, length=20)
@DiscriminatorValue( "null" )
public class Employe implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEmploye;
	private String login;
	private String nomEmploye;
	private String prenomEmploye;
	private String passwordEmploye;
	private String fonction;
	
	
	@ManyToOne
	@JoinColumn(name="centre")
	private Centre leCentre;
	//private Collection<Centre> centres;
	/*
	@ManyToOne
	@JoinColumn(name="employes")
	*/
	private Employe responsable;
	
	
	
	
	@OneToMany(mappedBy="employelivreur")
	private Collection<LivraisonColis> livColis;
	
	
	@OneToMany(mappedBy="empPrep")
	private Collection<PreparationColis> listPrep;
	
	 
	public Employe() {
		super();
	}


	public Employe(String login, String nomEmploye, String prenomEmploye, String passwordEmploye,
			String fonction) {
		super();
		
		this.login = login;
		this.nomEmploye = nomEmploye;
		this.prenomEmploye = prenomEmploye;
		this.passwordEmploye = passwordEmploye;
		this.fonction = fonction;
	}


	public Long getIdEmploye() {
		return idEmploye;
	}


	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getNomEmploye() {
		return nomEmploye;
	}


	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}


	public String getPrenomEmploye() {
		return prenomEmploye;
	}


	public void setPrenomEmploye(String prenomEmploye) {
		this.prenomEmploye = prenomEmploye;
	}


	public String getPasswordEmploye() {
		return passwordEmploye;
	}


	public void setPasswordEmploye(String passwordEmploye) {
		this.passwordEmploye = passwordEmploye;
	}


	public String getFonction() {
		return fonction;
	}


	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public Centre getLeCentre() {
		return leCentre;
	}


	public void setLeCentre(Centre leCentre) {
		this.leCentre = leCentre;
	}


	/*
	public Collection<Centre> getCentres() {
		return centres;
	}


	public void setCentres(Collection<Centre> centres) {
		this.centres = centres;
	}
	*/
	public Employe getResponsable() {
		return responsable;
	}


	public void setResponsable(Employe responsable) {
		this.responsable = responsable;
	}


}
