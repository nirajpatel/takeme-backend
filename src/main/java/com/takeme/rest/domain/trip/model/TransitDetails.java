
package com.takeme.rest.domain.trip.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TransitDetails {

    @SerializedName("arrival_stop")
    @Expose
    private ArrivalStop arrivalStop;
    @SerializedName("arrival_time")
    @Expose
    private ArrivalTime arrivalTime;
    @SerializedName("departure_stop")
    @Expose
    private DepartureStop departureStop;
    @SerializedName("departure_time")
    @Expose
    private DepartureTime departureTime;
    @Expose
    private String headsign;
    @Expose
    private Line line;
    @SerializedName("num_stops")
    @Expose
    private Integer numStops;

    public ArrivalStop getArrivalStop() {
        return arrivalStop;
    }

    public void setArrivalStop(ArrivalStop arrivalStop) {
        this.arrivalStop = arrivalStop;
    }

    public ArrivalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(ArrivalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public DepartureStop getDepartureStop() {
        return departureStop;
    }

    public void setDepartureStop(DepartureStop departureStop) {
        this.departureStop = departureStop;
    }

    public DepartureTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(DepartureTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getHeadsign() {
        return headsign;
    }

    public void setHeadsign(String headsign) {
        this.headsign = headsign;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public Integer getNumStops() {
        return numStops;
    }

    public void setNumStops(Integer numStops) {
        this.numStops = numStops;
    }

}
