package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.AssessmentQuestion;

import java.util.List;

public interface AssessmentQuestionService {
    List<AssessmentQuestion> getAllAssessmentQuestions();
    AssessmentQuestion getAssessmentQuestionById(Long id);
    AssessmentQuestion saveAssessmentQuestion(AssessmentQuestion assessmentQuestion);
    AssessmentQuestion updateAssessmentQuestion(Long id, AssessmentQuestion assessmentQuestion);
    void removeAssessmentQuestion(Long id);
}
