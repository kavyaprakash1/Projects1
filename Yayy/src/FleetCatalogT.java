/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kavyaprakash
 */

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 

public class FleetCatalogT {
    public ArrayList<AirplaneT> fleetcatalog;

    public FleetCatalogT() {
        fleetcatalog = new ArrayList<AirplaneT>();
        String fileAirplanes = "src/fileAirplanes.csv";
        
        //To populate the Arraylist 
        Path pathToFile = Paths.get(fileAirplanes);
     
     try(BufferedReader br=Files.newBufferedReader(pathToFile))
        { 
          String line=br.readLine();
          //To skip heading
          line=br.readLine();
          
          
          while(line!=null){
              String[] airplaneT = line.split(",");
              AirplaneT arp = new AirplaneT(airplaneT);
              //System.out.println(obj1.airport);
              fleetcatalog.add(arp);
              line = br.readLine();
              
          }
            
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
            
    }
    }
    
}
