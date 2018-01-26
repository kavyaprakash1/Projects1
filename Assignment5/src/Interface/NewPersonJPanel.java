/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Person;
import Business.PersonDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author kavyaprakash
 */
public class NewPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FindPersonJPanel
     */
 JPanel userProcessContainer;
 PersonDirectory personDirectory;
 ManagePersonDirectoryJPanel managepersonJPanel;
 
    NewPersonJPanel(JPanel userProcessContainer, PersonDirectory personDirectory,ManagePersonDirectoryJPanel managepersonJPanel) {
        initComponents(); //To change body of generated methods, choose Tools | Templates.
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        this.managepersonJPanel = managepersonJPanel;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateNewPerson = new javax.swing.JButton();
        btnCancelNewPerson = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtLastNameNP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFirstNameNP = new javax.swing.JTextField();
        btnBackANP = new javax.swing.JButton();

        btnCreateNewPerson.setText("CREATE");
        btnCreateNewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewPersonActionPerformed(evt);
            }
        });

        btnCancelNewPerson.setText("CANCEL");
        btnCancelNewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelNewPersonActionPerformed(evt);
            }
        });

        jLabel5.setText("LastName:");

        jLabel1.setText("ADD NEW PERSON");

        jLabel3.setText("FirstName:");

        btnBackANP.setText("<<BACK");
        btnBackANP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackANPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLastNameNP, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstNameNP, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBackANP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(187, 187, 187)
                    .addComponent(btnCreateNewPerson)
                    .addGap(32, 32, 32)
                    .addComponent(btnCancelNewPerson)
                    .addContainerGap(194, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBackANP))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFirstNameNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLastNameNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(330, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCreateNewPerson)
                        .addComponent(btnCancelNewPerson))
                    .addGap(41, 41, 41)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackANPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackANPActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        managepersonJPanel.populatePersonTable();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackANPActionPerformed

    private void btnCreateNewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewPersonActionPerformed
        // TODO add your handling code here:
        Person newPerson = new Person();
        if(txtFirstNameNP.getText().matches(".*\\d.*") || txtLastNameNP.getText().matches(".*\\d.*"))
         JOptionPane.showMessageDialog(null,"Please enter a valid name");   
        else{
        newPerson.setFirstName(txtFirstNameNP.getText());
        newPerson.setLastName(txtLastNameNP.getText());
        personDirectory.getPersonList().add(newPerson);
        JOptionPane.showMessageDialog(null,"Person added successfully");
        } 
        
    }//GEN-LAST:event_btnCreateNewPersonActionPerformed

    private void btnCancelNewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelNewPersonActionPerformed
        // TODO add your handling code here:
        txtFirstNameNP.setText(" ");
        txtLastNameNP.setText(" ");
    }//GEN-LAST:event_btnCancelNewPersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackANP;
    private javax.swing.JButton btnCancelNewPerson;
    private javax.swing.JButton btnCreateNewPerson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtFirstNameNP;
    private javax.swing.JTextField txtLastNameNP;
    // End of variables declaration//GEN-END:variables
}