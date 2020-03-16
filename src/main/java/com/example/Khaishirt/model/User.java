package com.example.Khaishirt.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Data //การทำ get/set
@Document("User") //บอกว่าสร้าง Users
public class User {

    @Id
    private ObjectId _id;
    private String name;
    @JsonFormat(pattern="yyy-MM-dd")
    private LocalDate BOD;
    private int age;
    private String gender;
    private String country;

}
