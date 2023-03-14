package com.capg.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capg.springboot.dto.Productdto;
import com.capg.springboot.entity.Product;

/*/*****************************************************************************
 * IProduct Repository Class 
 *
 * Created By: 
 * Date:08/01/2022 
 *******************************************************************************/

public interface IProductRepository extends JpaRepository<Product,String>{

	Product findByproductId(String id);

	

	Product deleteByProductId(String pid);
	
	@Query("select p from Product p where p.category=:c")
	 public List<Product> findAllProductByCategory(@Param("c") String cname);

	

}
