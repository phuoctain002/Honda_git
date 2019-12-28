package com.example.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Model.TaiKhoan;
import com.example.myapplication.Model.TinTucModel;
import com.example.myapplication.ui.login.LoginActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.Serializable;
import java.net.PasswordAuthentication;

public class TaoTaiKhoan extends AppCompatActivity {


    EditText sdt;
    EditText mk;
    Button save;

    String sdtString;
    String mkString;


    DatabaseReference mDatabase;
    StorageReference mStorage;
    FirebaseAuth firebaseAuth;
    ProgressBar progressBar;
    TaiKhoan taiKhoan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dangki);


        addControls();

    }

    private  void addControls()
    {
        sdt = findViewById(R.id.edSdt);
        mk = findViewById(R.id.edMk);
        progressBar = findViewById(R.id.progressBar);
        mDatabase = FirebaseDatabase.getInstance().getReference("taikhoan");
        firebaseAuth = FirebaseAuth.getInstance();
        save = (Button)findViewById(R.id.btnSave);
    }


    public void SignUp(View view) {
        final String SDT = sdt.getText().toString();
        final String Pass = mk.getText().toString();
        if (SDT.isEmpty()) {
            sdt.setError("Vui lòng nhập tên!");
            sdt.requestFocus();
            return;
        } else if (Pass.isEmpty()) {
            mk.setError("Vui lòng nhập mật khẩu");
            mk.requestFocus();
            return;
        }
        if(Pass.length()<6){
            mk.setError("Mật khẩu phải hơn 6 ký tự");
            mk.requestFocus();
            return;
        }
        else {
            progressBar.setVisibility(View.VISIBLE);
            firebaseAuth.createUserWithEmailAndPassword(SDT, Pass).addOnCompleteListener(TaoTaiKhoan.this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    progressBar.setVisibility(View.GONE);
                    if (task.isSuccessful()) {
                        TaiKhoan user = new TaiKhoan(
                                SDT,
                                Pass
                        );
                        FirebaseDatabase.getInstance().getReference("taikhoan")
                                .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Toast.makeText(TaoTaiKhoan.this, "Đăng ký thành công!", Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(i);

                            }
                        });
                    }
                    if(task.getException() instanceof FirebaseAuthUserCollisionException){
                        Toast.makeText(getApplicationContext(), "Tài khoản này đã tồn tại!!", Toast.LENGTH_SHORT).show();
                    }


                }
            });
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

    }


}
