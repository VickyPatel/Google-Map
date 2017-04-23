package com.example.vickypatel.myapplication.models;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Vicky Patel on 4/22/2017.
 */

public class Steps {

    private String html_instructions;

    private Polyline polyline;

    private String travel_mode;

    public String getHtml_instructions() {
        return html_instructions;
    }

    public void setHtml_instructions(String html_instructions) {
        this.html_instructions = html_instructions;
    }

    public Polyline getPolyline() {
        return polyline;
    }

    public void setPolyline(Polyline polyline) {
        this.polyline = polyline;
    }

    public String getTravel_mode() {
        return travel_mode;
    }

    public void setTravel_mode(String travel_mode) {
        this.travel_mode = travel_mode;
    }

    @Override
    public String toString() {
        return "Steps{" +
                "html_instructions='" + html_instructions + '\'' +
                ", polyline=" + polyline +
                ", travel_mode='" + travel_mode + '\'' +
                '}';
    }
}

