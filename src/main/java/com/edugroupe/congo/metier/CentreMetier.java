package com.edugroupe.congo.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.edugroupe.congo.dao.IDao;
import com.edugroupe.congo.entities.Centre;

@Service
public class CentreMetier {
	
	@Autowired
	private IDao<Centre> dao;
	
	public void saveCentre(Centre c) {
	      try {
	          dao.save(c);
	      } catch (DataAccessException e) {
	          e.printStackTrace();
	      }
	  }

	  public List<Centre> getAllCentres() {
	      try {
	          return dao.loadAll();
	      } catch (DataAccessException e) {
	          e.printStackTrace();
	      }
	      return null;
	  }

	  public Centre getCentreById(Long idCentre) {
	      try {
	          return dao.load(idCentre);
	      } catch (DataAccessException e) {
	          e.printStackTrace();
	      }
	      return null;
	  }

	  public void deleteCentre(Long idCentre) {
	      try {
	          dao.delete(idCentre);
	      } catch (DataAccessException e) {
	          e.printStackTrace();
	      }
	  }

	  public void updateCentre(Centre c) {
	      try {
	          dao.update(c);
	      } catch (DataAccessException e) {
	          e.printStackTrace();
	      }
	  }

}
