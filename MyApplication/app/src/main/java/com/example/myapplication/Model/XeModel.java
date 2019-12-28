package com.example.myapplication.Model;

import java.io.Serializable;

public class XeModel implements Serializable {
    private String tenxe;
    private String gia;
    private String mau;
    private String chitiet;
    public String hinh;



    public XeModel() {

    }


    public String getTenxe() {
        return tenxe;
    }

    public void setTenxe(String tenxe) {
        this.tenxe = tenxe;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getChitiet() {
        return chitiet;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }

}
