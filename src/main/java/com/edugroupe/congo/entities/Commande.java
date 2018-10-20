package com.edugroupe.congo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

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
@Table(name="COMMANDE")
public class Commande implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCommande;
	private Date dateHeureEnregistrement;
	
	@NotNull
	private boolean statutCommande; 
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	
	@OneToMany(mappedBy="commande")
	private Collection<Colis> listColisCmd;
	
	@OneToMany(mappedBy="commande")
	private Collection<DetailCommande> detailsCommande;
	
	

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commande(Date dateHeureEnregistrement, boolean statutCommande, Client client) {
		super();
		this.dateHeureEnregistrement = dateHeureEnregistrement;
		this.statutCommande = statutCommande;
		this.client = client;
	}

	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateHeureEnregistrement() {
		return dateHeureEnregistrement;
	}

	public void setDateHeureEnregistrement(Date dateHeureEnregistrement) {
		this.dateHeureEnregistrement = dateHeureEnregistrement;
	}

	public boolean isStatutCommande() {
		return statutCommande;
	}

	public void setStatutCommande(boolean statutCommande) {
		this.statutCommande = statutCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	

}
