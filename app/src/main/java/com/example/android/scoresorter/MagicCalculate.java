package com.example.android.scoresorter;

import java.util.ArrayList;
import java.util.Collections;

import static com.example.android.scoresorter.CustomeAdapter.editModelArrayList;

public class MagicCalculate {


    ArrayList comparedData = new ArrayList<Double>();
    ArrayList entryData;
    ArrayList outputData = new ArrayList<Integer>();

    {
        entryData = new ArrayList<Double>();
    }

    //editModelArrayList = editModelArrayList;


    /**
     * This is where calculation is  made
     */
    public MagicCalculate(ArrayList entryData) {
        this.entryData = entryData;
        comparedData = entryData;
        //Sorting to the order
        Collections.sort(comparedData);
        // for each element in @entryData find their order in
        for (Object result : entryData) {
            // If empty EditText?
            if ((double) result == -2.75) {
                outputData.add(-2);
            } else if ((double) result > 0) {
                int i = comparedData.indexOf(result);
                outputData.add(i);
            }
        }
        MagicOutput();
    }

    public void setEntryData(ArrayList entryData) {
        this.entryData = entryData;
    }

    public void addToEntryData(double i) {

        entryData.add(i);
    }

    /**
     * this creates an output data for other use,
     * USE ONLY IN @MagicCalculate to prevent problems
     */
    public void MagicOutput() {
        int number;

        for (int i = 0; i < comparedData.size(); i++) {
            number = (int) comparedData.get(i);
            //catching mistakes and empty(-2) ...
            switch (number) {
                case -2:
                    editModelArrayList.get(i).setFinalScore("");
                case -1:
                    editModelArrayList.get(i).setFinalScore("Chyba");
                default:
                    editModelArrayList.get(i).setFinalScore(Integer.toString(number));

            }


        }

    }
}

