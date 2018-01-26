
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kavyaprakash
 */
// public static void main(String[] args){
public class TravelAgencyT {

    MasterTravelScheduler mts;
    CustomerDirectory cd;
     
    static int seatPrice = 500;
    int airlinerRevenue;
    int flightRevenue;
    int totalRevenue;

    public static void revenuePerFlight() {
        int flightSerialNumber = 0;
        System.out.println("Enter the flight serial number");
        Scanner userInput = new Scanner(System.in);
        boolean found = false;
        try{
        flightSerialNumber = userInput.nextInt();
        FlightScheduleT listOfFlights = new FlightScheduleT();
        for (FlightT ft : listOfFlights.flightList) {
            
           
                
            if (ft.getSerialNumber().equalsIgnoreCase(String.valueOf(flightSerialNumber))) {
                 
                int numberOfSeatsBooked = Integer.parseInt(ft.getBookedSeats());
                int revenueOfFlight = numberOfSeatsBooked * seatPrice;

                System.out.println("The revenue of the Flight is" + revenueOfFlight);
                found = true;
                break;
                 }
            
           }
            }
        catch(NumberFormatException e){
               System.out.println("Invalid value in file");
        }
        catch(InputMismatchException e){
             System.out.println("Please enter a number");

        }
        if (!found) {
            System.out.println("Flight not found");

        }
    }

    public static void revenuePerAirliner() {
        //AirlinerT airliner = new AirlinerT();
        int bookedSeats = 0;
        String airlinerName = "";
        System.out.println("Enter the Airliner name");
        Scanner usersInput = new Scanner(System.in);
        airlinerName = usersInput.nextLine();
        
        
        MasterTravelScheduler masterList = new MasterTravelScheduler();
        AirlinerT ar1 = masterList.getMasterTravelList().get(0);
        ArrayList<FlightT> al = ar1.flightScheduleT.getFlightList();

        try {
            boolean found = false;
            for (FlightT fft : al) {
                if (fft.getAirliner().equalsIgnoreCase(airlinerName)) {
                    int revenuePerAirliner = seatPrice * Integer.parseInt(fft.getBookedSeats());
                    found = true;
                    System.out.println("The revenue of " + airlinerName + " is " + revenuePerAirliner);
                    break;
                }

            }
            if (!found) {
                System.out.println("Airliner not found");
            }
        } catch (Exception e) {
            System.out.println("Invalid input from file");
        }

    }

    public static void totalRevenue() {
        int bookedSeats = 0;

        MasterTravelScheduler masterList = new MasterTravelScheduler();
        AirlinerT ar2 = masterList.getMasterTravelList().get(0);
        ArrayList<FlightT> al = ar2.flightScheduleT.getFlightList();
        for (FlightT fft : al) {
            bookedSeats += Integer.parseInt(fft.getBookedSeats());
        }

        int totalRevenue = bookedSeats * seatPrice;
        System.out.println("Total revenue is " + totalRevenue);
    }
    
    public static void customerDetails(){
        
        CustomerDirectory cdd = new CustomerDirectory();
         ArrayList<Person> persons = cdd.getPersonList();
         for(Person p : persons){
                    
                    String seatsAssigned = p.getSeatassigned();
                    String personDetails = p.getFirstName();
                    String FlightNumber = p.getFlightSerialNumber();
                    
                System.out.println("The Person name:" + personDetails + "; Flight number:" +FlightNumber +"; and seat assigned: " +seatsAssigned);
                    
         }
        
    }

    public TravelAgencyT() {

        mts = new MasterTravelScheduler();
        ArrayList<AirlinerT> l = mts.masterTravelList;
        cd = new CustomerDirectory();
        
    }

    public static void main(String[] args) {
        
        
        // TODO code application logic here
      
        //CustomerDirectory test1 = new CustomerDirectory();
        //System.out.println(test1.personList);
        //TravelAgencyT taobj;
        System.out.println("\tChoose an option");
        System.out.println("1. Get revenue per flight");
        System.out.println("2. Get revenue per Airliner");
        System.out.println("3. Get total revenue");
        System.out.println("4. Get Customer Details");

        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        if (userInput == 1) {
            revenuePerFlight();

        } else if (userInput == 2) {
            revenuePerAirliner();
        } else if (userInput == 3) {
            totalRevenue();
        } else if (userInput == 4) {
            customerDetails();
        }
        

    }

    //setters and getters 
    public MasterTravelScheduler getMts() {
        return mts;
    }

    public void setMts(MasterTravelScheduler mts) {
        this.mts = mts;
    }
}
