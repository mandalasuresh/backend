package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.entity.Cart;


/*/*****************************************************************************
 *ICart Repository Class
 *
 * Created By: 
 * Date:11/01/2022 
 *******************************************************************************/

public interface ICartRepository extends JpaRepository<Cart,String>{
	Cart findByCartId(String cartId);

}
