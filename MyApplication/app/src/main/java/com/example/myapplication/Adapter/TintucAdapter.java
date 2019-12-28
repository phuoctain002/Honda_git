package com.example.myapplication.Adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.myapplication.Model.TinTucModel;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class TintucAdapter extends ArrayAdapter<TinTucModel> {

    Activity context;
    int layoutResource;
    ArrayList<TinTucModel> arrayList;

    public TintucAdapter( Activity context, int resource) {
        super(context, resource);
        this.context = context;
        this.layoutResource = resource;


    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(layoutResource, null);

        //Thêm dữ liệu cho từng dòng trong listview
        TextView textTitle = (TextView)convertView.findViewById(R.id.tvTitle);
        TextView textDesc = (TextView)convertView.findViewById(R.id.tvDesc);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.ivTintuc);

        final TinTucModel tt = getItem(position);

      textTitle.setText(tt.getTitle());
      textDesc.setText(tt.getDescription());
        if (tt.base64 != null && !tt.base64.isEmpty()) {
            byte[] decodedString = Base64.decode(tt.base64, Base64.DEFAULT);
            Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
            imageView.setImageBitmap(decodedByte);
        }
        else {
            imageView.setImageResource(R.drawable.noimg);
        }

        return  convertView;
    }
}
