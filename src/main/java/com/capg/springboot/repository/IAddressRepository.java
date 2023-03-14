package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.entity.Address;

/*/*****************************************************************************
 * IAddress Repository Class
 * 
 * Created By: 
 * Date:11/01/2022 
 *******************************************************************************/

public interface IAddressRepository extends JpaRepository<Address,String> {

	Address findByAddressId(String addressid);
   
}
