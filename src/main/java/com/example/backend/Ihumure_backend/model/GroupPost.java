package com.example.backend.Ihumure_backend.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class GroupPost {
    private Long id;

    @ManyToOne
    private SupportGroup group;

    @ManyToOne
    private User author;

    private String content;
    private LocalDate createdAt;
}
