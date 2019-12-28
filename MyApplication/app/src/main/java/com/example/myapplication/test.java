package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class test extends AppCompatActivity {

    CarouselView carouselView;
    TextView xemthem;
    int[] sampleImages = {R.drawable.iconcontay, R.drawable.icontayga};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        addControlls();
    }


    private void addControlls() {
        carouselView = findViewById(R.id.carouselView);
        xemthem = findViewById(R.id.xemthem);
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