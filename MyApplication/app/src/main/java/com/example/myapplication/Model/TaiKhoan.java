package com.example.myapplication.Model;

import java.io.Serializable;

public class TaiKhoan implements Serializable {
    private String SDT;
    private String Matkhau;

    public TaiKhoan(){}
    public TaiKhoan(String SDT, String matkhau) {
        this.SDT = SDT;
        Matkhau = matkhau;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getMatkhau() {
        return Matkhau;
    }

    public void setMatkhau(String matkhau) {
        Matkhau = matkhau;
    }
}
