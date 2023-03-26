package com.automobile.experience.main.repository.config;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.automobile.experience.main.model.entities.SuddenLaneChanges;

public interface SuddenLaneChangesRepository extends MongoRepository<SuddenLaneChanges, Integer> {

}
