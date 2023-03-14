package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.entity.User;

/*/*****************************************************************************
 *ILogin Repository Class 
 *
 * Created By: 
 * Date:08/01/2022 
 *******************************************************************************/

public interface IUserRepository extends JpaRepository<User,String> {

	public User findByUserId(String id);
}
