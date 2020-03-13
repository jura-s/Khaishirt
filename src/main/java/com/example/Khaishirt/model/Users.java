package com.example.Khaishirt.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document("Users") //บอกว่าสร้าง Users
public class Users {

    @Id
    private ObjectId _id;
    private String name;
    private Date BOD;
    private int age;
    private String gender;
    private String country;

}
