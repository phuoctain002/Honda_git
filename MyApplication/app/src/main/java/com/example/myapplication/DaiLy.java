package com.example.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Adapter.daiLyAdapter;
import com.example.myapplication.Model.DailyModel;

public class DaiLy extends AppCompatActivity {
    ListView lstDaiLY;
    Button btnadd;
    ArrayAdapter<DailyModel> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);
        addControlls();
        addEvent();
        addData();
    }

    private void addData() {
        DailyModel d1 = new DailyModel(R.drawable.daily, "dia chi", "0767919280");
        adapter.add(d1);

    }

    private void addEvent() {
//        btnadd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(DaiLy.this, ThemDaiLyActivity.class);
//
//                startActivityForResult(i, 100);
//            }
//        });

        lstDaiLY.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DailyModel d = adapter.getItem(position);
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + d.getSDT()));
                if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(DaiLy.this, "Chua cap quyen", Toast.LENGTH_LONG).show();
                    return;
                }
                startActivity(intent);
            }
        });
    }

    private void addControlls() {
        lstDaiLY = findViewById(R.id.lstDaiLY);
//        btnadd = findViewById(R.id.btnadd);
        adapter = new daiLyAdapter(DaiLy.this, R.layout.item_list_daily);
        lstDaiLY.setAdapter(adapter);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == 101) {
            DailyModel dl = (DailyModel) data.getSerializableExtra("dl");
            adapter.add(dl);
        }
    }
}
