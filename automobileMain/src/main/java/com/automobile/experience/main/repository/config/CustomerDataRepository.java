package com.automobile.experience.main.repository.config;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.automobile.experience.main.model.entities.CustomerData;

public interface CustomerDataRepository extends MongoRepository<CustomerData, Integer> {

}
