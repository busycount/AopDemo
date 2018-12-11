package com.busycount.aop;

import android.os.Looper;

/**
 * DoubleClickUtil
 * <p>
 * 2018/12/11 | Count.C | Created
 */
public class DoubleClickUtil {
    private static long lastClickTime = 0;
    private static final int INTERVAL = 1000;

    public static boolean isDoubleClick() {
        long currentClickTime = System.currentTimeMillis();
        boolean isDoubleClick = (currentClickTime - lastClickTime) < INTERVAL;
        lastClickTime = currentClickTime;
        return isDoubleClick;
    }

    public static boolean notDoubleClick() {
        return !isDoubleClick();
    }
}
