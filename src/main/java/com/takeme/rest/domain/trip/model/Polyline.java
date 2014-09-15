
package com.takeme.rest.domain.trip.model;

import com.google.gson.annotations.Expose;

public class Polyline {

    @Expose
    private String points;

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

}
