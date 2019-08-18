package com.example.pcuser.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.EOFException;

public class lingkaran extends AppCompatActivity {
    EditText  r;
    TextView output, keterangan;
    Double v1, v2, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        r = (EditText) findViewById(R.id.EtRl);
        output = (TextView) findViewById(R.id.tvhasilLingkaran);
        keterangan = (TextView) findViewById(R.id.tvketeranganL);

    }


    public void konver2() {
        v2 = Double.parseDouble(r.getText().toString());
    }

    public void prosesluasl(View view) {
        try {
            konver2();

            hasil = 3.14 * v2 * v2;
            output.setText(Double.toString(hasil));
            keterangan.setText("Luas = phi * r * r");

        } catch (Exception e) {
            output.setText("");
            keterangan.setText("");
        }
    }



        public void proseskelilingl(View view){
        try{
            konver2();
            hasil = 2 * 3.14 * v2 ;

            output.setText(Double.toString(hasil));
            keterangan.setText("Keliling = 2 * phi * r");
        }catch (Exception e) {
            output.setText("");
            keterangan.setText("");
        }
        }
    }

