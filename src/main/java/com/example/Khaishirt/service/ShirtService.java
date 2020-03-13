package com.example.Khaishirt.service;

import com.example.Khaishirt.model.Shirt;
import com.example.Khaishirt.repository.ShirtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShirtService {

    @Autowired // เป็นการสร้าง obj เหมือนการ new
            ShirtRepository shirtRepository;

    public List<Shirt> getData(){

        return shirtRepository.findAll(); // get all data
    }
}
