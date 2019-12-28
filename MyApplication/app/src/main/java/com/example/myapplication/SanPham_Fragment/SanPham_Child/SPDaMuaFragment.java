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
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.Adapter.MybikeAdapter;
import com.example.myapplication.Adapter.TintucAdapter;
import com.example.myapplication.Adapter.XedamuaAdapter;
import com.example.myapplication.Home_Fragment.Home_Child.TintucFragment;
import com.example.myapplication.Model.MyBikeModel;
import com.example.myapplication.Model.TinTucModel;
import com.example.myapplication.Model.XedamuaModel;
import com.example.myapplication.R;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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


        arrayList = new ArrayList<>();
        xedamuaAdapter = new XedamuaAdapter(SPDaMuaFragment.this.getActivity(),R.layout.item_listview_xedamua);
        listXedamua.setAdapter(xedamuaAdapter);

        addControlls();
        addData();
        addFirebBase();

        return view;
    }
    private void addFirebBase() {
        progressBar.setVisibility(view.VISIBLE);
        mDatabase = FirebaseDatabase.getInstance().getReference("sanphamdamua");
        ChildEventListener childEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String previousChildName) {
                Toast.makeText(SPDaMuaFragment.this.getActivity(), "Lay duoc xe", Toast.LENGTH_LONG).show();
                progressBar.setVisibility(view.GONE);
                XedamuaModel xdm = dataSnapshot.getValue(XedamuaModel.class);
                adapter.add(xdm);

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }


        };
        mDatabase.addChildEventListener(childEventListener);
    }
    private void addData() {
        adapter = new XedamuaAdapter(SPDaMuaFragment.this.getActivity(), R.layout.item_listview_xedamua);
        listXedamua.setAdapter(adapter);
    }



    private void addControlls() {
        listXedamua = view.findViewById(R.id.listDamua);

    }

}
