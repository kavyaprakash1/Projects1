/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
*
* @author incha
*/
public class CustomerDirectory {

   private ArrayList<Customer> customerList;

   public CustomerDirectory() {
       customerList = new ArrayList<Customer>();

   }

   public Customer newCustomer(){
       Customer newCustomer = new Customer();
       return newCustomer;
   }
   public ArrayList<Customer> getCustomerList() {
       return customerList;
   }

   public void setCustomerList(ArrayList<Customer> customerList) {
       this.customerList = customerList;
   }
}
