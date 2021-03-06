/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Account;
import Business.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.Person;
import Business.PersonDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kavyaprakash
 */
public class ManageUserAccountsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    AccountDirectory userAccountDirectory;
    Person person;
    PersonDirectory personDirectory;

    /**
     * Creates new form ManageUserAccounts
     */
    ManageUserAccountsJPanel(JPanel userProcessContainer, AccountDirectory userAccountDirectory, PersonDirectory personDirectory) {
        initComponents(); //To change body of generated methods, choose Tools | Templates.
        this.userProcessContainer = userProcessContainer;
        this.userAccountDirectory = userAccountDirectory;
        this.personDirectory = personDirectory;

        populateAccountsTable();

    }

    public void populateAccountsTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblUserAccounts.getModel();
        dtm.setRowCount(0);

        for (Account a : userAccountDirectory.getAccountList()) {
            Object row[] = new Object[5];
            row[0] = a;
            row[1] = a.getUserName();
            row[2] = "*******";
            row[3] = a.getRole();
            row[4] = a.getStatus();

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
        tblUserAccounts = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAddUserAccount = new javax.swing.JButton();
        btnFindUserAccount = new javax.swing.JButton();
        btnUpdateUserAccount = new javax.swing.JButton();
        btnDeleteAccount = new javax.swing.JButton();

        jLabel1.setText("MANAGE USER ACCOUNTS");

        tblUserAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserId", "UserName", "Password", "Role", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUserAccounts);
        if (tblUserAccounts.getColumnModel().getColumnCount() > 0) {
            tblUserAccounts.getColumnModel().getColumn(0).setResizable(false);
            tblUserAccounts.getColumnModel().getColumn(1).setResizable(false);
            tblUserAccounts.getColumnModel().getColumn(2).setResizable(false);
            tblUserAccounts.getColumnModel().getColumn(3).setResizable(false);
            tblUserAccounts.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel2.setText("User Accounts:");

        btnAddUserAccount.setText("Add User Account");
        btnAddUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserAccountActionPerformed(evt);
            }
        });

        btnFindUserAccount.setText("Find User Account ");
        btnFindUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindUserAccountActionPerformed(evt);
            }
        });

        btnUpdateUserAccount.setText("Update User Account");
        btnUpdateUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserAccountActionPerformed(evt);
            }
        });

        btnDeleteAccount.setText("Delete account");
        btnDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddUserAccount)
                            .addComponent(btnUpdateUserAccount)
                            .addComponent(btnFindUserAccount)
                            .addComponent(btnDeleteAccount))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnFindUserAccount)
                        .addGap(31, 31, 31)
                        .addComponent(btnAddUserAccount)
                        .addGap(37, 37, 37)
                        .addComponent(btnUpdateUserAccount)
                        .addGap(33, 33, 33)
                        .addComponent(btnDeleteAccount)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserAccountActionPerformed
        // TODO add your handling code here:
        NewUserAccountJPanel newPersonJPanel = new NewUserAccountJPanel(userProcessContainer, userAccountDirectory, personDirectory, this);
        userProcessContainer.add("NewUserAccountJPanel", newPersonJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddUserAccountActionPerformed

    private void btnUpdateUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserAccountActionPerformed

        if (tblUserAccounts.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        Account accountSelected = (Account) tblUserAccounts.getValueAt(tblUserAccounts.getSelectedRow(), 0);
        UpdateUserAccountJPanel newPersonJPanel = new UpdateUserAccountJPanel(userProcessContainer, userAccountDirectory, accountSelected, this);
        userProcessContainer.add("UpdateUserAccountJPanel", newPersonJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUpdateUserAccountActionPerformed

    private void btnDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccountActionPerformed
        // TODO add your handling code here:
        Account accountSelected1 = (Account) tblUserAccounts.getValueAt(tblUserAccounts.getSelectedRow(), 0);
        userAccountDirectory.getAccountList().remove(accountSelected1);
        JOptionPane.showMessageDialog(null, "Account Deleted successfully");
        populateAccountsTable();

    }//GEN-LAST:event_btnDeleteAccountActionPerformed

    private void btnFindUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindUserAccountActionPerformed
        // TODO add your handling code here:
        String inputFindAccount = JOptionPane.showInputDialog("Enter userId");

        for (Account a1 : userAccountDirectory.getAccountList()) {
            if (a1.getUserId().equalsIgnoreCase(inputFindAccount)) {
                JOptionPane.showMessageDialog(null, "Account found!");
                Account accountFound = a1;
                FindUserAccountJPanel findUserAccountJPanel = new FindUserAccountJPanel(userProcessContainer, accountFound);
                userProcessContainer.add("FindUserAccountJPanel", findUserAccountJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
    }//GEN-LAST:event_btnFindUserAccountActionPerformed
      JOptionPane.showMessageDialog(null, "Account not found");  
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUserAccount;
    private javax.swing.JButton btnDeleteAccount;
    private javax.swing.JButton btnFindUserAccount;
    private javax.swing.JButton btnUpdateUserAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUserAccounts;
    // End of variables declaration//GEN-END:variables
}
