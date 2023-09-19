package com.example.smartdiagnosissystem.repository;

import com.example.smartdiagnosissystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
