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
public class CustomerDirectory {
    ArrayList<Customer> customerList;
    FlightSchedule flightLists;
    
    public CustomerDirectory() {
        customerList = new ArrayList<Customer>();
        flightLists = new FlightSchedule ();
    }
    

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
}
