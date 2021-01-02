package com.example.whatsapp_task;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class PagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<MyTab> arrayList =new ArrayList<>();
    public PagerAdapter(@NonNull FragmentManager fm, ArrayList<MyTab> arrayList) {
        super(fm);
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return arrayList.get(position).getFragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return arrayList.get(position).getName();
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }
}
