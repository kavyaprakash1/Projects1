/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EmployeeConfiguration;

import Business.EmployeeDirectory;
import Business.*;
import Business.Market;
import java.util.ArrayList;

/**
 *
 * @author kavyaprakash
 */
public class EmployeeInitialization {
    public static EmployeeDirectory employeeDirectory;
    public static  ArrayList<Person> employeeList;
    private static Market market;
    
    public static EmployeeDirectory InitializeEmployee(){
        employeeDirectory = new EmployeeDirectory();
        employeeList = employeeDirectory.getPersonList();
        
        MasterOrderCatalog masterOrderCatalog1 =new MasterOrderCatalog();
        
        Person p1 = employeeDirectory.newPerson();
        p1.setPersonName("employee1");
        p1.setPassword("abc");
        p1.setUsername("employee1");
        
        
        employeeList.add(p1);
        MasterOrderCatalog masterOrderCatalog2 =new MasterOrderCatalog();
        Person p2 = employeeDirectory.newPerson();
        p2.setPersonName("employee2");
        p2.setPassword("abc");
        p2.setUsername("employee2");
        
        
        employeeList.add(p2);
        
        return employeeDirectory;
}
}
