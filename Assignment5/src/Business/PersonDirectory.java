/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kavyaprakash
 */
public class PersonDirectory {

    ArrayList<Person> personList;
    String firstname;
    String lastname;
    
    public PersonDirectory() {

        personList = new ArrayList<Person>();
    }

    public Person newPerson(){
        Person p = new Person();
        
        return p;
                }
    
    public Person findPersonByLastName(String lastname)
    {
       for( Person p : personList){
           if(p.getLastName().equalsIgnoreCase(lastname)){
               return p;
           }
           else{
               JOptionPane.showMessageDialog(null,"Person not found");
           }
       }
       return null;    
    }
    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

}
