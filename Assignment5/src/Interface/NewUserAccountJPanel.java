/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Account;
import Business.AccountDirectory;
import Business.Person;
import Business.PersonDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kavyaprakash
 */
public class NewUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewUserAccountJPanel
     */
    JPanel userProcessContainer;
    AccountDirectory userAccountDirectory;
    PersonDirectory personDirectory;
    ManageUserAccountsJPanel manageUserAccountsJPanel;

    NewUserAccountJPanel(JPanel userProcessContainer, AccountDirectory userAccountDirectory, PersonDirectory personDirectory, ManageUserAccountsJPanel manageUserAccountsJPanel) {
        initComponents(); //To change body of generated methods, choose Tools | Templates.
        this.userProcessContainer = userProcessContainer;
        this.userAccountDirectory = userAccountDirectory;
        this.personDirectory = personDirectory;
        this.manageUserAccountsJPanel = manageUserAccountsJPanel;
 radioBtnActiveNUA.setActionCommand("Active");
       radioBtnInactiveNUA.setActionCommand("Inactive");
        
        for (Person p : personDirectory.getPersonList()) {
            comboBoxPersonUA.addItem(p);

        }

        /*for (Account a : userAccountDirectory.getAccountList()) {
            
            comboBoxRoleUA.addItem(a.getRole());
        }
         */
        ArrayList<String> at = new ArrayList<String>();
        for (Account a : userAccountDirectory.getAccountList()) {
            if (!at.contains(a.getRole())) {
                comboBoxRoleUA.addItem(a.getRole());
                at.add(a.getRole());
            }

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        comboBoxPersonUA = new javax.swing.JComboBox();
        comboBoxRoleUA = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPasswordNewUserAccount = new javax.swing.JTextField();
        txtUsernameNewUserAccount = new javax.swing.JTextField();
        btnCreateNewUserAccount = new javax.swing.JButton();
        btnCancelNewUserAccount = new javax.swing.JButton();
        btnBackNUA = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtUserIdUA = new javax.swing.JTextField();
        radioBtnActiveNUA = new javax.swing.JRadioButton();
        radioBtnInactiveNUA = new javax.swing.JRadioButton();

        jLabel1.setText("ADD NEW USER ACCOUNT");

        jLabel2.setText("Username:");

        jLabel3.setText("Person:");

        jLabel4.setText("Role:");

        jLabel5.setText("Password:");

        txtUsernameNewUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameNewUserAccountActionPerformed(evt);
            }
        });

        btnCreateNewUserAccount.setText("CREATE");
        btnCreateNewUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewUserAccountActionPerformed(evt);
            }
        });

        btnCancelNewUserAccount.setText("CANCEL");
        btnCancelNewUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelNewUserAccountActionPerformed(evt);
            }
        });

        btnBackNUA.setText("<<BACK");
        btnBackNUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackNUAActionPerformed(evt);
            }
        });

        jLabel6.setText("userId:");

        buttonGroup1.add(radioBtnActiveNUA);
        radioBtnActiveNUA.setText("Active");
        radioBtnActiveNUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnActiveNUAActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBtnInactiveNUA);
        radioBtnInactiveNUA.setText("Inactive");
        radioBtnInactiveNUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnInactiveNUAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnBackNUA)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(14, 14, 14)))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboBoxPersonUA, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtUsernameNewUserAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                            .addComponent(txtPasswordNewUserAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                            .addComponent(txtUserIdUA)))
                                    .addComponent(comboBoxRoleUA, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioBtnActiveNUA)
                                    .addComponent(radioBtnInactiveNUA))
                                .addGap(39, 39, 39))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnCreateNewUserAccount)
                        .addGap(106, 106, 106)
                        .addComponent(btnCancelNewUserAccount))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel6)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnBackNUA)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPersonUA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxRoleUA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUserIdUA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(radioBtnActiveNUA)
                        .addGap(18, 18, 18)
                        .addComponent(radioBtnInactiveNUA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUsernameNewUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPasswordNewUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateNewUserAccount)
                    .addComponent(btnCancelNewUserAccount))
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameNewUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameNewUserAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameNewUserAccountActionPerformed

    private void btnBackNUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackNUAActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackNUAActionPerformed

    private void btnCreateNewUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewUserAccountActionPerformed
        // TODO add your handling code here:
        Person personChosen = (Person) comboBoxPersonUA.getSelectedItem();
        String roleChosen = (String) comboBoxRoleUA.getSelectedItem();

        for (Person p : personDirectory.getPersonList()) {

            if (p.equals(personChosen)) {
                Account newAccount = new Account();
                newAccount.setPerson(personChosen);
                newAccount.setRole(roleChosen);
                /*
               if (isInvalid(txtDepartureAddFlight.getText())) {
            JOptionPane.showMessageDialog(null, "Departure cannot be empty or number");
            return;
        }
                 */
                try {
                    int i = Integer.parseInt(txtUserIdUA.getText());
                } catch (NumberFormatException ne) {
                    JOptionPane.showMessageDialog(null, "UserId needs to be a number");
                    return;

                }
                if (txtUsernameNewUserAccount.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "UserName cannot be empty ");
                    return;
                }

                if (txtPasswordNewUserAccount.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Password cannot be empty ");
                    return;
                }

                newAccount.setUserName(txtUsernameNewUserAccount.getText());
                newAccount.setPassword(txtPasswordNewUserAccount.getText());
                newAccount.setUserId(txtUserIdUA.getText());
                       String selected = buttonGroup1.getSelection().getActionCommand();

                if(selected.equalsIgnoreCase("Active")){
           newAccount.setStatus("Active");
       }
       
       if(selected.equalsIgnoreCase("Inactive")){
           newAccount.setStatus("Inactive");
       }
                userAccountDirectory.getAccountList().add(newAccount);

                
                JOptionPane.showMessageDialog(null, "Account is added successfully");

                manageUserAccountsJPanel.populateAccountsTable();
            }
        }

        //f(p2!=null){
    }//GEN-LAST:event_btnCreateNewUserAccountActionPerformed

    private void btnCancelNewUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelNewUserAccountActionPerformed
        // TODO add your handling code here:
        txtUsernameNewUserAccount.setText(" ");
        txtPasswordNewUserAccount.setText(" ");
        txtUserIdUA.setText(" ");
    }//GEN-LAST:event_btnCancelNewUserAccountActionPerformed

    private void radioBtnActiveNUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnActiveNUAActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_radioBtnActiveNUAActionPerformed

    private void radioBtnInactiveNUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnInactiveNUAActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_radioBtnInactiveNUAActionPerformed

    /* public boolean isInvalid(String input) {
        if (input.isEmpty()) {
            return true;
        }
        try {
            Double.parseDouble(input);
        } catch (NullPointerException ne) {
            return false;
        } catch (NumberFormatException ne) {
            return false;
        }
        return true;
    }
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackNUA;
    private javax.swing.JButton btnCancelNewUserAccount;
    private javax.swing.JButton btnCreateNewUserAccount;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboBoxPersonUA;
    private javax.swing.JComboBox comboBoxRoleUA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton radioBtnActiveNUA;
    private javax.swing.JRadioButton radioBtnInactiveNUA;
    private javax.swing.JTextField txtPasswordNewUserAccount;
    private javax.swing.JTextField txtUserIdUA;
    private javax.swing.JTextField txtUsernameNewUserAccount;
    // End of variables declaration//GEN-END:variables
}
