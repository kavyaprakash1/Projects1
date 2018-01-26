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
public class Supplier {

   private String supplyName;
   private ProductCatalog productCatalog;
   private String username;
   private String password;

   public Supplier() {
   productCatalog = new ProductCatalog();
   }

   public String getUsername() {
       return username;
   }

   public void setUsername(String username) {
       this.username = username;
   }

   public String getPassword() {
       return password;
   }

   public void setPassword(String password) {
       this.password = password;
   }

   public String getSupplyName() {
       return supplyName;
   }

   public void setSupplyName(String supplyName) {
       this.supplyName = supplyName;
   }

   public ProductCatalog getProductCatalog() {
       return productCatalog;
   }

   public void setProductCatalog(ProductCatalog productCatalog) {
       this.productCatalog = productCatalog;
   }
   

   @Override
   public String toString() {
       return supplyName; //To change body of generated methods, choose Tools | Templates.
   }
   
}
