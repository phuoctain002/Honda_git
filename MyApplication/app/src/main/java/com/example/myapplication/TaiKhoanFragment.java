package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class TaiKhoanFragment extends Fragment {
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int images[] = {R.drawable.home_slide_1, R.drawable.home_slide_2, R.drawable.home_slide_3};
        view = inflater.inflate(R.layout.fragment_taikhoan, container, false);






        return view;
    }
}
