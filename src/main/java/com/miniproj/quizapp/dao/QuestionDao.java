package com.miniproj.quizapp.dao;

import com.miniproj.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository< Question,Integer>,QuestionDaoCustom {
    List<Question> findByCategory(String category);

}

