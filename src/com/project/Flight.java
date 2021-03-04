package com.project;

public class Flight {

    private String flightNumber;
    private String airline;
    private int capacity;
    private int seatsBooked;

    public Flight (String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.seatsBooked = bookedSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return seatsBooked;
    }

    public void setBookedSeats(int bookedSeats) {
        this.seatsBooked = bookedSeats;
    }

    public String getFlightDetails() {
        return "Flight No: " + flightNumber + ", Airline: " + airline +
                ", Capacity: " + capacity + ", Booked Seats: " + seatsBooked;
    }

    public boolean checkAvailability() {
        return seatsBooked < capacity;
    }

    public void incrementBookingCounter() {
        seatsBooked++;
    }

}
