package com.project;
import java.time.LocalDateTime;

public class TouristTicket extends  Ticket{

    private String hotelAddress;
    private String[] touristLocation;

    public TouristTicket(String pnr, String from, String to, String departureDateTime,
                         String arrivalDateTime, String seatNo, float price, boolean cancelled,
                         Flight flight, Passenger passenger, String hotelAddress,
                         String[] selectedTouristLocation) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flight, passenger);
        this.hotelAddress = hotelAddress;
        this.touristLocation = selectedTouristLocation;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return touristLocation;
    }

    public void setTouristLocation(String[] selectedTouristLocation) {
        this.touristLocation = selectedTouristLocation;
    }

    public void removeTouristLocation(String location) {
        int point=0;
        for (int i=0; i<touristLocation.length; i++) {
            if (touristLocation[i].equals(location)) {
                point = i;
                break;
            }
        }
        if (point == 0) {
            return;
        }
        for (int j = point; j< touristLocation.length-1; j++) {
            touristLocation[j] = touristLocation[j+1];
        }
        touristLocation[touristLocation.length-1] = null;
    }

    public void addTouristLocation(String newLocation) {
        int point = -1;
        for (int i=0; i< touristLocation.length; i++) {
            if (touristLocation[i] == null) {
                point = i;
                break;
            }
        }
        if (point != -1) {
            touristLocation[point] = newLocation;
        }
    }
}
