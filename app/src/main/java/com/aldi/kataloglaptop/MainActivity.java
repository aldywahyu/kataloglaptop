package com.aldi.kataloglaptop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DataProvider dp = new DataProvider();
    ListView list;
    TextView nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);
        nama = findViewById(R.id.nama);


        String[] arrayLaptop =  {"Asus", "Acer", "Lenovo"};
        ArrayAdapter<String> adapterLaptop = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1, arrayLaptop);
        list.setAdapter(adapterLaptop);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), Detail.class);

                intent.putExtra("pos", position);

                startActivity(intent);

            }
        });

    }

}