/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author kavyaprakash
 */
public class Flight {

   
    String serialNumber;
    String date;
    String timeOfDay;
    String departure;
    String destination;
    ArrayList<Seat> allSeatsOfAFlight;

    
    
  public Flight() {
    }


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String TimeOfDay) {
        this.timeOfDay = TimeOfDay;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public ArrayList<Seat> getAllSeatsOfAFlight() {
        return allSeatsOfAFlight;
    }

    public void setAllSeatsOfAFlight(ArrayList<Seat> allSeatsOfAFlight) {
        this.allSeatsOfAFlight = allSeatsOfAFlight;
    }
    
    @Override
    public String toString() {
        return serialNumber;
    }
}
