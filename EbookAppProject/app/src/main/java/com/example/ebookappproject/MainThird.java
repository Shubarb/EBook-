package com.example.ebookappproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ebookappproject.TruyenCoTich.TruyenCoTich_Nd_Fragment;
import com.example.ebookappproject.TruyenCuoi.Nd_TruyenCuoi_Fragment;

public class MainThird extends AppCompatActivity {
    ImageView img4,img5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_third);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            img4 = (ImageView) findViewById(R.id.imgback4);
            img4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainThird.this, MainFirst.class);
                    startActivity(intent);
                }
            });
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            Fragment fragment = new ListTruyenCoTich();
            fragmentTransaction.add(R.id.FrameMainThird, fragment);
            fragmentTransaction.commit();
        }
        else if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            img5 = (ImageView) findViewById(R.id.imgback5);
            img5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainThird.this, MainFirst.class);
                    startActivity(intent);
                }
            });
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            FragmentTransaction fragmentTransaction2= fragmentManager.beginTransaction();
            Fragment fragment = new ListTruyenCoTich();
            fragmentTransaction.add(R.id.scr3, fragment);

            Fragment fragment2 = new TruyenCoTich_Nd_Fragment();
            fragmentTransaction2.add(R.id.scr4, fragment2);

            fragmentTransaction.commit();
            fragmentTransaction2.commit();
        }
    }
}