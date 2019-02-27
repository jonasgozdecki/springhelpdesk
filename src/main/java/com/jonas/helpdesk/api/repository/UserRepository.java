package com.jonas.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jonas.helpdesk.api.security.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);

}
