package com.example.backend.Ihumure_backend.repository;

import com.example.backend.Ihumure_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    User findUserById(Long userId);
}
