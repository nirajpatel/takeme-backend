
package com.takeme.rest.domain.trip.model;

import com.google.gson.annotations.Expose;

public class Duration {

    @Expose
    private String text;
    @Expose
    private Integer value;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}
