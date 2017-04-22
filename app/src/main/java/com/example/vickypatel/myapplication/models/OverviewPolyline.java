package com.example.vickypatel.myapplication.models;

/**
 * Created by Vicky Patel on 4/22/2017.
 */

public class OverviewPolyline {
    private String points;

    public String getPoints ()
    {
        return points;
    }

    public void setPoints (String points)
    {
        this.points = points;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [points = "+points+"]";
    }
}
