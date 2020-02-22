package com.example.android.scoresorter;

public class EditModel {
    private String editTextValue;
    private int finalScore;
    private String finalScoreText;
    //test TextView to list

    public String getEditTextValue() {
        return editTextValue;
    }

    public void setEditTextValue(String editTextValue) {
        this.editTextValue = editTextValue;
    }


    //moving from int to String

    public String getFinalScore() {
        if (finalScore != 0) return finalScoreText = Integer.toString(finalScore);
        else return finalScoreText = "Pořadí:";
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }
}



