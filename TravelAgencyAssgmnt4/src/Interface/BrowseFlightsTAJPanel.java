/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Airliner;
import Business.Flight;
import Business.FlightSchedule;
import Business.MasterTravelScheduler;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kavyaprakash
 */
public class BrowseFlightsTAJPanel extends javax.swing.JPanel {

    BrowseFlightsTAJPanel(JPanel userProcessContainer, MasterTravelScheduler masterTravelScheduler, Airliner airliner) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.masterTravelScheduler = masterTravelScheduler;
        this.airliner = airliner;
        populateBrowseFlightsTable(airliner);//To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form BrowseFlightsTA
     */
    JPanel userProcessContainer;
    MasterTravelScheduler masterTravelScheduler;
    Airliner airliner;

    public void populateBrowseFlightsTable(Airliner airliner) {
        DefaultTableModel dtm = (DefaultTableModel) tblBrowseFlights.getModel();
        dtm.setRowCount(0);
        for (Airliner airl : masterTravelScheduler.getMasterTravelList()) {
            if (airl.getAirlinerName().equalsIgnoreCase(airliner.getAirlinerName())) {
                String test = airl.getAirlinerName();
                if (test.equalsIgnoreCase("airindia")) {
                    for (Flight flt : masterTravelScheduler.getMasterTravelList().get(1).getAirIndiaFlightSchedule().getFlightListAirIndia()) {
                        Object row[] = new Object[6];
                        row[0] = flt;
                        row[1] = flt.getDeparture();
                        row[2] = flt.getDestination();
                        row[3] = flt.getDate();
                        row[4] = flt.getTimeOfDay();
                        dtm.addRow(row);
                    }
                }

                if (test.equalsIgnoreCase("Luftansa")) {
                    {
                        for (Flight flt : masterTravelScheduler.getMasterTravelList().get(1).getLuftansaFlightSchedule().getFlightListLuftansa()) {
                            Object row[] = new Object[6];
                            row[0] = flt;
                            row[1] = flt.getDeparture();
                            row[2] = flt.getDestination();
                            row[3] = flt.getDate();
                            row[4] = flt.getTimeOfDay();
                            dtm.addRow(row);
                        }
                    }

                    // Count the number of seats in the particular flight which has seats assigned attribute as false
                }
            }
        }}
            /**
             * This method is called from within the constructor to initialize
             * the form. WARNING: Do NOT modify this code. The content of this
             * method is always regenerated by the Form Editor.
             */
            @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBrowseFlights = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BackBrowseFlights = new javax.swing.JButton();

        tblBrowseFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SerialNo", "Departure", "Destination", "Date", "TimeOfDay"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBrowseFlights);
        if (tblBrowseFlights.getColumnModel().getColumnCount() > 0) {
            tblBrowseFlights.getColumnModel().getColumn(0).setResizable(false);
            tblBrowseFlights.getColumnModel().getColumn(1).setResizable(false);
            tblBrowseFlights.getColumnModel().getColumn(2).setResizable(false);
            tblBrowseFlights.getColumnModel().getColumn(3).setResizable(false);
            tblBrowseFlights.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setText("BROWSE FLIGHTS");

        BackBrowseFlights.setText("<<BACK");
        BackBrowseFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBrowseFlightsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BackBrowseFlights)
                .addGap(110, 110, 110)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackBrowseFlights)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBrowseFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBrowseFlightsActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackBrowseFlightsActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBrowseFlights;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBrowseFlights;
    // End of variables declaration//GEN-END:variables
}