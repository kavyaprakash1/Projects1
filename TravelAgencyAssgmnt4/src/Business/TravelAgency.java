/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author kavyaprakash
 */
public class TravelAgency {
    MasterTravelScheduler masterTravelScheduler;
    CustomerDirectory customerList;
    
    public TravelAgency() {
        customerList = new CustomerDirectory();
        masterTravelScheduler = new MasterTravelScheduler();
    }
    
    public MasterTravelScheduler getMasterTravelScheduler() {
        return masterTravelScheduler;
    }

    public void setMasterTravelScheduler(MasterTravelScheduler masterTravelScheduler) {
        this.masterTravelScheduler = masterTravelScheduler;
    }
    
}
