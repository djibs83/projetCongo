package com.edugroupe.congo.dao;

import java.util.List;
//tedsfg;:f,gs:fg,:;fsn
import
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.edugroupe.congo.entities.Centre;

@Repository
public class CentreDaoImpl implements IDao<Centre> {
	
	@PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public void save(Centre c) {
		EntityManager em = emf.createEntityManager();
	    em.getTransaction().begin();
	    em.persist(c);
	    em.getTransaction().commit();
	    em.close();
		
	}

	@Override
	public Centre load(Long idCentre) {
		EntityManager em = emf.createEntityManager();
	    Centre c = em.find(Centre.class, idCentre);
	    em.close();
	    return c;
	}

	@Override
	public void delete(Long idCentre) {
		EntityManager em = emf.createEntityManager();
	    Centre c = em.find(Centre.class, idCentre);
	    em.getTransaction().begin();
	    em.remove(c);
	    em.getTransaction().commit();
	    em.close();
		
	}

	@Override
	public void update(Centre c) {
		EntityManager em = emf.createEntityManager();
	    em.getTransaction().begin();
	    em.merge(c);
	    em.getTransaction().commit();
	    em.close();
		
	}

	@Override
	public List<Centre> loadAll() {
		EntityManager em = emf.createEntityManager();
	    List<Centre> ctres = em.createQuery("Select c from Centre c", Centre.class).getResultList();
	    em.close();
	    return ctres;
	    
	    //"Select c from Centre c left join fetch c.commandes"
	}

}
