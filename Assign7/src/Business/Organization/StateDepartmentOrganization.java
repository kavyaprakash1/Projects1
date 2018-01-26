/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.StateDepartmentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class StateDepartmentOrganization extends Organization{

    public StateDepartmentOrganization() {
        super(Organization.Type.StateDepartmentOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new StateDepartmentRole());
        return roles;
    }
     
}