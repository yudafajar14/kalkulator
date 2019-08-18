package com.example.pcuser.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class jajargenjang extends AppCompatActivity {
    EditText a, b, t;
    TextView output, keterangan;
    Double v1, v2, v3, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajargenjang);
        a = (EditText) findViewById(R.id.EtAJG);
        b = (EditText) findViewById(R.id.EtBJG);
        t = (EditText) findViewById(R.id.EtTJG);
        output = (TextView) findViewById(R.id.tvHasilJG);
        keterangan = (TextView) findViewById(R.id.tvKeteranganJG);

    }

    public void konver() {
        v1 = Double.parseDouble(a.getText().toString());
        v2 = Double.parseDouble(b.getText().toString());
    }

    public void konvers() {
        v1 = Double.parseDouble(a.getText().toString());
        v3 = Double.parseDouble(t.getText().toString());
    }

    public void proseskelilingJG(View view) {
        try {
            konver();
            hasil = 2 * (v1 + v2);
            output.setText(Double.toString(hasil));
            keterangan.setText("Keliling = 2 * (a + b)");
        } catch (Exception e) {
            output.setText("");
            keterangan.setText("");
        }
    }

    public void prosesluasJG(View view) {
        try {
            konvers();
            hasil = v1 * v3;
            output.setText(Double.toString(hasil));
            keterangan.setText("Luas = a * t");
        } catch (Exception e) {
            output.setText("");
            keterangan.setText("");
        }
    }
}