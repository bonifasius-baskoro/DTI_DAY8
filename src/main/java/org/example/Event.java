
package org.example;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

public class Event {
    private final String eventName;
    private final String eventID;
    private  int availabeTicket;
    private final int ticketCapacity;
    private final double price;
    private HashSet<String> bookingList;


    public String getEventName() {
        return eventName;
    }

    public Event(String eventName, int availabeTicket, double price) {
        this.eventName = eventName;
        this.eventID = RandomStringUtils.randomAlphabetic(3).toUpperCase();
        this.availabeTicket = availabeTicket;
        this.bookingList = new HashSet<>();
        this.ticketCapacity = availabeTicket;
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public boolean checkAvailableTicket(){
        if(availabeTicket!=0){
            return true;
        }
        return false;
    }

    public Ticket  bookTicket(String userName ){
        if( this.availabeTicket == 0){
            System.out.println("Ticket sold out!");
        }
        else{
            String ticketID = this.eventID+Integer.toString(this.ticketCapacity-this.availabeTicket) ;
            this.availabeTicket -=1;
            if(!this.bookingList.add(ticketID)){
                System.out.println("This Ticket ID already booked");
                return null;
            }
            else{
                this.bookingList.add(ticketID);
            }

            Ticket newTicket = new Ticket(ticketID,this.eventID,userName,this.eventName);
            System.out.println("Hi "+ userName + " your ticket for "+ this.eventName+ " is confirmed with this ID: "+ticketID);
            return newTicket;
        }
        return null;
    }
}
