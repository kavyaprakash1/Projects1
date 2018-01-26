/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author kavyaprakash
 */
public class MasterTravelScheduler {

    ArrayList<Airliner> masterTravelList;

    public MasterTravelScheduler() {

        masterTravelList = new ArrayList<Airliner>();
        // To populate master travel list add airplane objects create an object of airliner

        Airliner airIndia = new Airliner("AirIndia");
        Airliner luftansa = new Airliner("Luftansa");
        masterTravelList.add(airIndia);
        masterTravelList.add(luftansa);

    }

    public void deleteAirliner(Airliner ar) {
        masterTravelList.remove(ar);
    }

    public Airliner addAirliner(Airliner newAirliner) {

        masterTravelList.add(newAirliner);
        return newAirliner;
    }

    public ArrayList<Flight> searchFlightsByCustomerAirIndia(String searchInputDeparture, String searchInputDestination) {
        ArrayList<Flight> flightsSearchAirIndia = new ArrayList<Flight>();
        for (Flight flight : masterTravelList.get(0).getAirIndiaFlightSchedule().getFlightListAirIndia()) {
            if (flight.getDeparture().equalsIgnoreCase(searchInputDeparture) && flight.getDestination().equalsIgnoreCase(searchInputDestination)) {
                flightsSearchAirIndia.add(flight);

            }
        }

        return flightsSearchAirIndia;
    }
    
    public ArrayList<Flight> searchFlightsByCustomerLuftansa(String searchInputDeparture, String searchInputDestination) {
        ArrayList<Flight> flightsSearchLuftansa = new ArrayList<Flight>();
        for (Flight flight : masterTravelList.get(1).getLuftansaFlightSchedule().getFlightListLuftansa()) {
            if (flight.getDeparture().equalsIgnoreCase(searchInputDeparture) && flight.getDestination().equalsIgnoreCase(searchInputDestination)) {
                flightsSearchLuftansa.add(flight);

            }
        }

        return flightsSearchLuftansa;
    }

    public ArrayList<Airliner> getMasterTravelList() {
        return masterTravelList;
    }

    public void setMasterTravelList(ArrayList<Airliner> masterTravelList) {
        this.masterTravelList = masterTravelList;
    }

}
