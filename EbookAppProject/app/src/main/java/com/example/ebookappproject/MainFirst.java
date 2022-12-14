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
        arrayList.add(new truyen("Truy???n c?????i d??n gian", R.drawable.truyencuoi));
        arrayList.add(new truyen("Thanh ki???m c???a qu???", R.drawable.thanhkiemcuaquy));
        arrayList.add(new truyen("T???m c??m truy???n ???? k???", R.drawable.tamcam));
        arrayList.add(new truyen("Truy???n c??? t??ch", R.drawable.truyencotich));
        arrayList.add(new truyen("Tuy???n xe bu??t th??? 13", R.drawable.tuyenxethu13));
        arrayList.add(new truyen("Princess Mononoke", R.drawable.princessmononoke));
        arrayList.add(new truyen("Harry Potter Ho??ng t??? lai", R.drawable.hoangtulai));
        arrayList.add(new truyen("Harry Potter Chi???c c???c l???a", R.drawable.chieccoclua));
        arrayList.add(new truyen("Harry Potter H???i ph?????ng ho??ng", R.drawable.hoiphuonghoang));

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