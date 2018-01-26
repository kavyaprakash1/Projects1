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
public class Seat {
    
    String seatNumber;
    String seatPrice;
    String seatAssigned;
    
    public Seat() {
        
    }
    
    public Seat(String[] seat) {
        this.seatAssigned = seat[2];
        this.seatPrice = seat[1];
        this.seatNumber = seat[0];
         
    }

    
    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(String seatPrice) {
        this.seatPrice = seatPrice;
    }

    public String getSeatAssigned() {
        return seatAssigned;
    }

    public void setSeatAssigned(String seatAssigned) {
        this.seatAssigned = seatAssigned;
    }
}
