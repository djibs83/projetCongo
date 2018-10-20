package com.edugroupe.congo.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PRODUIT")
public class Produit {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduit;
	private String designation;
	private String description;
	private double poidsProduit;
	
	
	@OneToMany(mappedBy="product")
	private Collection<ProduitFournisseur> listPrdFour;
	
	
	@OneToMany(mappedBy="produitStocke")
	private Collection<ProduitStock> lesStocks;
	
	
	@OneToMany(mappedBy="produit")
	private Collection<DetailCommande> detailsCommande;
	
	
	@OneToMany (mappedBy="produit")
	private Collection<DetailColis> detailsColis;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Produit(String designation, String description, double poidsProduit) {
		super();
		this.designation = designation;
		this.description = description;
		this.poidsProduit = poidsProduit;
	}


	public Long getIdProduit() {
		return idProduit;
	}


	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPoidsProduit() {
		return poidsProduit;
	}


	public void setPoidsProduit(double poidsProduit) {
		this.poidsProduit = poidsProduit;
	}

	
	

}
