package com.example.pcuser.kalkulator;

import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    boolean doubleBackToExitPreesedOnce = false;

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.container);


        setupToolbar();
        init();
    }

    private void init() {
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setOffscreenPageLimit(2);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setTabsFromPagerAdapter(viewPagerAdapter);
    }



    private void setupToolbar() {
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }
    }



    public void onBackPressed() {
        if (doubleBackToExitPreesedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPreesedOnce = true;
        Toast.makeText(this, "Klik Back Sekali Lagi Untuk Keluar", Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackToExitPreesedOnce = false;
            }
        }, 2000);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_keluar) {
            moveTaskToBack(true);
            return true;
        }
        else if (id == R.id.action_tentang) {
            Intent intent = new Intent(MainActivity.this,about.class);
        startActivity(intent);

            return true;
        }
        else if (id == R.id.action_bantuan){
            Intent intent = new Intent(MainActivity.this,bantuan.class);
            startActivity(intent);
        }

            return super.onOptionsItemSelected(item);
        }

}

