package com.service;

import com.model.Question;
import com.model.Quiz;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.repository.QuestionRepository;

import java.util.List;

@Component
public class QuestionService {
    QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }
}
