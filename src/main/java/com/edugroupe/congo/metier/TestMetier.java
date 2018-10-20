package com.edugroupe.congo.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.edugroupe.congo.dao.IDao;
import com.edugroupe.congo.entities.Centre;
import com.edugroupe.congo.entities.Colis;

@Service
public class TestMetier {

	@Autowired
	private IDao<Centre> daoCentre;

	@Autowired
	private IDao<Colis> daoColis;

	public void saveCentre(Centre c) {
		try {
			daoCentre.save(c);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

	public List<Centre> getAllCentres() {
		try {
			return daoCentre.loadAll();
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Centre getCentreById(Long idCentre) {
		try {
			return daoCentre.load(idCentre);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void deleteCentre(Long idCentre) {
		try {
			daoCentre.delete(idCentre);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

	public void updateCentre(Centre c) {
		try {
			daoCentre.update(c);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

	public void saveColis(Colis col) {
		try {
			daoColis.save(col);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

}
