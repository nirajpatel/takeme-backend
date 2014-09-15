
package com.takeme.rest.domain.location.model;

import com.google.gson.annotations.Expose;

public class Viewport {

	  @Expose
	    private Location north;
	    @Expose
	    private Location south;
	    @Expose
	    private Location northeast;
	    @Expose
	    private Location northwest;
	    @Expose
	    private Location southeast;
	    @Expose
	    private Location southwest;

	    public Location getNorth() {
	        return north;
	    }

	    public void setNorth(Location north) {
	        this.north = north;
	    }

	    public Location getSouth() {
	        return south;
	    }

	    public void setSouth(Location south) {
	        this.south = south;
	    }

	    public Location getNortheast() {
	        return northeast;
	    }

	    public void setNortheast(Location northeast) {
	        this.northeast = northeast;
	    }
	    
	    public Location getNorthwest() {
	        return northwest;
	    }

	    public void setNorthwest(Location northwest) {
	        this.northwest = northwest;
	    }
	    
	    public Location getSoutheast() {
	        return northeast;
	    }

	    public void setSoutheast(Location southeast) {
	        this.southeast = southeast;
	    }

	    public Location getSouthwest() {
	        return southwest;
	    }

	    public void setSouthwest(Location southwest) {
	        this.southwest = southwest;
	    }

}
