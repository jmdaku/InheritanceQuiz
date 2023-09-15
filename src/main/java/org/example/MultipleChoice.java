package org.example;

import java.util.ArrayList;

public class MultipleChoice extends Question{
    public ArrayList <String> Answers = new ArrayList<>();

    public MultipleChoice(String question, String correctAnswer, ArrayList<String> answers) {
        super(question, correctAnswer);
        Answers = answers;
    }

    ArrayList<String> getAnswers() {
        return Answers;
    }

    private void setAnswers(ArrayList<String> answers) {
        Answers = answers;
    }

    public String Instructions(){
        return null;

    }

}
