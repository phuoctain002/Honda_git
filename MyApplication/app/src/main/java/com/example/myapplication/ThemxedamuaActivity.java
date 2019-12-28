package com.example.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Model.TinTucModel;
import com.example.myapplication.Model.XedamuaModel;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThemxeActivity extends AppCompatActivity {
    public static int RESULT_LOAD_IMAGE = 1;

    ImageView img;
    EditText tenxe;
    EditText sokhung;
    EditText tinhtrang;
    EditText ngaymua;
    Button add;
    Button save;

    String picturePath;
    String tenxeString;
    String sokhungString;
    String tinhtrangString;
    String ngaymuaString;

    private Uri selectedImage;

    DatabaseReference mDatabase;
    StorageReference mStorage;
    XedamuaModel xedamuaModel;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themxedamua);

        img = findViewById(R.id.img);
        tenxe = findViewById(R.id.edTenxe);
        sokhung = findViewById(R.id.edSokhung);
        tinhtrang = findViewById(R.id.edTinhTrang);
        ngaymua = findViewById(R.id.edNgaymua);


        add = (Button) findViewById(R.id.add);
        save = (Button) findViewById(R.id.btnSave);

        openFirebase();
        addValues();
        addEvent();
    }
    private void addValues() {
        Intent i = getIntent();
        xedamuaModel = (XedamuaModel) i.getSerializableExtra("xedamua");
        if(xedamuaModel == null) xedamuaModel = new XedamuaModel();

    }

    private void openFirebase() {
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mStorage = FirebaseStorage.getInstance().getReference();
    }

    private void addEvent() {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(i,RESULT_LOAD_IMAGE);
            }
        });

        // xu ly them san pham.
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = getIntent();
                String txtTenxe = tenxe.getText().toString();
                String txtSokhung = sokhung.getText().toString();
                String txtTinhtrang = tinhtrang.getText().toString();
                String txtNgaymua = ngaymua.getText().toString();

                if (txtTenxe.isEmpty()) {
                    tenxe.setError("Vui lòng nhập tiêu đề");
                    tenxe.requestFocus();

                } else if (txtSokhung.isEmpty()) {
                    sokhung.setError("Không được bỏ trống");
                    sokhung.requestFocus();

                } else if (txtTinhtrang.isEmpty()) {
                    tinhtrang.setError("Không được bỏ trống");
                    tinhtrang.requestFocus();

                } else if (txtNgaymua.isEmpty()) {
                    ngaymua.setError("Không được bỏ trống");
                    ngaymua.requestFocus();

                }else {

                    XedamuaModel xdm = new XedamuaModel( txtTenxe, txtSokhung,txtTinhtrang,txtNgaymua, null);
                    if (picturePath != null && picturePath != "") {
                        xdm.base64 = encodeImage(picturePath);
                    }

                    // uploadFile();
                    String key = mDatabase.child("xedamua").push().getKey();
                    mDatabase.child("xedamua").child(key).setValue(xdm);
                    //i.putExtra("xedamua", xdm);
                    finish();
                    Toast.makeText(getApplicationContext(), "Thêm thành công!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            picturePath = cursor.getString(columnIndex);
            cursor.close();
            ImageView imageView = findViewById(R.id.img);
            imageView.setImageBitmap(BitmapFactory.decodeFile(picturePath));
        }


    }


    private String encodeImage(String path)
    {
        File imagefile = new File(path);
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(imagefile);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        Bitmap bm = BitmapFactory.decodeStream(fis);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bm.compress(Bitmap.CompressFormat.JPEG,100,baos);
        byte[] b = baos.toByteArray();
        String encImage = Base64.encodeToString(b, Base64.DEFAULT);
        //Base64.de
        return encImage;

    }
}
