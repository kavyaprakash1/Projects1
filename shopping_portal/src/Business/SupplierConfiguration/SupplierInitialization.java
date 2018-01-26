/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierConfiguration;

import Business.*;
import java.util.ArrayList;

/**
 *
 * @author kavyaprakash
 */
public class SupplierInitialization {

    private static SupplierDirectory supplierDirectory;
    private static ArrayList<Supplier> supplierList;

    public static SupplierDirectory InitializeSupplier() {

        supplierDirectory = new SupplierDirectory();
        supplierList = supplierDirectory.getSupplierlist();

        Supplier s1 = supplierDirectory.newSupplier();
        s1.setSupplyName("supplier1");
        Product product1 = s1.getProductCatalog().newProduct();
        product1.setAvailability(10);
        product1.setProdName("tennisBall");
        s1.setUsername("supplier1.supplier");
        s1.setPassword("456");
        s1.getProductCatalog().getProductList().add(product1);

        Product product2 = s1.getProductCatalog().newProduct();
        product2.setAvailability(10);
        product2.setProdName("volleyball");
        s1.getProductCatalog().getProductList().add(product2);

        Product product3 = s1.getProductCatalog().newProduct();
        product3.setAvailability(10);
        product3.setProdName("basketball");
        s1.getProductCatalog().getProductList().add(product3);

        /*Product product4 = s1.getProductCatalog().newProduct();
        product4.setAvailability(10);
        product4.setProdName("baseball");
        s1.getProductCatalog().getProductList().add(product4);*/

        supplierList.add(s1);

        Supplier s2 = supplierDirectory.newSupplier();
        s2.setSupplyName("supplier2");
        Product product5 = s2.getProductCatalog().newProduct();
        product5.setAvailability(15);
        product5.setProdName("tennisRacquet");
        s2.getProductCatalog().getProductList().add(product5);

        Product product6 = s2.getProductCatalog().newProduct();
        product6.setAvailability(15);
        product6.setProdName("badmintonRacquet");
        s2.getProductCatalog().getProductList().add(product6);

        Product product7 = s2.getProductCatalog().newProduct();
        product7.setAvailability(15);
        product7.setProdName("baseballBat");
        s2.getProductCatalog().getProductList().add(product7);

//        Product product8 = s2.getProductCatalog().newProduct();
//        product8.setAvailability(15);
//        product8.setProdName("cricketBat");
//        s2.getProductCatalog().getProductList().add(product6);
        s2.setUsername("supplier2.supplier");
        s2.setPassword("456");

        supplierList.add(s2);

       /* Supplier s3 = supplierDirectory.newSupplier();
        s3.setSupplyName("supplier3");
        Product product9 = s3.getProductCatalog().newProduct();
        product9.setAvailability(10);
        product9.setProdName("jordans");
        s3.setUsername("supplier3.supplier");
        s3.setPassword("789");
        s3.getProductCatalog().getProductList().add(product9);

        Product product10 = s3.getProductCatalog().newProduct();
        product10.setAvailability(10);
        product10.setProdName("studs");
        s3.getProductCatalog().getProductList().add(product10);

        /*Product product11 = s3.getProductCatalog().newProduct();
        product11.setAvailability(10);
        product11.setProdName("spikes");
        s3.getProductCatalog().getProductList().add(product11);

        Product product12 = s3.getProductCatalog().newProduct();
        product12.setAvailability(10);
        product12.setProdName("runningShoes");
        s3.getProductCatalog().getProductList().add(product12);*/

        //supplierList.add(s3);
        

        return supplierDirectory;

    }

}
