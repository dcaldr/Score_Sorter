package com.example.android.scoresorter;

public class EditModel {
    private String editTextValue;
    private String finalScore;
    private String finalScoreText = "Pořadí";
    //test TextView to list

    public String getEditTextValue() {
        return editTextValue;
    }

    public void setEditTextValue(String editTextValue) {
        this.editTextValue = editTextValue;
    }


    //moving from int to String

    public String getFinalScore() {

        // if (finalScore != 0) return finalScoreText = Integer.toString(finalScore);
        // else return finalScoreText = "Pořadí:";
        return finalScoreText;
    }

    public void setFinalScore(String finalScore) {
        this.finalScore = finalScore;

    }
}



