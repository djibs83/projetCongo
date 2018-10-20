package com.edugroupe.congo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import com.edugroupe.congo.entities_pks.DetailCommandePk;






@Entity
@Table(name="DETAIL_COMMANDE")
@IdClass(DetailCommandePk.class)
public class DetailCommande implements Serializable {
	
	@Column(name = "quantite")
	private int quantite;
	
	/*@Id
	private Long idProduit;
	@Id
	private Long idCommande;*/
	
	@Id
	@ManyToOne
	//@PrimaryKeyJoinColumn(name="id_produit", referencedColumnName = "idProduit")
	@JoinColumn(name="id_produit")
	private Produit produit;
	
	@Id
	@ManyToOne
	//@PrimaryKeyJoinColumn(name="id_commande", referencedColumnName = "idCommande")
	@JoinColumn(name="id_commande")
	private Commande commande;
	
	

	public DetailCommande() {
		
	}

	public DetailCommande(int quantite, Produit produit, Commande commande) {
		this.quantite = quantite;
		this.produit = produit;
		this.commande = commande;
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

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	

}
