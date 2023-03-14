package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.entity.Category;

/*/*****************************************************************************
 *ICategory repository Class 
 *
 * Created By: 
 * Date:11/01/2022 
 *******************************************************************************/

public interface ICategoryRepository extends JpaRepository<Category,String> {
	Category findByCatId(String catId);
}
