package com.example.tugasprogramvsga2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InputNama extends AppCompatActivity {
    private EditText TextNama;
    private TextView Hasil;
    private Button kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nama);
        kembali=(Button)findViewById(R.id.kembali);
        //panggil Vriabel Berdasarkan id
        TextNama=(EditText)findViewById(R.id.TxtNama);
        Hasil=(TextView)findViewById(R.id.lblnama);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void TampilNama(View view) {
        Hasil.setText(getString(R.string.nama_anda)+TextNama.getText());
        TextNama.setText("");
    }

}