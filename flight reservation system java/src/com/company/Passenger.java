package com.company;

public class Passenger {

    private int idCounter=0;

    public String addressstreet ;
    public String addressscity ;
    public String addresssstate ;
    public String addressscountry ;


    public String contactname ;
    public String contactphoneNumber ;
    public String contactemailid ;

    public  int getIdCounter(){
        return idCounter;
    }
    public int setIdCounter(){
        return this.idCounter = idCounter;
    }

    public Passenger(int idCounter,String contactname, String contactphoneNumber, String contactemailid,
                     String addressstreet, String addressscity, String addresssstate, String addressscountry){

        this.contactname = contactname;
        this.contactphoneNumber = contactphoneNumber;
        this.contactemailid = contactemailid;

        this.idCounter = idCounter;
        this.addressstreet = addressstreet;
        this.addressscity = addressscity;
        this.addresssstate = addresssstate;
        this.addressscountry = addressscountry;


    }

    Passenger (Passenger passenger){
        idCounter = passenger.idCounter;
        contactname = passenger.contactname;
        contactphoneNumber = passenger.contactphoneNumber;
        contactemailid = passenger.contactemailid;
        addressstreet = passenger.addressstreet;
        addressscity = passenger.addressscity;
        addresssstate = passenger.addresssstate;
        addressscountry = passenger.addressscountry;

    }

    public String getAddressDetails(){
        return addressstreet+", "+addressscity+", "+addresssstate+", "+addressscountry;
    }
    public String getContactDetails(){
        return contactname+", "+contactphoneNumber+", "+contactemailid;
    }
    public int getPassengerCount(){
        return idCounter+1;
    }
}
