package com.example.backend.Ihumure_backend.repository;

import com.example.backend.Ihumure_backend.model.AssessmentQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentQuestionRepository extends JpaRepository<AssessmentQuestion, Long> {
    AssessmentQuestion findAssessmentQuestionById(Long questionId);
}
