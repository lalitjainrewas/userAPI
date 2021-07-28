package com.userAPI.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userAPI.dao.UserRepository;
import com.userAPI.entites.User;

@RestController
@CrossOrigin(origins = "http://localhost:9000")
public class UserController {

    // standard constructors
    
    private  UserRepository userRepository;
    

    public UserController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	@GetMapping("/users")
    public java.util.List<User> getUsers() {
        return (java.util.List<User>) userRepository.findAll();
    }
    
    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
