package com.edugroupe.congo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;


import com.edugroupe.congo.entities.Drone;


@Repository
public class DroneDaoImpl implements IDao<Drone> {
	
	@PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public void save(Drone d) {
		EntityManager em = emf.createEntityManager();
	    em.getTransaction().begin();
	    em.persist(d);
	    em.getTransaction().commit();
	    em.close();
		
	}

	@Override
	public Drone load(Long idDrone) {
		EntityManager em = emf.createEntityManager();
	    Drone d = em.find(Drone.class, idDrone);
	    em.close();
	    return d;
	}

	@Override
	public void delete(Long idDrone) {
		EntityManager em = emf.createEntityManager();
		Drone d = em.find(Drone.class, idDrone);
	    em.getTransaction().begin();
	    em.remove(d);
	    em.getTransaction().commit();
	    em.close();
		
	}

	@Override
	public void update(Drone d) {
		EntityManager em = emf.createEntityManager();
	    em.getTransaction().begin();
	    em.merge(d);
	    em.getTransaction().commit();
	    em.close();
		
	}

	@Override
	public List<Drone> loadAll() {
		EntityManager em = emf.createEntityManager();
	    List<Drone> drnes = em.createQuery("Select d from Drone d", Drone.class).getResultList();
	    em.close();
	    return drnes;
	}

}
