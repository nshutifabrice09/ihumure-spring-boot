package com.example.backend.Ihumure_backend.repository;

import com.example.backend.Ihumure_backend.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    UserProfile findUserProfileById(Long id);
}
