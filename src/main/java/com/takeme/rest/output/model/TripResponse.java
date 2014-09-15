
package com.takeme.rest.output.model;

/**
 * TripResponse class that enables Spring to automatically convert to JSON when
 * TripController method 'getTrip' is called via API.
 * 
 */
public class TripResponse {
	
	private String arrivalTime;
	private String departureTime;
	private String duration;
	private String distance;
	private String startAddress;
	private String endAddress;

	public TripResponse(String arrivalTime, String departureTime, String duration, String distance, String startAddress, String endAddress) {
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.duration = duration;
		this.distance = distance;
		this.startAddress = startAddress;
		this.endAddress = endAddress;
	}
	
	public String getArrivalTime() {
		return arrivalTime;
	}
	
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	public String getDepartureTime() {
		return departureTime;
	}
	
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
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
	
	public String getStartAddress() {
		return startAddress;
	}
	
	public void setStartAddress(String startAddress) {
		this.startAddress = startAddress;
	}
	
	public String getEndAddress() {
		return endAddress;
	}
	
	public void setEndAddress(String endAddress) {
		this.endAddress = endAddress;
	}
	
}
