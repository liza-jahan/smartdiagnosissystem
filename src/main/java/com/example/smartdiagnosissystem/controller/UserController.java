package com.example.smartdiagnosissystem.controller;

import com.example.smartdiagnosissystem.model.User;
import com.example.smartdiagnosissystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

@Autowired
private UserService userService;

//Get All users
   @PostMapping("/Save")
   public long saveUser(@RequestBody User user)
    {
      userService.save(user);
      return  user.getId();
    }
}
