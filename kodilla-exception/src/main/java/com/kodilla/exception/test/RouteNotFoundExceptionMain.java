package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteNotFoundExceptionMain {
    public static void main(String[] args) {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warszawa", false);
        airports.put("Poznan", true);
        airports.put("Krakow", true);
        airports.put("Lublin", true);
        airports.put("Gniezno", false);

        FindFlight findFlight = new FindFlight(airports);
        Flight flight = new Flight("Poznan","Gniezno");
        try{
            findFlight.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry you can't take a fly, departure or arrival airport is not available");
        }
    }
}
