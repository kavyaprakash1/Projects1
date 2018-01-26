/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class BEnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public BEnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Provider){
            enterprise = new BProvider(name);
            enterpriseList.add(enterprise);
        }
        
       if (type == Enterprise.EnterpriseType.CDC){
            enterprise = new BCDC(name);
            enterpriseList.add(enterprise);
        }
       
       if (type == Enterprise.EnterpriseType.StateDepartment){
            enterprise = new BStateDepartment(name);
            enterpriseList.add(enterprise);
        }
       
       
       if (type == Enterprise.EnterpriseType.Clinics){
            enterprise = new BClinics(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    
}
