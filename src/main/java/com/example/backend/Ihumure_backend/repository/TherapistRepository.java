package com.example.backend.Ihumure_backend.repository;

import com.example.backend.Ihumure_backend.model.Therapist;
import com.example.backend.Ihumure_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TherapistRepository extends JpaRepository<Therapist, Long> {
    Therapist findTherapistById(Long therapistId);
}
