/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Market;
import Business.Market.MarketType;

/**
 *
 * @author Kavya
 */
public class Customer {

    private String customerName;
    private int customerId;
    private String username;
    private String password;
//    private MasterOrderCatalog masterOrderCatalog;
    private MarketType market;
    static int c=0;

    public Customer() {
        c++;
        this.customerId=c;

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public MarketType getMarket() {
        return market;
    }

    public void setMarket(MarketType market) {
        this.market = market;
    }

    @Override
    public String toString() {
        return customerName;
    }
}
