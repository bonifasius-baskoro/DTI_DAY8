package org.example;


import java.util.UUID;

public class Ticket  {
    private final String ticketID;
    private final String eventID;
    private final String eventName;



    private final String userName;


    public Ticket(String ticketID, String eventID, String userName, String eventName) {
        this.ticketID = ticketID;
        this.eventID = eventID;
        this.userName = userName;
        this.eventName = eventName;
    }

    public String getTicketID() {
        return ticketID;
    }

    public String getEventID() {
        return eventID;
    }
}

