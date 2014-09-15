
package com.takeme.rest.domain.trip.model;

import com.google.gson.annotations.Expose;

public class ArrivalStop {

    @Expose
    private Location location;
    @Expose
    private String name;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
