package com.example.ebookappproject;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.ebookappproject.TruyenCoTich.TruyenCoTich_Nd_Activity;
import com.example.ebookappproject.TruyenCuoi.Nd_TruyenCuoi_Fragment;
import com.example.ebookappproject.TruyenCuoi.TruyenCuoiActivity;

import java.util.ArrayList;

public class ListTruyenCoTich extends Fragment {

    ListView listView;
    ArrayList<String> arrayList2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_truyen_co_tich,container,false);
        listView = (ListView) view.findViewById(R.id.listtruyencotich);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {

            arrayList2 = new ArrayList<>();
            arrayList2.add("Truyện 1: Tấm cám");
            arrayList2.add("Truyện 2: Bà chúa tuyết");
            arrayList2.add("Truyện 3: Quả bầu tiên");
            arrayList2.add("Truyện 4: Ba chiếc rìu");
            arrayList2.add("Truyện 5: Câu chuyện chủ tịch huyện");
            arrayList2.add("Truyện 6: Rao làng");
            arrayList2.add("Truyện 7: Chả dấu gì bác");

            ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, arrayList2);

            listView.setAdapter(arrayAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    for (int n = 0; n <= arrayList2.size(); n++) {
                        Toast.makeText(getActivity(), arrayList2.get(position), Toast.LENGTH_SHORT).show();

                        if (n == position) {
                            Intent intent = new Intent(getActivity(), TruyenCoTich_Nd_Activity.class);
                            Bundle bundle = new Bundle();
                            bundle.putString("p" + n, arrayList2.get(n));
                            intent.putExtra("T" + n, bundle);
                            intent.putExtra("stt", position);
                            startActivity(intent);
                        }
                    }
                }
            });
        }
        else if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            arrayList2 = new ArrayList<>();
            arrayList2.add("Truyện 1: Tấm cám");
            arrayList2.add("Truyện 2: Bà chúa tuyết");
            arrayList2.add("Truyện 3: Quả bầu tiên");
            arrayList2.add("Truyện 4: Ba chiếc rìu");
            arrayList2.add("Truyện 5: Câu chuyện chủ tịch huyện");
            arrayList2.add("Truyện 6: Rao làng");
            arrayList2.add("Truyện 7: Chả dấu gì bác");

            ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, arrayList2);

            listView.setAdapter(arrayAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    for (int n = 0; n <= arrayList2.size(); n++) {
                        Toast.makeText(getActivity(), arrayList2.get(position), Toast.LENGTH_SHORT).show();

                        if (n == position) {
//                            Bundle bundle = new Bundle();
//                            bundle.putString("p" + n, arrayList.get(n));
//                            Nd_TruyenCuoi_Fragment fragment = new Nd_TruyenCuoi_Fragment();
//                            fragment.setArguments(bundle);
//                            fragment.
//                            getFragmentManager().beginTransaction().replace(R.id.fragment_nd,fragment).commit();
                            Intent intent = new Intent(getActivity(), MainThird.class);
//                            FragmentManager fragmentManager = getSupportFragmentManager();
//                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                            Fragment fragment = (Fragment)getFragmentManager().findFragmentById(R.id.fragment_nd);
                            Bundle bundle = new Bundle();
                            bundle.putString("p" + n, arrayList2.get(n));
                            intent.putExtra("T" + n, bundle);
                            intent.putExtra("stt", position);
                            startActivity(intent);
                        }
                    }
                }
            });
        }
        return view;
    }
}
