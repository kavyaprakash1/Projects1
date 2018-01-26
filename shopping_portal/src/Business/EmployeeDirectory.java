/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author kavyaprakash
 */
public class EmployeeDirectory {

    private ArrayList<Person> personList;

    public EmployeeDirectory() {
        personList = new ArrayList<Person>();
    }

    public Person newPerson() {
        Person newPerson = new Person();
        return newPerson;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
}
