/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

//imports for reading csv file
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths;  
import java.util.List;



/**
 *
 * @author kavyaprakash
 */
public class FleetCatalog {
    
    public ArrayList<Airplanes> fleetCatalog; 
    String filename="src/input.csv";
    
    public FleetCatalog()
    {
        
        fleetCatalog = new ArrayList<Airplanes>();
        Path pathToFile = Paths.get(filename);
        //try catch block while reading from csv file
   
        try(BufferedReader br=Files.newBufferedReader(pathToFile))
        { 
          String line=br.readLine();
          //To skip heading
          line=br.readLine();
          
          
          while(line!=null){
              String[] airplane = line.split(",");
              Airplanes flight=new Airplanes(airplane);
              //System.out.println(obj1.airport);
              fleetCatalog.add(flight);
              line = br.readLine();
              
          }
            
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
            //return fleetCatalog;
    }
        
     
    
      
    }

    public ArrayList<Airplanes> getFleetCatalog() {
        return fleetCatalog;
    }

    public class csvReader{
        
    
}
   
  
}

    

