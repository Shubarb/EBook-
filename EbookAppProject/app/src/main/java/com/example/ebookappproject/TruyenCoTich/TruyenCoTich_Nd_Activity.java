package com.example.ebookappproject.TruyenCoTich;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ebookappproject.MainSecond;
import com.example.ebookappproject.MainThird;
import com.example.ebookappproject.R;
import com.example.ebookappproject.TruyenCuoi.TruyenCuoiActivity;

public class TruyenCoTich_Nd_Activity extends AppCompatActivity {
    ImageView img6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truyen_co_tich_nd);
        img6 = (ImageView) findViewById(R.id.imgback6);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TruyenCoTich_Nd_Activity.this, MainThird.class);
                startActivity(intent);
            }
        });
    }
}