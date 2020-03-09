package com.example.tugas_fragment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class tabung extends AppCompatActivity {

    Button bhitung;
    EditText epanjang,elebar,etinggi;
    TextView thasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);
        bhitung = findViewById(R.id.hitung);
        epanjang = findViewById(R.id.panjang);
        elebar = findViewById(R.id.lebar);
        etinggi = findViewById(R.id.tinggi);
        thasil = findViewById(R.id.hasil);

        bhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String spanjang = epanjang.getText().toString();
                    String slebar = elebar.getText().toString();
                    String stinggi = etinggi.getText().toString();
                    double panjang = Double.parseDouble(spanjang);
                    double lebar = Double.parseDouble(slebar);
                    double tinggi = Double.parseDouble(stinggi);
                    double hasil = panjang*lebar*tinggi;
                    String shasil = String.valueOf(hasil);
                    thasil.setText(shasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"field tidak boleh kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
