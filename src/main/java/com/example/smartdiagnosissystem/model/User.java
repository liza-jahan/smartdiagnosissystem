package com.example.smartdiagnosissystem.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Entity
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Table(name="userinfo")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id",length = 100)
        public  long id;
        @Column(nullable = false,length = 20,name="user_name ")
        public  String userName;
        @Column(nullable = false, unique = true, length = 45,name = "email")
        public  String email;
        @Column(nullable = false,length =30,name="password")
        public  String password;
        @Column(nullable = false,length = 56,unique = true,name="phone_number")
        public  int phoneNumber;


    }
