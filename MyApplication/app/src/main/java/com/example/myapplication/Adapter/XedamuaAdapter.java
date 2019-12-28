package com.example.myapplication.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.Model.XedamuaModel;
import com.example.myapplication.R;

import java.util.ArrayList;

public class XedamuaAdapter extends ArrayAdapter<XedamuaModel> {
    Activity context;
    int layoutResource;
    ArrayList<XedamuaModel> arrayList;
    public XedamuaAdapter (Activity context, int resource){
        super(context,resource);
        this.context = context;
        this.layoutResource = resource;
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(layoutResource, null);

        //Thêm dữ liệu cho từng dòng trong listview
        TextView textTenxe = (TextView)convertView.findViewById(R.id.tvTenxe);
        TextView textSokhung = (TextView)convertView.findViewById(R.id.tvSokhung);
        TextView textTinhtrang = (TextView)convertView.findViewById(R.id.tvTinhtrang);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.ivXedamua);

        textTenxe.setText(arrayList.get(position).getTenxe());
        textSokhung.setText(arrayList.get(position).getSokhung());
        textTinhtrang.setText(arrayList.get(position).getTinhtrang());
        imageView.setImageResource(arrayList.get(position).getImageId());

        return  convertView;
    }

}
