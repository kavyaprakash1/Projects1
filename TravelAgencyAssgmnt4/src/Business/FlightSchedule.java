/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author kavyaprakash
 */
public class FlightSchedule {

    ArrayList<Flight> flightListLuftansa;
    ArrayList<Flight> flightListAirIndia;

    Seat se;

    String fileLuftansaFlights = "src/fileLuftansaFlight.csv";
    String fileAirIndiaFlights = "src/fileAirIndiaFlight.csv";
    //int i = 0;

    public FlightSchedule() {
        flightListLuftansa = new ArrayList<Flight>();
        flightListAirIndia = new ArrayList<Flight>();
        ArrayList<Seat> allSeatsOfAFlight ;

        //For populating Boeing flight schedule
        Path pathToFile1 = Paths.get(fileLuftansaFlights);
        try (BufferedReader br = Files.newBufferedReader(pathToFile1)) {
            String line = br.readLine();
            //To skip heading
            line = br.readLine();
             
            while (line != null) {
                allSeatsOfAFlight = new ArrayList<>();
                 String[] flight= line.split(",");
                String[] oneSeat = flight[5].split(";");
                for (String i : oneSeat) {
                    String[] seatAttr = i.split(":");
                    se = new Seat();
                    se.seatNumber = seatAttr[0];
                    se.seatPrice = seatAttr[1];
                    se.seatAssigned = seatAttr[2];
                    allSeatsOfAFlight.add(se);

                }
            
                Flight flght = new Flight();
                flght.serialNumber = flight[0];
                flght.date = flight[1];
                flght.departure = flight[2];
                flght.destination = flight[3];
                flght.timeOfDay = flight[4];
                flght.allSeatsOfAFlight = allSeatsOfAFlight;
                
                flightListLuftansa.add(flght);
                line = br.readLine();
            }
            

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        

        //For populating Air India Air flight schedule
        
        Path pathToFile2 = Paths.get(fileAirIndiaFlights);
        try (BufferedReader br = Files.newBufferedReader(pathToFile2)) {
            String line = br.readLine();
            //To skip heading
            line = br.readLine();
            while (line != null) {
                allSeatsOfAFlight = new ArrayList<>();
               String[] flight = line.split(",");

                String[] oneSeat = flight[5].split(";");
                for (String i : oneSeat) {
                    String[] seatAttr = i.split(":");
                    se = new Seat();
                    se.seatNumber = seatAttr[0];
                    se.seatPrice = seatAttr[1];
                    se.seatAssigned = seatAttr[2];
                    allSeatsOfAFlight.add(se);

                }
            
                
                Flight flght = new Flight();
                flght.serialNumber = flight[0];
                flght.date = flight[1];
                flght.departure = flight[2];
                flght.destination = flight[3];
                flght.timeOfDay = flight[4];
                flght.allSeatsOfAFlight = allSeatsOfAFlight;
                
                flightListAirIndia.add(flght);
                line = br.readLine();
            }
            

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
            

         
    }

    public void deleteFlight(Flight flt) 
    {
        flightListAirIndia.remove(flt);
    }
    
    public ArrayList<Flight> getFlightListLuftansa() {
        return flightListLuftansa;
    }

    public void setFlightListBoeing(ArrayList<Flight> flightListBoeing) {
        this.flightListLuftansa = flightListBoeing;
    }

    public ArrayList<Flight> getFlightListAirIndia() {
        return flightListAirIndia;
    }

    public void setFlightListAirIndia(ArrayList<Flight> flightListAirIndia) {
        this.flightListAirIndia = flightListAirIndia;
    }

}
