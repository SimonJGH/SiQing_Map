package com.simon.siqing_map;

import android.app.Application;

import org.xutils.x;

/**
 * @author YDS
 * @date 2020/11/18
 * @discribe
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG); // 是否输出debug日志, 开启debug会影响性能.
    }
}
