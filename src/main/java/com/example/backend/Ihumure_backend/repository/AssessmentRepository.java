package com.example.backend.Ihumure_backend.repository;

import com.example.backend.Ihumure_backend.model.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentRepository extends JpaRepository <Assessment, Long> {
}
