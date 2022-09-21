package com.example.ebookappproject.TruyenCuoi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ebookappproject.MainSecond;
import com.example.ebookappproject.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TruyenCuoiActivity extends AppCompatActivity {

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truyen_cuoi);
        img = (ImageView) findViewById(R.id.imgback1);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TruyenCuoiActivity.this, MainSecond.class);
                startActivity(intent);
            }
        });
    }
}