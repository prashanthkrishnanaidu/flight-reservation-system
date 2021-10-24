package com.company;

public class Address {

   public String street ;
    public String city ;
    public String state ;
    public String country ;

   public Address(String street, String city, String state, String country){
       this.street = street;
       this.city = city;
       this.state = state;
       this.country = country;
   }

   public  String getAddressDetails(){
       return this.street+", "+this.city+", "+this.state+", "+this.country;
   }

}
