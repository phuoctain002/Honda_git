package com.example.myapplication.SanPham_Fragment.SanPham_Child;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.Adapter.MybikeAdapter;
import com.example.myapplication.Model.MyBikeModel;
import com.example.myapplication.R;

import java.util.ArrayList;

public class SPDaMuaFragment extends Fragment {
    View view;
    MybikeAdapter mybikeAdapter;
    ArrayList<MyBikeModel> arrayList;
    ListView listView;
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,   Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_mybike, container, false);
        listView = view.findViewById(R.id.listMybike);

        arrayList = new ArrayList<>();
        arrayList.add(new MyBikeModel(R.drawable.img_xeso, "RSX 110", "2AWF232AS2434SDFA43","12/05/2018"));
        arrayList.add(new MyBikeModel(R.drawable.img_contay, "WINNER X 2020", "4342AS2434SDSRT43","26/012/2019"));

        mybikeAdapter = new MybikeAdapter(getContext(),R.layout.item_listview_tintuc,arrayList);
        listView.setAdapter(mybikeAdapter);


        return view;
    }
}
