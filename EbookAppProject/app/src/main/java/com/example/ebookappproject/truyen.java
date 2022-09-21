package com.example.ebookappproject;

public class truyen {
    public  String tenTruyen;
    public  int hinh;

    public truyen(String tenTruyen,int hinh) {
        this.tenTruyen = tenTruyen;
        this.hinh = hinh;
    }

    public String getTenTruyen() {
        return tenTruyen;
    }

    public void setTenTruyen(String tenTruyen) {
        this.tenTruyen = tenTruyen;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
