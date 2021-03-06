/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.FleetCatalog;
import Business.Airplanes;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author kavyaprakash
 */
public class mainJFrame extends javax.swing.JFrame {

    FleetCatalog ctg;

    int BUTTON_BOEING = 1;

    /**
     * Creates new form mainJFrame
     */
    public mainJFrame() {
        initComponents();
        //send fleet catalog
        ctg = new FleetCatalog();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        btnFirstAvailable = new javax.swing.JButton();
        btnByBoeing = new javax.swing.JButton();
        byYearManufactured = new javax.swing.JButton();
        btnTotalAvailable = new javax.swing.JButton();
        btnBySeatNumber = new javax.swing.JButton();
        btnBySerialNumber = new javax.swing.JButton();
        btnModelNumber = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnManufacturer = new javax.swing.JButton();
        btnFleetCatalog = new javax.swing.JButton();
        btnByAirport = new javax.swing.JButton();
        btnExpired = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFirstAvailable.setText("First Available ");
        btnFirstAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvailableActionPerformed(evt);
            }
        });

        btnByBoeing.setText("By Boeing");
        btnByBoeing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnByBoeingActionPerformed(evt);
            }
        });

        byYearManufactured.setText("Manufactured in a year");
        byYearManufactured.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byYearManufacturedActionPerformed(evt);
            }
        });

        btnTotalAvailable.setText("Total Available");
        btnTotalAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalAvailableActionPerformed(evt);
            }
        });

        btnBySeatNumber.setText("By seat number");
        btnBySeatNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBySeatNumberActionPerformed(evt);
            }
        });

        btnBySerialNumber.setText("By serial number");
        btnBySerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBySerialNumberActionPerformed(evt);
            }
        });

        btnModelNumber.setText("By model number");
        btnModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelNumberActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Flight information");

        btnManufacturer.setText("Manufacturers");
        btnManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManufacturerActionPerformed(evt);
            }
        });

        btnFleetCatalog.setText("Fleet Catalog changes");
        btnFleetCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFleetCatalogActionPerformed(evt);
            }
        });

        btnByAirport.setText("By Airport");
        btnByAirport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnByAirportActionPerformed(evt);
            }
        });

        btnExpired.setText("Expired ");
        btnExpired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpiredActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnFirstAvailable)
                                .addComponent(btnTotalAvailable))
                            .addComponent(btnByBoeing))
                        .addGap(42, 42, 42)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnManufacturer)
                            .addComponent(btnFleetCatalog)
                            .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnExpired)
                                .addComponent(btnByAirport)))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBySeatNumber)
                            .addComponent(btnBySerialNumber)
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addComponent(btnModelNumber)
                                .addGap(18, 18, 18)
                                .addComponent(byYearManufactured)))
                        .addGap(25, 25, 25))))
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnByBoeing)
                    .addComponent(btnManufacturer))
                .addGap(15, 15, 15)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFirstAvailable, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFleetCatalog))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnByAirport)
                    .addComponent(btnTotalAvailable))
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBySeatNumber)
                        .addGap(12, 12, 12)
                        .addComponent(btnBySerialNumber))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnExpired)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModelNumber)
                    .addComponent(byYearManufactured))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        splitPane.setLeftComponent(leftPanel);

        getContentPane().add(splitPane, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void byYearManufacturedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byYearManufacturedActionPerformed
        // TODO add your handling code here:
        String byYear = JOptionPane.showInputDialog("Enter the year");
        DisplayPanel displayPanel = new DisplayPanel(ctg, 4, byYear);
        splitPane.setLeftComponent(displayPanel);


    }//GEN-LAST:event_byYearManufacturedActionPerformed

    private void btnBySerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBySerialNumberActionPerformed
        // TODO add your handling code here:
        String bySerialNumber = JOptionPane.showInputDialog("Enter the serial number");
        DisplayPanel displaypanel = new DisplayPanel(ctg, 5, bySerialNumber);
        splitPane.setLeftComponent(displaypanel);
    }//GEN-LAST:event_btnBySerialNumberActionPerformed

    private void btnExpiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpiredActionPerformed
        // TODO add your handling code here:
        ArrayList<Airplanes> expiredAirplanes = new ArrayList<Airplanes>();
        Date todayDate = new Date();
        //JOptionPane.showMessageDialog(null, "Today's date is " +todayDate.format(date));
        for (Airplanes airplane : ctg.fleetCatalog) {
            String inputFromFile = airplane.getMaintainanceCertificateDate();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            //simpleDateFormat.setLenient(false);

            try {

                Date maintainanceValidDate = simpleDateFormat.parse(inputFromFile);
                boolean expired = maintainanceValidDate.before(todayDate);
                if (expired) {
                    expiredAirplanes.add(airplane);

                }
            } catch (ParseException ex) {
                //Logger.getLogger(mainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (expiredAirplanes.size() == 0) {
            JOptionPane.showMessageDialog(null, "None of the airplanes have expired");
        } else {
            DisplayPanel displaypanel = new DisplayPanel(expiredAirplanes);
            splitPane.setLeftComponent(displaypanel);
        }

    }//GEN-LAST:event_btnExpiredActionPerformed

    private void btnByBoeingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnByBoeingActionPerformed
        DisplayPanel displayPanel = new DisplayPanel(ctg, 1);

        splitPane.setLeftComponent(displayPanel);

        // TODO add your handling code here:

    }//GEN-LAST:event_btnByBoeingActionPerformed

    private void btnByAirportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnByAirportActionPerformed
        // TODO add your handling code here:
        String userInput = JOptionPane.showInputDialog("Enter the Airport name");
        
        DisplayPanel displayPanel = new DisplayPanel(ctg, 2, userInput);
        splitPane.setLeftComponent(displayPanel);
    }//GEN-LAST:event_btnByAirportActionPerformed

    private void btnModelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelNumberActionPerformed
        // TODO add your handling code here:
        String userInput = JOptionPane.showInputDialog("Enter the model number");
       
        try{
            Integer.parseInt(userInput);
            
            DisplayPanel displayPanel = new DisplayPanel(ctg, 3, userInput);
            splitPane.setLeftComponent(displayPanel);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid input");
        }
        

    }//GEN-LAST:event_btnModelNumberActionPerformed

    private void btnFirstAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvailableActionPerformed
        // TODO add your handling code here:
        Airplanes firstAvailableFlight = null;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        for (Airplanes airplane : ctg.fleetCatalog) {

            if (Integer.parseInt(airplane.getAvailableSeats()) != 0) {
                if (firstAvailableFlight == null) {
                    firstAvailableFlight = airplane;
                } else {

                    try {
                        Date d = df.parse(airplane.getTakeOffTime());
                        Date d2 = df.parse(firstAvailableFlight.getTakeOffTime());

                        if (d.before(d2)) {
                            firstAvailableFlight = airplane;
                        }
                    } catch (ParseException e) {

                    }
                }
            }

        }
        if (firstAvailableFlight != null) {
            DisplayPanel displaypanel = new DisplayPanel(firstAvailableFlight);
            splitPane.setLeftComponent(displaypanel);

        }
    }//GEN-LAST:event_btnFirstAvailableActionPerformed


    private void btnManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManufacturerActionPerformed
        // TODO add your handling code here:
        String userInput = JOptionPane.showInputDialog("Please enter the Airliner");
        String manufacturers = "";
        for (Airplanes airplane : ctg.fleetCatalog) {
            if (airplane.getAirliner().equalsIgnoreCase(userInput)) {
                manufacturers += "\n" + airplane.getManufacturer();

            }
        }
        JOptionPane.showMessageDialog(null, "The manufacturers used by the airliner are: " +manufacturers);


    }//GEN-LAST:event_btnManufacturerActionPerformed

    private void btnBySeatNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBySeatNumberActionPerformed
        // TODO add your handling code here:
        int minseats = Integer.parseInt(JOptionPane.showInputDialog("Please enter the minimum number of seats"));
        int maxseats = Integer.parseInt(JOptionPane.showInputDialog("Please enter the maximum number of seats"));
        int buttonType = 6;
        ArrayList<Airplanes> filteredResult = new ArrayList<Airplanes>();
        for (Airplanes airplane : ctg.fleetCatalog) {

            int numberOfSeats = Integer.parseInt(airplane.getNumberOfSeats());

            if ((numberOfSeats < maxseats) & (numberOfSeats > minseats)) {
                filteredResult.add(airplane);

                DisplayPanel displaypanel = new DisplayPanel(filteredResult);
                splitPane.setLeftComponent(displaypanel);

            }

        }
        if (filteredResult.size() == 0) {
            JOptionPane.showMessageDialog(null, "No flights found with the required criterion");
        }


    }//GEN-LAST:event_btnBySeatNumberActionPerformed

    private void btnTotalAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalAvailableActionPerformed
        // TODO add your handling code here:

        ArrayList<Airplanes> resultInfo = new ArrayList<Airplanes>();
        for (Airplanes airplane : ctg.fleetCatalog) {
            int availSeats = Integer.parseInt(airplane.getAvailableSeats());
            if (availSeats > 0) {
                resultInfo.add(airplane);
                DisplayPanel displaypanel = new DisplayPanel(resultInfo);
                splitPane.setLeftComponent(displaypanel);

            }
        }
        JOptionPane.showMessageDialog(null, "The total number of flights is 5");
        JOptionPane.showMessageDialog(null, "The available flights are as shown in the table");
    }//GEN-LAST:event_btnTotalAvailableActionPerformed

    private void btnFleetCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFleetCatalogActionPerformed
        // TODO add your handling code here:
        File file = new File("src/input.csv");
        Date date = new Date(file.lastModified());
        JOptionPane.showMessageDialog(null, "The last time fleet catalog was modified was " + date);
    }//GEN-LAST:event_btnFleetCatalogActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnByAirport;
    private javax.swing.JButton btnByBoeing;
    private javax.swing.JButton btnBySeatNumber;
    private javax.swing.JButton btnBySerialNumber;
    private javax.swing.JButton btnExpired;
    private javax.swing.JButton btnFirstAvailable;
    private javax.swing.JButton btnFleetCatalog;
    private javax.swing.JButton btnManufacturer;
    private javax.swing.JButton btnModelNumber;
    private javax.swing.JButton btnTotalAvailable;
    private javax.swing.JButton byYearManufactured;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
