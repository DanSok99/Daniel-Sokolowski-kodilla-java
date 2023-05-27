package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    Map<String, Boolean> airport = new HashMap<>();
    public FindFlight(Map<String, Boolean> airport){
        this.airport = airport;
    }
    public void findFlight(Flight flight) throws RouteNotFoundException{
        if(airport.get(flight.getDepartureAirport())){
            System.out.println("Departure airport is available");
        }else{
            throw new RouteNotFoundException();
        }
        if(airport.get(flight.getArrivalAirport())){
            System.out.println("Arrival airport is available");
        }else{
            throw new RouteNotFoundException();
        }
    }
}
