package com.example.myapplication.SanPham_Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.Toolbar;

import com.example.myapplication.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SanphamFragment extends Fragment {


    private Toolbar toolbar;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_sanpham, container, false);
        loadTabs();
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

}
