package com.example.backend.Ihumure_backend.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;

public class User {
    private Long id;

    private String email;
    private String password;
    private String fullName;
    private boolean active;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne(mappedBy = "user")
    private UserProfile profile;
}
