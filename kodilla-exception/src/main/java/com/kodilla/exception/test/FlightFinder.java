package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException{
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("FRA", true);
        flights.put("OSL", false);
        flights.put("PMO", true);
        flights.put("MAD", true);
        flights.put("KRK", false);

        if(flights.get(flight.getArrivalAirport())==null){
            throw new RouteNotFoundException("message");
        }

        if(flights.get(flight.getDepartureAirport())==null || !flights.get(flight.getDepartureAirport())){
            throw new RouteNotFoundException("message");
        }

    }

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();

        try{
            flightFinder.findFlight(new Flight("RZE", "MAD"));
            System.out.println();
        }catch (RouteNotFoundException e){
            System.out.println("Airport is not available. Error: "+ e);
        }
    }
}
