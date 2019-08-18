package com.example.pcuser.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class belahketupat extends AppCompatActivity {
    EditText a, b, d1, d2;
    TextView output, keterangan;
    Double v1, v2, v3, v4, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belahketupat);
        a = (EditText) findViewById(R.id.EtABK);
        b = (EditText) findViewById(R.id.EtBBK);
        d1 = (EditText) findViewById(R.id.Etd1BK);
        d2 = (EditText) findViewById(R.id.Etd2BK);
        output = (TextView) findViewById(R.id.tvhasilBK);
        keterangan = (TextView) findViewById(R.id.tvketeranganBK);
    }

    public void konver() {
        v1 = Double.parseDouble(a.getText().toString());
        v2 = Double.parseDouble(b.getText().toString());
    }

    public void konver2() {
        v3 = Double.parseDouble(d1.getText().toString());
        v4 = Double.parseDouble(d2.getText().toString());
    }

    public void prosesluasBK(View view) {
        try {
            konver2();
            hasil = (v3 * v4) / 2;
            output.setText(Double.toString(hasil));
            keterangan.setText("Luas = (d1 * d2) / 2");
        } catch (Exception e) {
            output.setText("");
            keterangan.setText("");
        }
    }

    public void proseskelilingBK(View view) {
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
}
