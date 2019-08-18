package com.example.pcuser.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class limas3 extends AppCompatActivity {
EditText a,t;
TextView output,keterangan;
Double v1,v2,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limas3);
        a = (EditText) findViewById(R.id.EtAlasLimas3);
        t = (EditText) findViewById(R.id.EtTinggiLimas3);
        output = (TextView)findViewById(R.id.tvhasilLimas3);
        keterangan = (TextView)findViewById(R.id.tvketeranganLimas3);
    }


    public void konver(){
        v1 = Double.parseDouble(a.getText().toString());
        v2 = Double.parseDouble(t.getText().toString());
    }

    public void prosesluasLimas3(View view) {
        try{
            konver();
            hasil = 4 *(v1*v2/2);
            output.setText(Double.toString(hasil));
            keterangan.setText("L.Permukaan = 4 * ( a * t / 2 )");
        }catch(Exception e){
            output.setText("");
            keterangan.setText("");
        }
    }

    public void prosesvolumeLimas3(View view) {
    try{
        konver();
        hasil = v1*v2*v2/6;
        output.setText(Double.toString(hasil));
        keterangan.setText("Volume = 1/3*(1/2*a*t)*t");
    }catch (Exception e){
        output.setText("");
        keterangan.setText("");
    }
    }

}
