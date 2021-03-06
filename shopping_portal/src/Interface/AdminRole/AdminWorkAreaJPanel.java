/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdminRole;

import Business.*;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author incha
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Business business;

    public AdminWorkAreaJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
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
        btnManageSuppliers = new javax.swing.JButton();
        btnStatistics = new javax.swing.JButton();
        btnSalesPersonsPerf = new javax.swing.JButton();
        btnManageMO = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Aminstrative Role");

        btnManageSuppliers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageSuppliers.setText("Manage Suppliers >>");
        btnManageSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliersActionPerformed(evt);
            }
        });

        btnStatistics.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnStatistics.setText("Sales statistics>>");
        btnStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatisticsActionPerformed(evt);
            }
        });

        btnSalesPersonsPerf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalesPersonsPerf.setText("Review sales persons Performance>>");
        btnSalesPersonsPerf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesPersonsPerfActionPerformed(evt);
            }
        });

        btnManageMO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageMO.setText("Manage Market Offers>>");
        btnManageMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageMO, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalesPersonsPerf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(btnManageSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageMO, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalesPersonsPerf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliersActionPerformed
        
        ManageSuppliersJPanel ms = new ManageSuppliersJPanel(userProcessContainer, business);
        userProcessContainer.add("ManageSupplierAdministrative", ms);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSuppliersActionPerformed

    private void btnStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatisticsActionPerformed
        // TODO add your handling code here:
        SalesStatisticsJPanel ms = new SalesStatisticsJPanel(userProcessContainer, business);
        userProcessContainer.add("SalesStatisticsJPanel", ms);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnStatisticsActionPerformed

    private void btnSalesPersonsPerfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesPersonsPerfActionPerformed
        // TODO add your handling code here:
        ReviewSalesPersonPerfJPanel reviewSalesPPerf = new ReviewSalesPersonPerfJPanel(userProcessContainer,business);
        userProcessContainer.add("ReviewSalesPersonPerfJPanel", reviewSalesPPerf);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSalesPersonsPerfActionPerformed

    private void btnManageMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMOActionPerformed
        // TODO add your handling code here:
        ManageMarketOfferJPanel manageMarketOfferJPanel = new ManageMarketOfferJPanel(userProcessContainer,business);
        userProcessContainer.add("ManageMarketOfferJPanel", manageMarketOfferJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageMOActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageMO;
    private javax.swing.JButton btnManageSuppliers;
    private javax.swing.JButton btnSalesPersonsPerf;
    private javax.swing.JButton btnStatistics;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
