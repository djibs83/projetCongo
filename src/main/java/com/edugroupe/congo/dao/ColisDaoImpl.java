package com.edugroupe.congo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;


import com.edugroupe.congo.entities.Colis;

@Repository
public class ColisDaoImpl implements IDao<Colis> {
	
	@PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public void save(Colis col) {
		EntityManager em = emf.createEntityManager();
	    em.getTransaction().begin();
	    em.persist(col);
	    em.getTransaction().commit();
	    em.close();
		
	}

	@Override
	public Colis load(Long idColis) {
		EntityManager em = emf.createEntityManager();
		Colis col = em.find(Colis.class, idColis);
	    em.close();
	    return col;
	}

	@Override
	public void delete(Long idColis) {
		EntityManager em = emf.createEntityManager();
		Colis col = em.find(Colis.class, idColis);
	    em.getTransaction().begin();
	    em.remove(col);
	    em.getTransaction().commit();
	    em.close();
		
	}

	@Override
	public void update(Colis col) {
		EntityManager em = emf.createEntityManager();
	    em.getTransaction().begin();
	    em.merge(col);
	    em.getTransaction().commit();
	    em.close();
		
	}

	@Override
	public List<Colis> loadAll() {
		EntityManager em = emf.createEntityManager();
	    List<Colis> cols = em.createQuery("Select col from Colis col").getResultList();
	    em.close();
	    return cols;
	}
	
	

}
