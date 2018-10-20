package com.edugroupe.congo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.edugroupe.congo.entities.Produit;

@Repository
public class ProduitDaoImpl implements IDao<Produit> {

	@PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public void save(Produit p) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
	}
	
	@Override
	public Produit load(Long idProduit) {
		
		EntityManager em = emf.createEntityManager();
	    Produit p = em.find(Produit.class, idProduit);
	    em.close();
	    return p;
	
	}
	
	@Override
	public void delete(Long idProduit) {
		EntityManager em = emf.createEntityManager();
	    Produit p = em.find(Produit.class, idProduit);
	    em.getTransaction().begin();
	    em.remove(p);
	    em.getTransaction().commit();
	    em.close();
		
	}

	@Override
	public void update(Produit p) {
		EntityManager em = emf.createEntityManager();
	    em.getTransaction().begin();
	    em.merge(p);
	    em.getTransaction().commit();
	    em.close();
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Produit> loadAll() {
		EntityManager em = emf.createEntityManager();
	    List<Produit>  prods= em.createQuery("Select p from Produit p").getResultList();
	    em.close();
	    return prods;
			
	}

}
