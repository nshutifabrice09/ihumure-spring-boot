package com.example.backend.Ihumure_backend.controller;

import com.example.backend.Ihumure_backend.model.User;
import com.example.backend.Ihumure_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/")
      public ResponseEntity<User> createUser(@RequestBody User user){
        User saveUser = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveUser);
    }


    @GetMapping("/")
    public List<User> userList(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable ("id") Long id){
        return userService.getUserById(id);
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable ("id") Long id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/{id}")
    public void removeUser(@PathVariable ("id") Long id){
        userService.removeUser(id);
    }
}
