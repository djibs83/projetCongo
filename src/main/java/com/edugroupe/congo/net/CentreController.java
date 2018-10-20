package com.edugroupe.congo.net;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.edugroupe.congo.entities.Centre;
import com.edugroupe.congo.metier.CentreMetier;


@Controller
@RequestMapping("/centres")
public class CentreController {
	
	@Autowired
	private CentreMetier cm;
	
	
	@GetMapping("/liste")
	public String listerCentres(Model theModel) {
		
		
		List<Centre> theCentres = cm.getAllCentres();	
		theModel.addAttribute("centres", theCentres);
		return "listecentres";
	}
	
	@GetMapping("/formAddCentre")
	public String ajouterCentre(Model theModel) {
		
		Centre theCentre = new Centre();
		theModel.addAttribute("centre", theCentre);
		return "centre-form";
	}
	
	@PostMapping("/saveCentre")
	public String saveCentre(@ModelAttribute("centre") Centre theCentre) {
		
		cm.saveCentre(theCentre);
		return "redirect:/centres/liste";
	}
	
	@GetMapping("/delete")
	public String deleteCentre(@RequestParam("idCentre") Long idCentre) {
		cm.deleteCentre(idCentre);
		return "redirect:/centres/liste";
	}
	
	
	@GetMapping("/formUpdateCentre")
	public String updateCentre(@RequestParam("idCentre") Long idCentre, Model theModel) {
		
		Centre theCentre = cm.getCentreById(idCentre);
		theModel.addAttribute("centre",theCentre);
		return "centre-update-form";
	}
	
	@PostMapping("/updateCentre")
	public String updateCentre(@ModelAttribute("centre") Centre theCentre) {
		
		cm.updateCentre(theCentre);
		
		return "redirect:/centres/liste";
	}
	
}
