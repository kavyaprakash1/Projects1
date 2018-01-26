/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.CustomerConfiguration.CustomerInitialization;
import Business.SupplierConfiguration.SupplierInitialization;
import Business.*;
import Business.MarketOfferConfiguration.MarketOfferInitialization;
import Business.EmployeeConfiguration.EmployeeInitialization;
import Business.Market.MarketType;

/**
 *
 * @author Kavya
 */
public class Business {

    private SupplierDirectory supplierDirectory;
    private MarketOfferCatalog marketOfferCatalog;
    private CustomerDirectory customerDirectory;
    private EmployeeDirectory employeeDirectory;
    private static double totalAmount=0;
    private static double totalCommissionGiven=0;
    private static double XeroxRevenue=0;

//    public Business business;
    public Business() {

        supplierDirectory = SupplierInitialization.InitializeSupplier();
        marketOfferCatalog = MarketOfferInitialization.InitializeMarketOffer(supplierDirectory);
        customerDirectory = CustomerInitialization.InitializeCustomer();
        employeeDirectory = EmployeeInitialization.InitializeEmployee();

    }

    public static double getTotalAmount() {
        return totalAmount;
    }

    public static void setTotalAmount(double totalAmount) {
        Business.totalAmount = totalAmount;
    }

    public static double getTotalCommissionGiven() {
        return totalCommissionGiven;
    }

    public static void setTotalCommissionGiven(double totalCommissionGiven) {
        Business.totalCommissionGiven = totalCommissionGiven;
    }

    public static double getXeroxRevenue() {
        return XeroxRevenue;
    }

    public static void setXeroxRevenue(double XeroxRevenue) {
        Business.XeroxRevenue = XeroxRevenue;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public MarketOfferCatalog getMarketOfferCatalog() {
        return marketOfferCatalog;
    }

    public void setMarketOfferCatalog(MarketOfferCatalog marketOfferCatalog) {
        this.marketOfferCatalog = marketOfferCatalog;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    
    
}
