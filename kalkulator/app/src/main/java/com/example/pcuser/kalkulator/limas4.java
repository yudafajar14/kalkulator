package com.example.pcuser.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class limas4 extends AppCompatActivity {
EditText s,t,a,sm1,sm2;
TextView output,keterangan;
Double v1,v2,v3,v4,v5,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limas4);
        s = (EditText)findViewById(R.id.EtSisiLimas4);
        t = (EditText) findViewById(R.id.EtTinggiLimas4);
        a = (EditText)findViewById(R.id.EtAlasLimas4);
        sm1 = (EditText)findViewById(R.id.EtSM1Limas4);
        sm2 = (EditText)findViewById(R.id.EtSM2Limas4);
        output = (TextView)findViewById(R.id.tvhasilLimas4);
        TextView tvklimas4 = (TextView)findViewById(R.id.tvKLimas4);
        keterangan = (TextView)findViewById(R.id.tvketeranganLimas4);

    }

    public void konverV(){
        v1=Double.parseDouble(s.getText().toString());
        v2=Double.parseDouble(t.getText().toString());
        v3=Double.parseDouble(a.getText().toString());

    }


    public void konverL(){
        v1=Double.parseDouble(s.getText().toString());
        v2=Double.parseDouble(t.getText().toString());
        v3=Double.parseDouble(a.getText().toString());

    }

    public void konverK(){
        v1=Double.parseDouble(s.getText().toString());
        v2=Double.parseDouble(t.getText().toString());
        v3=Double.parseDouble(a.getText().toString());
        v4=Double.parseDouble(sm1.getText().toString());
        v5=Double.parseDouble(sm2.getText().toString());
    }

    public void prosesvolumeLimas4(View view) {
    try{
        konverV();
        hasil = (v1 * v2 * v3)/3;
        output.setText(Double.toString(hasil));
        keterangan.setText("Volume = (a * s * t)/3");
    }catch (Exception e){
        output.setText("");
        keterangan.setText("");
    }
    }

    public void prosesluasLimas4(View view) {
        try{
            konverL();
            hasil = (v1*v1)+(4*((v3*v2)/2));
            output.setText(Double.toString(hasil));
            keterangan.setText("Luas = s * s + 4*((a*t)/2)");
        }catch (Exception e){
            output.setText("");
            keterangan.setText("");
        }
    }

    public void proseskelilingLimas4(View view) {
        try{
            konverK();
            hasil = (2*(v3+v1))+(4*(v4+v5+v3));
            output.setText(Double.toString(hasil));
            keterangan.setText("Keliling = (2*(a+s))+(4*(sm1 + sm2 + a))");
        }catch (Exception e){
            keterangan.setText("");
            output.setText("");
        }

    }
}
