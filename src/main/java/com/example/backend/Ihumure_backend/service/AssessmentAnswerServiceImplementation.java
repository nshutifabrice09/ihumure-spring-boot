package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.Assessment;
import com.example.backend.Ihumure_backend.model.AssessmentAnswer;
import com.example.backend.Ihumure_backend.model.AssessmentQuestion;
import com.example.backend.Ihumure_backend.repository.AssessmentAnswerRepository;
import com.example.backend.Ihumure_backend.repository.AssessmentQuestionRepository;
import com.example.backend.Ihumure_backend.repository.AssessmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentAnswerServiceImplementation implements AssessmentAnswerService {
    private final AssessmentAnswerRepository assessmentAnswerRepository;
    private final AssessmentRepository assessmentRepository;

    private final AssessmentQuestionRepository assessmentQuestionRepository;

    @Autowired
    public AssessmentAnswerServiceImplementation(AssessmentAnswerRepository assessmentAnswerRepository, AssessmentRepository assessmentRepository, AssessmentQuestionRepository assessmentQuestionRepository) {
        this.assessmentAnswerRepository = assessmentAnswerRepository;
        this.assessmentRepository = assessmentRepository;
        this.assessmentQuestionRepository = assessmentQuestionRepository;
    }

    @Override
    public List<AssessmentAnswer> getAllAssessmentAnswers() {
        return assessmentAnswerRepository.findAll();
    }

    @Override
    public AssessmentAnswer getAssessmentAnswerById(Long id) {
        return assessmentAnswerRepository.findAssessmentAnswerById(id);
    }

    @Override
    public AssessmentAnswer save(AssessmentAnswer assessmentAnswer, Long assessmentId, Long questionId) {
        Assessment assessment = assessmentRepository.findAssessmentById(assessmentId);
        AssessmentQuestion assessmentQuestion = assessmentQuestionRepository.findAssessmentQuestionById(questionId);
        assessmentAnswer.setAssessment(assessment);
        assessmentAnswer.setQuestion(assessmentQuestion);
        return assessmentAnswerRepository.save(assessmentAnswer);
    }

    @Override
    public AssessmentAnswer updateAssessmentAnswer(Long id, AssessmentAnswer assessmentAnswer) {
        AssessmentAnswer existAssessmentAnswer = assessmentAnswerRepository.findAssessmentAnswerById(id);
        if(existAssessmentAnswer !=null){
            return assessmentAnswerRepository.save(existAssessmentAnswer);
        }
        return null;
    }

    @Override
    public void removeById(Long id) {
        assessmentAnswerRepository.deleteById(id);
    }
}
