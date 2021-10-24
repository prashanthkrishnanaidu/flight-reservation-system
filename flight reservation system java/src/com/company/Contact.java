package com.company;

public class Contact {

    public String name ;
    public String phoneNumber ;
    public String emailid ;

    public  Contact (String name, String phoneNumber, String emailid){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailid = emailid;
    }

    public String getContactDetails(){
        return this.name+", "+this.phoneNumber+", "+this.emailid;
    }
}
