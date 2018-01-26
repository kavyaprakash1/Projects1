/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MarketOfferConfiguration;

import Business.*;
import java.util.ArrayList;

/**
 *
 * @author kavyaprakash
 */
public class MarketOfferInitialization {

    private static MarketOfferCatalog marketOfferCatalog;
    private static ArrayList<MarketOffer> marketofferList;
//    private static SupplierDirectory supplierDirectory;
    private static Market market;
    private static ProductCatalog supplier1ProductCatalog;
    private static ProductCatalog supplier2ProductCatalog;

    public static MarketOfferCatalog InitializeMarketOffer(SupplierDirectory supplierDirectory) {
        marketOfferCatalog = new MarketOfferCatalog();
//        marketofferList = marketOfferCatalog.getMarketOfferList();

        supplier1ProductCatalog = supplierDirectory.getSupplierlist().get(0).getProductCatalog();

        supplier2ProductCatalog = supplierDirectory.getSupplierlist().get(1).getProductCatalog();
        //Initialize first marketOffer of supplier1 product1 marketStudent
        MarketOffer marketOffer1 = marketOfferCatalog.newMarketOffer();

        marketOffer1.setProduct(supplier1ProductCatalog.getProductList().get(0));
        marketOffer1.setMarket(Market.MarketType.STUDENT);
        marketOffer1.setCeilingPrice(7000);
        marketOffer1.setTargetPrice(5000);
        marketOffer1.setFloorPrice(3000);

        marketOfferCatalog.getMarketOfferList().add(marketOffer1);
        //Initialize second marketOfferof supplier1 product 1 marketBusiness

        MarketOffer marketOffer2 = marketOfferCatalog.newMarketOffer();

        marketOffer2.setProduct(supplier1ProductCatalog.getProductList().get(0));
        marketOffer2.setMarket((Market.MarketType.BUSINESS));
        marketOffer2.setCeilingPrice(1000);
        marketOffer2.setTargetPrice(8000);
        marketOffer2.setFloorPrice(7000);

        marketOfferCatalog.getMarketOfferList().add(marketOffer2);

        //Initialize first marketOffer of supplier1 product2 marketStudent
        MarketOffer marketOffer3 = marketOfferCatalog.newMarketOffer();

        marketOffer3.setProduct(supplier1ProductCatalog.getProductList().get(1));
        marketOffer3.setMarket((Market.MarketType.STUDENT));
        marketOffer3.setCeilingPrice(6000);
        marketOffer3.setTargetPrice(5000);
        marketOffer3.setFloorPrice(3000);
        marketOfferCatalog.getMarketOfferList().add(marketOffer3);
        //Initialize first marketOffer of supplier1 product2 marketBusiness
        MarketOffer marketOffer4 = marketOfferCatalog.newMarketOffer();

        marketOffer4.setProduct(supplier1ProductCatalog.getProductList().get(1));
        marketOffer4.setMarket((Market.MarketType.STUDENT));
        marketOffer4.setCeilingPrice(6000);
        marketOffer4.setTargetPrice(5000);
        marketOffer4.setFloorPrice(3000);
        marketOfferCatalog.getMarketOfferList().add(marketOffer4);

        //SECOND SUPPLIER
        //Initialize first marketOffer of supplier2 product1 marketStudent
        MarketOffer marketOffer5 = marketOfferCatalog.newMarketOffer();

        marketOffer5.setProduct(supplier1ProductCatalog.getProductList().get(0));
        marketOffer5.setMarket((Market.MarketType.STUDENT));
        marketOffer5.setCeilingPrice(15000);
        marketOffer5.setTargetPrice(10000);
        marketOffer5.setFloorPrice(5000);

        marketOfferCatalog.getMarketOfferList().add(marketOffer5);
        //Initialize second marketOfferof supplier2 product 1 marketBusiness

        MarketOffer marketOffer6 = marketOfferCatalog.newMarketOffer();

        marketOffer6.setProduct(supplier2ProductCatalog.getProductList().get(0));
        marketOffer6.setMarket((Market.MarketType.STUDENT));
        marketOffer6.setCeilingPrice(20000);
        marketOffer6.setTargetPrice(15000);
        marketOffer6.setFloorPrice(13000);

        marketOfferCatalog.getMarketOfferList().add(marketOffer6);

        //Initialize first marketOffer of supplier1 product2 marketStudent
        MarketOffer marketOffer7 = marketOfferCatalog.newMarketOffer();

        marketOffer7.setProduct(supplier1ProductCatalog.getProductList().get(1));
        marketOffer7.setMarket((Market.MarketType.STUDENT));
        marketOffer7.setCeilingPrice(25000);
        marketOffer7.setTargetPrice(2000);
        marketOffer7.setFloorPrice(18000);
        marketOfferCatalog.getMarketOfferList().add(marketOffer7);
        //Initialize first marketOffer of supplier1 product2 marketBusiness
        MarketOffer marketOffer8 = marketOfferCatalog.newMarketOffer();

        marketOffer8.setProduct(supplier1ProductCatalog.getProductList().get(1));
        marketOffer8.setMarket((Market.MarketType.BUSINESS));
        marketOffer8.setCeilingPrice(7000);
        marketOffer8.setTargetPrice(5000);
        marketOffer8.setFloorPrice(3000);
        marketOfferCatalog.getMarketOfferList().add(marketOffer8);
        
        MarketOffer marketOffer9 = marketOfferCatalog.newMarketOffer();
        marketOffer9.setProduct(supplier1ProductCatalog.getProductList().get(1));
        marketOffer9.setMarket((Market.MarketType.STUDENT));
        marketOffer9.setCeilingPrice(100000);
        marketOffer9.setTargetPrice(8000);
        marketOffer9.setFloorPrice(3000);
        marketOfferCatalog.getMarketOfferList().add(marketOffer9);

        MarketOffer marketOffer10 = marketOfferCatalog.newMarketOffer();
        marketOffer10.setProduct(supplier2ProductCatalog.getProductList().get(0));
        marketOffer10.setMarket((Market.MarketType.BUSINESS));
        marketOffer10.setCeilingPrice(6000);
        marketOffer10.setTargetPrice(5000);
        marketOffer10.setFloorPrice(3000);
        marketOfferCatalog.getMarketOfferList().add(marketOffer10);

        MarketOffer marketOffer11 = marketOfferCatalog.newMarketOffer();
        marketOffer11.setProduct(supplier1ProductCatalog.getProductList().get(1));
        marketOffer11.setMarket((Market.MarketType.BUSINESS));
        marketOffer11.setCeilingPrice(5000);
        marketOffer11.setTargetPrice(3000);
        marketOffer11.setFloorPrice(2000);
        marketOfferCatalog.getMarketOfferList().add(marketOffer11);
        
        MarketOffer marketOffer12 = marketOfferCatalog.newMarketOffer();
        marketOffer12.setProduct(supplier2ProductCatalog.getProductList().get(2));
        marketOffer12.setMarket((Market.MarketType.BUSINESS));
        marketOffer12.setCeilingPrice(35000);
        marketOffer12.setTargetPrice(3000);
        marketOffer12.setFloorPrice(2000);
        marketOfferCatalog.getMarketOfferList().add(marketOffer12);

        //new MO
        
        MarketOffer marketOffer13 = marketOfferCatalog.newMarketOffer();
        marketOffer13.setProduct(supplier2ProductCatalog.getProductList().get(0));
        marketOffer13.setMarket((Market.MarketType.STUDENT));
        marketOffer13.setCeilingPrice(75000);
        marketOffer13.setTargetPrice(5000);
        marketOffer13.setFloorPrice(3000);
        marketOfferCatalog.getMarketOfferList().add(marketOffer13);
        
        MarketOffer marketOffer14 = marketOfferCatalog.newMarketOffer();
        marketOffer14.setProduct(supplier2ProductCatalog.getProductList().get(1));
        marketOffer14.setMarket((Market.MarketType.STUDENT));
        marketOffer14.setCeilingPrice(8000);
        marketOffer14.setTargetPrice(5000);
        marketOffer14.setFloorPrice(4000);
        marketOfferCatalog.getMarketOfferList().add(marketOffer14);
        
        MarketOffer marketOffer15 = marketOfferCatalog.newMarketOffer();
        marketOffer15.setProduct(supplier2ProductCatalog.getProductList().get(2));
        marketOffer15.setMarket((Market.MarketType.STUDENT));
        marketOffer15.setCeilingPrice(35000);
        marketOffer15.setTargetPrice(3000);
        marketOffer15.setFloorPrice(2000);
        marketOfferCatalog.getMarketOfferList().add(marketOffer15);

        return marketOfferCatalog;
    }



}
