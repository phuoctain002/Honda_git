package com.example.myapplication.SanPham_Fragment.SanPham_Child;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.XeActivity;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class TraCuuSPFragment extends Fragment {
    View view;
    CarouselView carouselView;
    public String loaixe;


    int[] sampleImages = {R.drawable.icontayga, R.drawable.icontayga};
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        view =  inflater.inflate(R.layout.fragment_tracuusanpham, container, false);
        addControlls();

        return view;
    }

    private void addControlls() {
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

    public void onClick(View v) {

        switch(v.getId()){

            case R.id.btnXetayga:
                this.loaixe = "Tay ga";
                Intent intent = new Intent(TraCuuSPFragment.this.getActivity(), XeActivity.class);
                intent.putExtra("LOAIXE",loaixe);
                this.startActivity(intent);
                break;

            case R.id.btnXeso:
                this.loaixe = "xeso";
                intent = new Intent(TraCuuSPFragment.this.getActivity(), XeActivity.class);
                intent.putExtra("LOAIXE",loaixe);
                this.startActivity(intent);
                break;

            case R.id.btnMoto:
                this.loaixe = "xetaycon";
                intent = new Intent(TraCuuSPFragment.this.getActivity(), XeActivity.class);
                intent.putExtra("LOAIXE",loaixe);
                this.startActivity(intent);
                break;

            case R.id.btnContay:
                this.loaixe = "xemoto";
                intent = new Intent(TraCuuSPFragment.this.getActivity(), XeActivity.class);
                intent.putExtra("LOAIXE",loaixe);
                this.startActivity(intent);
                break;
        }
    }
}
