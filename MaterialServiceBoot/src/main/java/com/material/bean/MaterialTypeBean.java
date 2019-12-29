package com.material.bean;

public class MaterialTypeBean {
	private String typeId;
	private String typeName;
	private String categoryId;

	public MaterialTypeBean(String typeId, String typeName, String categoryId) {
		// super();
		this.typeId = typeId;
		this.typeName = typeName;
		this.categoryId = categoryId;
	}

	public MaterialTypeBean() {
		// super();
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "MaterialTypeBean [typeId=" + typeId + ", typeName=" + typeName + ", categoryId=" + categoryId + "]";
	}

}

