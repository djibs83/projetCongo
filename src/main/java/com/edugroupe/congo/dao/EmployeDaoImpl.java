package com.edugroupe.congo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.PersistenceUnit;
import org.springframework.stereotype.Repository;


import com.edugroupe.congo.entities.Employe;

@Repository
public class EmployeDaoImpl implements IDao<Employe> {

	@PersistenceUnit
	private EntityManagerFactory emf;
	
	@Override
	public void save(Employe emp) {
		EntityManager em = emf.createEntityManager();
	    em.getTransaction().begin();
	    em.persist(emp);
	    em.getTransaction().commit();
	    em.close();
		
	}

	@Override
	public Employe load(Long idEmploye) {
		EntityManager em = emf.createEntityManager();
		Employe emp = em.find(Employe.class, idEmploye);
	    em.close();
	    return emp;
	}

	@Override
	public void delete(Long idEmploye) {
		EntityManager em = emf.createEntityManager();
		Employe emp = em.find(Employe.class, idEmploye);
	    em.getTransaction().begin();
	    em.remove(emp);
	    em.getTransaction().commit();
	    em.close();
		
	}

	@Override
	public void update(Employe emp) {
		EntityManager em = emf.createEntityManager();
	    em.getTransaction().begin();
	    em.merge(emp);
	    em.getTransaction().commit();
	    em.close();
		
	}

	@Override
	public List<Employe> loadAll() {
		EntityManager em = emf.createEntityManager();
	    List<Employe> employes = em.createQuery("Select e from Employe e").getResultList();
	    em.close();
	    return employes;
	}


}
