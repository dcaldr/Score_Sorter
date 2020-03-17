package com.example.android.scoresorter;

public class EditModel {
    private String editTextValue;
    private int resultOrder;

    public String getEditTextValue() {
        return editTextValue;
    }

    public void setEditTextValue(String editTextValue) {
        this.editTextValue = editTextValue;
    }

    public String  getResultOrder() {
        if (resultOrder < 0) {
            return String.valueOf(resultOrder);
        } else {
            return "";
        }
    }
        public void setResultOrder ( int intResultOrder){
            this.resultOrder = intResultOrder;

        }

    }
