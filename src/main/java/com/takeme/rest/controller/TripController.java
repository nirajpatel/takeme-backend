
package com.takeme.rest.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.takeme.rest.domain.Trip;
import com.takeme.rest.output.model.TripResponse;

/**
 * Controller that exposes the Trip class that consumes @origin @destination @time
 * @mode, retrieves itinerary using Google Maps Directions API, and returns itinerary.
 * 
 */
@Controller
@RequestMapping("trips/itineraries")
public class TripController {
		
	/*
	 * API method that takes in @origin @destination @time @mode, retrieves an itinerary via the Trip class, and
	 * returns that location packed in the TripResponse class.
	 * 
	 */
	@RequestMapping(value = "/gettrip", method = RequestMethod.GET, produces="application/json")
	public @ResponseBody TripResponse getTrip(HttpServletResponse response, @RequestParam("origin") String origin,
			@RequestParam("destination") String destination, @RequestParam("time") String time,
			@RequestParam("mode") String mode) {		
		Trip trip = new Trip(origin, destination, time, mode);
		
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
		
		return trip.getTrip();		
	}
	
}
