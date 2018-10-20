package com.edugroupe.congo.entities_pks;

import java.io.Serializable;
import java.util.Objects;

public class ProduitFournisseurPk implements Serializable {
	
	

	private Long product;
	private Long provider;
	
	
	public ProduitFournisseurPk() {
		
	}
	
	
	public ProduitFournisseurPk(Long product, Long provider) {
		super();
		this.product = product;
		this.provider = provider;
	}






	public Long getProduct() {
		return product;
	}


	public void setProduct(Long product) {
		this.product = product;
	}


	public Long getProvider() {
		return provider;
	}


	public void setProvider(Long provider) {
		this.provider = provider;
	}


	@Override
    public int hashCode() {
        return Objects.hash(getProvider(), getProduct());
    }
	
	@Override
	public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof ProduitFournisseurPk)) return false;
        ProduitFournisseurPk pk = (ProduitFournisseurPk) obj;
        return pk.provider.equals(this.provider) && pk.product.equals(this.product);
    }
	
	

}
