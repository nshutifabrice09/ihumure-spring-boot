package com.example.backend.Ihumure_backend.service;

import com.example.backend.Ihumure_backend.model.AssessmentQuestion;
import com.example.backend.Ihumure_backend.repository.AssessmentQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssessmentQuestionServiceImplementation implements AssessmentQuestionService{
    private final AssessmentQuestionRepository assessmentQuestionRepository;

    @Autowired
   public AssessmentQuestionServiceImplementation(AssessmentQuestionRepository assessmentQuestionRepository){
       this.assessmentQuestionRepository = assessmentQuestionRepository;
    }

    @Override
    public List<AssessmentQuestion> getAllAssessmentQuestions() {
        return assessmentQuestionRepository.findAll();
    }

    @Override
    public Optional<AssessmentQuestion> getAssessmentQuestionById(Long id) {
        return assessmentQuestionRepository.findById(id);
    }

    @Override
    public AssessmentQuestion saveAssessmentQuestion(AssessmentQuestion assessmentQuestion) {
        return assessmentQuestionRepository.save(assessmentQuestion);
    }

    @Override
    public AssessmentQuestion updateAssessmentQuestion(Long id, AssessmentQuestion assessmentQuestion) {
        AssessmentQuestion existAssessmentQuestion = assessmentQuestionRepository.findAssessmentQuestionById(id);
        if(existAssessmentQuestion !=null){
            existAssessmentQuestion.setQuestionText(assessmentQuestion.getQuestionText());
            existAssessmentQuestion.setCategory(assessmentQuestion.getCategory());
            return assessmentQuestionRepository.save(existAssessmentQuestion);
        }
        return null;
    }

    @Override
    public void removeAssessmentQuestion(Long id) {
        assessmentQuestionRepository.deleteById(id);
    }
}
