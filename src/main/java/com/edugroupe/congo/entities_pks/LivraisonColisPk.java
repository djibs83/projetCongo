package com.edugroupe.congo.entities_pks;

import java.io.Serializable;
import java.util.Objects;

public class LivraisonColisPk implements Serializable {
	
	private Long employelivreur;
	private Long delivery;
	
	public LivraisonColisPk() {
		}
	
	
	


	public LivraisonColisPk(Long employelivreur, Long delivery) {
		super();
		this.employelivreur = employelivreur;
		this.delivery = delivery;
	}
	
	





	
	
	public Long getEmployelivreur() {
		return employelivreur;
	}





	public void setEmployelivreur(Long employelivreur) {
		this.employelivreur = employelivreur;
	}





	public Long getDelivery() {
		return delivery;
	}





	public void setDelivery(Long delivery) {
		this.delivery = delivery;
	}





	@Override
    public int hashCode() {
        return Objects.hash(getEmployelivreur(), getDelivery());
    }
	
	@Override
	public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof LivraisonColisPk)) return false;
        LivraisonColisPk pk = (LivraisonColisPk) obj;
        return pk.employelivreur.equals(this.employelivreur) && pk.delivery.equals(this.delivery);
    }
	

}
