package com.example.ebookappproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TruyenAdapter extends BaseAdapter {

    Context mcontext;
    int hinh;
    List<truyen> arrayList;

    public TruyenAdapter(Context mcontext, int hinh, List<truyen> arrayList) {
        this.mcontext = mcontext;
        this.hinh = hinh;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class ViewHolder {
        TextView txtView;
        ImageView imgView;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(hinh,null);
            viewHolder = new ViewHolder();

            viewHolder.txtView = (TextView) convertView.findViewById(R.id.txtTruyenCuoi);
            viewHolder.imgView = (ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();

        }
        viewHolder.txtView.setText(arrayList.get(position).tenTruyen);
        viewHolder.imgView.setImageResource(arrayList.get(position).hinh);
        return convertView;
    }
}
