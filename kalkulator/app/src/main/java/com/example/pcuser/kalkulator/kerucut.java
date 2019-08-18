package com.example.pcuser.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class kerucut extends AppCompatActivity {
EditText r,s,t;
TextView output,keterangan;
Double v1,v2,v3,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);
        r=(EditText)findViewById(R.id.EtJariKerucut);
        s=(EditText)findViewById(R.id.EtSisiKerucut);
        t=(EditText)findViewById(R.id.EtTinggiKerucut);
        output=(TextView)findViewById(R.id.tvHasilKerucut);
        keterangan=(TextView)findViewById(R.id.tvKeteranganKerucut);

    }
    public void konver(){
        v1 = Double.parseDouble(r.getText().toString());
        v2 = Double.parseDouble(s.getText().toString());
    }
    public void konver2(){
        v1 = Double.parseDouble(r.getText().toString());
        v3 = Double.parseDouble(t.getText().toString());

    }
    public void proseskLuasKerucut(View view) {
        try{
            konver();
            hasil = 3.14*v1*(v1+v2);
            output.setText(Double.toString(hasil));
            keterangan.setText("L.Permukaan = phi * r * (r + s)");
        }catch (Exception e){
            keterangan.setText("");
            output.setText("");
        }
    }

    public void prosesVolumeKerucut(View view) {
        try {
            konver2();
            hasil = (3.14 * v1 * v1 * v3) / 3;
            output.setText(Double.toString(hasil));
            keterangan.setText("Volume = 1/3*phi*r*r*t");
        }catch (Exception e){
            keterangan.setText("");
            output.setText("");
        }
    }
}
