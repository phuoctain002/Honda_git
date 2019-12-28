package com.example.myapplication.Home_Fragment.Home_Child;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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

import com.example.myapplication.Model.DataSystem;
import com.example.myapplication.Model.TinTucModel;
import com.example.myapplication.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThemtintucActivity extends AppCompatActivity {

    public static int RESULT_LOAD_IMAGE = 1;

    ImageView img;
    EditText title;
    EditText description;
    Button add;
    Button save;

    String picturePath;
    String titleString;
    String descString;

    private Uri selectedImage;

    DatabaseReference mDatabase;
    StorageReference mStorage;
    TinTucModel tinTucModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themtintuc);

        img = findViewById(R.id.img);
        title = findViewById(R.id.edTitle);
        description = findViewById(R.id.edDesc);


        add = (Button)findViewById(R.id.add);
        save = (Button)findViewById(R.id.btnSave);

        openFirebase();
        addValues();
        addEvent();

    }

    private void addValues() {
        Intent i = getIntent();
        tinTucModel = (TinTucModel) i.getSerializableExtra("tintuc");
        if(tinTucModel == null) tinTucModel = new TinTucModel();

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
                String txtTitle = title.getText().toString();
                String txtDesc = description.getText().toString();

                if (txtTitle.isEmpty()) {
                    title.setError("Vui lòng nhập tiêu đề");
                    title.requestFocus();

                } else if (txtDesc.isEmpty()) {
                    description.setError("Không được bỏ trống");
                    description.requestFocus();

                } else {

                    TinTucModel tt = new TinTucModel(  txtTitle, txtDesc, null);
                    if (picturePath != null && picturePath != "") {
                        tt.base64 = encodeImage(picturePath);
                    }

                    // uploadFile();
                    String key = mDatabase.child("tintuc").push().getKey();
                    mDatabase.child("tintuc").child(key).setValue(tt);
                    i.putExtra("tintuc", tt);
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
