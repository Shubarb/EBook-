package com.example.ebookappproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainFirst extends AppCompatActivity {

    GridView gridView;
    ArrayList<truyen> arrayList;
    TruyenAdapter truyenAdapter;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_first);
        gridView = (GridView) findViewById(R.id.grid);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.floatingbtl);
        gridView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
//                Toast.makeText(MainFirst.this, "onScrollStateChanged", Toast.LENGTH_SHORT).show();
                if(scrollState > 0){
                    floatingActionButton.hide();
                }
                else {
                    floatingActionButton.show();
                }
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

            }
        });
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainFirst.this, MainActivity.class);
                startActivity(intent);
            }
        });
        arrayList = new ArrayList<>();
        arrayList.add(new truyen("Truyện cười dân gian", R.drawable.truyencuoi));
        arrayList.add(new truyen("Thanh kiếm của quỷ", R.drawable.thanhkiemcuaquy));
        arrayList.add(new truyen("Tấm cám truyện đã kể", R.drawable.tamcam));
        arrayList.add(new truyen("Truyện cổ tích", R.drawable.truyencotich));
        arrayList.add(new truyen("Tuyến xe buýt thứ 13", R.drawable.tuyenxethu13));
        arrayList.add(new truyen("Princess Mononoke", R.drawable.princessmononoke));
        arrayList.add(new truyen("Harry Potter Hoàng tử lai", R.drawable.hoangtulai));
        arrayList.add(new truyen("Harry Potter Chiếc cốc lửa", R.drawable.chieccoclua));
        arrayList.add(new truyen("Harry Potter Hội phượng hoàng", R.drawable.hoiphuonghoang));

        truyenAdapter = new TruyenAdapter(MainFirst.this, R.layout.fragment_truyen_cuoi, arrayList);
        gridView.setAdapter(truyenAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainFirst.this, arrayList.get(position).tenTruyen, Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    Intent intent = new Intent(MainFirst.this, MainSecond.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(MainFirst.this, MainThird.class);
                    startActivity(intent);
                }
            }
        });
    }
}