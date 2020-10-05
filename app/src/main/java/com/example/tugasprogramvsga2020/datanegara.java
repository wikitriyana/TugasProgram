package com.example.tugasprogramvsga2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class datanegara extends AppCompatActivity {
    private ListView V ;
    private String[] namanegara = new String[]{
            "Indonesia", "Malaysia", "Singapura", "Italia",
            "Inggris", "Belanda", "Argentina", "Chile", "Mesir",
            "Uganda", "Portugal", "Jimbawe", "Palestina", "Thailand"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datanegara);

        V = (ListView) findViewById(R.id.List);
        ArrayAdapter<String> adapter = new ArrayAdapter<> (datanegara.this, android.R.layout.simple_list_item_1, android.R.id.text1, namanegara);

        V.setAdapter(adapter);

        V.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(datanegara.this, "" +namanegara[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}