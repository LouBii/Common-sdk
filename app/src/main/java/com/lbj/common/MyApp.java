package com.lbj.common;

import android.app.Application;

import com.apkfuns.log2file.LogFileEngineFactory;
import com.lbj.commonsdk.Klog;

/**
 * Created by luo on 2021/1/26.
 */
class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initLog();

    }

    private void initLog() {
        Klog.fileEnable(true)
                .filePath(getExternalFilesDir("log").getAbsolutePath())
                .fileEngine(new LogFileEngineFactory(this));
        Klog.config()
                .configShowBorders(false);
    }
}
