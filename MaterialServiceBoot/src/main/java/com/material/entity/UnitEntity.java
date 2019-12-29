package com.material.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "unit")
public class UnitEntity {
	@Id
	@Column(name = "unit_id")
	private String unitId;
	@Column(name = "unit_name")
	private String unitName;
	
	@ManyToOne( cascade=CascadeType.ALL)
	@JoinColumn(name="category_id_fk")	
	private MaterialCategoryEntity materialCategoryEntity;
	public MaterialCategoryEntity getMaterialCategoryEntity() {
		return materialCategoryEntity;
	}
	public void setMaterialCategoryEntity(MaterialCategoryEntity materialCategoryEntity) {
		this.materialCategoryEntity = materialCategoryEntity;
	}
	public UnitEntity(String unitId, String unitName) {
		//super();
		this.unitId = unitId;
		this.unitName = unitName;
		
	}
	public UnitEntity() {
		//super();
	}
	public String getUnitId() {
		return unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	
	
	@Override
	public String toString() {
		return "UnitEntity [unitId=" + unitId + ", unitName=" + unitName + "]";
	}
}
