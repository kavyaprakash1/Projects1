/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdminRole;

import Business.Business;
import Business.MarketOfferCatalog;
import Business.MarketOffer;
import javax.swing.JPanel;
import Business.Product;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author kavyaprakash
 */
public class ManageMarketOfferJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMarketOfferJPanel
     */
JPanel userProcessContainer;    
Business business;
private Product moOfferProduct;

    ManageMarketOfferJPanel(JPanel userProcessContainer, Business business) {
         //To change body of generated methods, choose Tools | Templates.
         initComponents();
         this.business = business;
         this.userProcessContainer = userProcessContainer;
        populateMOtbl();
    }

    public void populateMOtbl(){
        DefaultTableModel dtm = (DefaultTableModel)tblMO.getModel();
        
        for(MarketOffer mo : business.getMarketOfferCatalog().getMarketOfferList()){
           moOfferProduct =  mo.getProduct();
        Object row[] = new Object[7];
        row[0] = mo;
        row[1] = moOfferProduct;
        row[2] = moOfferProduct.getProdName();
        row[3] = mo.getMarket();
        row[4] = mo.getCeilingPrice();
        row[5] = mo.getTargetPrice();
        row[6] = mo.getFloorPrice();
        
        dtm.addRow(row);
        
        }
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMO = new javax.swing.JTable();
        btnUpdateMarketOffer = new javax.swing.JButton();
        btnBackMMO = new javax.swing.JButton();

        jLabel1.setText("Manage Market Offers");

        tblMO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MoNum", "Product Id", "Product Name", "Market", "Ceiling Price", "Target Price", "Floor Price"
            }
        ));
        jScrollPane1.setViewportView(tblMO);

        btnUpdateMarketOffer.setText("Update Market Offer");
        btnUpdateMarketOffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMarketOfferActionPerformed(evt);
            }
        });

        btnBackMMO.setText("<<BACK");
        btnBackMMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMMOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBackMMO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdateMarketOffer)
                                .addGap(11, 11, 11))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateMarketOffer)
                    .addComponent(btnBackMMO))
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMMOActionPerformed
        // TODO add your handling code here:
      userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);  
        
    }//GEN-LAST:event_btnBackMMOActionPerformed

    private void btnUpdateMarketOfferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMarketOfferActionPerformed
        // TODO add your handling code here:
        int selectedRow1 = tblMO.getSelectedRow();
        if (selectedRow1 < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        
        MarketOffer mo1 = (MarketOffer)tblMO.getValueAt(selectedRow1,0);
        UpdateMarketOfferJPanel mof = new UpdateMarketOfferJPanel(userProcessContainer,business,mo1);
        userProcessContainer.add("UpdateMarketOfferJPanel", mof);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnUpdateMarketOfferActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackMMO;
    private javax.swing.JButton btnUpdateMarketOffer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMO;
    // End of variables declaration//GEN-END:variables
}
