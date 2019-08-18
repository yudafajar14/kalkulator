package com.example.pcuser.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class layangan extends AppCompatActivity {
    EditText p, l, d1, d2;
    TextView output, keterangan;
    Double v1, v2, v3, v4, hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layangan);
        p = (EditText) findViewById(R.id.EtPL);
        l = (EditText) findViewById(R.id.EtLL);
        d1 = (EditText) findViewById(R.id.Etd1L);
        d2 = (EditText) findViewById(R.id.Etd2L);
        output = (TextView) findViewById(R.id.tvhasilL);
        keterangan = (TextView) findViewById(R.id.tvketeranganL);


    }
    public void konver() {
        v1 = Double.parseDouble(p.getText().toString());
        v2 = Double.parseDouble(l.getText().toString());
    }

    public void konver2() {
        v3 = Double.parseDouble(d1.getText().toString());
        v4 = Double.parseDouble(d2.getText().toString());
    }

    public void prosesluasL(View view) {
        try{
            konver2();
            hasil = (v3*v4)/2;
            output.setText(Double.toString(hasil));
            keterangan.setText("Luas = (d1 * d2)/2");
        }catch (Exception e){
            output.setText("");
            keterangan.setText("");
        }
    }

    public void proseskelilingL(View view) {
        try{
            konver();
            hasil = 2*(v1+v2);
            output.setText(Double.toString(hasil));
            keterangan.setText("Keliling = 2 * (p + l)");
        }catch (Exception e){
            output.setText("");
            keterangan.setText("");
        }
    }
}
