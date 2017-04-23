package com.example.vickypatel.myapplication.helpers;

import android.os.AsyncTask;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.vickypatel.myapplication.extras.AppUtils;
import com.example.vickypatel.myapplication.extras.VolleySingleton;
import com.example.vickypatel.myapplication.models.DirectionResponse;
import com.example.vickypatel.myapplication.models.Legs;
import com.example.vickypatel.myapplication.models.Routes;
import com.example.vickypatel.myapplication.models.Steps;
import com.google.android.gms.maps.model.LatLng;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Vicky Patel on 4/22/2017.
 */

public class APIClient {

    private static APIClient instance;

    public static APIClient getInstance() {
        if (instance == null) {
            return instance = new APIClient();
        }
        return instance;
    }

    public void getDirectionPoints(final RequestListener<ArrayList<LatLng>> listener) {
        jsonRequestHandler(Request.Method.GET, "https://maps.googleapis.com/maps/api/directions/json?origin=Toronto&destination=Montreal&key=AIzaSyDEwoVTGEYfIyKGrz2ntWINgp1EsKWBVFk", new JSONResponseListener() {
            @Override
            public void onResponse(JSONObject obj) {
                System.out.println(obj.toString());
                new GetPointsTask(new OnTaskCompleted<ArrayList<LatLng>>() {
                    @Override
                    public void onTaskCompleted(ArrayList<LatLng> response) {
                        listener.onResponse(response);
                    }
                }).execute(obj.toString());
            }

            @Override
            public void onError(String error) {

            }
        });
    }

    public void jsonRequestHandler(int method, String URL, final JSONResponseListener listener) {

        JsonObjectRequest request = new JsonObjectRequest(method, URL, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                listener.onResponse(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onError(error.getMessage().toString());
            }
        });

        VolleySingleton.getInstance().addToRequestQueue(request);
    }


    private class GetPointsTask extends AsyncTask<String, Void, ArrayList> {

        private OnTaskCompleted listener;

        public GetPointsTask(OnTaskCompleted listener) {
            this.listener = listener;
        }

        @Override
        protected ArrayList<LatLng> doInBackground(String... params) {
            ArrayList<LatLng> pointsList = new ArrayList<LatLng>();
            DirectionResponse response = new Gson().fromJson(params[0], DirectionResponse.class);
            for (Routes routes :
                    response.getRoutes()) {
                for (Legs legs :
                        routes.getLegs()) {
                    for (Steps steps :
                            legs.getSteps()) {
                        String points = steps.getPolyline().getPoints();
                        pointsList.addAll(AppUtils.decodePoly(points));
                    }
                }
            }
            return pointsList;
        }

        @Override
        protected void onPostExecute(ArrayList arrayList) {
            super.onPostExecute(arrayList);
            listener.onTaskCompleted(arrayList);

        }
    }


    public interface JSONResponseListener {

        void onResponse(JSONObject obj);

        void onError(String error);
    }

    public interface RequestListener<T> {

        void onResponse(T obj);

        void onError(String error);
    }

    public interface OnTaskCompleted<T> {
        void onTaskCompleted(T response);
    }

}
