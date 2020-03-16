package com.example.Khaishirt.repository;

import com.example.Khaishirt.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User,String> {
    Optional<User> findById(ObjectId _id);

}
