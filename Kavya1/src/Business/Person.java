/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author kavya
 */
public class Person {
    private String firstname;
    private String lastname;
    private LicenseData licenseData;
    private FinancialAccounts financialAccount;
    private CreditCard creditCard;
    private Address address;
    private String imagePath;

    
    public Person(){
    }
    
    public Person(String firstname, String lastname, LicenseData licenseData, 
            FinancialAccounts financialAccount,CreditCard creditCard, Address address){
        this.firstname = firstname;
        this.lastname = lastname;
        this.licenseData = licenseData;
        this.financialAccount = financialAccount;

        this.creditCard = creditCard;
        this.address = address;
    }

     public LicenseData getLicenseData(){
        return this.licenseData;
    }
     
    public void setLicenseData(LicenseData licenseData) {
        this.licenseData = licenseData;
    }

    public FinancialAccounts getFinancialAccount(){
        return this.financialAccount;
    }
    
    
    public void setFinancialAccounts(FinancialAccounts financialAccount) {
        this.financialAccount = financialAccount;
    }

     public CreditCard getCreditCard(){
        return this.creditCard;
    }
    
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
    
    
    public Address getAddress(){
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
   
    
   
   
    
    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    public String getImagePath() {
        return imagePath;
    }
    
}
