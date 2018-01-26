/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelagency;

import java.util.ArrayList;


/**
 *
 * @author kavyaprakash
 */
public class TravelAgency {
    
    ArrayList<Person> customerDirectory = new ArrayList<Person>();
    ArrayList<Airliners> airlinerDirectory = new ArrayList<Airliners>();
    
     
    



int seatPrice=500;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TravelAgency taobj;
        
    }
    
     /*public void bookSeat(int[][] seatList){
        
        int seatNum = flight.findEmptySeat(seatList);// Find empty seat and return the seat number
       
        if seatList[][]==seatList.length{
            System.out.println("All the seats are booked");
            
        }
        else {
            String name=person.getFirstName();
            System.out.println(name + "has been assigned seat " + seatNum);
        }
        
    
        
        
    }*/

    public TravelAgency() {
        for(int i=0; i < customerDirectory.size(); i ++){
            customerDirectory.add("Person" +i);
        }
    }
    
    
        public int revenuePerFlight(int serialNumber,int bookedSeats){
        int flightSerialNumber = this.flight.getSeatNumber();
        
        int revenuePerFlight = bookedSeats*seatPrice;
        return(revenuePerFlight);
    }
    
    public int revenuePerAirliner(){
      
        
       
    }

    public int revenueTotal(){
        
    }
 }


