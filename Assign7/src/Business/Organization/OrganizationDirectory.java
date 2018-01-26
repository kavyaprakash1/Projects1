/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.StateDepartmentOrganization.getValue())){
            organization = new StateDepartmentOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CDCOrganization.getValue())){
            organization = new CDCOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.ClinicsOrganization.getValue())){
            organization = new ClinicsOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.DistributorOrganization.getValue())){
            organization = new DistributorOrganization();
            organizationList.add(organization);
        }
        
//        else if (type.getValue().equals(Type.ProviderOrganization.getValue())){
//            organization = new ProviderOrganization();
//            organizationList.add(organization);
//        }
        return organization;
    }
}