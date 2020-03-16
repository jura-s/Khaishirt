package com.example.Khaishirt.service;

import com.example.Khaishirt.model.User;
import com.example.Khaishirt.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository repository) {
        this.userRepository = repository;
    }

    public List<User> retrieveUser() {
        return (List<User>) userRepository.findAll();
    }

    public Optional<User> retrieveUser(ObjectId _id) {
        return  userRepository.findById(_id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

//    public Optional<Customer> updateCustomer(Long id, Customer customer) {
//        Optional<Customer> customerOptional = customerRepository.findById(id);
//        if(!customerOptional.isPresent()) {
//            return customerOptional;
//        }
//        customer.setId(id);
//        return Optional.of(customerRepository.save(customer));
//    }

}
