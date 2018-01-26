/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author kavyaprakasha
*/
public class ProductCatalog {
    private ArrayList<Product> productList;

   public ProductCatalog() {
   productList= new ArrayList<Product>();
   }
   
   public ArrayList<Product> getProductList(){
       return productList;
   }
   
   public Product newProduct(){
       Product newProduct = new Product();
       return newProduct;
   }
   public Product addProduct(){
       Product p = new Product();
       productList.add(p);
       return p;
   }
   
   public void removeProduct(Product p){
       productList.remove(p);
   }
   
   public Product searchProduct(int id){
       for (Product product : productList) {
           if(product.getModelNumber()==id){
               return product;
           }
       }
       return null;
   }
}
