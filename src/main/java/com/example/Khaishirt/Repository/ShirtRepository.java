package com.example.Khaishirt.Repository;

import com.example.Khaishirt.Model.Shirt;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShirtRepository extends MongoRepository<Shirt,String> {
}
