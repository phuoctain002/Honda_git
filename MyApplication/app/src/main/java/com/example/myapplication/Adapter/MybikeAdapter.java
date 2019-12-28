package com.example.myapplication.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.myapplication.Model.MyBikeModel;
import com.example.myapplication.R;
import com.google.firebase.database.annotations.Nullable;

import java.util.ArrayList;

public class MybikeAdapter extends ArrayAdapter<MyBikeModel> {
    Context context;
    int layoutResource;
    ArrayList<MyBikeModel> arrayList;

    public MybikeAdapter(Context context, int resource, ArrayList<MyBikeModel> objects) {
        super(context, resource);
        this.context = context;
        this.arrayList = objects;
        this.layoutResource = resource;


    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(layoutResource, null);

        //Thêm dữ liệu cho từng dòng trong listview
        TextView textTenxe = (TextView)convertView.findViewById(R.id.tvTenxe);
        TextView textMakhung = (TextView)convertView.findViewById(R.id.tvMakhung);
        TextView textDate = (TextView)convertView.findViewById(R.id.tvNgaymua);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imgMybike);

        textTenxe.setText(arrayList.get(position).getTenXe());
        textMakhung.setText(arrayList.get(position).getMaKhung());
        textDate.setText(arrayList.get(position).getNgayMua());
        imageView.setImageResource(arrayList.get(position).getImageId());

        return  convertView;
    }
}
