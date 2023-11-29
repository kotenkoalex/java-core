package com.kotenko.exercises.ex12classes.second.ex4;

import com.kotenko.exercises.ex12classes.second.ex4.question.Question;
import com.kotenko.exercises.ex12classes.second.ex4.questionnaire.IQuestionnaireDao;
import com.kotenko.exercises.ex12classes.second.ex4.questionnaire.Questionnaire;
import com.kotenko.exercises.ex12classes.second.ex4.questionnaire.QuestionnaireDao;
import com.kotenko.exercises.ex12classes.second.ex4.questionnaire.QuestionnaireService;
import com.kotenko.exercises.ex12classes.second.ex4.user.User;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);
        User user = registerUser(scanner);
        System.out.println("Choose Questionnaire, enter number: ");
        var questionnaireNumber = getQuestionnaireNumber(scanner);
        IQuestionnaireDao questionnaireDao = new QuestionnaireDao();
        QuestionnaireService questionnaireService = new QuestionnaireService(questionnaireDao);
        Questionnaire questionnaire = questionnaireService.getQuestionnaireByNumber(questionnaireNumber);
        String[] answers = takeQuestionnaire(questionnaire, scanner);
        File file = new File("src/com/kotenko/exercises/ex12classes/third/ex4/questionnaire_storage.txt");
        saveAnswersToFile(file, user, answers);
        scanner.close();
    }

    private static void saveAnswersToFile(File file, User user, String[] answers) {
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(user.toString() + "\n");
            for (String answer : answers) {
                fileWriter.write(answer);
            }
            fileWriter.write("\n\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String[] takeQuestionnaire(Questionnaire questionnaire, Scanner scanner) {
        String[] result = new String[questionnaire.getQuestions().length + 1];
        int counter = 0;
        String title = "Questionnaire: %s, %s\n"
                .formatted(questionnaire.getId().toString(), questionnaire.getCreatedAt().toString());
        result[counter++] = title;
        String content;
        for (Question question : questionnaire.getQuestions()) {
            content = question.id() + ". " + question.text();
            System.out.println(content);
            result[counter++] = content + " : " + scanner.nextLine() + "\n";
        }
        return result;
    }

    private static long getQuestionnaireNumber(Scanner scanner) {
        try {
            return Long.parseLong(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sorry, it's not a int questionnaire number");
        }
        return -1;
    }

    private static User registerUser(Scanner scanner) {
        System.out.println("Enter your name, please: ");
        String name = scanner.nextLine();
        System.out.println("Enter your name, email: ");
        String email = scanner.nextLine();
        System.out.println("Enter your name, dob in format yyyy:mm:dd: ");
        String dob = scanner.nextLine();
        return new User(name, email, dob);
    }
}
