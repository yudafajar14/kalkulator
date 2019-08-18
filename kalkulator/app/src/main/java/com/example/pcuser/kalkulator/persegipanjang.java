package com.example.pcuser.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class persegipanjang extends AppCompatActivity {
    EditText pp,lp;
    TextView output,keterangan;
    Double v1,v2,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);

        /* Deklarasi id */

        pp = (EditText)findViewById(R.id.EtPanjangPp);
        lp = (EditText)findViewById(R.id.EtLebarPp);
        output = (TextView) findViewById(R.id.tvhasilPersegiP);
        keterangan = (TextView)findViewById(R.id.tvketeranganpp);
    }

    public void konver (){
        v1 = Double.parseDouble(pp.getText().toString());
        v2 = Double.parseDouble(lp.getText().toString());
    }

    public void prosesluaspp(View view){
        try {
            konver();
            hasil = v1 * v2;
            output.setText(Double.toString(hasil));
            keterangan.setText("Luas = p * l");
        }catch (Exception e){
            output.setText("");
            keterangan.setText("");
        }
    }

    public void proseskelilingpp(View view){
        try {
            konver();

            hasil = 2 * (v1 + v2);
            output.setText(Double.toString(hasil));
            keterangan.setText("Keliling = 2 * ( p + l )");
        }catch(Exception e){
            output.setText("");
            keterangan.setText("");
        }
        }
}
