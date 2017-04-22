package com.example.vickypatel.myapplication.models;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Vicky Patel on 4/22/2017.
 */

public class Steps {

    private String html_instructions;

    private String duration;

    private String distance;

    private LatLng end_location;

    private Polyline polyline;

    private LatLng start_location;

    private String travel_mode;

    public String getHtml_instructions() {
        return html_instructions;
    }

    public void setHtml_instructions(String html_instructions) {
        this.html_instructions = html_instructions;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public LatLng getEnd_location() {
        return end_location;
    }

    public void setEnd_location(LatLng  end_location) {
        this.end_location = end_location;
    }

    public Polyline getPolyline() {
        return polyline;
    }

    public void setPolyline(Polyline polyline) {
        this.polyline = polyline;
    }

    public LatLng  getStart_location() {
        return start_location;
    }

    public void setStart_location(LatLng  start_location) {
        this.start_location = start_location;
    }

    public String getTravel_mode() {
        return travel_mode;
    }

    public void setTravel_mode(String travel_mode) {
        this.travel_mode = travel_mode;
    }

    @Override
    public String toString() {
        return "ClassPojo [html_instructions = " + html_instructions + ", duration = " + duration + ", distance = " + distance + ", end_location = " + end_location + ", polyline = " + polyline + ", start_location = " + start_location + ", travel_mode = " + travel_mode + "]";
    }
}

