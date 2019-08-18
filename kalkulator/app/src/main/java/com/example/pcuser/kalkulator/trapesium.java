package com.example.pcuser.kalkulator;

import android.content.Intent;
import android.content.IntentSender;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class trapesium extends AppCompatActivity {
    EditText a, b, t, l;
    TextView output, keterangan;
    Double v1, v2, v3, v4, hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);
        a = (EditText) findViewById(R.id.EtATP);
        b = (EditText) findViewById(R.id.EtBTP);
        t = (EditText) findViewById(R.id.EtTTP);
        l = (EditText) findViewById(R.id.EtLTP);
        output = (TextView) findViewById(R.id.tvhasilTP);
        keterangan = (TextView) findViewById(R.id.tvketeranganTP);
    }

    public void konver(){
        v1 =Double.parseDouble(a.getText().toString());
        v2 = Double.parseDouble(b.getText().toString());
        v3 = Double.parseDouble(t.getText().toString());
        v4 = Double.parseDouble(l.getText().toString());
    }

    public void konver2(){
        v1 = Double.parseDouble(a.getText().toString());
        v2 = Double.parseDouble(b.getText().toString());
        v3 = Double.parseDouble(t.getText().toString());
    }
    public void proseskelilingTP(View view) {
        try {
            konver();
            hasil = v1 + v2 + v3 + v4;
            output.setText(Double.toString(hasil));
            keterangan.setText("Keliling = a + b + t + l");
        } catch (Exception e) {
            output.setText("");
            keterangan.setText("");
        }
    }
    public void prosesluasTP(View view) {
        try{
            konver2();
            hasil = ((v1+v2)*v3)/2;
            output.setText(Double.toString(hasil));
            keterangan.setText("Luas = ((a + b) * t)/2");
        } catch(Exception e){
            output.setText("");
            keterangan.setText("");
        }

    }
}
