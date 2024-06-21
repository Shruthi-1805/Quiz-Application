package com.miniproj.quizapp.dao;
import com.miniproj.quizapp.model.Question;
import java.util.List;

public interface QuestionDaoCustom {
    List<Question> findRandomQuestionsByCategory(String category, int numQ);
}
