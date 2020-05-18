package com.example.android.scoresorter;

public class EditModel {
    private String editTextValue;
    public int resultOrder;
   public int intResultOrder;
    public String getStringResultOrder = MainActivity.getContext().getString(R.string.firstResultTextVal);


    public String getEditTextValue() {
        return editTextValue;
    }

    public void setEditTextValue(String editTextValue) {
        this.editTextValue = editTextValue;
    }

    public String  getResultOrder() {
        return getStringResultOrder;
    }
        public  void setResultOrder (int intResultOrder){
            this.intResultOrder = intResultOrder;
            this.resultOrder = intResultOrder;
            CalculateResultOrder();

        }
public String CalculateResultOrder() {
    if (this.intResultOrder > 0) {

        getStringResultOrder = String.valueOf(this.intResultOrder);
        return getStringResultOrder;
    } else {
        getStringResultOrder = "";
        return getStringResultOrder;
    }
}

    }
