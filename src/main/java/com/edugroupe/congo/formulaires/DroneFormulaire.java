package com.edugroupe.congo.formulaires;

public class DroneFormulaire {
	
	private double chargeMaxDrone;
	private double porteeMaxDrone;
	private boolean disponibiliteDrone;
	private Long idCentre;
	
	
	public DroneFormulaire(double chargeMaxDrone, double porteeMaxDrone, boolean disponibiliteDrone, Long idCentre) {
		super();
		this.chargeMaxDrone = chargeMaxDrone;
		this.porteeMaxDrone = porteeMaxDrone;
		this.disponibiliteDrone = disponibiliteDrone;
		this.idCentre = idCentre;
	}


	public DroneFormulaire() {
		super();
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


	public boolean isDisponibiliteDrone() {
		return disponibiliteDrone;
	}


	public void setDisponibiliteDrone(boolean disponibiliteDrone) {
		this.disponibiliteDrone = disponibiliteDrone;
	}


	public Long getIdCentre() {
		return idCentre;
	}


	public void setIdCentre(Long idCentre) {
		this.idCentre = idCentre;
	}
	
	
	
	

}
