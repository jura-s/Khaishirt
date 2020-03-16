package com.example.Khaishirt.controller;

import com.example.Khaishirt.model.User;
import com.example.Khaishirt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    UserService userService;

//    @GetMapping("/user")
//    public List<User> getUser{
//        return userService.retrieveUser();
//    }

    @PostMapping("/user")
    public ResponseEntity<?> postCustomer(@Valid @RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }
}
