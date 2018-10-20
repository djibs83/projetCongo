package com.edugroupe.congo.entities_pks;

import java.io.Serializable;
import java.util.Objects;

public class DetailCommandePk implements Serializable {
	
	private Long produit;
	private Long commande;
	
	public DetailCommandePk() {
		}
	
	
	
	
	public DetailCommandePk(Long produit, Long commande) {
		super();
		this.produit = produit;
		this.commande = commande;
	}
	
	




	public Long getProduit() {
		return produit;
	}




	public void setProduit(Long produit) {
		this.produit = produit;
	}




	public Long getCommande() {
		return commande;
	}




	public void setCommande(Long commande) {
		this.commande = commande;
	}




	@Override
    public int hashCode() {
        return Objects.hash(getProduit(), getCommande());
    }
	
	@Override
	public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof DetailCommandePk)) return false;
        DetailCommandePk pk = (DetailCommandePk) obj;
        return pk.produit.equals(this.produit) && pk.commande.equals(this.commande);
    }
	

}
