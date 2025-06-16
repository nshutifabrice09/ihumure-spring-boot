package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.UserProfile;
import com.example.backend.Ihumure_backend.repository.UserProfileRepository;
import com.example.backend.Ihumure_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileServiceImplementation implements UserProfileService{
    private final UserProfileRepository userProfileRepository;
    private final UserRepository userRepository;

    @Autowired
    public UserProfileServiceImplementation(UserProfileRepository userProfileRepository, UserRepository userRepository){
        this.userProfileRepository = userProfileRepository;
        this.userRepository= userRepository;
    }

    @Override
    public List<UserProfile> getAllUserProfiles() {
        return userProfileRepository.findAll();
    }

    @Override
    public UserProfile getUserProfileById(Long id) {
        return userProfileRepository.findUserProfileById(id);
    }

    @Override
    public UserProfile saveUserProfile(UserProfile userProfile, Long userId) {
        return null;
    }

    @Override
    public UserProfile updateUserProfile(Long id, UserProfile userProfile) {
        return null;
    }

    @Override
    public void removeUserProfile(Long id) {

    }
}
