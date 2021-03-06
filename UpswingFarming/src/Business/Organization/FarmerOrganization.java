/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.FarmerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kavyaprakash
 */
public class FarmerOrganization extends Organization {

   public FarmerOrganization() {
        super(Type.Farmer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FarmerRole());
        return roles;
    }
}
