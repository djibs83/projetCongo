package com.edugroupe.congo.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.edugroupe.congo.dao.IDao;
import com.edugroupe.congo.entities.Drone;

@Service
public class DroneMetier {
	
	@Autowired
	private IDao<Drone> dao;
	
	public void saveDrone(Drone d) {
	      try {
	          dao.save(d);
	      } catch (DataAccessException e) {
	          e.printStackTrace();
	      }
	  }
	
	
	public List<Drone> getAllDrones() {
	      try {
	          return dao.loadAll();
	      } catch (DataAccessException e) {
	          e.printStackTrace();
	      }
	      return null;
	  }
	
	public Drone getDroneById(Long idDrone) {
	      try {
	          return dao.load(idDrone);
	      } catch (DataAccessException e) {
	          e.printStackTrace();
	      }
	      return null;
	  }
	
	public void deleteDrone(Long idDrone) {
	      try {
	          dao.delete(idDrone);
	      } catch (DataAccessException e) {
	          e.printStackTrace();
	      }
	  }

	  public void updateDrone(Drone d) {
	      try {
	          dao.update(d);
	      } catch (DataAccessException e) {
	          e.printStackTrace();
	      }
	  }

}
