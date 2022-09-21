package com.example.ebookappproject.TruyenCoTich;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ebookappproject.R;

public class TruyenCoTich_Nd_Fragment extends Fragment {

    TextView txtP2,txtTenTruyenCo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_truyen_co_tich__nd_,container,false);
//        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
        txtP2 = (TextView) view.findViewById(R.id.txtTruyenco);
        txtTenTruyenCo = (TextView) view.findViewById(R.id.txttentruyenco);
//        txtP1.setMovementMethod(new ScrollingMovementMethod());
        Intent intent = getActivity().getIntent();
        int n = intent.getIntExtra("stt" , -1);
        Bundle bundle = intent.getBundleExtra("T" + n);
        if (bundle != null){
            if( n == 0){
                txtP2.setText(R.string.TamCam);
                String p1 = bundle.getString("p" + n);
                txtTenTruyenCo.setText(p1);
            }
            if( n == 1){
                txtP2.setText(R.string.BaChuaTuyet);
                String p2 = bundle.getString("p" + n);
                txtTenTruyenCo.setText(p2);
            }
            if( n == 2){
                txtP2.setText(R.string.QuaBauTien);
                String p3 = bundle.getString("p" + n);
                txtTenTruyenCo.setText(p3);
            }
            if( n == 3){
                txtP2.setText(R.string.BaChiecRiu);
                String p4 = bundle.getString("p" + n);
                txtTenTruyenCo.setText(p4);
            }

        }
        else{
            txtP2.setText("chọn truyện đi b");
        }

//        Bundle bundle = intent.getBundleExtra("T1");
//        String p1 = bundle.getString("p1");
//        txtP1.setText(p1);
        return view;
    }
}