package com.example.myapplication.SanPham_Fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;
import android.widget.ViewFlipper;

import com.example.myapplication.Adapter.XedamuaAdapter;
import com.example.myapplication.Model.XedamuaModel;
import com.example.myapplication.R;
import com.example.myapplication.SanPham_Fragment.SanPham_Child.SPDaMuaFragment;
import com.example.myapplication.SanPham_Fragment.SanPham_Child.TraCuuSPFragment;
import com.example.myapplication.XeActivity;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SanphamFragment extends Fragment {

    ListView listXedamua;
    ArrayList<XedamuaModel> arrayList;
    XedamuaAdapter xedamuaAdapter;
    XedamuaAdapter adapter;
    // database
    DatabaseReference mDatabase;
    ProgressBar progressBar;
    private Toolbar toolbar;
    View view;
    public String loaixe;
    Button btnXeTayga, btnXeso, btnMoto, btnContay;
    TextView btnXemall;
    private ViewFlipper viewFlipper;


    int[] sampleImages = {R.drawable.icontayga, R.drawable.icontayga};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int images[] = {R.drawable.banner_1,R.drawable.banner_2,R.drawable.banner_3};
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_sanpham, container, false);
        arrayList = new ArrayList<>();

        xedamuaAdapter = new XedamuaAdapter(SanphamFragment.this.getActivity(),R.layout.item_listview_xedamua);

        btnXeTayga = view.findViewById(R.id.btnXetayga);
        btnXeso = view.findViewById(R.id.btnXeso);
        btnMoto = view.findViewById(R.id.btnMoto);
        btnContay = view.findViewById(R.id.btnContay);
        btnXemall = view.findViewById(R.id.xemall);

        View.OnClickListener eventLoaiXe = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyLoaiXe(v);
            }
        };

        btnXeTayga.setOnClickListener(eventLoaiXe);
        btnXeso.setOnClickListener(eventLoaiXe);
        btnMoto.setOnClickListener(eventLoaiXe);
        btnContay.setOnClickListener(eventLoaiXe);
        btnXemall.setOnClickListener(eventLoaiXe);

        loadTabs();
        addControlls();
        addData();
        addFirebBase();

        viewFlipper = view.findViewById(R.id.v_flipper);
        for(int image: images)
        {
            flipperImages(image);
        }



        //listXedamua.setAdapter(xedamuaAdapter);

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
    private void addFirebBase() {
        progressBar.setVisibility(view.VISIBLE);
        mDatabase = FirebaseDatabase.getInstance().getReference("sanphamdamua");
        ChildEventListener childEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String previousChildName) {
                progressBar.setVisibility(view.GONE);
                XedamuaModel xdm = dataSnapshot.getValue(XedamuaModel.class);
                adapter.add(xdm);

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
        adapter = new XedamuaAdapter(SanphamFragment.this.getActivity(), R.layout.item_listview_xedamua);
        listXedamua.setAdapter(adapter);
    }



    private void addControlls() {
        listXedamua = view.findViewById(R.id.listDamua);
        progressBar = view.findViewById(R.id.progressBar);

    }

    public void xuLyLoaiXe(View v) {
        Intent intent = new Intent(SanphamFragment.this.getActivity(), XeActivity.class);
        switch(v.getId()){

            case R.id.btnXetayga:
                this.loaixe = "Tay ga";
                break;

            case R.id.btnXeso:
                this.loaixe = "Xe số";
                break;

            case R.id.btnMoto:
                this.loaixe = "Mô tô";
                break;

            case R.id.btnContay:
                this.loaixe = "Tay côn";
                break;

            case R.id.xemall:
                this.loaixe = "Tất cả";
                break;

        }
        intent.putExtra("LOAIXE",loaixe);
        this.startActivity(intent);


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
