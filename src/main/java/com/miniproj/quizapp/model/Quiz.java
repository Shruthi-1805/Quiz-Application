package com.miniproj.quizapp.model;

import jakarta.persistence.*;

import java.util.List;

import lombok.Data;

@Entity
@Data
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String title;

    @ManyToMany
    private List<Question> questions;
}
