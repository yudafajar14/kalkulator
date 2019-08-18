package com.example.pcuser.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class tabung extends AppCompatActivity {
EditText r,t;
TextView output,keterangan;
Double v1,v2,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);
        r = (EditText)findViewById(R.id.EtJariTabung);
        t = (EditText)findViewById(R.id.EtTinggiTabung);
        output = (TextView)findViewById(R.id.tvhasilTabung);
        keterangan = (TextView)findViewById(R.id.tvketeranganTabung);
    }

    public void konver(){
        v1 = Double.parseDouble(r.getText().toString());
        v2 = Double.parseDouble(t.getText().toString());
    }


    public void prosesluasTabung(View view) {
        try{
            konver();
            hasil = 2*3.14*v1*(v1+v2);
            output.setText(Double.toString(hasil));
            keterangan.setText("L.Permukaan = 2*phi*r*(r+t)");
        }catch (Exception e){
            keterangan.setText("");
            output.setText("");
        }
    }

    public void prosesvolumeTabung(View view) {
    try{
        konver();
        hasil = 3.14*v1*v1*v2;
        output.setText(Double.toString(hasil));
        keterangan.setText("Volume = phi*r*r*t");
    }catch (Exception e){
        output.setText("");
        keterangan.setText("");
    }
    }
}
