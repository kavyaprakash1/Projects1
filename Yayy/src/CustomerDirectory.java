/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kavyaprakash
 */

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 


    public class CustomerDirectory {
    public ArrayList<Person> personList;
    String filePersons="src/filePersons.csv";
            
    public CustomerDirectory(){
     personList = new ArrayList<Person>();
     
     //To populate the customer Directory from input file
     
     Path pathToFile = Paths.get(filePersons);
     
     try(BufferedReader br=Files.newBufferedReader(pathToFile))
        { 
          String line=br.readLine();
          //To skip heading
          line=br.readLine();
          
          
          while(line!=null){
              String[] personT = line.split(",");
              Person pr = new Person(personT);
              //System.out.println(obj1.airport);
              personList.add(pr);
              line = br.readLine();
              
          }
            
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
            
    }
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
}
