package com.edugroupe.congo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PreRemove;
import javax.persistence.Table;

import com.edugroupe.congo.entities_pks.ProduitFournisseurPk;




@Entity
@Table(name="PRODUIT_FOURNISSEUR")
@IdClass(ProduitFournisseurPk.class)
public class ProduitFournisseur implements Serializable {
	
	@Column(name="quantite")
	private int quantite;
	
	@Column(name="date_livraison")
	private Date dateLivraison;
	
	/*@PreRemove
	private void before() {
		
	}*/
	
	/*@Id
	private Long idFournisseur;
	@Id
	private Long idProduit;*/
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_produit")
	private Produit product;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_fournisseur")
	private Fournisseur provider;
	
	public ProduitFournisseur() {
		super();
		
	}

	public ProduitFournisseur(int quantite, Date dateLivraison, Produit product, Fournisseur provider) {
		super();
		this.quantite = quantite;
		this.dateLivraison = dateLivraison;
		this.product = product;
		this.provider = provider;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Date getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public Produit getProduct() {
		return product;
	}

	public void setProduct(Produit product) {
		this.product = product;
	}

	public Fournisseur getProvider() {
		return provider;
	}

	public void setProvider(Fournisseur provider) {
		this.provider = provider;
	}
	
}
