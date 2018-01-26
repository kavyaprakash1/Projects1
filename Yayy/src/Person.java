/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kavyaprakash
 */
public class Person {

    String firstName;
    String lastName;
    String seatassigned;
    String flightSerialNumber;

    
    public Person() {
        
    }
    
    public Person(String[] person){
        this.firstName = person[0];
        this.lastName = person[1];
        this.seatassigned = person[2];
        this.flightSerialNumber = person[3];
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSeatassigned() {
        return seatassigned;
    }

    public void setSeatassigned(String seatassigned) {
        this.seatassigned = seatassigned;
    }
    public String getFlightSerialNumber() {
        return flightSerialNumber;
    }

    public void setFlightSerialNumber(String flightSerialNumber) {
        this.flightSerialNumber = flightSerialNumber;
    }
    
}

    
    

