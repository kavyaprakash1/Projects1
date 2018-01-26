/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kavyaprakash
 */

public class AirlinerT {

    FlightScheduleT flightScheduleT ;
    FleetCatalogT fleetCatalogT;
    
    public AirlinerT() {
        
        //To access flightlist we are creating an object of flightScgeduleT
        flightScheduleT = new FlightScheduleT();
        
        //To access fleet catalog we are creating an object of FleetCatalog
        fleetCatalogT = new FleetCatalogT();
        
       
    }
    
    public AirlinerT(AirlinerT test) {
         flightScheduleT = new FlightScheduleT();
        
        //To access fleet catalog we are creating an object of FleetCatalog
        fleetCatalogT = new FleetCatalogT();
        
        this.flightScheduleT = flightScheduleT;
        this.fleetCatalogT = fleetCatalogT;
    }

    public FlightScheduleT getFlightScheduleT() {
        return flightScheduleT;
    }

    public void setFlightScheduleT(FlightScheduleT flightScheduleT) {
        this.flightScheduleT = flightScheduleT;
    }

    public FleetCatalogT getFleetCatalogT() {
        return fleetCatalogT;
    }

    public void setFleetCatalogT(FleetCatalogT fleetCatalogT) {
        this.fleetCatalogT = fleetCatalogT;
    }
     
        
    
    
    
    
    }
    

    
        
        // To access the flightlist use : flightScheduleT.flightList;
        //To access fleetCatalog use : 
        
        
        
        
        
    
    







