package com.example.android.scoresorter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

// my import


public class MainActivity extends AppCompatActivity {

    public Button btn;
    public ArrayList<EditModel> editModelArrayList;
    int populateListMaxNum = 50;
    int listNumber = populateListMaxNum;
    private ListView lv;
    private CustomeAdapter customeAdapter;

    //Data collection:
    public ArrayList collectedData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listView);
        btn = findViewById(R.id.btn);

        editModelArrayList = populateList();
        customeAdapter = new CustomeAdapter(this, editModelArrayList);
        lv.setAdapter(customeAdapter);

        /* TODO activate button */

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //addToList(); //not working
                Toast.makeText(getApplicationContext(), "button", Toast.LENGTH_LONG).show();
                //  TextView meta = editModelArrayList.get(1).;
                //  meta.setText("Hello there");
                editModelArrayList.get(2).setFinalScore(21);

            }
        });
        //Data collection


    }

    private ArrayList<EditModel> populateList() { //this part works perfectly

        ArrayList<EditModel> list = new ArrayList<>();

        for (int i = 0; i < populateListMaxNum; i++) {
            EditModel editModel = new EditModel();
            //editModel.setEditTextValue(String.valueOf(i));
            list.add(editModel);
        }

        return list;
    }
    /*TODO make it work = expand */

   /* private void addToList() {  // this part doesn't work nor it doesn't fail

        EditModel editModel = new EditModel();

        editModelArrayList.add(editModel);
        customeAdapter.notifyDataSetChanged();

    }*/

}

