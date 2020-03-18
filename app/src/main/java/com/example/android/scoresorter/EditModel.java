package com.example.android.scoresorter;

public class EditModel {
    private String editTextValue;
    private int resultOrder;
   public int intResultOrder;

    public String getEditTextValue() {
        return editTextValue;
    }

    public void setEditTextValue(String editTextValue) {
        this.editTextValue = editTextValue;
    }

    public String  getResultOrder() {
        if (this.resultOrder < 0) {
            return String.valueOf(this.resultOrder);
        } else {
            return "";
        }
    }
        public  void setResultOrder (int intResultOrder){
            this.resultOrder = intResultOrder;

        }

    }
