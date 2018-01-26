
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kavyaprakash
 */

//This class will have a group of Airliners 

public class MasterTravelScheduler {

    ArrayList<AirlinerT> masterTravelList ;
    
    
    public MasterTravelScheduler() {
       
        masterTravelList = new ArrayList<AirlinerT>();
        // To populate master travel list add airplane objects create an object of airliner
        
        AirlinerT test = new AirlinerT();
        AirlinerT sch1 = new AirlinerT(test);
        masterTravelList.add(sch1);
        
        
    }

    public ArrayList<AirlinerT> getMasterTravelList() {
        return masterTravelList;
    }

    public void setMasterTravelList(ArrayList<AirlinerT> masterTravelList) {
        this.masterTravelList = masterTravelList;
    }
    
}
