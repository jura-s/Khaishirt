package com.example.Khaishirt.controller;

import com.example.Khaishirt.model.Shirt;
import com.example.Khaishirt.service.ShirtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired // เป็นการสร้าง obj เหมือนการ new
            ShirtService shirtService;

    @RequestMapping("/test") //annotation นี้จะทำให้ class นี้กลายเป็น RestController
    public String Hello(){
        return ("Hello");
    }

    @RequestMapping("/data")
    public List<Shirt> getData() {

        return shirtService.getData(); // get all data
    }
}
