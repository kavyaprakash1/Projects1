/*
                     * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CustomerConfiguration;

import Business.*;
import java.util.ArrayList;
/**
 *
 * @author kavyaprakash
 */
public class CustomerInitialization {
    
    public static CustomerDirectory customerDirectory;
    public static  ArrayList<Customer> customerList;
    private static Market market;
    
    public static CustomerDirectory InitializeCustomer(){
        customerDirectory = new CustomerDirectory();
        customerList = customerDirectory.getCustomerList();
        
        Customer c1 = customerDirectory.newCustomer();
        
        c1.setCustomerName("Inchara");
        c1.setUsername("inchara");
        c1.setPassword("123");
        
        
        c1.setMarket(Market.MarketType.STUDENT);
        
        Customer c2 = customerDirectory.newCustomer();
        
        c2.setCustomerName("Kavya");
        c2.setUsername("kavya");
        c2.setPassword("123");
        c2.setMarket(Market.MarketType.BUSINESS);
        customerList.add(c1);
        customerList.add(c2);
        
        return customerDirectory;
    }
    
    
}
