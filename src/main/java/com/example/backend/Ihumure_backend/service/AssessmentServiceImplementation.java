package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Assessment;
import com.example.backend.Ihumure_backend.repository.AssessmentRepository;
import com.example.backend.Ihumure_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentServiceImplementation implements AssessmentService{

    private final AssessmentRepository assessmentRepository;
    private final UserRepository userRepository;

    @Autowired
    public AssessmentServiceImplementation(AssessmentRepository assessmentRepository, UserRepository userRepository) {
        this.assessmentRepository = assessmentRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Assessment> getAllAssessments() {
        return assessmentRepository.findAll();
    }

    @Override
    public Assessment getAssessmentById(Long id) {
        return assessmentRepository.findAssessmentById(id);
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
