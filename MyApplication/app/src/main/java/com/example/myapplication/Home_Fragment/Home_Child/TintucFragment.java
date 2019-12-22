package com.example.myapplication.Home_Fragment.Home_Child;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ViewFlipper;

import com.example.myapplication.Adapter.TintucAdapter;
import com.example.myapplication.MainActivity;
import com.example.myapplication.Model.TinTucModel;
import com.example.myapplication.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TintucFragment extends Fragment{
    private ViewFlipper viewFlipper;
    private View view;
    ListView listTintuc;
    ArrayList<TinTucModel> arrayList;
    TintucAdapter tintucAdapter;
    Button them;
    TintucAdapter adapter;
    // database
    DatabaseReference mDataBase;

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        int images[] = {R.drawable.home_slide_1,R.drawable.home_slide_2,R.drawable.home_slide_3};
        view = inflater.inflate(R.layout.fragment_tintuc, container, false);

       addControlls();
       addEvent();
       addData();
       addFirebBase();

        viewFlipper = view.findViewById(R.id.v_flipper);
        for(int image: images)
        {
            flipperImages(image);
        }
        return view;
    }

    private void addFirebBase() {

    }

    private void addData() {
        adapter = new TintucAdapter(TintucFragment.this.getActivity(), R.layout.item_listview_tintuc);
        listTintuc.setAdapter(adapter);
    }

    private void addEvent() {
        them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ThemtintucActivity.class);
                startActivity(i);
            }
        });
    }

    private void addControlls() {
        listTintuc = view.findViewById(R.id.listTintuc);
        them = view.findViewById(R.id.them);
    }

    public void flipperImages(int image){
        ImageView imageView =  new ImageView(getContext());
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(getContext(), android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(getContext(), android.R.anim.slide_out_right);
    }

}
