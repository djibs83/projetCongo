package com.edugroupe.congo.net;

import java.util.List;
import java.util.SortedMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.edugroupe.congo.entities.Centre;
import com.edugroupe.congo.entities.Drone;
import com.edugroupe.congo.formulaires.DroneFormulaire;
import com.edugroupe.congo.metier.CentreMetier;
import com.edugroupe.congo.metier.DroneMetier;



@Controller
@RequestMapping("/drones")
public class DroneController {
	
	@Autowired
	private DroneMetier dm;
	
	@Autowired
	private CentreMetier cm;
	
	
	@GetMapping("/liste")
	public String listerDrones(Model theModel) {
		
		
		List<Drone> theDrones = dm.getAllDrones();	
		theModel.addAttribute("drones", theDrones);
		return "listedrones";
	}
	
	@GetMapping("/formAddDrone")
	public String ajouterDrone(Model theModel) {
		
		List<Centre> lescentres = cm.getAllCentres();
		theModel.addAttribute("lescentres", lescentres);
		
		//Drone theDrone = new Drone();
		//theModel.addAttribute("drone", theDrone);
		
		//Centre leCentre = new Centre();
		
		//theModel.addAttribute("leCentre", leCentre);
		
		DroneFormulaire formulaire = new DroneFormulaire();
		theModel.addAttribute("formulaire", formulaire);
		
		return "drone-form";
	}
	
	@PostMapping("/saveDrone")
	public String saveDrone(@ModelAttribute("formulaire") DroneFormulaire formulaire,
			Model theModel) {
		
		//Centre leCentre = cm.getCentreById(idCentre);
		//theDrone.setLeCentre(leCentre);
		
		//dm.saveDrone(theDrone);
		
		
		Centre leCentre = cm.getCentreById(formulaire.getIdCentre());
		Drone theDrone = new Drone(formulaire.getChargeMaxDrone(), formulaire.getPorteeMaxDrone(), 
				formulaire.isDisponibiliteDrone(), leCentre);
		dm.saveDrone(theDrone);
		
		
		return "redirect:/drones/liste";
	}
	
	@GetMapping("/delete")
	public String deleteDrone(@RequestParam("idDrone") Long idDrone) {
		dm.deleteDrone(idDrone);
		return "redirect:/drones/liste";
	}
	
	
	@GetMapping("/formUpdateDrone")
	public String updateDrone(@RequestParam("idDrone") Long idDrone, Model theModel) {
		
		Drone theDrone = dm.getDroneById(idDrone);
		theModel.addAttribute("drone",theDrone);
		return "drone-update-form";
	}
	
	@PostMapping("/updateDrone")
	public String updateDrone(@ModelAttribute("drone") Drone theDrone) {
		
		dm.updateDrone(theDrone);
		
		return "redirect:/drone/liste";
	}

}



