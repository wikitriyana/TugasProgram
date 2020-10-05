package com.example.tugasprogramvsga2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kalkulator extends AppCompatActivity {

    private EditText nila1, nilai2;
    private Button plus, mins, kali, bagi, bersihkan, kembali;
    private TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        nila1=(EditText)findViewById(R.id.nilai1);
        nilai2=(EditText)findViewById(R.id.nilai2);
        plus=(Button)findViewById(R.id.plus);
        mins=(Button)findViewById(R.id.mins);
        kali=(Button)findViewById(R.id.kali);
        bagi=(Button)findViewById(R.id.bagi);
        hasil=(TextView)findViewById(R.id.hasil);
        bersihkan=(Button) findViewById(R.id.bersikan);
        kembali=(Button) findViewById(R.id.kembali);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nilai_1, nilai_2, h;
                if ((nila1.getText().length()>0) && (nilai2.getText().length()>0)) {
                    nilai_1 = Double.parseDouble(nila1.getText().toString());
                    nilai_2 = Double.parseDouble(nilai2.getText().toString());
                    h = nilai_1 + nilai_2;
                    hasil.setText(String.valueOf(h));
                }else{
                    Toast toast= Toast.makeText(Kalkulator.this, "Masukan  Angka pertama dan Kedua ", Toast.LENGTH_LONG );
                    toast.show();
                }
            }
        });
        mins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nilai_1, nilai_2, h;
                if ((nila1.getText().length()>0) && (nilai2.getText().length()>0)) {
                    nilai_1 = Double.parseDouble(nila1.getText().toString());
                    nilai_2 = Double.parseDouble(nilai2.getText().toString());
                    h = nilai_1 - nilai_2;
                    hasil.setText(String.valueOf(h));
                }else{
                    Toast toast= Toast.makeText(Kalkulator.this, "Masukan  Angka pertama dan Kedua ", Toast.LENGTH_LONG );
                    toast.show();
                }
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nilai_1, nilai_2, h;
                if ((nila1.getText().length()>0) && (nilai2.getText().length()>0)) {
                    nilai_1 = Double.parseDouble(nila1.getText().toString());
                    nilai_2 = Double.parseDouble(nilai2.getText().toString());
                    h = nilai_1 * nilai_2;
                    hasil.setText(String.valueOf(h));
                }else{
                    Toast toast= Toast.makeText(Kalkulator.this, "Masukan  Angka pertama dan Kedua ", Toast.LENGTH_LONG );
                    toast.show();
                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nilai_1, nilai_2, h;
                if ((nila1.getText().length()>0) && (nilai2.getText().length()>0)) {
                    nilai_1 = Double.parseDouble(nila1.getText().toString());
                    nilai_2 = Double.parseDouble(nilai2.getText().toString());
                    h = nilai_1 / nilai_2;
                    hasil.setText(String.valueOf(h));
                }else{
                    Toast toast= Toast.makeText(Kalkulator.this, "Masukan  Angka pertama dan Kedua ", Toast.LENGTH_LONG );
                    toast.show();
                }
            }
        });
        bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nila1.setText("");
                nilai2.setText("");
                hasil.setText("0");
                nila1.requestFocus();
            }
        });

    }
}