package com.lbj.commonsdk;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.apkfuns.log2file.LogFileEngineFactory;
import com.lbj.commonsdk.log.KLog;

/**
 * Created by luo on 2021/1/27.
 * only used to init some sdk.
 */
public class LifecycleProvider extends ContentProvider {
    @Override
    public boolean onCreate() {
        initLog();
        return true;
    }

    private void initLog() {
        KLog.fileEnable(false)
                .filePath(getContext().getExternalFilesDir("log").getAbsolutePath())
                .fileEngine(new LogFileEngineFactory(getContext()));
        KLog.config()
                .configShowBorders(false);
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] strings, @Nullable String s, @Nullable String[] strings1, @Nullable String s1) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }
}
