package com.app.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.helpdesk.api.entity.User;

public interface UserRepository extends MongoRepository<User, String>{

	
	User findByEmail(String email);
}
