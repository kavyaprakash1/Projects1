/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author kavyaprakash
 */
public class Customer {

    String FirstName;
    String LastName;
    String FlightBooked;
    Seat seat;

    public Customer() {
        this.FirstName= FirstName;
        this.LastName = LastName;
        this.FlightBooked = FlightBooked;
        this.seat = seat;
        
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFlightBooked() {
        return FlightBooked;
    }

    public void setFlightBooked(String FlightBooked) {
        this.FlightBooked = FlightBooked;
    }

}
