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
        TextView textNgaymua = (TextView)convertView.findViewById(R.id.tvNgaymua);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.ivXedamua);

        final XedamuaModel xdm = getItem(position);

        textTenxe.setText(xdm.getTenxe());
        textSokhung.setText(xdm.getSokhung());
        textTinhtrang.setText(xdm.getTinhtrang());
        textNgaymua.setText(xdm.getNgaymua() == null ? "" : xdm.getNgaymua());
        try {
            if (xdm.hinh != null && !xdm.hinh.isEmpty()) {
                byte[] decodedString = Base64.decode(xdm.hinh, Base64.DEFAULT);
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
