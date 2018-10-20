package com.edugroupe.congo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.edugroupe.congo.entities_pks.ProduitStockPk;




@Entity
@Table(name="PRODUIT_STOCK")
@IdClass(ProduitStockPk.class)
public class ProduitStock implements Serializable {
	
	@Column(name="quantite")
	private int quantite;
	
	/*@Id
	private Long idCentre;
	@Id
	private Long idProduit;*/
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_produit")
	private Produit produitStocke; 
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_centre")
	private Centre centreDeStock;
	
	
	public ProduitStock() {
		
	}

	
	public ProduitStock(int quantite, Produit produitStocke, Centre centreDeStock) {
		
		this.quantite = quantite;
		this.produitStocke = produitStocke;
		this.centreDeStock = centreDeStock;
	}




	public int getQuantite() {
		return quantite;
	}




	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}




	public Produit getProduitStocke() {
		return produitStocke;
	}




	public void setProduitStocke(Produit produitStocke) {
		this.produitStocke = produitStocke;
	}




	public Centre getCentreDeStock() {
		return centreDeStock;
	}




	public void setCentreDeStock(Centre centreDeStock) {
		this.centreDeStock = centreDeStock;
	}



}
