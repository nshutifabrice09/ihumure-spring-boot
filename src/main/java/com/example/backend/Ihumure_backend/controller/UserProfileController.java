package com.example.backend.Ihumure_backend.controller;

import com.example.backend.Ihumure_backend.model.UserProfile;
import com.example.backend.Ihumure_backend.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-profile")
@CrossOrigin("http://localhost:3000")
public class UserProfileController {

    private final UserProfileService userProfileService;

    @Autowired
    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @PostMapping("/{userId}")
    public UserProfile saveUserProfile(@RequestBody UserProfile userProfile, @PathVariable ("userId") Long userId){
        return userProfileService.saveUserProfile(userProfile, userId);
    }

    @GetMapping("/")
    public List<UserProfile> userProfileList(){
        return userProfileService.getAllUserProfiles();
    }

    @GetMapping("/{id}")
    public UserProfile getUserProfile(@PathVariable ("id") Long id){
        return userProfileService.getUserProfileById(id);
    }

    @PutMapping("/update/{id}")
    public UserProfile updateUserProfile(@PathVariable ("id") Long id, @RequestBody UserProfile userProfile){
        return userProfileService.updateUserProfile(id, userProfile);
    }

    @DeleteMapping("/delete/{id}")
    private void removeUserProfile(@PathVariable ("id") Long id){
        userProfileService.removeUserProfile(id);
    }

}
