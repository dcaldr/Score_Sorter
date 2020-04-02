package com.example.android.scoresorter;

import java.util.ArrayList;
import java.util.Collections;

import static com.example.android.scoresorter.CustomeAdapter.editModelArrayList;


public class MagicCalculate {
    private ArrayList<Float> inputHolder = new ArrayList<Float>();
    private ArrayList<Float> inputCompare = new ArrayList<Float>();
    private ArrayList<Float> inputCompared = new ArrayList<Float>();
    Float lookupValue;
    int order;



        public void MagicCalculator () {


        Float inputValue;
        /* from @EditText (s) to ArrayList */
        for (int i = 0; i < editModelArrayList.size(); i++) {
            try {
                if (editModelArrayList.get(i).getEditTextValue().length() > 0) {

                    inputValue = Float.valueOf(editModelArrayList.get(i).getEditTextValue());
                    inputHolder.add(inputValue);
                } else {
                    inputHolder.add((float) -1);
                }


            } catch (NullPointerException e) {
                inputHolder.add((float) -1);
            }
        }
        /* Copy list ArrayList for lookup and remove data from unused @EditText
         */
        for (int i = 0; i < editModelArrayList.size(); i++) {
            inputValue = inputHolder.get(i);
            if (inputValue == null){
                return;
            }
            else if (inputValue > 0.0001) {
                inputCompare.add(inputValue);

            } else return;

        }
        /* Order lookup @inputCompare from high to low FUTURE:add switch */
        sortArrayList();

        /*looking up values of first ArrayList */ /* FUTURE:  encapsulate in method */


        for (int i = 0; i < editModelArrayList.size(); i++) {
            lookupValue = inputHolder.get(i);
            order = 0;
            if (lookupValue > 0.0001) {
                //+1 to not start with 0
                order = inputCompare.indexOf(lookupValue);

                //non-static method cannot be referenced from static context
                /**
                 * When switching don't forget at @MagicWipe
                 */

               editModelArrayList.get(i).setResultOrder(order);
              //  MainActivity.editModelArrayList.get(i).setResultOrder(order);



            }

            else{
                editModelArrayList.get(i).setResultOrder(-1);
                MainActivity.editModelArrayList.get(i).setResultOrder(-1);
            }


            ;
            }


        }




        private void sortArrayList () {
      Collections.sort(inputCompare);
            inputCompared.addAll(inputCompare);

    }

        /*Return to @EditModel => -1 if from unused @EditText or invalid data order */
//private void returnOrder(){

//}
public void MagicWipe(){
    for (int i =0; i < editModelArrayList.size(); i++){
        editModelArrayList.get(i).setResultOrder(0);
    }
    }
}


