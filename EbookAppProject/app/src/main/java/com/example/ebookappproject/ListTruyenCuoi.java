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

import com.example.ebookappproject.TruyenCuoi.Nd_TruyenCuoi_Fragment;
import com.example.ebookappproject.TruyenCuoi.TruyenCuoiActivity;

import java.util.ArrayList;

public class ListTruyenCuoi extends Fragment {

    ListView listView;
    ArrayList<String> arrayList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_truyen_cuoi,container,false);
        listView = (ListView) view.findViewById(R.id.listtruyencuoi);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {

            arrayList = new ArrayList<>();
            arrayList.add("Truyện 1: Kẻ ngốc nhà giàu");
            arrayList.add("Truyện 2: Ngạo mạn");
            arrayList.add("Truyện 3: Ba trọc");
            arrayList.add("Truyện 4: Tam đại con gà");
            arrayList.add("Truyện 5: Câu chuyện chủ tịch huyện");
            arrayList.add("Truyện 6: Rao làng");
            arrayList.add("Truyện 7: Chả dấu gì bác");

            ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, arrayList);

            listView.setAdapter(arrayAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    for (int n = 0; n <= arrayList.size(); n++) {
                        Toast.makeText(getActivity(), arrayList.get(position), Toast.LENGTH_SHORT).show();

                        if (n == position) {
                            Intent intent = new Intent(getActivity(), TruyenCuoiActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putString("p" + n, arrayList.get(n));
                            intent.putExtra("T" + n, bundle);
                            intent.putExtra("stt", position);
                            startActivity(intent);
                        }
                    }
                }
            });
        }
        else if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            arrayList = new ArrayList<>();
            arrayList.add("Truyện 1: Kẻ ngốc nhà giàu");
            arrayList.add("Truyện 2: Ngạo mạn");
            arrayList.add("Truyện 3: Ba trọc");
            arrayList.add("Truyện 4: Tam đại con gà");
            arrayList.add("Truyện 5: Câu chuyện chủ tịch huyện");
            arrayList.add("Truyện 6: Rao làng");
            arrayList.add("Truyện 7: Chả dấu gì bác");

            ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, arrayList);

            listView.setAdapter(arrayAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    for (int n = 0; n <= arrayList.size(); n++) {
                        Toast.makeText(getActivity(), arrayList.get(position), Toast.LENGTH_SHORT).show();

                        if (n == position) {

                            Intent intent = new Intent(getActivity(), MainSecond.class);
                            Bundle bundle = new Bundle();
                            bundle.putString("p" + n, arrayList.get(n));
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
