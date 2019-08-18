package com.example.pcuser.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.DownloadListener;
import android.widget.EditText;
import android.widget.TextView;

public class bola extends AppCompatActivity {
EditText r;
TextView output,keterangan;
Double v1,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);
        r = (EditText) findViewById(R.id.EtJariBola);
        output = (TextView)findViewById(R.id.tvhasilBola);
        keterangan = (TextView)findViewById(R.id.tvketeranganBola);
    }
    public void konver(){
        v1 = Double.parseDouble(r.getText().toString());
    }

    public void prosesluasBola(View view) {
        try{
            konver();
            hasil = 4*3.14*v1*v1;
            output.setText(Double.toString(hasil));
            keterangan.setText("L.Permukaan = 4 * phi * r * r");
        }catch (Exception e){
            output.setText("");
            keterangan.setText("");
        }
    }

    public void prosesvolumeBola(View view) {
        try {
            konver();
            hasil = (4*3.14*v1*v1*v1)/3;
            output.setText(Double.toString(hasil));
            keterangan.setText("Volume = 4/3 * phi * r * r * r");
        }catch(Exception e){
            output.setText("");
            keterangan.setText("");
        }
    }
}
