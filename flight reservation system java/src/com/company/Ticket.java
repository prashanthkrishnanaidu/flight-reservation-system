package com.company;

public class Ticket extends Flight implements RegularTicket,TouristTicket{

    public long PNRnumber ;
    public String passengerName;
    public String departure;
    public String destination;
    public String dateAndTime;
    public String seatNumber;
    public float ticketPrice;
    public float travelTime;
    public boolean ticketStatus;

    public Ticket(String flightNumber, String flightAirlines, int capacity, int seatsBooked, long PNRnumber, String passengerName,
                   String departure, String destination, String dateAndTime, String seatNumber, float ticketPrice, float travelTime,
                  boolean ticketStatus) {
        super(flightNumber, flightAirlines, capacity, seatsBooked);
        this.PNRnumber = PNRnumber;
        this.passengerName = passengerName;
        this.departure = departure;
        this.destination = destination;
        this.dateAndTime = dateAndTime;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
        this.travelTime = travelTime;
        this.ticketStatus = ticketStatus;
    }

    public  String ticketDetails(){
        return "Ticket Details are:"+"\n"+super.getFlightDetails()+"\n"+this.PNRnumber+"\n"+this.passengerName+"\n"+this.departure+"\n"+this.destination
                +"\n"+this.dateAndTime+"\n"+this.seatNumber+"\n"+this.ticketPrice+"\n"+this.travelTime+"\n"+this.ticketStatus;
   }
   public String specialServices(){
        return ticketDetails()+"Special services like food, water and snacks";
   }
   public  String touristLocations(){
        return ticketDetails()+"Details of Tourist locations ";
   }

}
