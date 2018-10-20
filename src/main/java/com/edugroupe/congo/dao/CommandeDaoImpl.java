package com.edugroupe.congo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.edugroupe.congo.entities.Centre;
import com.edugroupe.congo.entities.Commande;

@Repository
public class CommandeDaoImpl implements IDao<Commande> {
	
	@PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public void save(Commande com) {
		EntityManager em = emf.createEntityManager();
	    em.getTransaction().begin();
	    em.persist(com);
	    em.getTransaction().commit();
	    em.close();
		
	}

	@Override
	public Commande load(Long idCommande) {
		EntityManager em = emf.createEntityManager();
	    Commande com = em.find(Commande.class, idCommande);
	    em.close();
	    return com;
	}

	@Override
	public void delete(Long idCommande) {
		EntityManager em = emf.createEntityManager();
		Commande com = em.find(Commande.class, idCommande);
	    em.getTransaction().begin();
	    em.remove(com);
	    em.getTransaction().commit();
	    em.close();
		
	}

	@Override
	public void update(Commande com) {
		EntityManager em = emf.createEntityManager();
	    em.getTransaction().begin();
	    em.merge(com);
	    em.getTransaction().commit();
	    em.close();
		
	}

	@Override
	public List<Commande> loadAll() {
			EntityManager em = emf.createEntityManager();
		    List<Commande> cmds = em.createQuery("Select com from Commande com").getResultList();
		    em.close();
		    return cmds;
		}
	}


