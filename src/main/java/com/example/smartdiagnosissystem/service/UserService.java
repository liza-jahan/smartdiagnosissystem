package com.example.smartdiagnosissystem.service;

import com.example.smartdiagnosissystem.exceptions.EmailAlreadyExistsException;
import com.example.smartdiagnosissystem.model.User;
import com.example.smartdiagnosissystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    private BCryptPasswordEncoder bCryptPasswordEncoder;


    public User saveuser(User newUser) {

        try {
            newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));

            //Email has to be unique
            newUser.setEmail(newUser.getEmail());
            //make sure that password  and confirmPassword
            newUser.setConfirmPassword("");
            return userRepository.save(newUser);
        } catch (Exception e) {
            throw new EmailAlreadyExistsException("Email '" + newUser.getEmail() + "' already exists");
        }


    }


}