package com.example.myapplication.SanPham_Fragment.SanPham_Child;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class TraCuuSPFragment extends Fragment {
    View view;
    CarouselView carouselView;


    int[] sampleImages = {R.drawable.icontayga, R.drawable.icontayga};
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_tracuusanpham, container, false);
        addControlls();
        return view;
    }

    private void addControlls() {
        carouselView = view.findViewById(R.id.carouselView);
//        xemthem = findViewById(R.id.xemthem);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };
}
