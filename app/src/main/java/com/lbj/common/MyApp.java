package com.lbj.common;

import android.app.Application;

import com.lbj.commonsdk.log.KLog;

/**
 * Created by luo on 2021/1/26.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initLog();

    }

    private void initLog() {
        KLog.TAG = "VMI-LOG";
        KLog.fileEnable(true).fileShowStack(true);
    }
}
