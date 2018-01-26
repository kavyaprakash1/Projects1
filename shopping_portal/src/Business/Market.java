/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author kavyaprakash
 */
public class Market {

   public enum MarketType {
        STUDENT, BUSINESS,HOSPITAL;
    }
    MarketType MarketType;
 
    public Market(MarketType MarketType) {
        this.MarketType = MarketType;
    }
 
    public MarketType getMarketType() {
        return MarketType;
    }
 
    public void setMarketType(MarketType MarketType) {
        this.MarketType = MarketType;

    }

    

}
