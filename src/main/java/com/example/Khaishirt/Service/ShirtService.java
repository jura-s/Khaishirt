package com.example.Khaishirt.Service;

import com.example.Khaishirt.Model.Shirt;
import com.example.Khaishirt.Repository.ShirtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class ShirtService {

    @Autowired // เป็นการสร้าง obj เหมือนการ new
            ShirtRepository shirtRepository;

    public List<Shirt> getData(){

        return shirtRepository.findAll(); // get all data
    }
}
