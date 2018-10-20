package com.edugroupe.congo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DRONE")
public class Drone implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDrone;
	private double chargeMaxDrone;
	private double porteeMaxDrone;
	private boolean disponibiliteDrone;
	
	
	@ManyToOne
	@JoinColumn(name="centre")
	private Centre leCentre;
	

	
	@OneToMany(mappedBy="livreurDrone")
	private Collection<LivraisonDrone> livColisDrone;

	public Drone() {
		super();
		
	}

	
	public Long getIdDrone() {
		return idDrone;
	}

	public Drone(double chargeMaxDrone, double porteeMaxDrone, boolean disponibiliteDrone, Centre leCentre) {
		super();
		
		this.chargeMaxDrone = chargeMaxDrone;
		this.porteeMaxDrone = porteeMaxDrone;
		this.disponibiliteDrone = disponibiliteDrone;
		this.leCentre = leCentre;
	}

	public double getChargeMaxDrone() {
		return chargeMaxDrone;
	}

	public void setChargeMaxDrone(double chargeMaxDrone) {
		this.chargeMaxDrone = chargeMaxDrone;
	}

	public double getPorteeMaxDrone() {
		return porteeMaxDrone;
	}

	public void setPorteeMaxDrone(double porteeMaxDrone) {
		this.porteeMaxDrone = porteeMaxDrone;
	}

	public boolean getDisponibiliteDrone() {
		return disponibiliteDrone;
	}

	public void setDisponibiliteDrone(boolean disponibiliteDrone) {
		this.disponibiliteDrone = disponibiliteDrone;
	}

	public Centre getLeCentre() {
		return leCentre;
	}

	public void setLeCentre(Centre leCentre) {
		this.leCentre = leCentre;
	}

	public Collection<LivraisonDrone> getLivColisDrone() {
		return livColisDrone;
	}

	public void setLivColisDrone(Collection<LivraisonDrone> livColisDrone) {
		this.livColisDrone = livColisDrone;
	}

	public void setIdDrone(Long idDrone) {
		this.idDrone = idDrone;
	}

	
	

}
