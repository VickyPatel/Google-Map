package com.example.vickypatel.myapplication.helpers;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.vickypatel.myapplication.VolleySingleton;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Vicky Patel on 4/22/2017.
 */

public class APIClient {

    public void getDirections() {

    }

    public void jsonRequestHandler(int method, String URL) {

        JsonObjectRequest request = new JsonObjectRequest(method, URL, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        VolleySingleton.getInstance().addToRequestQueue(request);
    }

    

}
