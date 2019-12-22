package com.example.myapplication.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

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

        textTitle.setText(arrayList.get(position).getTitle());
        textDesc.setText(arrayList.get(position).getDescription());
        imageView.setImageResource(arrayList.get(position).getImageId());

        return  convertView;
    }
}
