package com.example.pcuser.kalkulator;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


class   ViewPagerAdapter extends FragmentPagerAdapter {
    private final Context context;

    ViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0 :
                fragment = kedua.newInstance();
                break;
            case 1:
                fragment = tabruang.newInstance();
                break;


        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getResources().getString(R.string.kedua);
            case 1:
                return context.getResources().getString(R.string.tabruang);


        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
