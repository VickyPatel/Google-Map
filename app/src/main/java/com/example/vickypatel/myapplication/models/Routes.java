package com.example.vickypatel.myapplication.models;

/**
 * Created by Vicky Patel on 4/22/2017.
 */

public class Routes {

    private String summary;

    private String[] waypoint_order;

    private Legs[] legs;

    private String[] warnings;

    private OverviewPolyline overview_polyline;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String[] getWaypoint_order() {
        return waypoint_order;
    }

    public void setWaypoint_order(String[] waypoint_order) {
        this.waypoint_order = waypoint_order;
    }

    public Legs[] getLegs() {
        return legs;
    }

    public void setLegs(Legs[] legs) {
        this.legs = legs;
    }

    public String[] getWarnings() {
        return warnings;
    }

    public void setWarnings(String[] warnings) {
        this.warnings = warnings;
    }

    public OverviewPolyline getOverview_polyline() {
        return overview_polyline;
    }

    public void setOverview_polyline(OverviewPolyline overview_polyline) {
        this.overview_polyline = overview_polyline;
    }

    @Override
    public String toString() {
        return "ClassPojo [summary = " + summary + ", waypoint_order = " + waypoint_order + ", legs = " + legs + ", warnings = " + warnings + ", overview_polyline = " + overview_polyline + "]";
    }
}
