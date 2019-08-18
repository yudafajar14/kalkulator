package com.example.pcuser.kalkulator;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v4.app.Fragment;

public class kedua extends Fragment {

    public static kedua newInstance(){
        return new kedua();
}
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View View = inflater.inflate(R.layout.activity_kedua, container, false);

        Button btnSegitiga = View.findViewById(R.id.btnSegitiga);
        Button btnPersegi = View.findViewById(R.id.btnPersegi);
        Button btnPersegiPanjang = View.findViewById(R.id.btnPersegiPanjang);
        Button btnLingkaran = View.findViewById(R.id.btnLingkaran);
        Button btnTrapesium = View.findViewById(R.id.btnTrapesium);
        Button btnBelahKetupat = View.findViewById(R.id.btnBelahKetupat);
        Button btnLayangan = View.findViewById(R.id.btnLayang);
        Button btnJajatGenjang = View.findViewById(R.id.btnJajarGenjang);

        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), segitiga.class);
                startActivity(intent);
            }
        });
        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),persegi.class);
                startActivity(intent);
            }
        });
        btnPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),persegipanjang.class);
                startActivity(intent);
            }
        });
        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),lingkaran.class);
                startActivity(intent);
            }
        });
        btnTrapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),trapesium.class);
                startActivity(intent);
            }
        });
        btnBelahKetupat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),belahketupat.class);
                startActivity(intent);
            }
        });
        btnLayangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),layangan.class);
                startActivity(intent);
            }
        });
        btnJajatGenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),jajargenjang.class);
                startActivity(intent);
            }
        });
    return View;
    }
}
