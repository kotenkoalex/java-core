package com.kotenko.exercises.ex12classes.second.ex4.questionnaire;

import com.kotenko.exercises.ex12classes.second.ex4.question.Question;

import java.time.LocalDate;

public class QuestionnaireDao implements IQuestionnaireDao {
    private static final Questionnaire[] questionnaires;

    static {
        Question[] questions1 = {
                new Question(1L, "Do you talk to your car even though you're pretty sure it can't hear you?"),
                new Question(2L, "Have you ever pressed the \"close door\" button in an elevator multiple times, hoping it would speed things up?"),
                new Question(3L, "What is yor name"),
        };
        Question[] questions2 = {
                new Question(1L, "Do you believe the sock-eating monster in the laundry room is just misunderstood?"),
                new Question(2L, "Have you ever laughed at your own joke before delivering it, just because you knew it was going to be hilarious?"),
                new Question(3L, "Ever danced like no one's watching, only to realize someone was actually watching?"),
        };
        Questionnaire questionnaire1 = new Questionnaire(1L, questions1, LocalDate.now());
        Questionnaire questionnaire2 = new Questionnaire(2L, questions2, LocalDate.now().minusDays(1));
        questionnaires = new Questionnaire[]{questionnaire1, questionnaire2};
    }

    @Override
    public Questionnaire[] getQuestionnaire() {
        return questionnaires;
    }
}
