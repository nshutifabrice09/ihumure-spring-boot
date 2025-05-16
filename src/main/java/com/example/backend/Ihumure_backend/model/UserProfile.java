package com.example.backend.Ihumure_backend.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;

public class UserProfile {
    private Long id;

    private String bio;
    private String language;
    private LocalDate birthDate;
    private String gender;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
