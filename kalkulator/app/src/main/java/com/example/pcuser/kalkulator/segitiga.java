package com.example.pcuser.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class segitiga extends AppCompatActivity {
EditText as,ts,ss;
TextView output,keterangan;
Double v1,v2,v3,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        as = (EditText) findViewById(R.id.EtAlasSegitiga);
        ts = (EditText) findViewById(R.id.EtTinggiSegitiga);
        ss = (EditText) findViewById(R.id.EtSisiSegitiga);
        output = (TextView) findViewById(R.id.tvhasilSegitiga);
        keterangan = (TextView) findViewById(R.id.tvketerangan);


    }
    public void konver1(){
        v1 = Double.parseDouble(as.getText().toString());
        v2 = Double.parseDouble(ts.getText().toString());
    }
    public void konver (){


        v3 = Double.parseDouble(ss.getText().toString());

    }

    public void prosesluas(View view) {

        try {
            konver1();
            hasil = (v1*v2)/2;
            output.setText(Double.toString(hasil));
            keterangan.setText("Luas = ( a * t ) / 2");
        } catch (Exception e) {
            output.setText("");
            keterangan.setText("");
        }
    }







    public void proseskeliling(View view){



        try {
            konver();
            hasil = v3+v3+v3;
            output.setText(Double.toString(hasil));
            keterangan.setText("Keliling = s + s + s ");
        } catch (Exception e) {
            output.setText("");
            keterangan.setText("");
        }
    }
}
