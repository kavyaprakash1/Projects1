/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsuper;

/**
 *
 * @author kavyaprakash
 */
public class Person extends UserAccount {

    public String firstName;
    public String lastName;

    Person(String firstName, String lastName) {
        super("kavya.prakash", "123");
        this.firstName = firstName;
        this.lastName = lastName;

        @Override
        public String toString
        
            (){
            return 
        }
    }

}
