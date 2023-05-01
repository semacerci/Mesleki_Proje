package com.example.toplandapp.controllers;

import com.example.toplandapp.entities.User;
import com.example.toplandapp.repos.UserRepository;
import com.example.toplandapp.service.UserServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }


    @GetMapping
    public List<User> getAllUsers() {
        return userServices.getAllUsers();
    }


    @GetMapping("/{userId}")
    public User getOneUser(@PathVariable Long userId) {
        return userServices.getOneuser(userId);
    }

    @PostMapping
    public User createUser(@RequestBody User newUser) {
        return userServices.saveOneUser(newUser);
    }

    //varolan id li user da değişiklik yapar
    @PutMapping("/{userId}")
    public User updateOneUser(@PathVariable Long userId, @RequestBody User newUser) {
        return userServices.updateOneUser(userId, newUser);

    }

    @DeleteMapping("/{userId}")
    public void deleteOneUser(@PathVariable Long userId) {
        userServices.deleteById(userId);
    }


}
