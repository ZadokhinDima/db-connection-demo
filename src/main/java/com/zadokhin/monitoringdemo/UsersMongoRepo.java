package com.zadokhin.monitoringdemo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UsersMongoRepo extends MongoRepository<UserMongo, String> {
    @Query("{'$text': {'$search': ?0}}")
    List<UserMongo> findByName(String name);
}
