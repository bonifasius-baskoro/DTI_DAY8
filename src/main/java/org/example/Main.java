package org.example;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    /**
     * Write a Java Program using OOP about simple ticketing system for an event.
     * <p>
     * Feature Acceptance Criteria:
     * - Ticket Creation: The system should allow for the creation of a new ticket with a unique identifier, event name, and price.
     * - Ticket Booking: Users should be able to book a ticket by selecting an event and providing their details.
     * - Ticket Validation: The system should check if the ticket is still available for booking.
     * - Ticket Confirmation: After booking, the system should issue a confirmation ticket to the user.
     * <p>
     * OOP Concept-wise Acceptance Criteria:
     * - Classes and Objects: The system should define a Ticket class that serves as a blueprint for creating ticket objects. Each ticket object should represent a unique ticket for an event.
     * - Encapsulation: The Ticket class should encapsulate the ticket details (e.g., ticket ID, event name, price) by making them private and providing public getter and setter methods to access and modify these details.
     * - Static Keyword: The Ticket class should use a static field to keep track of the total number of tickets sold, demonstrating the use of static variables.
     * - Interface Implementation (Optional): Ticket class could implement an interface (e.g., Ticketable) that defines methods for printing ticket details, ensuring that all ticket types adhere to a common contract.
     * <p>
     * Start your project from the main method below ;) have fun!
     */
    public static void main(String[] args) {

        Event konserBMTH = new Event("Konser BMTH", 3, 250000);

        System.out.println(konserBMTH.checkAvailableTicket());

        for (int i = 0; i < 5; i++) {
            User user = new User("Ayam" + StringUtil.generateName());
            try {
                user.saveTicket(konserBMTH.bookTicket(user.getName()));
            } catch (NullPointerException e) {
                System.out.println("Hi " + user.getName() + " Ticket is sold can't buy the ticket for" + konserBMTH.getEventName());
            }
            user.printListTicket();

        }
    }
}