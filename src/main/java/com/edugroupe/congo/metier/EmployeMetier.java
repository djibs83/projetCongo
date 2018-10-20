package com.edugroupe.congo.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.edugroupe.congo.dao.IDao;
import com.edugroupe.congo.entities.Employe;

@Service
public class EmployeMetier {
	
	@Autowired
	private IDao<Employe> dao;
	
	public void saveEmploye(Employe emp) {
	      try {
	          dao.save(emp);
	      } catch (DataAccessException e) {
	          e.printStackTrace();
	      }
	  }
	 public List<Employe> getAllEmployes() {
	      try {
	          return dao.loadAll();
	      } catch (DataAccessException e) {
	          e.printStackTrace();
	      }
	      return null;
	  }
	
	public Employe getEmployeById(Long idEmploye) {
	      try {
	          return dao.load(idEmploye);
	      } catch (DataAccessException e) {
	          e.printStackTrace();
	      }
	      return null;
	  }
	 
	
	public void deletePerson(Long idEmploye) {
	      try {
	          dao.delete(idEmploye);
	      } catch (DataAccessException e) {
	          e.printStackTrace();
	      }
	  }
	 
	 public void updatePerson(Employe emp) {
	      try {
	          dao.update(emp);
	      } catch (DataAccessException e) {
	          e.printStackTrace();
	      }
	  }


}
