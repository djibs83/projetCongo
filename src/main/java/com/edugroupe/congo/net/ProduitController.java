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
import com.edugroupe.congo.entities.Produit;
import com.edugroupe.congo.metier.ProduitMetier;

@Controller
@RequestMapping("/produits")
public class ProduitController {
	
	@Autowired
	private ProduitMetier pm;
	
	
	@GetMapping("/liste")
	public String listerproduits(Model theModel) {
		
		
		List<Produit> produits = pm.getAllProduits();	
		theModel.addAttribute("produits", produits);
		return "listeproduits";
	}
	
	@GetMapping("/formAddProduit")
	public String ajouterProduit(Model theModel) {
		
		Produit p= new Produit();
		theModel.addAttribute("produit", p);
		return "produit-form";
	}
	
	@PostMapping("/saveProduit")
	public String saveProduit(@ModelAttribute("produit") Produit produit) {
		
		pm.saveProduit(produit);
		return "redirect:/produits/liste";
	}
	
	@GetMapping("/delete")
	public String deleteProduit(@RequestParam("idProduit") Long idProduit) {
		pm.deleteProduit(idProduit);
		return "redirect:/produits/liste";
	}
	
	@GetMapping("/formUpdateProduit")
	public String updateProduit(@RequestParam("idProduit") Long idProduit, Model theModel) {
		
		Produit p = pm.getProduitById(idProduit);
		theModel.addAttribute("produit",p);
		return "produit-update-form";
	}
	
	@PostMapping("/updateProduit")
	public String updateProduit(@ModelAttribute("produit") Produit p) {
		
		pm.updateProduit(p);
		
		return "redirect:/produits/liste";
	}

}
