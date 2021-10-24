package com.company;

public class Flight {

    String flightNumber ;
    String flightAirlines ;
    int capacity ;
    int seatsBooked ;

    public Flight(String flightNumber, String flightAirlines, int capacity, int seatsBooked){
        this.flightNumber = flightNumber;
        this.flightAirlines = flightAirlines;
        this.capacity = capacity;
        this.seatsBooked = seatsBooked;
    }

    public String getFlightDetails(){
        return this.flightNumber+", "+this.flightAirlines;
    }
    public  int updateSeatsAvailable(){
        return (this.capacity-this.seatsBooked);
    }
}
