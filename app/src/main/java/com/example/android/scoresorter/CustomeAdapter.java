package com.example.android.scoresorter;

import android.content.Context;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomeAdapter extends BaseAdapter {


    public static ArrayList<EditModel> editModelArrayList/*this*/;
    private Context context;

    public CustomeAdapter(Context context, ArrayList<EditModel> editModelArrayList) {

        this.context = context;
        CustomeAdapter.editModelArrayList = editModelArrayList;
    }

    @Override
    public int getViewTypeCount() {
        return getCount();
    }

    @Override
    public int getItemViewType(int position) {

        return position;
    }

    @Override
    public int getCount() {
        return editModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return editModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;



        if (convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.lv_item, null, true);

            holder.editText = convertView.findViewById(R.id.editid);
            holder.textView = convertView.findViewById(R.id.TextViewId);
//my
            TextView thatView = convertView.findViewById(R.id.TextViewId);
            String toPrint = editModelArrayList.get(position).getResultOrder();
            thatView.setText(toPrint);

            convertView.setTag(holder);
        } else {
            // the getTag returns the viewHolder object set as a tag to the view
            holder = (ViewHolder) convertView.getTag();
        }

        holder.editText.setText(editModelArrayList.get(position).getEditTextValue());
        //TODO:repair this mistake
        holder.textView.setText(editModelArrayList.get(position).getResultOrder());

        //Setting input to decimal and its working!
        holder.editText.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);


        holder.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                editModelArrayList.get(position).setEditTextValue(holder.editText.getText().toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }


        });

        return convertView;
    }

    public class ViewHolder {

        protected EditText editText;
        //my
        protected TextView textView;

    }


}


