package com.example.smartdiagnosissystem.controller;

import com.example.smartdiagnosissystem.model.User;
import com.example.smartdiagnosissystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin("http://localhost:3000")
public class UserController {

@Autowired
private UserService userService;


  @GetMapping("/getAll")
  public List<User> getAllUser(){
        return userService.getAllUser();
    }

//Save All users
   @PostMapping("/save")
   public long saveUser(@RequestBody User user)
    {
      userService.save(user);
      return  user.getId();
    }


}
