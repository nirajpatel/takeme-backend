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
import com.takeme.rest.domain.trip.model.Itinerary;
import com.takeme.rest.domain.trip.model.Leg;
import com.takeme.rest.domain.trip.model.Route;
import com.takeme.rest.domain.trip.model.Step;
import com.takeme.rest.output.model.TripResponse;

/**
 * Trip class that retrieves itinerary from @origin to @destination using @mode at @time
 * using Google Maps Directions API.
 * 
 */
public class Trip {
	
	private String gMapsDirectionsBaseUrl = "https://maps.googleapis.com/maps/api/directions/json?";
	private String gMapsKey = "AIzaSyACcttA2c3J75_C-Fjj8ldnemB_ylTjVcM";
	
	private String arrivalTime;
	private String departureTime;
	private String duration;
	private String distance;
	private String startAddress;
	private String endAddress;
	private List<Step> steps;
	
	/*
	 * Constructor for a Trip object. Sends query to Google Maps Directions API and parses the
	 * response.
	 * 
	 */
	public Trip(String origin, String destination, String time, String mode) {
		JsonObject tripJsonObject = requestTrip(origin, destination, time, mode);
		
		String status = tripJsonObject.get("status").getAsString();
		if(status.equals("OK")) {
			Gson gson = new Gson();
			Itinerary itinerary = gson.fromJson(tripJsonObject, Itinerary.class);
			
			Route route = itinerary.getRoutes().get(0);
			Leg leg = route.getLegs().get(0);
			
			arrivalTime = leg.getArrivalTime().getText();
			departureTime = leg.getDepartureTime().getText();
			duration = leg.getDuration().getText();
			distance = leg.getDistance().getText();
			startAddress = leg.getStartAddress();
			endAddress = leg.getEndAddress();
			steps = leg.getSteps();
		}
	}
	
	/*
	 * Returns object containing data for this Trip.
	 * 
	 */
	public TripResponse getTrip() {
		TripResponse tripResponse = new TripResponse(arrivalTime, departureTime, duration, distance, startAddress, endAddress);
		
		return tripResponse;
	}
	
	/*
	 * Sends a request to Google Maps Directions API to find a trip via @mode (i.e. transit) starting
	 * at time @time from @origin to @destination.
	 * 
	 */
	private JsonObject requestTrip(String origin, String destination, String time, String mode) {
	    try {	    	
	    	origin = origin.replaceAll("\\s+", "+");
	    	destination = destination.replaceAll("\\s+", "+");
	    	
			URL url = new URL(gMapsDirectionsBaseUrl + "origin=" + origin + "&destination=" + destination +
					"&key=" + gMapsKey + "&departure_time=" + time + "&mode=" + mode);
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
