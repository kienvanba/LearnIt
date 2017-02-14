package com.example.kienvanba.pewpow.utils;

import android.util.Log;

/**
 * Created by kienvanba on 2/14/17.
 */

public class LogUtils {
    private static final String LOG_PREFIX = "LogUtils_";
    private static final int LOG_PREFIX_LENGTH = LOG_PREFIX.length();
    private static final int MAX_LOG_TAG_LENGTH = 30;

    public static String makeLogTag(String str) {
        if (str.length() > MAX_LOG_TAG_LENGTH - LOG_PREFIX_LENGTH) {
            return LOG_PREFIX + str.substring(0, MAX_LOG_TAG_LENGTH - LOG_PREFIX_LENGTH - 1);
        }

        return LOG_PREFIX + str;
    }

    public static String makeLogTag(Class cls) {
        return makeLogTag(cls.getSimpleName());
    }

    public static void LogE(String tag, String message){
        Log.e(tag,message);
    }
}