package com.example.ebookappproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.ebookappproject.TruyenCuoi.Nd_TruyenCuoi_Fragment;


public class MainSecond extends AppCompatActivity {
    ImageView img2,img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second);

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            img2 = (ImageView) findViewById(R.id.imgback2);
            img2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainSecond.this, MainFirst.class);
                    startActivity(intent);
                }
            });
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            Fragment fragment = new ListTruyenCuoi();
            fragmentTransaction.add(R.id.FrameMainSecond, fragment);
            fragmentTransaction.commit();
        }
        else if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            img3 = (ImageView) findViewById(R.id.imgback3);
            img3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainSecond.this, MainFirst.class);
                    startActivity(intent);
                }
            });
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            FragmentTransaction fragmentTransaction2= fragmentManager.beginTransaction();
            Fragment fragment = new ListTruyenCuoi();
            fragmentTransaction.add(R.id.scr1, fragment);

            Fragment fragment2 = new Nd_TruyenCuoi_Fragment();
            fragmentTransaction2.add(R.id.scr2, fragment2);

            fragmentTransaction.commit();
            fragmentTransaction2.commit();
        }
    }
}