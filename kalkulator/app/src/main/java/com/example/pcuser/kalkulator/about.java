package com.example.pcuser.kalkulator;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class about extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView tvabout = (TextView)findViewById(R.id.tvabout);

        tvabout.setText("Aplikasi kumpulan rumus \n" +
                "bangun datar dan bangun ruang");


    }
}