package com.example.whatsapp_task;

import androidx.fragment.app.Fragment;

public class MyTab {
   String name;
    Fragment fragment;


    public String getName() {
        return name;
    }

    public Fragment getFragment() {
        return fragment;
    }


    public MyTab( String name,Fragment fragment) {
  this.name=name;
        this.fragment = fragment;
    }


}
