package com.material.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.material.entity.UnitEntity;




public interface UnitDAO extends JpaRepository<UnitEntity, String> {

	@Query("Select k from UnitEntity k  where k.materialCategoryEntity.categoryId=?1 ")
	public List<UnitEntity> findUnitByName(String categoryId);
}
