package com.example.vickypatel.myapplication;

import android.text.TextUtils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

/**
 * Created by Vicky Patel on 4/22/2017.
 */

public class VolleySingleton {

    private RequestQueue mRequestQueue;
    private ImageLoader mImageLoader;
    private static VolleySingleton instance;

    public static VolleySingleton getInstance(){
        if(instance == null){
            return instance = new VolleySingleton();
        }
        return instance;
    }

    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(MyApp.getInstance().getApplicationContext());
        }

        return mRequestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }

    public void cancelPendingRequests(Object tag) {
        if (mRequestQueue != null) {
            mRequestQueue.cancelAll(tag);
        }
    }
}
