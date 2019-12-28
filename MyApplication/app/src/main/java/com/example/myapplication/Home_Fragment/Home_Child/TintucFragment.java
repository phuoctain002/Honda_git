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
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.example.myapplication.Adapter.TintucAdapter;
import com.example.myapplication.MainActivity;
import com.example.myapplication.Model.TinTucModel;
import com.example.myapplication.R;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
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
    DatabaseReference mDatabase;
    ProgressBar progressBar;


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        int images[] = {R.drawable.home_slide_1,R.drawable.home_slide_2,R.drawable.home_slide_3};
        view = inflater.inflate(R.layout.fragment_tintuc, container, false);

       addControlls();
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
        progressBar.setVisibility(view.VISIBLE);
        mDatabase = FirebaseDatabase.getInstance().getReference("tintuc");
        ChildEventListener childEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String previousChildName) {

                progressBar.setVisibility(view.GONE);
                TinTucModel tt = dataSnapshot.getValue(TinTucModel.class);
                adapter.add(tt);
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
        adapter = new TintucAdapter(TintucFragment.this.getActivity(), R.layout.item_listview_tintuc);
        listTintuc.setAdapter(adapter);
    }



    private void addControlls() {
        listTintuc = view.findViewById(R.id.listTintuc);

        progressBar = view.findViewById(R.id.progressBar);
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
