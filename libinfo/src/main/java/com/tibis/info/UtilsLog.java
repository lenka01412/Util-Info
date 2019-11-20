package com.tibis.info;

import android.util.Log;
import com.android.logx.Ulog;

public class UtilsLog {
    public static void debug(String msg)
    {
        Log.d("TAG",msg);
    }

    public  static void info (String msg)
    {
        Ulog.info(msg);
    }

    public  static void error (String msg)
    {
        Ulog.debug(msg);
    }

}
