package com.example.Restaurant.controller;

import com.example.Restaurant.model.user.User;
import com.example.Restaurant.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Deprecated
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return  userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){

        return userService.getUserById(id);
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
        System.out.println("Saving username: " + user.getUsername() + " to db");
        return userService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        System.out.println("deleting userId: " + id + " from db");
        userService.deleteUser(id);

    }
}
