package com.example.backend.Ihumure_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@Entity
@Table(name = "therapists")
@NoArgsConstructor
@AllArgsConstructor
public class Therapist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String specialization;
    private String licenseNumber;

    @OneToMany(mappedBy = "therapist")
    private List<Appointment> appointments;
}
