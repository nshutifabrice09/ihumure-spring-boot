package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.AssessmentQuestion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentQuestionServiceImplementation implements AssessmentQuestionService{
    @Override
    public List<AssessmentQuestion> getAllAssessmentQuestions() {
        return null;
    }

    @Override
    public AssessmentQuestion getAssessmentQuestionById(Long id) {
        return null;
    }

    @Override
    public AssessmentQuestion save(AssessmentQuestion assessmentQuestion) {
        return null;
    }

    @Override
    public AssessmentQuestion updateAssessmentQuestion(Long id, AssessmentQuestion assessmentQuestion) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }
}
