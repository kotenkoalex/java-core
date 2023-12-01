package com.kotenko.exercises.ex12classes.second.ex4.questionnaire;

import com.kotenko.exercises.ex12classes.second.ex4.question.Question;

import java.time.LocalDate;
import java.util.Arrays;

public class Questionnaire {
    private Long id;
    private Question[] questions;
    private LocalDate createdAt;

    public Questionnaire(Long id, Question[] questions, LocalDate createdAt) {
        this.id = id;
        this.questions = questions;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "age=" + id +
                ", questions=" + Arrays.toString(questions) +
                ", createdAt=" + createdAt +
                '}';
    }
}
