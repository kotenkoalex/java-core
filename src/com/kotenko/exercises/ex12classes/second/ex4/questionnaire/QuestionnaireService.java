package com.kotenko.exercises.ex12classes.second.ex4.questionnaire;

public class QuestionnaireService {
    private final IQuestionnaireDao questionnaireDao;

    public QuestionnaireService(IQuestionnaireDao questionnaireDao) {
        this.questionnaireDao = questionnaireDao;
    }

    public Questionnaire getQuestionnaireByNumber(Long id) {
        Questionnaire[] questionnaires = questionnaireDao.getQuestionnaire();
        for (Questionnaire questionnaire : questionnaires) {
            if (questionnaire.getId().equals(id)) {
                return questionnaire;
            }
        }
        return null;
    }
}
