package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Adapter.XeAdapter;
import com.example.myapplication.Model.XeModel;
import com.example.myapplication.SanPham_Fragment.SanPham_Child.TraCuuSPFragment;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import android.content.Intent;

import java.util.ArrayList;

import static android.view.View.VISIBLE;

public class XeActivity extends AppCompatActivity {
    ListView listXe;
    ArrayList<XeModel> arrayList;
    XeAdapter xeAdapter;
    TextView tvTitle;
    View view;
    // database
    DatabaseReference mDatabase;
    ProgressBar progressBar;
    private Query query;
    private String sessionId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listxe);
        sessionId = getIntent().getStringExtra("LOAIXE");
        arrayList = new ArrayList<>();
        addControlls();
        addData();
        addFirebBase();
        addEvent();
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void addFirebBase() {
        progressBar.setVisibility(VISIBLE);
        mDatabase = FirebaseDatabase.getInstance().getReference("sanpham");
        if(sessionId.equals("Tất cả"))
        {
           ChildEventListener childEventListener = new ChildEventListener() {
               @Override
               public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                   //progressBar.setVisibility(view.GONE);
                   XeModel xe = dataSnapshot.getValue(XeModel.class);
                   xeAdapter.add(xe);

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
        else
        {
            mDatabase.orderByChild("loai").equalTo(sessionId).addChildEventListener(
                    new ChildEventListener() {

                        @Override
                        public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                            progressBar.setVisibility(view.GONE);
                            XeModel xe = dataSnapshot.getValue(XeModel.class);
                            xeAdapter.add(xe);
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
                    }
            );
        }
        tvTitle.setText(sessionId.toString());

    }
    private void addData() {
        xeAdapter = new XeAdapter(XeActivity.this, R.layout.item_list_xe);
        listXe.setAdapter(xeAdapter);
    }


    private void addControlls() {
        listXe = findViewById(R.id.listXe);
        progressBar = findViewById(R.id.progressBar);
        tvTitle = findViewById(R.id.tvTitle);
    }

    private void addEvent()
    {
        listXe.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                XeModel xe = xeAdapter.getItem(position);
                Intent intent = new Intent(XeActivity.this, ChiTietSanPham.class);
                intent.putExtra("TENXE",xe.getTenxe());
                intent.putExtra("GIAXE",xe.getGia());
                intent.putExtra("MAUXE",xe.getMau());
                intent.putExtra("CHITIET",xe.getChitiet());
                startActivity(intent);

            }
        });
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    // Shows the system bars by removing all the flags
// except for the ones that make the content appear under the system bars.
    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }

}

