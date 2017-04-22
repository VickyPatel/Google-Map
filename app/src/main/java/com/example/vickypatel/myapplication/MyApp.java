package com.example.vickypatel.myapplication;

import android.app.Application;

/**
 * Created by Vicky Patel on 4/22/2017.
 */

public class MyApp extends Application {

    private static MyApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static synchronized MyApp getInstance() {
        return mInstance;
    }

}
