/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Market.MarketType;

/**
 *
 * @author kavyaprakash
 */

public class MarketOffer {

    private int marketOfferNumber;
    private Product product;
    private MarketType market;
    private double ceilingPrice;
    private double targetPrice;
    private double floorPrice;
    private static int count;

    public MarketOffer() {
        count++;
        marketOfferNumber=count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public MarketType getMarket() {
        return market;
    }

    public void setMarket(MarketType market) {
        this.market = market;
    }

    public double getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(double ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public double getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(double targetPrice) {
        this.targetPrice = targetPrice;
    }

    public double getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(double floorPrice) {
        this.floorPrice = floorPrice;
    }

    public int getMarketOfferNumber() {
        return marketOfferNumber;
    }

    public void setMarketOfferNumber(int marketOfferNumber) {
        this.marketOfferNumber = marketOfferNumber;
    }
    
    @Override
    public String toString(){
        return String.valueOf(marketOfferNumber);
    }
    
    
    
}
