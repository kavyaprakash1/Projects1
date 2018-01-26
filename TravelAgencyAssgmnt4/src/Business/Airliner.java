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
public class Airliner {
    
    String airlinerName;

    
    FlightSchedule LuftansaFlightSchedule; 
    FlightSchedule AirIndiaFlightSchedule;
    
    
    
        public Airliner(String airlinerName) {
        LuftansaFlightSchedule = new FlightSchedule();
        AirIndiaFlightSchedule = new FlightSchedule();
        this.airlinerName = airlinerName;
    }
    
    

    
      /*  public Airliner(Airliner ar) {
        this.BoeingFlightSchedule = BoeingFlightSchedule;
        this.AirIndiaFlightSchedule = AirIndiaFlightSchedule;
        
    }*/
    
   

    public FlightSchedule getLuftansaFlightSchedule() {
        return LuftansaFlightSchedule;
    }

    public void setLuftansaFlightSchedule(FlightSchedule BoeingFlightSchedule) {
        this.LuftansaFlightSchedule = BoeingFlightSchedule;
    }

    public FlightSchedule getAirIndiaFlightSchedule() {
        return AirIndiaFlightSchedule;
    }

    public void setAirIndiaFlightSchedule(FlightSchedule AirIndiaFlightSchedule) {
        this.AirIndiaFlightSchedule = AirIndiaFlightSchedule;
    }
    
    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    @Override
    public String toString() {
        return airlinerName;
    }

    
    

    
}

