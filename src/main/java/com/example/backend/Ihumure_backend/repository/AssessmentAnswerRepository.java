package com.example.backend.Ihumure_backend.repository;

import com.example.backend.Ihumure_backend.model.AssessmentAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentAnswerRepository extends JpaRepository<AssessmentAnswer, Long> {
    AssessmentAnswer findAssessmentAnswerById(Long id);
}
