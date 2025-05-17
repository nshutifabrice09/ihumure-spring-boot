package com.example.backend.Ihumure_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@Builder
@Entity
@Table(name = "user_profiles")
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bio;
    private String language;
    private LocalDate birthDate;
    private String gender;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
