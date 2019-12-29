package com.example.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.Model.TaiKhoan;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TaiKhoanFragment extends Fragment {
    EditText edTen, edSDT, edNgaysinh, edMatkhau, edDiachi;
    ImageView imgAva;
    Button btnSave;
    DatabaseReference mDatabase;
    ProgressBar progressBar;
    TaiKhoan taiKhoan;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int images[] = {R.drawable.home_slide_1, R.drawable.home_slide_2, R.drawable.home_slide_3};
        view = inflater.inflate(R.layout.fragment_taikhoan, container, false);

        taiKhoan = new TaiKhoan();

        addControlls();
        addFirebBase();




        return view;
    }

    private void addFirebBase() {
        progressBar.setVisibility(view.VISIBLE);
        mDatabase = FirebaseDatabase.getInstance().getReference("taikhoan");
        mDatabase.orderByChild("sdt").equalTo("0767919280").addChildEventListener(
                new ChildEventListener() {


                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {


                        progressBar.setVisibility(view.GONE);
                        taiKhoan = dataSnapshot.getValue(TaiKhoan.class);
                        edTen.setText(taiKhoan.getTen());
                        edSDT.setText(taiKhoan.getSdt());
                        edNgaysinh.setText(taiKhoan.getNgaysinh());
                        edDiachi.setText(taiKhoan.getDiachi());
                        edMatkhau.setText(taiKhoan.getMatkhau());
                        byte[] decodedString = Base64.decode(taiKhoan.getHinh(), Base64.DEFAULT);
                        Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
                        imgAva.setImageBitmap(decodedByte);
                    }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                        taiKhoan = dataSnapshot.getValue(TaiKhoan.class);
                        btnSave.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mDatabase.child("ten").setValue(edTen.getText().toString());
                            }
                        });

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
    private void addControlls()
    {
        edTen = view.findViewById(R.id.edTen);
        edSDT = view.findViewById(R.id.edSDT);
        edNgaysinh = view.findViewById(R.id.edNgaysinh);
        edMatkhau = view.findViewById(R.id.edMatkhau);
        edDiachi = view.findViewById(R.id.edDiachi);
        imgAva = view.findViewById(R.id.imgAva);
        btnSave = view.findViewById(R.id.btnSave);
        progressBar = view.findViewById(R.id.progressBar);
    }
}
