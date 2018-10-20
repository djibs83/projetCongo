package com.edugroupe.congo.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="LIVREUR")
public class Livreur extends Employe implements Serializable{

	public Livreur() {
		super();
	}

	public Livreur(String login, String nomEmploye, String prenomEmploye, String passwordEmploye,
			String fonction) {
		super(login, nomEmploye, prenomEmploye, passwordEmploye, fonction);
		
	}

}
