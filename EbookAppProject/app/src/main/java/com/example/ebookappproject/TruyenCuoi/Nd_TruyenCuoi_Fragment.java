package com.example.ebookappproject.TruyenCuoi;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.ebookappproject.MainActivity;
import com.example.ebookappproject.MainFirst;
import com.example.ebookappproject.MainSecond;
import com.example.ebookappproject.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Nd_TruyenCuoi_Fragment extends Fragment {

    TextView txtP1,txtTenTruyen;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nd__truyen_cuoi_,container,false);

        txtP1 = (TextView) view.findViewById(R.id.txtTruyen);
        txtTenTruyen = (TextView) view.findViewById(R.id.txttentruyen);

        Intent intent = getActivity().getIntent();
        int n = intent.getIntExtra("stt" , -1);
        Bundle bundle = intent.getBundleExtra("T" + n);
        if (bundle != null){
            if( n == 0){
                txtP1.setText(R.string.Phan1);
                String p1 = bundle.getString("p" + n);
                txtTenTruyen.setText(p1);
            }
            if( n == 1){
                txtP1.setText(R.string.Phan2);
                String p2 = bundle.getString("p" + n);
                txtTenTruyen.setText(p2);
            }
            if( n == 2){
                txtP1.setText(R.string.Phan3);
                String p3 = bundle.getString("p" + n);
                txtTenTruyen.setText(p3);
            }
            if( n == 3){
                txtP1.setText(R.string.Phan4);
                String p4 = bundle.getString("p" + n);
                txtTenTruyen.setText(p4);
            }

        }
        else{
            txtP1.setText("chọn chương đi b");
        }

        return view;
    }
}