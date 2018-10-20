package com.edugroupe.congo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.edugroupe.congo.entities_pks.DetailColisPk;



@Entity
@Table(name="DETAIL_COLIS")
@IdClass(DetailColisPk.class)
public class DetailColis implements Serializable {

	@Column(name = "quantite")
	private int quantite;
	
	/*@Id
	private Long idProduit;
	@Id
	private Long idColis;*/
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_produit")
	private Produit produit;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_colis")
	private Colis colis;
	

	public DetailColis() {
		}

	public DetailColis(int quantite, Produit produit, Colis colis) {
		
		this.quantite = quantite;
		this.produit = produit;
		this.colis = colis;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Colis getColis() {
		return colis;
	}

	public void setColis(Colis colis) {
		this.colis = colis;
	}
	
	
}
