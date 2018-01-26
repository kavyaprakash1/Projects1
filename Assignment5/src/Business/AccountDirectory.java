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
public class AccountDirectory {

    ArrayList<Account> accountList;

    public AccountDirectory() {
        accountList = new ArrayList<Account>();
       
    }
    
    public Account newAccount(){
        Account a1 = new Account();
        return a1;
        
    }
    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }

}
