package com.material.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.material.entity.MaterialTypeEntity;


public interface MaterialTypeDAO extends JpaRepository<MaterialTypeEntity, String> {
	@Query("Select k from MaterialTypeEntity k  where k.materialCategoryEntity.categoryId=?1 ")
	public List<MaterialTypeEntity> findMaterialTypeByName(String categoryId);
}
