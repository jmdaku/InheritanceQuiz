package org.example;

import java.util.ArrayList;

public class Checkbox extends Question {

    public ArrayList<String> Answers = new ArrayList<>();

    public Checkbox(String question, String correctAnswer, ArrayList<String> answers) {
        super(question, correctAnswer);
        Answers = answers;
    }

    public ArrayList<String> getAnswers() {
        return Answers;
    }

    private void setAnswers(ArrayList<String> answers) {
        Answers = answers;
    }

    public String Instructions() {
        return null;
    }

}