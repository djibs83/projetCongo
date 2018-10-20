package com.edugroupe.congo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="COLIS")
public class Colis implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idColis;
	
	private String typeColis;
	private double poidsColis;
	private String statutColis;
	
	@NotNull
	private boolean indicationLivraison;
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="idCommande")
	private Commande commande;
	
	@OneToMany(mappedBy="delivery")
	private Collection<LivraisonColis> livColis;
	
	@OneToMany(mappedBy="deliveryDrone")
	private Collection<LivraisonDrone> livColisDrone;
	
	@OneToMany (mappedBy="deliveryPrep")
	private Collection<PreparationColis> listPrep;
	
	@OneToMany (mappedBy="colis")
	private Collection<DetailColis> detailsColis;
	

	public Colis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Colis(String typeColis, double poidsColis, String statutColis, boolean indicationLivraison, Client client,
			Commande commande) {
		super();
		this.typeColis = typeColis;
		this.poidsColis = poidsColis;
		this.statutColis = statutColis;
		this.indicationLivraison = indicationLivraison;
		this.client = client;
		this.commande = commande;
	}

	public Long getIdColis() {
		return idColis;
	}

	public void setIdColis(Long idColis) {
		this.idColis = idColis;
	}

	public String getTypeColis() {
		return typeColis;
	}

	public void setTypeColis(String typeColis) {
		this.typeColis = typeColis;
	}

	public double getPoidsColis() {
		return poidsColis;
	}

	public void setPoidsColis(double poidsColis) {
		this.poidsColis = poidsColis;
	}

	public String getStatutColis() {
		return statutColis;
	}

	public void setStatutColis(String statutColis) {
		this.statutColis = statutColis;
	}

	public boolean isIndicationLivraison() {
		return indicationLivraison;
	}

	public void setIndicationLivraison(boolean indicationLivraison) {
		this.indicationLivraison = indicationLivraison;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	
	

}
