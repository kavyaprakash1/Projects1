///*
 //* To change this license header, choose License Headers in Project Properties.
 //* To change this template file, choose Tools | Templates
// * and open the template in the editor.
 //*/
package Business;

import java.util.Date;

/**
 *
 * @author kavyaprakash
 */
public class Airplanes {
    
String serialNumber;
String modelNumber;
String numberOfSeats;
String availableSeats;
String airliner;
String manufacturer;
String takeOffTime;
String airport;
String maintainanceCertificateDate;
String yearManufactured;

    public String getYearManufactured() {
        return yearManufactured;
    }

    public void setYearManufactured(String yearManufactured) {
        this.yearManufactured = yearManufactured;
    }

public Airplanes()
{
    
}

public Airplanes(String[] airplanes)
{
    
    this.serialNumber= airplanes[0];
    this.modelNumber= airplanes[1];
    this.availableSeats= airplanes[2];
    this.numberOfSeats= airplanes[3];
    this.airliner=airplanes[4];
    this.manufacturer=airplanes[5];
    this.takeOffTime=airplanes[6];
    this.airport=airplanes[7];
    this.maintainanceCertificateDate=airplanes[8];
    this.yearManufactured=airplanes[9];
    
}

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(String availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String airliner) {
        this.airliner = airliner;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getTakeOffTime() {
        return takeOffTime;
    }

    public void setTakeOffTime(String takeOffTime) {
        this.takeOffTime = takeOffTime;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getMaintainanceCertificateDate() {
        return maintainanceCertificateDate;
    }

    public void setMaintainanceCertificateDate(String maintainanceCertificateDate) {
        this.maintainanceCertificateDate = maintainanceCertificateDate;
    }

    
    @Override
public String toString()
{
return this.serialNumber;
}
}



