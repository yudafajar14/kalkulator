package com.example.pcuser.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class prismasegi3 extends AppCompatActivity {
EditText a,t,T;
TextView output,keterangan;
Double v1,v2,v3,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prismasegi3);
        a =(EditText)findViewById(R.id.EtAlasPrisma3);
        t =(EditText)findViewById(R.id.EtTinggiPrisma3);
        T =(EditText)findViewById(R.id.EtPanjangPrisma3);
        output = (TextView)findViewById(R.id.tvhasilPrisma3);
        keterangan = (TextView)findViewById(R.id.tvketeranganPrisma3);

    }
    public void konver(){
        v1 = Double.parseDouble(a.getText().toString());
        v2 = Double.parseDouble(t.getText().toString());
        v3 = Double.parseDouble(T.getText().toString());
    }
    public void prosesvolumePrisma3(View view) {
        try{
            konver();
            hasil = (v1*v2*v3)/2;
            output.setText(Double.toString(hasil));
            keterangan.setText("Volume = 1/2 * a * t * T");
        }catch (Exception e){
            output.setText("");
            keterangan.setText("");
        }
    }
    public void prosesluasPrisma3(View view) {
        try{
            konver();
            hasil = v2 * (v1 + (3*v3));
            output.setText(Double.toString(hasil));
            keterangan.setText("L.Permukaan = t * (a + (3 * T))");
        }catch (Exception e){
            keterangan.setText("");
            output.setText("");
        }
    }

}
