package com.example.backend.Ihumure_backend.model;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;

public class Assessnment {
    private Long id;

    @ManyToOne
    private User user;

    private LocalDate takenAt;
    private String resultSummary;

    @OneToMany(mappedBy = "assessment")
    private List<AssessmentAnswer> answers;
}
