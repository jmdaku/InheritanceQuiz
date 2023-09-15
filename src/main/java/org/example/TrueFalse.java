package org.example;

import java.util.ArrayList;

public class TrueFalse extends Question {

    public Boolean answers;

    public TrueFalse(String question, String correctAnswer, Boolean answers) {
        super(question, correctAnswer);
        this.answers = answers;
        }

    public Boolean getAnswers() {
        return answers;
    }

    private void setAnswers(Boolean answers) {
        this.answers = answers;
    }

    public String Instructions() {
        return null;

    }

}
