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
import com.edugroupe.congo.entities.Employe;
import com.edugroupe.congo.metier.EmployeMetier;
@Controller
@RequestMapping("/employes")
public class ControllerEmploye {
	
	@Autowired
	private EmployeMetier em;
	
	@GetMapping("/listemploye")
	public String listerEmployes(Model theModel) {
		
		
		List<Employe> lesEmployes = em.getAllEmployes();	
		theModel.addAttribute("employes", lesEmployes);
		return "listemploye";
	}
	
	@GetMapping("/addemploye")
	public String ajouterEmploye(Model theModel) {
		
		Employe empl = new Employe();
		theModel.addAttribute("employe", empl);
		return "addemploye";
	}
	
	@PostMapping("/saveEmploye")
	public String saveEmploye(@ModelAttribute("employe") Employe e) {
		
		em.saveEmploye(e);
		
		return "redirect:/employes/listemploye";
	}
	
}
