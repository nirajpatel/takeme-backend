package com.takeme.rest.domain;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.takeme.rest.domain.location.model.AddressComponent;
import com.takeme.rest.domain.location.model.Origin;
import com.takeme.rest.domain.location.model.Result;
import com.takeme.rest.output.model.LocationResponse;

/**
 * Location class that reverse geocodes @latitude @longitude using Google Maps Geolocation API.
 * 
 */
public class Location {
	
	private String gMapsGeocodeBaseUrl = "https://maps.googleapis.com/maps/api/geocode/json?";
	private String gMapsKey = "AIzaSyACcttA2c3J75_C-Fjj8ldnemB_ylTjVcM";
		
	private String address;
	private String city;
	private String state;
	private String zipcode;

	/*
	 * Constructor for a Location object. Sends query to Google Maps Geolocations API and parses the
	 * response.
	 * 
	 */
	public Location(String latitude, String longitude) {
		JsonObject originJsonObject = requestReverseGeocode(latitude, longitude);
		
		String status = originJsonObject.get("status").getAsString();
		if(status.equals("OK")) {
			Gson gson = new Gson();
			Origin origin = gson.fromJson(originJsonObject, Origin.class);
			
			Result result = origin.getResults().get(0);
			List<AddressComponent> addressComponent = result.getAddressComponents();
			
			address = addressComponent.get(0).getLongName() + " " + addressComponent.get(1).getLongName();
			city = addressComponent.get(3).getLongName();
			state = addressComponent.get(5).getShortName();
			zipcode = addressComponent.get(7).getLongName();
		}
	}
	
	/*
	 * Returns object containing data for this Location.
	 * 
	 */
	public LocationResponse getUserLocation() {
		LocationResponse userLocationResponse = new LocationResponse(address, city, state, zipcode);
		
		return userLocationResponse;
	}
	
	/*
	 * Sends a request to Google Maps Geolocation API to reverse geocode @latitude @longitude}.
	 * 
	 */
	private JsonObject requestReverseGeocode(String latitude, String longitude) {
	    try {	    	
   	
			URL url = new URL(gMapsGeocodeBaseUrl + "latlng=" + latitude + "," + longitude +
					"&key=" + gMapsKey);
		    HttpURLConnection request = (HttpURLConnection) url.openConnection();
		    request.connect();
	
		    JsonParser jp = new JsonParser();
		    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
		    JsonObject rootobj = root.getAsJsonObject();
		    
		    return rootobj;
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	    
	    return null;
	}
	
}
