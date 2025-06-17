package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.User;
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
        User user = userRepository.findUserById(userId);
        userProfile.setUser(user);
        return userProfileRepository.save(userProfile);
    }

    @Override
    public UserProfile updateUserProfile(Long id, UserProfile userProfile) {
        UserProfile existUserProfile = userProfileRepository.findUserProfileById(id);
        if(existUserProfile != null){
            existUserProfile.setBio(userProfile.getBio());
            existUserProfile.setLanguage(userProfile.getLanguage());
            existUserProfile.setBirthDate(userProfile.getBirthDate());
            existUserProfile.setGender(userProfile.getGender());
            return userProfileRepository.save(existUserProfile);
        }
        return null;
    }

    @Override
    public void removeUserProfile(Long id) {
        userProfileRepository.deleteById(id);
    }
}
