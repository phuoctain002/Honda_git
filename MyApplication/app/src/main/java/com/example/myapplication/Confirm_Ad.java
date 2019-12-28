package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Home_Fragment.Home_Child.ThemtintucActivity;

public class Confirm_Ad extends AppCompatActivity {

    Button cancel, confirm;
    EditText edConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_ad);

        cancel = (Button)findViewById(R.id.Cancel);
        confirm = (Button)findViewById(R.id.Confirm);
        edConfirm = (EditText)findViewById(R.id.edConfirm);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL, WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);
        addEvent();
    }

    private void addEvent() {
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edConfirm.getText().toString().equals("admin")  || edConfirm.getText().toString().equals(""))
                {
                    Toast.makeText(Confirm_Ad.this,"Không có quyền truy cập",Toast.LENGTH_SHORT).show();
                    return;
                }
                else
                {
                    Intent i = new Intent(Confirm_Ad.this, ThemtintucActivity.class);
                    startActivity(i);
                    finish();
                }

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
