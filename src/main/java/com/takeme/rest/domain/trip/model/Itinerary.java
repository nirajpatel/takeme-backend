
package com.takeme.rest.domain.trip.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

public class Itinerary {

    @Expose
    private List<Route> routes = new ArrayList<Route>();
    @Expose
    private String status;

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
