package com.aldi.kataloglaptop;

import android.graphics.drawable.Drawable;

public class Laptop {
    String merk, deskripsi;
    int tahun_rilis, gambar;

    public Laptop(String merk, String deskripsi, int tahun_rilis, int gambar) {
        this.merk = merk;
        this.deskripsi = deskripsi;
        this.tahun_rilis = tahun_rilis;
        this.gambar = gambar;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getTahun_rilis() {
        return tahun_rilis;
    }

    public void setTahun_rilis(int tahun_rilis) {
        this.tahun_rilis = tahun_rilis;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
