package com.example.backend.Ihumure_backend.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class Notification {
    private Long id;

    @ManyToOne
    private User recipient;

    private String message;
    private boolean read;
    private LocalDate sentAt;
}
