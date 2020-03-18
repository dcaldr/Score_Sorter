package com.example.android.scoresorter;

import java.util.ArrayList;
import java.util.Collections;

import static com.example.android.scoresorter.CustomeAdapter.editModelArrayList;


public class MagicCalculate {
    private ArrayList<Float> inputHolder = new ArrayList<Float>();
    private ArrayList<Float> inputCompare = new ArrayList<Float>();




        public void MagicCalculator () {


        Float inputValue;
        /* from @EditText (s) to ArrayList */
        for (int i = 0; i < CustomeAdapter.editModelArrayList.size(); i++) {


            inputValue = Float.valueOf(editModelArrayList.get(i).getEditTextValue());
            inputHolder.add(inputValue);

        }
        /* Copy list ArrayList for lookup and remove data from unused @EditText
         */
        for (int i = 0; i < CustomeAdapter.editModelArrayList.size(); i++) {
            inputValue = inputHolder.get(i);
            if (inputValue > 0.0001) {
                inputCompare.add(inputValue);

            } else return;

        }
        /* Order lookup @inputCompare from high to low FUTURE:add switch */
        sortArrayList();

        /*looking up values of first ArrayList */
        Float lookupValue;
        int order;
        for (int i = 0; i < CustomeAdapter.editModelArrayList.size(); i++) {
            lookupValue = inputHolder.get(i);
            if (lookupValue > 0.0001) {
                order = inputCompare.indexOf(lookupValue);
                //non-static method cannot be referenced from static context
                //EditModel.setResultOrder(order);
                editModelArrayList.get(i).setResultOrder(order);
            }
            else{
                editModelArrayList.get(i).setResultOrder(-1);
            }
        }

    }
        private void sortArrayList () {
        Collections.sort(inputCompare);
    }
        /*Return to @EditModel => -1 if from unused @EditText or invalid data order */
//private void returnOrder(){

//}

}


