package com.example.backend.Ihumure_backend.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class Appointment {
    private Long id;

    @ManyToOne
    private Therapist therapist;

    @ManyToOne
    private User user;

    private LocalDate appointmentTime;
    private String notes;
    private boolean confirmed;
}
