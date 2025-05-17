package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.AssessmentAnswer;

import java.util.List;

public interface AssessmentAnswerService {
    List<AssessmentAnswer> getAllAssessmentAnswers();
    AssessmentAnswer getAssessmentAnswerById(Long id);
    AssessmentAnswer save(AssessmentAnswer assessmentAnswer, Long assessmentId, Long questionId);
    AssessmentAnswer updateAssessmentAnswer(Long id, AssessmentAnswer assessmentAnswer);
    void removeById(Long id);
}
