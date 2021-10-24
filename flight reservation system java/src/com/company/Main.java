package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Passenger passenger = new Passenger(1,"prashanth","123456789","p@gmail.com",
                "13th cross","davanagere","karnataka","India");

        Flight flight = new Flight("1AS5R4","AirIndia",150,5);


        Ticket ticket = new Ticket("1AS5R4","AirIndia",150,5,123456789,
                "prashanth","Bangalore","Delhi",
                "24/10/2021","10WS",4500,3,true);

        System.out.println(ticket.specialServices());
        System.out.println(passenger.getContactDetails());
    }
}
