package com.example.Khaishirt.Controller;

import com.example.Khaishirt.Model.Shirt;
import com.example.Khaishirt.Repository.ShirtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired // เป็นการสร้าง obj เหมือนการ new
    ShirtRepository shirtRepository;

    @RequestMapping("/test") //annotation นี้จะทำให้ class นี้กลายเป็น RestController
    public String Hello(){
        return ("Hello");
    }

    @RequestMapping("/data")
    public List<Shirt> getData(){
        return shirtRepository.findAll(); // get all data
    }
}
