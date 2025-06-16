package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.UserProfile;

import java.util.List;

public interface UserProfileService {
    List<UserProfile> getAllUserProfiles();
    UserProfile getUserProfileById(Long id);
    UserProfile saveUserProfile(UserProfile userProfile, Long userId);
    UserProfile updateUserProfile(Long id, UserProfile userProfile);
    void removeUserProfile(Long id);
}
