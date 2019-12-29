package com.material.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.material.bean.MaterialCategoryBean;
import com.material.bean.MaterialTypeBean;
import com.material.bean.UnitBean;
import com.material.dao.MaterialCategoryDAO;
import com.material.dao.MaterialTypeDAO;
import com.material.dao.UnitDAO;
import com.material.entity.MaterialCategoryEntity;
import com.material.entity.MaterialTypeEntity;
import com.material.entity.UnitEntity;


@Service
public class MaterialServiceImpl implements MaterialService {

	private static final Logger logger = LoggerFactory.getLogger(MaterialServiceImpl.class);

	
	/*
	 * Autowire MaterialCategoryDAO object
	 * 
	 * */
	@Autowired
	public MaterialCategoryDAO dao;
	
	@Autowired
	public UnitDAO dao2;
	
	@Autowired
	public MaterialTypeDAO dao1;
	
	
	// Your Code Here
	

	/*
	 * Method - getMaterialCategoryById()
	 * Use MaterialCategoryDAO object findById method to fetch the entity by --> categoryId
	 * Check if the entity is present
	 * 		initialized the materialCategoryBean object
	 * 		copy the properties value from entity to materialCategoryBean object
	 * */
	
	@Override
	public MaterialCategoryBean getMaterialCategoryById(String categoryId) {
		
		MaterialCategoryBean materialCategoryBean = new MaterialCategoryBean();
		
		// Your Code Here
		Optional<MaterialCategoryEntity> me=dao.findById(categoryId);
		BeanUtils.copyProperties(me.get(), materialCategoryBean);
		
		
		return materialCategoryBean;
	}

	
	/*
	 * Method - getMaterialCategories()
	 * Use the MaterialCategoryDAO to get all the MaterialCategoryEntity objects
	 * Check if list is not empty then 
	 * 		Declare a MaterialCategoryBean object with null value
	 * 		Loop through all the material categories
	 * 			Initialize a new MaterialCategoryBean object 
	 * 			Copy each property value of entity object to bean object
	 * 			Add the bean object to the materialCategoryBeans list
	 * */

	
	@Override
	public List<MaterialCategoryBean> getMaterialCategories() {
		
		List<MaterialCategoryBean> materialCategoryBeans = new ArrayList<MaterialCategoryBean>();
		
		// Your Code Here
		List<MaterialCategoryEntity> melist=dao.findAll();
		for(MaterialCategoryEntity me:melist) {
			MaterialCategoryBean mb=new MaterialCategoryBean();
			BeanUtils.copyProperties(me, mb);
			materialCategoryBeans.add(mb);
			
		}
		
		
		return materialCategoryBeans;
	}


	@Override
	public UnitBean getUnitById(String unitId) {
		UnitBean unitBean=new UnitBean();
		Optional<UnitEntity> ue=dao2.findById(unitId);
		BeanUtils.copyProperties(ue.get(), unitBean);
		return unitBean;
	}


	@Override
	public List<UnitBean> getUnits() {
	List<UnitBean> unitBean=new ArrayList<>();
	List<UnitEntity> uelist=dao2.findAll();
	
	for(UnitEntity ue:uelist) {
		UnitBean ub= new UnitBean();
		BeanUtils.copyProperties(ue, ub);
		unitBean.add(ub);
	}
		return unitBean;
	}
	
	@Override
	public MaterialTypeBean getMaterialTypeById(String typeId) {
		MaterialTypeBean mTypeBean= new MaterialTypeBean();
		Optional<MaterialTypeEntity> mTypeEntity= dao1.findById(typeId);
		BeanUtils.copyProperties(mTypeEntity.get(), mTypeBean);
		return mTypeBean;
	}
	
	@Override
	public List<MaterialTypeBean> getMaterialTypes() {
		
		List<MaterialTypeBean> mTypeBeanList = new ArrayList<>();
		List<MaterialTypeEntity> mTypeEntityList= dao1.findAll();
		for(MaterialTypeEntity m: mTypeEntityList) {
			MaterialTypeBean mb=new MaterialTypeBean();
			BeanUtils.copyProperties(m, mb);
			mTypeBeanList.add(mb);
		}
		
		return mTypeBeanList;
	}


	@Override
	public List<UnitBean> findUnitByName(String categoryId){
		List<UnitBean> unitBean=new ArrayList<>();
		List<UnitEntity> ulist=dao2.findUnitByName(categoryId);
		if(ulist!=null) {
			
		
		for(UnitEntity ue:ulist) {
			UnitBean ub= new UnitBean();
		    BeanUtils.copyProperties(ue, ub);
		    ub.setCategoryId(ue.getMaterialCategoryEntity().getCategoryId());
		    unitBean.add(ub);
		}
		
		}
		return unitBean;
		
	}

	/*@Override
	public List<UnitBean> getUnits() {
		// TODO Auto-generated method stub
		return null;
	}*/


	@Override
	public List<MaterialTypeBean> findMaterialTypeByName(String categoryId) {
		List<MaterialTypeBean> Bean=new ArrayList<>();
		List<MaterialTypeEntity> ulist=dao1.findMaterialTypeByName(categoryId);
		if(ulist!=null) {
			
		
		for(MaterialTypeEntity ue:ulist) {
			MaterialTypeBean ub= new MaterialTypeBean();
		    BeanUtils.copyProperties(ue, ub);
		    ub.setCategoryId(ue.getMaterialCategoryEntity().getCategoryId());
		    Bean.add(ub);
		}
		
		}
		return Bean;
	}


	/*@Override
	public List<MaterialCategoryBean> findcategoryByName(String categoryId) {
		List<MaterialCategoryBean> mblist=new ArrayList<>();
		List<MaterialCategoryEntity> melist=dao.findcategoryByName(categoryId);
		if(melist!=null) {
			for(MaterialCategoryEntity me:melist) {
				MaterialCategoryBean mcb= new MaterialCategoryBean();
				BeanUtils.copyProperties(me, mcb);
				mblist.add(mcb);
			}
		}
		return mblist;
	}
*/

	@Override
	public MaterialCategoryBean getMaterialCategoryByName(String categoryId) {
MaterialCategoryBean materialCategoryBean = new MaterialCategoryBean();
		
		// Your Code Here
		MaterialCategoryEntity me=dao.findcategoryByName(categoryId);
		BeanUtils.copyProperties(me, materialCategoryBean);
		materialCategoryBean.setCategoryId(me.getCategoryId());
		
		return materialCategoryBean;
		
	}





	

}
