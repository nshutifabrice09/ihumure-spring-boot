package com.example.backend.Ihumure_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@Table(name = "assessment_answers")
@NoArgsConstructor
@AllArgsConstructor
public class AssessmentAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Assessment assessment;

    @ManyToOne
    private AssessmentQuestion question;

    private int score;
}
