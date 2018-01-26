/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kavyaprakash
 */
public class AirplaneT {
     
  String modelNumber;
  String manufacturer;
  String airlinerName; 
  
    public AirplaneT() {
    }
    
  

    public AirplaneT(String[] airplane) {
        this.airlinerName = airlinerName;
        this.manufacturer = manufacturer;
        this.modelNumber = modelNumber;
        
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }
    
}
