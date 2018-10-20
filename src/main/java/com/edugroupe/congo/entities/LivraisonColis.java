package com.edugroupe.congo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import com.edugroupe.congo.entities_pks.LivraisonColisPk;


/*
@Entity
@Table(name="LivraisonColis")
@AssociationOverrides({
	@AssociationOverride( name="pk.employe",
			joinColumns=@JoinColumn(name="IdEmploye")),
	@AssociationOverride(name="pk.colis",
			joinColumns=@JoinColumn(name="idColis"))})
			
			*/
@Entity
@Table(name="LIVRAISON_COLIS")
@IdClass(LivraisonColisPk.class)
public class LivraisonColis implements Serializable{
	
	@Column(name="date_livraison")
	private Date dateHeureLivraison;
	
	/*@Id
	private Long idEmploye;
	@Id
	private Long idColis;*/
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_livreur")
	private Employe employelivreur;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_colis")
	private Colis delivery;
	
	
	
	public LivraisonColis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LivraisonColis(Date dateHeureLivraison) {
		super();
		this.dateHeureLivraison = dateHeureLivraison;
	}

	public Date getDateHeureLivraison() {
		return dateHeureLivraison;
	}

	public void setDateHeureLivraison(Date dateHeureLivraison) {
		this.dateHeureLivraison = dateHeureLivraison;
	}
	
	

}
