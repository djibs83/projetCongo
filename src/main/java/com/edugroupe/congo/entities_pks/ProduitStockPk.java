package com.edugroupe.congo.entities_pks;

import java.io.Serializable;
import java.util.Objects;

public class ProduitStockPk implements Serializable {
	
	
	private Long produitStocke;
	private Long centreDeStock;
	
	
	public ProduitStockPk() {
		
	}

	
	public ProduitStockPk(Long produitStocke, Long centreDeStock) {
		super();
		this.produitStocke = produitStocke;
		this.centreDeStock = centreDeStock;
	}




	public Long getProduitStocke() {
		return produitStocke;
	}


	public void setProduitStocke(Long produitStocke) {
		this.produitStocke = produitStocke;
	}


	public Long getCentreDeStock() {
		return centreDeStock;
	}


	public void setCentreDeStock(Long centreDeStock) {
		this.centreDeStock = centreDeStock;
	}


	@Override
    public int hashCode() {
        return Objects.hash(getProduitStocke(), getCentreDeStock());
    }
	
	@Override
	public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof ProduitStockPk)) return false;
        ProduitStockPk pk = (ProduitStockPk) obj;
        return pk.produitStocke.equals(this.produitStocke) && pk.centreDeStock.equals(this.centreDeStock);
    }
	
	
	

}
