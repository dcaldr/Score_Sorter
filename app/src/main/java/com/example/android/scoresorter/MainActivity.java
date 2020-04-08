package com.example.android.scoresorter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static boolean highToLow;
    public static ArrayList<EditModel> editModelArrayList;
    //my
    private static Context mContext;
    public Button infoBtn;
    public Button btn;
    public Switch switchOrder;
    public CustomeAdapter customeAdapter;
    int populateListMaxNum = 3;
    int listNumber = populateListMaxNum;
    private ListView lv;

    public static Context getContext() {
        return mContext;
    }

    public void AdapterResetOrStart() {
        customeAdapter = new CustomeAdapter(this, editModelArrayList);
        lv.setAdapter(customeAdapter);
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


    public void openInfoDialog() {
        InfoDialog infoDialog = new InfoDialog();
        infoDialog.show(getSupportFragmentManager(), "info dialog");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MagicCalculate NonStaticMethodtoStaticContext = new MagicCalculate();
        lv = findViewById(R.id.listView);
        btn = findViewById(R.id.btn);
        infoBtn = findViewById(R.id.InfoButton);
        switchOrder = findViewById(R.id.order_switch);
        mContext = this;


                editModelArrayList = populateList();

            AdapterResetOrStart();
               /* TODO activate button */
/** Calculate Button*/
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                highToLow = switchOrder.isChecked();

                NonStaticMethodtoStaticContext.MagicCalculator();


                customeAdapter.notifyDataSetChanged();


            }
        });
        /** Info button*/
        infoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                openInfoDialog();

            }
        });

    }
}

