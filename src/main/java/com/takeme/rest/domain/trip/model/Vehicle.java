
package com.takeme.rest.domain.trip.model;

import com.google.gson.annotations.Expose;

public class Vehicle {

    @Expose
    private String icon;
    @Expose
    private String name;
    @Expose
    private String type;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
