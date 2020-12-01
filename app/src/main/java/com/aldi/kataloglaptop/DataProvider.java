package com.aldi.kataloglaptop;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    public  List<Laptop> laptops = new ArrayList<>();

   

     void initDataLaptop(Context ctx) {
        laptops.add(new Laptop("Asus", "Asustek Computer Inc. ditulis dengan gaya huruf kapital ASUS, adalah sebuah perusahaan berbasis di Taiwan yang memproduksi komponen komputer seperti papan induk, kartu grafis, dan notebook. Asus belakangan ini mulai memproduksi PDA, Telepon genggam, monitor LCD, tablet dan produk komputer lainnya.",
                2018,
                R.drawable.asus));
        laptops.add(new Laptop("Acer", "Acer merupakan sebuah merek lima besar komputer pribadi dunia. Produk Acer antara lain adalah desktop, notebook, server, penyimpanan data, layar, peripheral, dan solusi e-bisnis untuk bisnis, pemerintah, pendidikan dan pengguna pribadi.",
                2019,
                R.drawable.acer));
        laptops.add(new Laptop("Lenovo", "Lenovo Group Limited, sebelumnya dikenal dengan nama Legend Group, adalah produsen PC terbesar di Republik Rakyat Tiongkok. Pada 2004, Lenovo adalah produsen PC terbesar kedelapan di dunia. Lenovo juga menjual server, komputer genggam, perangkat pencitraan, dan telepon genggam.",
                2017,
                R.drawable.lenovo));
    }
    

     List<Laptop> getAllLaptop(Context ctx) {
        if (laptops.size() == 0) {
            initDataLaptop(ctx);
        }
        return laptops;
    }




}
