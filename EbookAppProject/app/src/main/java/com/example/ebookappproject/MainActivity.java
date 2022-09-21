package com.example.ebookappproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout mDrawer;
    private Toolbar tbar;
//    private NavigationView nvDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbar = findViewById(R.id.toolbar);
        mDrawer = findViewById(R.id.drawerlayout);
//        nvDrawer = findViewById(R.id.nvView);

        setSupportActionBar(tbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);
        NavigationView navigationView = findViewById(R.id.nvView);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawer.openDrawer(GravityCompat.START);
                Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.nav_mybook){
            Intent intent = new Intent(MainActivity.this, MainFirst.class);
            startActivity(intent);
        }
        else if(id == R.id.nav_note){
            Toast.makeText(MainActivity.this, "My Note", Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.nav_download){
            Toast.makeText(MainActivity.this, "Download", Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.nav_information){
            Toast.makeText(MainActivity.this, "Trần Viết Quang _ 19021507", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.nav_information2){
            Toast.makeText(MainActivity.this, "Trần Minh Đức _ 19021437", Toast.LENGTH_SHORT).show();
        }

        return false;
    }
}