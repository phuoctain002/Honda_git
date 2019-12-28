package com.example.myapplication.SanPham_Fragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.myapplication.Adapter.XedamuaAdapter;
import com.example.myapplication.Model.XedamuaModel;
import com.example.myapplication.R;
import com.example.myapplication.SanPham_Fragment.SanPham_Child.SPDaMuaFragment;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SanphamFragment extends Fragment {

    ListView listXedamua;
    ArrayList<XedamuaModel> arrayList;
    XedamuaAdapter xedamuaAdapter;
    XedamuaAdapter adapter;
    // database
    DatabaseReference mDatabase;
    ProgressBar progressBar;
    private Toolbar toolbar;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_sanpham, container, false);
        arrayList = new ArrayList<>();

        xedamuaAdapter = new XedamuaAdapter(SanphamFragment.this.getActivity(),R.layout.item_listview_xedamua);
        loadTabs();
        addControlls();
        addData();
        addFirebBase();



        //listXedamua.setAdapter(xedamuaAdapter);

        return view;
    }
    public void loadTabs() {
        final TabHost tab = (TabHost) view.findViewById
                (R.id.tabhos_sp);
        //gọi lệnh setup
        tab.setup();
        TabHost.TabSpec spec;
        //Tạo tab1
        spec = tab.newTabSpec("t1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Sản phẩm");
        tab.addTab(spec);

        //Tạo tab2
        spec = tab.newTabSpec("t2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Xe của tôi");
        tab.addTab(spec);

        //Tạo tab3
        spec = tab.newTabSpec("t3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Yêu thích");
        tab.addTab(spec);

        //Set Tab
        tab.setCurrentTab(0);
    }
    private void addFirebBase() {
        progressBar.setVisibility(view.VISIBLE);
        mDatabase = FirebaseDatabase.getInstance().getReference("sanphamdamua");
        ChildEventListener childEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String previousChildName) {
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
        adapter = new XedamuaAdapter(SanphamFragment.this.getActivity(), R.layout.item_listview_xedamua);
        listXedamua.setAdapter(adapter);
    }



    private void addControlls() {
        listXedamua = view.findViewById(R.id.listDamua);
        progressBar = view.findViewById(R.id.progressBar);

    }

}
