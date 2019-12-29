package com.material.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.material.bean.MaterialCategoryBean;
import com.material.bean.MaterialTypeBean;
import com.material.bean.UnitBean;
import com.material.service.MaterialService;




@RestController
public class MaterialController {

	private static final Logger logger = LoggerFactory.getLogger(MaterialController.class);
	
	
	@Autowired
	MaterialService service;
	/*
	 * Autowire the MaterialService object
	 * 
	 * */
	
	// Your Code Here
	
	@GetMapping("/")
	public String index() {
		return "Welcome to Spring Boot Material Service API!";
	}
	
	
	/* 
	 * Method - getMaterialCategories()
	 * Fetch all the material categories details using MaterialService and store it inside a List
	 * Return a ResponseEntity object passing the list of material categories
	 * 
	 */
		
	@GetMapping(value = "/material/controller/getMaterialCategories", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MaterialCategoryBean>> getMaterialCategories() {
				
		List<MaterialCategoryBean>list=service.getMaterialCategories();
		// Your Code Here
		if(list!=null) {
			return new  ResponseEntity<List<MaterialCategoryBean>>(list,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<List<MaterialCategoryBean>>(HttpStatus.NOT_FOUND);
		}
		
		
	}

	
	/* 
	 * Method - getMaterialCategoryById()
	 * Fetch a single MaterialCategoryBean using MaterialService object and passing --> categoryId
	 * Return a ResponseEntity object passing the MaterialCategoryBean object
	 * 
	 */
			
	@GetMapping(value = "/material/controller/getMaterialCategoryById/{categoryId}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MaterialCategoryBean> getMaterialCategoryById(@PathVariable String categoryId) {

		// Your Code Here
		MaterialCategoryBean mm=service.getMaterialCategoryById(categoryId);
		if(mm!=null) {
			return new ResponseEntity<MaterialCategoryBean>(mm,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<MaterialCategoryBean>(HttpStatus.NOT_FOUND);
		}
		
	
	}
	@GetMapping(value = "/material/controller/getUnitName/{categoryId}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<UnitBean>> getUnitName(@PathVariable String categoryId){
		List<UnitBean> mm=service.findUnitByName(categoryId);
		if(mm!=null) {
			return new ResponseEntity<List<UnitBean>>(mm,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<List<UnitBean>>(HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping(value = "/material/controller/getMaterialTypeName/{categoryId}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MaterialTypeBean>> getMaterialTypeName(@PathVariable String categoryId){
		List<MaterialTypeBean> mm=service.findMaterialTypeByName(categoryId);
		if(mm!=null) {
			return new ResponseEntity<List<MaterialTypeBean>>(mm,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<List<MaterialTypeBean>>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@GetMapping(value = "/material/controller/getUnits", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<UnitBean>> getUnits() {
		
		List<UnitBean>list=service.getUnits();
		// Your Code Here
		if(list!=null) {
			return new  ResponseEntity<List<UnitBean>>(list,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<List<UnitBean>>(HttpStatus.NOT_FOUND);
		}
		
		
	}
	
	@GetMapping(value = "/material/controller/getUnitById/{unitId}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UnitBean> getUnitById(@PathVariable String unitId) {

		// Your Code Here
		UnitBean mm=service.getUnitById(unitId);
		if(mm!=null) {
			return new ResponseEntity<UnitBean>(mm,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<UnitBean>(HttpStatus.NOT_FOUND);
		}
		
	
	}
	

	@GetMapping(value = "/material/controller/getMaterialTypes", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MaterialTypeBean>> getMaterialTypes(){
		List<MaterialTypeBean> mBeanList=service.getMaterialTypes();
		if(mBeanList!=null) {
			return new ResponseEntity<List<MaterialTypeBean>>(mBeanList, HttpStatus.OK);
		}
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	@GetMapping(value = "/material/controller/getMaterialTypeById/{typeId}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MaterialTypeBean> getMaterialTypeById(@PathVariable String typeId){
		MaterialTypeBean mbean=service.getMaterialTypeById(typeId);
		if(mbean!=null) {
			return new ResponseEntity<MaterialTypeBean>(mbean, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping(value = "/material/controller/getMaterialCategoryByName/{categoryId}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MaterialCategoryBean> getMaterialCategoryByName(@PathVariable String categoryId) {

		// Your Code Here
		MaterialCategoryBean mm=service.getMaterialCategoryByName(categoryId);
		if(mm!=null) {
			return new ResponseEntity<MaterialCategoryBean>(mm,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<MaterialCategoryBean>(HttpStatus.NOT_FOUND);
		}
		
	
	}
}
