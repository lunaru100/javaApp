package com.example.firstapp;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int hour = 9;
        if (hour<12){
            setContentView(R.layout.main_activity_layout_1);
        }else{

        }
    }
}
