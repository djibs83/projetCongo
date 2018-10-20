package com.edugroupe.congo.entities;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.edugroupe.congo.entities_pks.LivraisonDronePk;


/*@Entity
@Table(name="LivraisonDrone")
@AssociationOverrides({
	@AssociationOverride( name="pk.colis",
			joinColumns=@JoinColumn(name="IdColis")),
	@AssociationOverride(name="pk.drone",
			joinColumns=@JoinColumn(name="idDrone"))})*/

@Entity
@Table(name="LIVRAISON_DRONE")
@IdClass(LivraisonDronePk.class)
public class LivraisonDrone implements Serializable{
	
	
	@Column(name="heure_depart")
	private Date dateHeureDepart;
	@Column(name="heure_livraison")
	private Date dateHeureLivraison;
	@Column(name="heure_retour")
	private Date dateHeureRetour;
	
	/*@Id
	private Long idDrone;
	@Id
	private Long idColis;*/
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_colis")
	private Colis deliveryDrone;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_drone")
	private Drone livreurDrone;
	
	
	
	
	public LivraisonDrone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public LivraisonDrone(Date dateHeureDepart, Date dateHeureLivraison, Date dateHeureRetour) {
		super();
		this.dateHeureDepart = dateHeureDepart;
		this.dateHeureLivraison = dateHeureLivraison;
		this.dateHeureRetour = dateHeureRetour;
	}



	public Date getDateHeureDepart() {
		return dateHeureDepart;
	}

	public void setDateHeureDepart(Date dateHeureDepart) {
		this.dateHeureDepart = dateHeureDepart;
	}

	public Date getDateHeureLivraison() {
		return dateHeureLivraison;
	}

	public void setDateHeureLivraison(Date dateHeureLivraison) {
		this.dateHeureLivraison = dateHeureLivraison;
	}

	public Date getDateHeureRetour() {
		return dateHeureRetour;
	}

	public void setDateHeureRetour(Date dateHeureRetour) {
		this.dateHeureRetour = dateHeureRetour;
	}

	
	

}
