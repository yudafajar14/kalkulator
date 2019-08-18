package com.example.pcuser.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class kubus extends AppCompatActivity {
EditText r;
TextView keterangan,output;
Double v1,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);
        r=(EditText)findViewById(R.id.EtRusukKubus);
        keterangan = (TextView)findViewById(R.id.tvketeranganKubus);
        output = (TextView)findViewById(R.id.tvhasilKubus);
    }

    public void konver(){
        v1 = Double.parseDouble(r.getText().toString());
    }

    public void proseskelilingKubus(View view) {
        try{
            konver();
            hasil = 12 * v1;
            output.setText(Double.toString(hasil));
            keterangan.setText("Keliling = 12 * R");
        }catch (Exception e){
            keterangan.setText("");
            output.setText("");
        }
    }

    public void prosesluasKubus(View view) {
    try{
        konver();
        hasil = 6 *(v1*v1);
        output.setText(Double.toString(hasil));
        keterangan.setText("Luas = 6 * ( R * R )");

    }catch(Exception e){
        keterangan.setText("");
        output.setText("");
    }
    }


    public void prosesvolumeKubus(View view) {
    try{
        konver();
        hasil = v1 * v1 * v1;
        output.setText(Double.toString(hasil));
        keterangan.setText("Volume = R * R * R");
    }catch (Exception e){
        keterangan.setText("");
        output.setText("");
    }
    }

}
