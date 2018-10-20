package com.edugroupe.congo.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.edugroupe.congo.dao.IDao;
import com.edugroupe.congo.entities.Produit;

@Service
public class ProduitMetier {

	@Autowired
	private IDao<Produit> dao;

	public void saveProduit(Produit p) {
		try {
			dao.save(p);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}

	}

	public List<Produit> getAllProduits() {
		try {
			return dao.loadAll();
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Produit getProduitById(Long idProduit) {
		try {
			return dao.load(idProduit);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void deleteProduit(Long idProduit) {
		try {
			dao.delete(idProduit);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

	public void updateProduit(Produit p) {
		try {
			dao.update(p);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

}
