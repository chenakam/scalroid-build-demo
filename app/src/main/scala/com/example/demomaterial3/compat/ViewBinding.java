package com.example.demomaterial3.compat;

import android.app.Activity;

import com.example.demomaterial3.databinding.ActivityMainBinding;

public class ViewBinding {
    public static ActivityMainBinding activityMain(Activity acty) {
        return ActivityMainBinding.inflate(acty.getLayoutInflater());
    }
}
