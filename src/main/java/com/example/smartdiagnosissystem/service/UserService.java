package com.example.smartdiagnosissystem.service;

import com.example.smartdiagnosissystem.model.User;
import com.example.smartdiagnosissystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

   @Autowired
   private UserRepository userRepository;

   public  void  save(User user){
       userRepository.save(user);
   }
   
   public List<User> getAllUser()
    {
        return userRepository.findAll();
    }
}
