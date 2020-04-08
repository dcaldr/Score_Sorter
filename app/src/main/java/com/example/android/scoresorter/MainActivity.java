package com.example.android.scoresorter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public Button infoBtn;
    public Button btn;
    public static ArrayList<EditModel> editModelArrayList;
    int populateListMaxNum = 3;
    int listNumber = populateListMaxNum;
    private ListView lv;
    public  CustomeAdapter customeAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MagicCalculate NonStaticMethodtoStaticContext = new MagicCalculate();
        lv = findViewById(R.id.listView);
        btn = findViewById(R.id.btn);
        infoBtn = findViewById(R.id.InfoButton);


                editModelArrayList = populateList();

            AdapterResetOrStart();
               /* TODO activate button */

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NonStaticMethodtoStaticContext.MagicCalculator();


                customeAdapter.notifyDataSetChanged();


            }
        });
        infoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                openInfoDialog();

            }
        });

    }

    public void AdapterResetOrStart(){
        customeAdapter = new CustomeAdapter(this, editModelArrayList);
        lv.setAdapter(customeAdapter);}

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
    public void openInfoDialog() {
        InfoDialog infoDialog = new InfoDialog();
        infoDialog.show(getSupportFragmentManager(), "info dialog");
    }

}

