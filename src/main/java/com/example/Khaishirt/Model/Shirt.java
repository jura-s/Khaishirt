package com.example.Khaishirt.Model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data //lombok = get/set
@Document(collection = "stock") // อ้างอิงว่าอยู่ collection ไหน
public class Shirt {

    @Id
    private ObjectId _id;
    private String size;
    private String color;
    private int price;
}
