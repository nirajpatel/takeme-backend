
package com.takeme.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.takeme.rest.domain.Location;
import com.takeme.rest.output.model.LocationResponse;

/**
 * Controller that exposes the Location class that consumes @latitude @longitude
 * reverse geocodes @latitude @longitude using Google Maps Geolocation API,
 * and returns a full address.
 * 
 */
@Controller
@RequestMapping("location/origin")
public class LocationController {
	
	/*
	 * API method that takes in @latitude @longitude, retrieves a location via the Location class,
	 * and returns that location packed in the LocationResponse class.
	 * 
	 */
	@RequestMapping(value = "/getlocation", method = RequestMethod.GET, produces="application/json")
	public @ResponseBody LocationResponse getLocation(@RequestParam("latitude") String latitude, @RequestParam("longitude") String longitude) {		
		Location userLocation = new Location(latitude, longitude);
		
		return userLocation.getUserLocation();		
	}
	
}
