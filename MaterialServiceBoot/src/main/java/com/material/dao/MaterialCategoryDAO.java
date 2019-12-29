package com.material.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.material.entity.MaterialCategoryEntity;




public interface MaterialCategoryDAO extends JpaRepository<MaterialCategoryEntity, String>{
@Query("Select k from MaterialCategoryEntity k  where k.categoryId=?1 ")
public MaterialCategoryEntity findcategoryByName(String categoryId);

}