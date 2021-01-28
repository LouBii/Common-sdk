package com.lbj.commonsdk.log;

import android.util.Log;

import com.apkfuns.logutils.LogConfig;
import com.apkfuns.logutils.LogUtils;
import com.apkfuns.logutils.file.LogFileEngine;

/**
 * Created by luo on 2021/1/22.
 * log manager
 */
public class KLog {
    public static String TAG = "KLog";

    public static void i(String tag, Object msg, Throwable tr) {
        LogUtils.tag(tag).i(msg);
        if (tr != null) {
            Log.i(tag, "", tr);
        }
    }

    public static void d(String tag, Object msg, Throwable tr) {
        LogUtils.tag(tag).d(msg);
        if (tr != null) {
            Log.d(tag, "", tr);
        }
    }

    public static void v(String tag, Object msg, Throwable tr) {
        LogUtils.tag(tag).v(msg);
        if (tr != null) {
            Log.v(tag, "", tr);
        }
    }

    public static void w(String tag, Object msg, Throwable tr) {
        LogUtils.tag(tag).w(msg);
        if (tr != null) {
            Log.w(tag, "", tr);
        }
    }

    public static void e(String tag, Object msg, Throwable tr) {
        LogUtils.tag(tag).e(msg);
        if (tr != null) {
            Log.e(tag, "", tr);
        }
    }

    public static void wtf(String tag, Object msg, Throwable tr) {
        LogUtils.tag(tag).wtf(msg);
        if (tr != null) {
            Log.wtf(tag, "", tr);
        }
    }


    public static void i(String tag, Object msg) {
        i(tag, msg, null);
    }

    public static void v(String tag, Object msg) {
        v(tag, msg, null);
    }

    public static void d(String tag, Object msg) {
        d(tag, msg, null);
    }

    public static void w(String tag, Object msg) {
        w(tag, msg, null);
    }

    public static void e(String tag, Object msg) {
        e(tag, msg, null);
    }

    public static void wtf(String tag, Object msg) {
        LogUtils.tag(tag).wtf(msg);
    }

    public static void i(Object msg) {
        i(TAG, msg);
    }

    public static void v(Object msg) {
        v(TAG, msg);
    }

    public static void d(Object msg) {
        d(TAG, msg);
    }

    public static void w(Object msg) {
        w(TAG, msg);
    }

    public static void e(Object msg) {
        e(TAG, msg);
    }

    public static void wtf(Object msg) {
        wtf(TAG, msg);
    }

    public static void json(String msg) {
        LogUtils.json(msg);
    }

    public static void xml(String msg) {
        LogUtils.xml(msg);
    }

    /**
     * is enable save to disk
     * the default file path is -> getExternalFilesDir("log").getAbsolutePath()
     */
    public static LogFileConfig fileEnable(boolean fileEnable) {
        // targetSdkVersion >= 23, need file permission
        return LogFileConfig.getInstance().fileEnable(fileEnable);
    }

    public static LogConfig config() {
        return LogUtils.getLogConfig();
    }

    public static class LogFileConfig {

        //default file path
        private static final String FILE_PATH = "";
        //default file name format
        private static final String FILE_NAME_FORMAT = "%d{yyyyMMdd}.txt";
        private static LogFileConfig sLogFileConfig;

        public static LogFileConfig getInstance() {
            if (sLogFileConfig == null) {
                synchronized (LogFileConfig.class) {
                    if (sLogFileConfig == null) {
                        sLogFileConfig = new LogFileConfig();
                    }
                }
            }
            return sLogFileConfig;
        }

        public LogFileConfig() {
            //filePath(FILE_PATH);
            fileNameFormat(FILE_NAME_FORMAT);
            //LogUtils.getLog2FileConfig().configLogFileEngine(new LogFileEngineFactory());
        }

        public LogFileConfig fileEnable(boolean fileEnable) {
            LogUtils.getLog2FileConfig().configLog2FileEnable(fileEnable);
            return this;
        }

        /**
         * is write to file with stack info,
         * be careful,if enabled it will affect performance
         */
        public LogFileConfig fileShowStack(boolean isShowStack) {
            LogUtils.getLog2FileConfig().configLog2FileShowStack(isShowStack);
            return this;
        }

        public LogFileConfig filePath(String path) {
            LogUtils.getLog2FileConfig().configLog2FilePath(path);
            return this;
        }

        public LogFileConfig fileNameFormat(String format) {
            LogUtils.getLog2FileConfig().configLog2FileNameFormat(format);
            return this;
        }

        public LogFileConfig fileEngine(LogFileEngine engine) {
            LogUtils.getLog2FileConfig().configLogFileEngine(engine);
            return this;
        }
    }

}
