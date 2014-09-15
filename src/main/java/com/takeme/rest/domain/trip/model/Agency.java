
package com.takeme.rest.domain.trip.model;

import com.google.gson.annotations.Expose;

public class Agency {

    @Expose
    private String name;
    @Expose
    private String phone;
    @Expose
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
