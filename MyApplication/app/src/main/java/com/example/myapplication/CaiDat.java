package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.myapplication.Home_Fragment.Home_Child.ThemtintucActivity;

public class CaiDat extends Fragment {

    View view;
    Button addTinTuc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_caidat, container, false);

        addTinTuc = (Button) view.findViewById(R.id.btnAddTinTuc);

        addEvent();
        return view;
    }

    private void addEvent() {
        addTinTuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Confirm_Ad.class);
                startActivity(i);
            }
        });
    }
}
