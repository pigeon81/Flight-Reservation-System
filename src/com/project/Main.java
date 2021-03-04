package com.project;

public class Main {
    public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket("8y8803", "Bhopal",
                "Delhi", "DepartureDateTime", "ArrivalDateTime",
                "1E", 3000, false, null, null, "Breakfast");

        Ticket touristTicket = new TouristTicket("67790", "India", "Bali",
                "DepartureDateTime", "ArrivalDateTIme",
                "11B", 12000, false, null, null,
                "Bali", new String[]{""});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }
}
