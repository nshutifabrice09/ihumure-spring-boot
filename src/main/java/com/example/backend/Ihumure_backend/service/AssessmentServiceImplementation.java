package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Assessment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentServiceImplementation implements AssessmentService{
    @Override
    public List<Assessment> getAllAssessments() {
        return null;
    }

    @Override
    public Assessment getAssessmentById(Long id) {
        return null;
    }

    @Override
    public Assessment save(Assessment assessment, Long userId) {
        return null;
    }

    @Override
    public Assessment updateAssessment(Long id, Assessment assessment) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }
}
