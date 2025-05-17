package com.example.backend.Ihumure_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
@Data
@Builder
@Entity
@Table(name = "assessments")
@NoArgsConstructor
@AllArgsConstructor
public class Assessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private LocalDate takenAt;
    private String resultSummary;

    @OneToMany(mappedBy = "assessment")
    private List<AssessmentAnswer> answers;
}
