package com.example.myapplication.DichVu_Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.Toolbar;

import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

public class DichVuFragment extends Fragment {
    private Toolbar toolbar;

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_dichvu, container, false);

        loadTabs();
        return view;
    }

    public void loadTabs() {
        final TabHost tab = (TabHost) view.findViewById
                (R.id.tabhost_dv);
        //gọi lệnh setup
        tab.setup();
        TabHost.TabSpec spec;
        //Tạo tab1
        spec = tab.newTabSpec("t1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Sửa chữa");
        tab.addTab(spec);

        //Tạo tab2
        spec = tab.newTabSpec("t2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Bảo hành");
        tab.addTab(spec);

        //Tạo tab3
        spec = tab.newTabSpec("t3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Tình trạng SC");
        tab.addTab(spec);

        //Set Tab
        tab.setCurrentTab(0);
    }
}
