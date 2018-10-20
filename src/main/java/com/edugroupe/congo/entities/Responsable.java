package com.edugroupe.congo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue(value ="RESPONSABLE")
public class Responsable extends Employe implements Serializable{
	
	/*
	@OneToMany(mappedBy="employes")
	private Collection<Employe> employes;
	*/
	
	public Responsable() {
		super();
	
	}
	

	public Responsable(Collection<Employe> employes) {
		super();
		//this.employes = employes;
	}

	

	public Responsable(String login, String nomEmploye, String prenomEmploye, String passwordEmploye,
			String fonction) {
		super(login, nomEmploye, prenomEmploye, passwordEmploye, fonction);
		
	}

/*
	public Collection<Employe> getEmployes() {
		return employes;
	}


	public void setEmployes(Collection<Employe> employes) {
		this.employes = employes;
	}
	*/

}
