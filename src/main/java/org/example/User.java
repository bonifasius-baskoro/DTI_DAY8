package org.example;



import java.util.*;

import static java.util.Map.*;

public class User {
    private final String name;
    private final String userID;
    private Ticket ticket;
    private HashMap<String,Ticket> ticketList = new HashMap<>() {
    };
    public User(String name) {
        UUID uuid = UUID.randomUUID();
        this.userID = uuid.toString();
        this.name = name;
        this.ticketList =new HashMap<>();
    }

    public void saveTicket(Ticket ticket) {
        this.ticketList.put(ticket.getEventID(),ticket);
    }


    public String getUserID() {
        return userID;
    }

    public Ticket getTicket(String eventId) {
        return this.ticketList.get(eventId);
    }

    public void printListTicket(){
        for(Map.Entry<String, Ticket>ticket : this.ticketList.entrySet()){
            String eventId =  ticket.getKey();
            String ticketID = ticket.getValue().getTicketID();
            System.out.println("You have ticket for " + eventId);
        }
    }
    public String getName() {
        return name;
    }
}

