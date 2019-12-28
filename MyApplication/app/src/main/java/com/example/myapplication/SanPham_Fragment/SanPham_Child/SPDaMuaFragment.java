package com.example.myapplication.SanPham_Fragment.SanPham_Child;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.Adapter.MybikeAdapter;
import com.example.myapplication.Adapter.TintucAdapter;
import com.example.myapplication.Adapter.XedamuaAdapter;
import com.example.myapplication.Model.MyBikeModel;
import com.example.myapplication.Model.TinTucModel;
import com.example.myapplication.Model.XedamuaModel;
import com.example.myapplication.R;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

import java.util.ArrayList;

public class SPDaMuaFragment extends Fragment {
    private View view;
    ListView listXedamua;
    ArrayList<XedamuaModel> arrayList;
    XedamuaAdapter xedamuaAdapter;
    XedamuaAdapter adapter;
    // database
    DatabaseReference mDatabase;
    ProgressBar progressBar;
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,   Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_damua, container, false);
        listXedamua = view.findViewById(R.id.listDamua);

        arrayList = new ArrayList<>();
        xedamuaAdapter = new XedamuaAdapter(SPDaMuaFragment.this.getActivity(),R.layout.item_listview_xedamua);
        listXedamua.setAdapter(xedamuaAdapter);


        return view;
    }
}
