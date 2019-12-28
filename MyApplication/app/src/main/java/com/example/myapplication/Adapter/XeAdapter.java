package com.example.myapplication.Adapter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.Model.XeModel;
import com.example.myapplication.R;

import java.util.ArrayList;

public class XeAdapter extends ArrayAdapter<XeModel> {
    Activity context;
    int layoutResource;
    ArrayList<XeModel> arrayList;
    public XeAdapter (Activity context, int resource){
        super(context,resource);
        this.context = context;
        this.layoutResource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //LayoutInflater inflater = LayoutInflater.from(context);
        //convertView = inflater.inflate(layoutResource, null);
        convertView =  this.context.getLayoutInflater().inflate(layoutResource, null);
        //Thêm dữ liệu cho từng dòng trong listview
        TextView textTenxe = (TextView)convertView.findViewById(R.id.tvTensp);
        TextView textGia = (TextView)convertView.findViewById(R.id.tvGia);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.ivXe);

        final XeModel xe = getItem(position);

        textTenxe.setText(xe.getTenxe() == null ? "" : xe.getTenxe());
        textGia.setText(xe.getGia()+"");
        try {
            if (xe.hinh != null && !xe.hinh.isEmpty()) {
                byte[] decodedString = Base64.decode(xe.hinh, Base64.DEFAULT);
                Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
                imageView.setImageBitmap(decodedByte);
            }
            else {
                imageView.setImageResource(R.drawable.noimg);
            }
        }
        catch (Exception ex) {
            imageView.setImageResource(R.drawable.noimg);
        }

        return  convertView;
    }

}

