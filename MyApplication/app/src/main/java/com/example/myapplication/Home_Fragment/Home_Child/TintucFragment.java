package com.example.myapplication.Home_Fragment.Home_Child;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TintucFragment extends Fragment{
    private ViewFlipper viewFlipper;
    private View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int images[] = {R.drawable.home_slide_1,R.drawable.home_slide_2,R.drawable.home_slide_3};


        view = inflater.inflate(R.layout.fragment_tintuc, container, false);
        viewFlipper = view.findViewById(R.id.v_flipper);
        for(int image: images)
        {
            flipperImages(image);
        }
        return view;
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
