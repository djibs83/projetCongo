package com.edugroupe.congo.entities_pks;

import java.io.Serializable;
import java.util.Objects;



public class DetailColisPk implements Serializable {
	
	private Long produit;
	private Long colis;
	
	public DetailColisPk() {
		}
	
	
	public DetailColisPk(Long produit, Long colis) {
		super();
		this.produit = produit;
		this.colis = colis;
	}


	
	
	public Long getProduit() {
		return produit;
	}


	public void setProduit(Long produit) {
		this.produit = produit;
	}


	public Long getColis() {
		return colis;
	}


	public void setColis(Long colis) {
		this.colis = colis;
	}


	@Override
    public int hashCode() {
        return Objects.hash(getProduit(), getColis());
    }
	
	@Override
	public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof DetailColisPk)) return false;
        DetailColisPk pk = (DetailColisPk) obj;
        return pk.produit.equals(this.produit) && pk.colis.equals(this.colis);
    }
	

}
