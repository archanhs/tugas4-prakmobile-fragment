package com.example.tugas_fragment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class kubus extends AppCompatActivity {

    Button bhitung;
    EditText esisi;
    TextView thasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);
        bhitung = findViewById(R.id.hitung);
        esisi = findViewById(R.id.sisi);
        thasil = findViewById(R.id.hasil);
        bhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String ssisi = esisi.getText().toString();
                    double sisi = Double.parseDouble(ssisi);
                    double hasil = sisi*sisi*sisi;
                    String shasil = String.valueOf(hasil);
                    thasil.setText(shasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"field tidak boleh kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
