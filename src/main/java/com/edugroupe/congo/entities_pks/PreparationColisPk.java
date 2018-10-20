package com.edugroupe.congo.entities_pks;

import java.io.Serializable;
import java.util.Objects;

public class PreparationColisPk implements Serializable {
	
	private Long empPrep;
	private Long deliveryPrep;
	
	public PreparationColisPk() {
		}
	
	
	
	
	
	public PreparationColisPk(Long empPrep, Long deliveryPrep) {
		super();
		this.empPrep = empPrep;
		this.deliveryPrep = deliveryPrep;
	}
	
	





	public Long getEmpPrep() {
		return empPrep;
	}





	public void setEmpPrep(Long empPrep) {
		this.empPrep = empPrep;
	}





	public Long getDeliveryPrep() {
		return deliveryPrep;
	}





	public void setDeliveryPrep(Long deliveryPrep) {
		this.deliveryPrep = deliveryPrep;
	}





	@Override
    public int hashCode() {
        return Objects.hash(getEmpPrep(), getDeliveryPrep());
    }
	
	@Override
	public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof PreparationColisPk)) return false;
        PreparationColisPk pk = (PreparationColisPk) obj;
        return pk.empPrep.equals(this.empPrep) && pk.deliveryPrep.equals(this.deliveryPrep);
    }
	

}
