package com.edugroupe.congo.test;


import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.edugroupe.congo.entities.Centre;
import com.edugroupe.congo.entities.Drone;
import com.edugroupe.congo.entities.Employe;
import com.edugroupe.congo.entities.Livreur;
import com.edugroupe.congo.entities.Magasinier;
import com.edugroupe.congo.entities.Responsable;
import com.edugroupe.congo.metier.CentreMetier;
import com.edugroupe.congo.metier.DroneMetier;
import com.edugroupe.congo.metier.EmployeMetier;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		CentreMetier metier = (CentreMetier) context.getBean(CentreMetier.class);
		
		//List<Centre> maliste = metier.getAllCentres();
		/*metier.saveCentre(new Centre("Centre orange", "5 rue Colbert", "Versailles", "78000", "France",
				2.124703, 48.804881));*/
		
	
		DroneMetier metier2 = (DroneMetier) context.getBean(DroneMetier.class);
		
		Centre moncentre = metier.getCentreById(5L);
		
		metier2.saveDrone(new Drone(10.5, 25.0, true, moncentre)); 
		
		//EmployeMetier metier1 = (EmployeMetier) context.getBean(EmployeMetier.class);
		
		//metier1.saveEmploye(new Livreur("mdp10", "Martin", "l'Alien", "klm", "Livreur"));
		//metier1.saveEmploye(new Responsable("mdp10", "Tony", "Soprano", "sqd", "Responasable"));
		//metier1.saveEmploye(new Employe("mdp10", "Rob", "Smith", "strs", "Magasinier"));

	}

}
