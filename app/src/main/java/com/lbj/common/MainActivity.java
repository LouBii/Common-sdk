package com.lbj.common;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lbj.commonsdk.Klog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Klog.d("");
    }
}