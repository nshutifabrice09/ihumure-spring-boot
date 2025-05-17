package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Assessment;

import java.util.List;

public interface AssessmentService {
    List<Assessment> getAllAssessments();
    Assessment getAssessmentById(Long id);
    Assessment save(Assessment assessment, Long userId);
    Assessment updateAssessment(Long id, Assessment assessment);
    void removeById(Long id);
}
