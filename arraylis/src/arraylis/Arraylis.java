/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylis;
import java.util.*;


/**
 *
 * @author kavyaprakash
 */
public class Arraylis {
        static Flights flight1;
        static Flights flight2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> str = new ArrayList<String>();
        
        str.add("Hi");
        str.add("Kavya");
        
        System.out.println(str);
        
        ArrayList<Flights> fltarray = new ArrayList<Flights>();
        
        fltarray.add(flight1);
        fltarray.add(flight2);
        System.out.println(fltarray);
       
        
    }
    
    public class Flights {
        
        Flights()
        {
            
        }
    }
}
