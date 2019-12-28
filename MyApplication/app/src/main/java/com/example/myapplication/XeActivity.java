package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Adapter.XeAdapter;
import com.example.myapplication.Adapter.XedamuaAdapter;
import com.example.myapplication.Model.XeModel;
import com.example.myapplication.SanPham_Fragment.SanPham_Child.SPDaMuaFragment;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class XeActivity extends AppCompatActivity {
    ListView listXe;
    ArrayList<XeModel> arrayList;
    XeAdapter xeAdapter;
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
    }

    private void addFirebBase() {
      //  progressBar.setVisibility(VISIBLE);
        mDatabase = FirebaseDatabase.getInstance().getReference("sanpham");
        mDatabase.orderByChild("loai").equalTo(sessionId).addChildEventListener(
                new ChildEventListener() {


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
                }
        );
        ChildEventListener childEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String previousChildName) {


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
        xeAdapter = new XeAdapter(XeActivity.this, R.layout.item_list_xe);
        listXe.setAdapter(xeAdapter);
    }



    private void addControlls() {
        listXe = findViewById(R.id.listXe);

    }
}
