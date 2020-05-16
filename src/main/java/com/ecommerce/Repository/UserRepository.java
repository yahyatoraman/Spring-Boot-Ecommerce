package com.ecommerce.Repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.Entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByEmail(String email);
	
}
