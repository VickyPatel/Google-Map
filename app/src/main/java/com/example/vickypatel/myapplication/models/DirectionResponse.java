package com.example.vickypatel.myapplication.models;

/**
 * Created by Vicky Patel on 4/22/2017.
 */

public class DirectionResponse {

    private String status;

    private Routes[] routes;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Routes[] getRoutes() {
        return routes;
    }

    public void setRoutes(Routes[] routes) {
        this.routes = routes;
    }

    @Override
    public String toString() {
        return "ClassPojo [status = " + status + ", routes = " + routes + "]";
    }
}

