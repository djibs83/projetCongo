package com.edugroupe.congo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="CENTRE")
public class Centre implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCentre;
	private String nomCentre;
	private String adresseCentre;
	private String villeCentre;
	private String codePostalCentre;
	private String paysCentre;
	private double longitudeCentre;
	private double latitudeCentre;
	
	
	
	@OneToMany(mappedBy="leCentre")
	private Collection<Employe> employes;
	
	@OneToMany(mappedBy="leCentre")
	private Collection<Drone> drones;
	
	
	@OneToMany (mappedBy="centreDeStock")
	private Collection<ProduitStock> lesStocks;
	
	
	public Centre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Centre(String nomCentre, String adresseCentre, String villeCentre, String codePostalCentre,
			String paysCentre, double longitudeCentre, double latitudeCentre) {
		super();
		this.nomCentre = nomCentre;
		this.adresseCentre = adresseCentre;
		this.villeCentre = villeCentre;
		this.codePostalCentre = codePostalCentre;
		this.paysCentre = paysCentre;
		this.longitudeCentre = longitudeCentre;
		this.latitudeCentre = latitudeCentre;
	}
	
	public Long getIdCentre() {
		return idCentre;
	}

	public void setIdCentre(Long idCentre) {
		this.idCentre = idCentre;
	}

	public String getNomCentre() {
		return nomCentre;
	}

	public void setNomCentre(String nomCentre) {
		this.nomCentre = nomCentre;
	}

	public String getAdresseCentre() {
		return adresseCentre;
	}

	public void setAdresseCentre(String adresseCentre) {
		this.adresseCentre = adresseCentre;
	}

	public String getVilleCentre() {
		return villeCentre;
	}

	public void setVilleCentre(String villeCentre) {
		this.villeCentre = villeCentre;
	}

	public String getCodePostalCentre() {
		return codePostalCentre;
	}

	public void setCodePostalCentre(String codePostalCentre) {
		this.codePostalCentre = codePostalCentre;
	}

	public String getPaysCentre() {
		return paysCentre;
	}

	public void setPaysCentre(String paysCentre) {
		this.paysCentre = paysCentre;
	}

	public double getLongitudeCentre() {
		return longitudeCentre;
	}

	public void setLongitudeCentre(double longitudeCentre) {
		this.longitudeCentre = longitudeCentre;
	}

	public double getLatitudeCentre() {
		return latitudeCentre;
	}

	public void setLatitudeCentre(double latitudeCentre) {
		this.latitudeCentre = latitudeCentre;
	}

	public Collection<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(Collection<Employe> employes) {
		this.employes = employes;
	}

	public Collection<Drone> getDrones() {
		return drones;
	}

	public void setDrones(Collection<Drone> drones) {
		this.drones = drones;
	}
	
	


}
