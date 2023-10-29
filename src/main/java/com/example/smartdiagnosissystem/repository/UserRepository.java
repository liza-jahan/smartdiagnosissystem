package com.example.smartdiagnosissystem.repository;

import com.example.smartdiagnosissystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
    User getById(Long id);
}
