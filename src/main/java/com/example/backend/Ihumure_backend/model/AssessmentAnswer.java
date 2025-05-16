package com.example.backend.Ihumure_backend.model;

import jakarta.persistence.ManyToOne;

public class AssessmentAnswer {
    private Long id;

    @ManyToOne
    private Assessment assessment;

    @ManyToOne
    private AssessmentQuestion question;

    private int score;
}
