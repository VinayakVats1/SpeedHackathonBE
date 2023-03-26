package com.automobile.experience.main.repository.config;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.automobile.experience.main.model.entities.UserLogin;

public interface UserLoginRepository extends MongoRepository<UserLogin, Integer> {

}