/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Network.SubNetwork;
import userinterface.SystemAdminWorkArea.*;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ayushkumar
 */
public class ManageCityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCityJPanel
     */
    JPanel userProcessContainer;
   EcoSystem system;

    public ManageCityJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        populateCityTable();
        populatestateComboBox();
    }
    
    private void populateCityTable() {
        DefaultTableModel model = (DefaultTableModel) cityJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
          for (SubNetwork subnet:network.getSubNet()){  
            Object[] row = new Object[2];
            row[0] = subnet.getName();
            row[1] = network.getName();
            model.addRow(row);
        }
    }}
    
      private void populatestateComboBox()
     {
         stateComboBox.removeAllItems();
     for (Network network : system.getNetworkList()) 
        {
            stateComboBox.addItem(network);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        cityJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        stateComboBox = new javax.swing.JComboBox();
        cityNameTextField = new javax.swing.JTextField();
        addCityBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cityJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "City", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cityJTable);
        if (cityJTable.getColumnModel().getColumnCount() > 0) {
            cityJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 150));

        jLabel1.setText("State:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabel3.setText("City:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        stateComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(stateComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));
        add(cityNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 90, -1));

        addCityBtn.setText("Submit");
        addCityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCityBtnActionPerformed(evt);
            }
        });
        add(addCityBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        jButton1.setText("<<back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addCityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCityBtnActionPerformed
        // TODO add your handling code here:
        
        Network network = (Network) stateComboBox.getSelectedItem();
        //Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();
        
        if (network == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }

        String name = cityNameTextField.getText();
 SubNetwork subnet = network.createAndAddsubNetwork();
        subnet.setName(name);

        populateCityTable();        
        
//        Enterprise enterprise = network.getSubNet().getEnterpriseDirectory().createAndAddEnterprise(name, type);
//
//        populateTable();

        
        
    }//GEN-LAST:event_addCityBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCityBtn;
    private javax.swing.JTable cityJTable;
    private javax.swing.JTextField cityNameTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox stateComboBox;
    // End of variables declaration//GEN-END:variables
}
