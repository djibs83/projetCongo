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
@Table(name="FOURNISSEUR")
public class Fournisseur implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFournisseur;
	private String nomFournisseur;
	
	@OneToMany(mappedBy="provider")
	private Collection<ProduitFournisseur> listPrdFour;
	
	
	public Fournisseur(String nomFournisseur) {
		super();
		this.nomFournisseur = nomFournisseur;
	}
	
	
	public Long getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public String getNomFournisseur() {
		return nomFournisseur;
	}

	public void setNomFournisseur(String nomFournisseur) {
		this.nomFournisseur = nomFournisseur;
	}

	public Fournisseur() {
		super();
		
	}
	
	
}
