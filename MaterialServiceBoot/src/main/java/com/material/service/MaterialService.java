package com.material.service;

import java.util.List;

import com.material.bean.MaterialCategoryBean;
import com.material.bean.MaterialTypeBean;
import com.material.bean.UnitBean;



public interface MaterialService {
	MaterialCategoryBean getMaterialCategoryById(String categoryId);
	List<MaterialCategoryBean> getMaterialCategories();
	UnitBean getUnitById(String unitId);
	List<UnitBean> getUnits();
	MaterialTypeBean getMaterialTypeById(String typeId);
	List<MaterialTypeBean> getMaterialTypes();
	public List<UnitBean> findUnitByName(String categoryId);
	public List<MaterialTypeBean> findMaterialTypeByName(String categoryId);
	MaterialCategoryBean getMaterialCategoryByName(String categoryId);
}
