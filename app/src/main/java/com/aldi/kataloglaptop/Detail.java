package com.aldi.kataloglaptop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Detail extends AppCompatActivity {

    TextView nama, deskripsi, tahun;
    ImageView gambar;

    String valJenis, valDeskripsi;
    int valTahun, valGambar;

    DataProvider dp = new DataProvider();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nama = findViewById(R.id.nama);
        tahun = findViewById(R.id.tahun);
        deskripsi = findViewById(R.id.deskripsi);
        gambar = findViewById(R.id.gambar);

        int pos = getIntent().getIntExtra("pos", 0);

        valJenis = dp.getAllLaptop(getApplicationContext()).get(pos).merk;
        valTahun = dp.getAllLaptop(getApplicationContext()).get(pos).tahun_rilis;
        valDeskripsi = dp.getAllLaptop(getApplicationContext()).get(pos).deskripsi;
        valGambar = dp.getAllLaptop(getApplicationContext()).get(pos).gambar;

        nama.setText(valJenis);
        tahun.setText("Tahun Rilis: " + String.valueOf(valTahun));
        deskripsi.setText(valDeskripsi);
        gambar.setImageDrawable(getResources().getDrawable(valGambar));


    }
}