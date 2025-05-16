package com.example.backend.Ihumure_backend.model;

import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class Comment {
    private Long id;

    @ManyToOne
    private GroupPost post;

    @ManyToOne
    private User author;

    private String text;
    private LocalDate createdAt;
}
