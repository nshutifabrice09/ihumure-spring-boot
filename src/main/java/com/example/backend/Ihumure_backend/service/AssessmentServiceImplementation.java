package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Assessment;
import com.example.backend.Ihumure_backend.model.User;
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
    public Assessment saveAssessment(Assessment assessment, Long userId) {
        User user = userRepository.findUserById(userId);
        assessment.setUser(user);
        return assessmentRepository.save(assessment);
    }

    @Override
    public Assessment updateAssessment(Long id, Assessment assessment) {
        Assessment existAssessment = assessmentRepository.findAssessmentById(id);
        if(existAssessment != null){
            existAssessment.setTakenAt(assessment.getTakenAt());
            existAssessment.setResultSummary(assessment.getResultSummary());
            return assessmentRepository.save(existAssessment);
        }
        return null;
    }

    @Override
    public void removeAssessment(Long id) {
        assessmentRepository.deleteById(id);
    }
}
