package com.example.myapplication.Home_Fragment.Home_Child;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.Model.TaiKhoan;
import com.example.myapplication.Model.XeModel;
import com.example.myapplication.R;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static android.view.View.VISIBLE;

public class userFragment extends Fragment {
    EditText edTen, edSDT, edNgaysinh, edMatkhau, edDiachi;
    Button btnSave;
    DatabaseReference mDatabase;
    TaiKhoan taiKhoan;
    View view;
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_user, container, false);
        taiKhoan = new TaiKhoan();

        addControlls();
        addFirebBase();

        return view;
    }

    private void addFirebBase() {
//        progressBar.setVisibility(VISIBLE);
        mDatabase = FirebaseDatabase.getInstance().getReference("taikhoan");
        mDatabase.orderByChild("sdt").equalTo("0767919280").addChildEventListener(
                new ChildEventListener() {


                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {


//                        progressBar.setVisibility(view.GONE);
                        taiKhoan = dataSnapshot.getValue(TaiKhoan.class);
                        edTen.setText(taiKhoan.getTen());
                        edSDT.setText(taiKhoan.getSdt());
                    }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                        taiKhoan = dataSnapshot.getValue(TaiKhoan.class);
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
        btnSave = view.findViewById(R.id.btnSave);
    }
}
