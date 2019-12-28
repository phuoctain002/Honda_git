package com.example.myapplication.Model;

import java.io.Serializable;

public class XedamuaModel implements Serializable {
    private String imageId;
    private String tenxe;
    private String sokhung;
    private String tinhtrang;
    private String ngaymua;
    public String hinh;

    public XedamuaModel(String imageId, String tenxe, String sokhung, String tinhtrang, String ngaymua) {
        this.imageId = imageId;
        this.tenxe = tenxe;
        this.sokhung = sokhung;
        this.tinhtrang = tinhtrang;
        this.ngaymua = ngaymua;
    }

    public XedamuaModel() {

    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getTenxe() {
        return tenxe;
    }

    public void setTenxe(String tenxe) {
        this.tenxe = tenxe;
    }

    public String getSokhung() {
        return sokhung;
    }

    public void setSokhung(String sokhung) {
        this.sokhung = sokhung;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getNgaymua() {
        return ngaymua;
    }

    public void setNgaymua(String ngaymua) {
        this.ngaymua = ngaymua;
    }
}
