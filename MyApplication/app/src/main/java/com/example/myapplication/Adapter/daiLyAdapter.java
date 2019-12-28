package com.example.myapplication.Adapter;


import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.myapplication.DaiLy;
import com.example.myapplication.Model.DailyModel;
import com.example.myapplication.R;

public class daiLyAdapter extends ArrayAdapter<DailyModel> {

    Activity context;
    int resource;


    public daiLyAdapter(Activity context, int resource) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
    }
    // hien thi len list view

//chuoy phai chon general chon override method go tim getView....

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View custom =  this.context.getLayoutInflater().inflate(resource, null);

        // ImageView imgView;

        TextView txtDiachidaily,txtSDT;

//        txtTendaily = custom.findViewById(R.id.txtgia);
        txtDiachidaily = custom.findViewById(R.id.txtDiachidaily);
        txtSDT = custom.findViewById(R.id.txtSDT);
//        imgView = custom.findViewById(R.id. imgView);

        DailyModel dl = getItem(position);

        // imgView.setImageResource(R.drawable.daily);

        // txtTendaily.setText(dl.getTendaily());
        txtDiachidaily.setText(dl.getDiachi());
        txtSDT.setText(dl.getSDT() + "");

        return custom;
    }
}