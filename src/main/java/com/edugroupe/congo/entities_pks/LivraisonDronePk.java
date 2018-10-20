package com.edugroupe.congo.entities_pks;

import java.io.Serializable;
import java.util.Objects;

public class LivraisonDronePk implements Serializable {
	
	
	private Long deliveryDrone;
	private Long livreurDrone;
	
	public LivraisonDronePk() {
		}
	
	
	
	public LivraisonDronePk(Long deliveryDrone, Long livreurDrone) {
		super();
		this.deliveryDrone = deliveryDrone;
		this.livreurDrone = livreurDrone;
	}


	public Long getDeliveryDrone() {
		return deliveryDrone;
	}



	public void setDeliveryDrone(Long deliveryDrone) {
		this.deliveryDrone = deliveryDrone;
	}



	public Long getLivreurDrone() {
		return livreurDrone;
	}



	public void setLivreurDrone(Long livreurDrone) {
		this.livreurDrone = livreurDrone;
	}



	@Override
    public int hashCode() {
        return Objects.hash(getLivreurDrone(), getDeliveryDrone());
    }
	
	@Override
	public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof LivraisonDronePk)) return false;
        LivraisonDronePk pk = (LivraisonDronePk) obj;
        return pk.livreurDrone.equals(this.livreurDrone) && pk.deliveryDrone.equals(this.deliveryDrone);
    }

}
