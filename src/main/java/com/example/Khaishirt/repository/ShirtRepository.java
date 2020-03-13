package com.example.Khaishirt.repository;

import com.example.Khaishirt.model.Shirt;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShirtRepository extends MongoRepository<Shirt,String> {
}
