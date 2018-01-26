/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.MasterOrderCatalog;
import java.util.ArrayList;

/**
 *
 * @author kavyaprakash
 */
public class Person {


    private String personName;
    private int personId;
    private String username;
    private String password;
    private double myCommision =0;
    private int belowTargetSales =0;
    private ArrayList<Order> orderCatalog;
    static int c=10;
    

    public Person() {
        c++;
        personId=c;
        orderCatalog = new ArrayList<>();
    }

    public int getBelowTargetSales() {
        return belowTargetSales;
    }

    public void setBelowTargetSales(int belowTargetSales) {
        this.belowTargetSales = belowTargetSales;
    }


    
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }


    public ArrayList<Order> getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(ArrayList<Order> OrderCatalog) {
        this.orderCatalog = OrderCatalog;
            }
    
    public void addOrders(Order order){
        this.orderCatalog.add(order);
        
    }



    public int getPersonrId() {
        return personId;
    }

    public void setPersonrId(int personrId) {
        this.personId = personrId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public double getMyCommision() {
        return myCommision;
    }

    public void setMyCommision(double myCommision) {
        this.myCommision = myCommision;
    }


    
    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return personName;
    }

    

   
  
}
