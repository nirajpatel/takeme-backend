
package com.takeme.rest.output.model;

/**
 * LocationResponse class that enables Spring to automatically convert to JSON when
 * LocationController method 'getLocation' is called via API.
 * 
 */
public class LocationResponse {
	
	private String address;
	private String city;
	private String state;
	private String zipcode;

	public LocationResponse(String address, String city, String state, String zipcode) {
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZipcode() {
		return city;
	}
	
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
