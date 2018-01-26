/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BusinessConfiguration;

import Business.Account;
import Business.AccountDirectory;
import Business.Business;
import Business.Person;
import Business.PersonDirectory;

/**
 *
 * @author kavyaprakash
 */
public class ConfigureABusiness {

    public static Business Initialize(String n) {
        Business business = new Business(n);
        PersonDirectory pd = business.getPersonDirectory();

        Person p1 = pd.newPerson();
        p1.setFirstName("Kavya");
        p1.setLastName("Prakash");
        pd.getPersonList().add(p1);

        AccountDirectory uad = business.getUserAccountDirectory();

        Account a1 = uad.newAccount();
        a1.setPerson(p1);
        a1.setUserName("kavya.prakash");
        a1.setPassword("123");
        a1.setRole("System");
        a1.setUserId("1");
        a1.setStatus("Active");

        uad.getAccountList().add(a1);

        Person p2 = pd.newPerson();
        p2.setFirstName("Mithali");
        p2.setLastName("Raj");
        pd.getPersonList().add(p2);

        Account a2 = uad.newAccount();
        a2.setPerson(p2);
        a2.setUserName("mithali.raj");
        a2.setPassword("456");
        a2.setRole("HR");
        a2.setUserId("2");
        a2.setStatus("Active");

        uad.getAccountList().add(a2);

//        Person p3 = pd.newPerson();
//        p3.setFirstName("Sania");
//        p3.setLastName("Mirza");
//        pd.getPersonList().add(p3);
//        
//        Account a3 = uad.newAccount();
//        a3.setPerson(p3);
//        a3.setUserName("mirza.sania");
//        a3.setPassword("456");
//        a3.setRole("HR");
//        a3.setUserId("7");
//        a3.setStatus("Active");
//        uad.getAccountList().add(a3);
        return business;
    }
}
