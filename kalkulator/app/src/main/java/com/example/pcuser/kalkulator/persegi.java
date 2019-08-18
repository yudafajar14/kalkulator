package com.example.pcuser.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegi extends AppCompatActivity {
    EditText s;
    Button btnl, btnk;
    TextView output, keterangan;
    Double v1, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        /* deklarasi id */
        s = (EditText) findViewById(R.id.EtSisiPersegi);


        output = (TextView) findViewById(R.id.tvhasilPersegi);
        keterangan = (TextView) findViewById(R.id.tvketeranganp);
        btnl = (Button) findViewById(R.id.btnLuasPersegi);
        btnk = (Button) findViewById(R.id.btnKelilingPersegi);

        btnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    konver();
                    hasil = 2 * (v1 + v1);
                    output.setText(Double.toString(hasil));
                    keterangan.setText("Keliling = 2 * ( s + s )");
                }catch (Exception e){
                    output.setText("");
                    keterangan.setText("");
                }
            }
        });

        btnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    konver();
                    hasil = v1 * v1;
                    output.setText(Double.toString(hasil));
                    keterangan.setText("Luas = s * s");
                }catch (Exception  e){
                    output.setText("");
                    keterangan.setText("");
                }
                }

        });

    }

    public void konver() {

        v1 = Double.parseDouble(s.getText().toString());


    }


}