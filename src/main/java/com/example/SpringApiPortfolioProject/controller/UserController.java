package com.example.SpringApiPortfolioProject.controller;

import com.example.SpringApiPortfolioProject.entities.User;
import com.example.SpringApiPortfolioProject.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(final UserRepository userRepo) {
        this.userRepository = userRepo;
    }

    @GetMapping()
    public Iterable<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @PostMapping()
    public User addNewUser(User user) {
        this.userRepository.save(user);
        return user;
    }


}
