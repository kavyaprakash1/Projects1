
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kavyaprakash
 */
public class FlightScheduleT {
    public ArrayList<FlightT> flightList;
    String fileFlights = "src/fileFlights.csv";
    
    public FlightScheduleT() {
        flightList = new ArrayList<FlightT>();
        //To populate the arraylist
        
        Path pathToFile = Paths.get(fileFlights);
        
        try(BufferedReader br=Files.newBufferedReader(pathToFile))
        { 
          String line=br.readLine();
          //To skip heading
          line=br.readLine();
          
          
          while(line!=null){
              String[] flightT = line.split(",");
              FlightT fl=new FlightT(flightT);
              //System.out.println(obj1.airport);
              flightList.add(fl);
              line = br.readLine();
              
          }
            
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
            //return fleetCatalog;
    }
        
    }

    public ArrayList<FlightT> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<FlightT> flightList) {
        this.flightList = flightList;
    }
    
}
