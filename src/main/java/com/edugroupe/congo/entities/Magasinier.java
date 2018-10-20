package com.edugroupe.congo.entities;

import java.io.Serializable;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="MAGASINIER")

public class Magasinier extends Employe implements Serializable{

	public Magasinier() {
		super();
		
	}

	public Magasinier(String login, String nomEmploye, String prenomEmploye, String passwordEmploye,
			String fonction) {
		super(login, nomEmploye, prenomEmploye, passwordEmploye, fonction);
		
	}
	
	

}
