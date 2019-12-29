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
    EditText mail;
    EditText mk;
    Button save;


    DatabaseReference mDatabase;
    FirebaseAuth firebaseAuth;
    ProgressBar progressBar;

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
        mail = findViewById(R.id.edMail);
        progressBar = findViewById(R.id.progressBar);
        mDatabase = FirebaseDatabase.getInstance().getReference("taikhoan");
        firebaseAuth = FirebaseAuth.getInstance();
        save = (Button)findViewById(R.id.btnSave);
    }


    public void SignUp(View view) {
        final String sdtString = sdt.getText().toString();
        final String emailString = mail.getText().toString();
        final String passwordString = mk.getText().toString();
        if (sdtString.isEmpty()) {
            sdt.setError("Vui lòng nhập số điện thoại!");
            sdt.requestFocus();
            return;
        } else if (emailString.isEmpty()) {
            mail.setError("Vui lòng nhập email!");
            mail.requestFocus();
            return;
        } else if (passwordString.isEmpty()) {
            mk.setError("Vui lòng nhập mật khẩu");
            mk.requestFocus();
            return;
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(emailString).matches()){
            mail.setError("Vui lòng nhập đúng địa chỉ email");
            mail.requestFocus();
            return;

        }
        if(passwordString.length()>10){
            mk.setError("Mật khẩu không quá 10 ký tự");
            mk.requestFocus();
            return;
        }
        else {
            progressBar.setVisibility(View.VISIBLE);
            firebaseAuth.createUserWithEmailAndPassword(emailString, passwordString).addOnCompleteListener(TaoTaiKhoan.this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    progressBar.setVisibility(View.GONE);
                    if (task.isSuccessful()) {
                        TaiKhoan taikhoan = new TaiKhoan(
                                sdtString,
                                emailString,
                                passwordString
                        );
                        FirebaseDatabase.getInstance().getReference("taikhoan")
                                .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                .setValue(taikhoan).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Toast.makeText(TaoTaiKhoan.this, "Đăng ký thành công!", Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
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
