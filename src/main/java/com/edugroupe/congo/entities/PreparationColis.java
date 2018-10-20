package com.edugroupe.congo.entities;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.edugroupe.congo.entities_pks.PreparationColisPk;




/*@Entity
@Table(name="PreparationColis")
@AssociationOverrides({
	@AssociationOverride( name="pk.employe",
			joinColumns=@JoinColumn(name="IdEmploye")),
	@AssociationOverride(name="pk.colis",
			joinColumns=@JoinColumn(name="idColis"))})
			*/

@Entity
@Table(name="PREPARATION_COLIS")
@IdClass(PreparationColisPk.class)
public class PreparationColis implements Serializable{
	
	
	@Column(name="date_preparation")
	private Date dateHeurePrep;
	
	/*@Id
	private Long idEmploye;
	
	@Id
	private Long idColis;*/
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_colis")
	private Colis deliveryPrep;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_employe")
	private Employe empPrep;
	
	
	
	

	public PreparationColis() {
		super();
		
	}

	

	public PreparationColis(Date dateHeurePrep, Colis deliveryPrep, Employe empPrep) {
		super();
		this.dateHeurePrep = dateHeurePrep;
		this.deliveryPrep = deliveryPrep;
		this.empPrep = empPrep;
	}



	public Date getDateHeurePrep() {
		return dateHeurePrep;
	}



	public void setDateHeurePrep(Date dateHeurePrep) {
		this.dateHeurePrep = dateHeurePrep;
	}



	public Colis getDeliveryPrep() {
		return deliveryPrep;
	}



	public void setDeliveryPrep(Colis deliveryPrep) {
		this.deliveryPrep = deliveryPrep;
	}



	public Employe getEmpPrep() {
		return empPrep;
	}



	public void setEmpPrep(Employe empPrep) {
		this.empPrep = empPrep;
	}

}
