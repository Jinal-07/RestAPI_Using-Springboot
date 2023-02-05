package com.practiceRestAPI.UserRestAPI.controllers;

import com.practiceRestAPI.UserRestAPI.entities.User;
import com.practiceRestAPI.UserRestAPI.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return this.userService.getUsers();
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Long id){
        return this.userService.getUser(id);
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        return this.userService.updateUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable Long id){
        this.userService.deleteUser(id);
    }
}
