package com.yyp.sun.util;

import android.content.Context;
import android.widget.Toast;

/**
 * 通知框工具
 * Created by yyp on 2016/8/13.
 */
public class ToastUtil {

    /**
     * 显示 Toast
     * @param context
     * @param msg
     */
    public static void showToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
