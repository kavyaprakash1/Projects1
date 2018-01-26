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
public class Flight {

    String takeoffTime;
    String Destination;
    String Airliner;
    private int[][] seatList = new int[25][6];
    private int seatPrice;
    Person person = new Person();
    
    
    public void initializeSeats(){
        for(int row=0; row < 25; row++){
            for(int column=0; column < 6 ; column++ ){
                seatList[row][column]=0;
            }
        }
    }
    
   
    
    //Find index of the first empty seat
    
    public int findEmptySeat(int[][] seatList){
        for(int row=0; row < 25; row++){
            for(int column=0; column < 6 ; column++ ){
                if (seatList[row][column]==0){
                    return seatList[row][column];
                }
            }
        }
        return 0;
    }
    
    
    public String getTakeoffTime() {
        return takeoffTime;
    }

    public void setTakeoffTime(String takeoffTime) {
        this.takeoffTime = takeoffTime;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public String getAirliner() {
        return Airliner;
    }

    public void setAirliner(String Airliner) {
        this.Airliner = Airliner;
    }

    

    
    


    
}
