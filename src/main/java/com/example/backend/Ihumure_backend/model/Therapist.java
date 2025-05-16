package com.example.backend.Ihumure_backend.model;

import jakarta.persistence.OneToMany;

import java.util.List;

public class Therapist {
    private Long id;

    private String fullName;
    private String specialization;
    private String licenseNumber;

    @OneToMany(mappedBy = "therapist")
    private List<Appointment> appointments;
}
