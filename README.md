takeme: Backend
==============
####Based on your current location, we will show you the next available public transit to take you wherever you want to go.

**Backend:** The backend provides a RESTful API service for the frontend to consume. I used Java over the Spring framework for the web service. I use the Google Maps Directions API and Google Maps Geolocation API to retrieve an address for user's geolocation based on latitude/longitude, and to find a public transportation "trip" between a given origin/destination.

1. **Controllers (com.takeme.rest.controller)**
  * **LocationController (location/origin/getlocation):** getLocation(latitude, longitude) is used to retrieve full address from Google Maps Geolocation API.
  * **TripController (trips/itineraries/gettrip):** getTrip(origin, destination, time, mode) is used to retrieve a trip itinerary from Google Maps Directions API.
2. **Domains (com.takeme.rest.domain)**
  * **Location:** Constructor takes latitude and longitude, and calls Google Maps Geolocation API to get full address.
  * **Trip:** Constructor takes origin, destination, time, and mode, and calls Google Maps Directions API to get trip itinerary.
3. **Models**
  * **com.takeme.rest.domain.location.model:** POJO representation of Google Maps Geolocation API response
  * **com.takeme.rest.domain.trip.model:** POJO representation of Google Maps Directions API response
  * **com.takeme.rest.output.model:** POJO respresentation of location and trip api call response

**Experience:** I have 5 years of Java experience, and 2 years of Java backend development experience. I chose to use the Spring framework as that was the framework I used as an intern at HomeAway.

**Credit:** http://jsonschema2pojo.org - Used to create POJO models from Google Maps Directions API and Google Maps Geolocation API JSON response. Creating models from scratch would have been very tedious.