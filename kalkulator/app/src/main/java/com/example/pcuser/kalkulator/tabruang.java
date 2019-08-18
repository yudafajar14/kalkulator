package com.example.pcuser.kalkulator;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class tabruang extends Fragment {
    public static tabruang newInstance() {
        return new tabruang();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View View = inflater.inflate(R.layout.activity_tabruang, container, false);
        /*========================================================*/
        Button btnBalok = (Button) View.findViewById(R.id.btnBalok);
        Button btnKubus = (Button) View.findViewById(R.id.btnKubus);
        Button btnLimas4 = (Button) View.findViewById(R.id.btnLimas);
        Button btnTabung = (Button) View.findViewById(R.id.btnTabung);
        Button btnBola = (Button) View.findViewById(R.id.btnBola);
        Button btnKerucut = (Button)View.findViewById(R.id.btnKerucut);
        Button btnLimas3 = (Button) View.findViewById(R.id.btnlimastiga);
        Button btnPrisma3 = (Button) View.findViewById(R.id.btnprisma);


        /*========================================================*/
        btnBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),balok.class);
                startActivity(intent);
            }
        });

        btnKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),kubus.class);
                startActivity(intent);
            }
        });

        btnLimas4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),limas4.class);
                startActivity(intent);
            }
        });

        btnTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),tabung.class);
                startActivity(intent);
            }
        });

        btnBola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),bola.class);
                startActivity(intent);
            }
        });

        btnKerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),kerucut.class);
                startActivity(intent);
            }
        });

        btnLimas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),limas3.class);
                startActivity(intent);
            }
        });

        btnPrisma3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),prismasegi3.class);
                startActivity(intent);
            }
        });

        return View;

    }
}
