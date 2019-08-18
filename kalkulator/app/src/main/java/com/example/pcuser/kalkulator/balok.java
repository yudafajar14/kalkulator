package com.example.pcuser.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class balok extends AppCompatActivity {
EditText p,l,t;
TextView output,keterangan;
Double v1,v2,v3,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);
        p = (EditText) findViewById(R.id.EtPanjangBalok);
        l = (EditText) findViewById(R.id.EtLebarBalok);
        t = (EditText) findViewById(R.id.EtTinggiBalok);
        output = (TextView) findViewById(R.id.tvhasilBalok);
        keterangan = (TextView)findViewById(R.id.tvketeranganBalok);


    }

        public void konver(){
        v1 = Double.parseDouble(p.getText().toString());
        v2 = Double.parseDouble(l.getText().toString());
        v3 = Double.parseDouble(t.getText().toString());
        }
    public void proseskelilingBalok(View view) {
        try {
            konver();
            hasil = 4 * (v1 + v2 + v3);
            output.setText(Double.toString(hasil));
            keterangan.setText("Keliling = 4 * (p + l + t)");
        } catch (Exception e) {
            output.setText("");
            keterangan.setText("");
        }
    }


    public void prosesluasBalok(View view) {
        try{
            konver();
            hasil = 2 * ((v1*v2)+(v1*v3)+(v2*v3));
            output.setText(Double.toString(hasil));
            keterangan.setText("Luas = 2 * ((p*l) + (p*t) + (l*t))");
        }catch (Exception e){
            output.setText("");
            keterangan.setText("");
        }
    }

    public void prosesvolumeBalok(View view) {
        try{
            konver();
            hasil=v1*v2*v3;
            output.setText(Double.toString(hasil));
            keterangan.setText("Volume = p * l * t");

        }catch (Exception e){
            output.setText("");
            keterangan.setText("");
        }
    }
}
