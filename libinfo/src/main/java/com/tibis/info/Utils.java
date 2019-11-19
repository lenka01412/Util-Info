package com.tibis.info;

import android.os.Build;

public class Utils {
    public static String getName() {
        return android.os.Build.MODEL;
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }
}
