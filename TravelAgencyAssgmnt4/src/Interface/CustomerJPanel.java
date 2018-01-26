/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Airliner;
import Business.MasterTravelScheduler;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Flight;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import Business.Seat;
import java.util.ArrayList;



/**
 *
 * @author kavyaprakash
 */
public class CustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Customer1JPanel
     */
    JPanel userProcessContainer;
    MasterTravelScheduler masterTravelScheduler;

    CustomerJPanel(JPanel userProcessContainer, MasterTravelScheduler masterTravelScheduler) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.masterTravelScheduler = masterTravelScheduler;

        populateCustomersTable();
    }

    public void populateCustomersTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblCustomerFlights.getModel();
        dtm.setRowCount(0);

        for (Airliner ar : this.masterTravelScheduler.getMasterTravelList()) {
            for (Flight flt : ar.getAirIndiaFlightSchedule().getFlightListAirIndia()) {
                Object row[] = new Object[2];
                row[0] = ar;
                row[1] = flt;

                dtm.addRow(row);
            }
//            for (Flight flt : this.masterTravelScheduler.getMasterTravelList().get(1).getLuftansaFlightSchedule().getFlightListLuftansa()) {
//                Object row[] = new Object[3];
//                row[0] = ar;
//                row[1] = flt;
//                
//                dtm.addRow(row);
//            }

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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomerFlights = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtDepartureSCustomer = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDestinationSCustomer = new javax.swing.JTextField();
        btnSearchFlightsCustomer = new javax.swing.JButton();
        btnCustomerViewDetails = new javax.swing.JButton();
        btnBookNowCustomer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSerialNumberVCustomer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDepartureVCustomer = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDestinationVCustomer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDateVCustomer = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTimeOfDayVCustomer = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("CUSTOMER");

        jLabel2.setText("Search Flights");

        tblCustomerFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner", "FlightNo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomerFlights);
        if (tblCustomerFlights.getColumnModel().getColumnCount() > 0) {
            tblCustomerFlights.getColumnModel().getColumn(0).setResizable(false);
            tblCustomerFlights.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel9.setText("Departure:");

        jLabel10.setText("Destination:");

        btnSearchFlightsCustomer.setText("Search");
        btnSearchFlightsCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchFlightsCustomerActionPerformed(evt);
            }
        });

        btnCustomerViewDetails.setText("VIEW DETAILS");
        btnCustomerViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerViewDetailsActionPerformed(evt);
            }
        });

        btnBookNowCustomer.setText("BOOK NOW");
        btnBookNowCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookNowCustomerActionPerformed(evt);
            }
        });

        jLabel3.setText("Serial Number:");

        jLabel4.setText("Departure:");

        jLabel5.setText("Destination:");

        jLabel6.setText("Date:");

        jLabel7.setText("Time of day:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(582, 582, 582))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDepartureSCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDestinationSCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(btnSearchFlightsCustomer)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(193, 193, 193))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtDepartureVCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(50, 50, 50)
                                                .addComponent(txtSerialNumberVCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(59, 59, 59)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtTimeOfDayVCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtDateVCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtDestinationVCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCustomerViewDetails)
                                        .addGap(62, 62, 62)
                                        .addComponent(btnBookNowCustomer)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDepartureSCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDestinationSCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addGap(0, 392, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCustomerViewDetails)
                            .addComponent(btnBookNowCustomer))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSerialNumberVCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(btnSearchFlightsCustomer)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDepartureVCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDestinationVCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDateVCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTimeOfDayVCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(208, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookNowCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookNowCustomerActionPerformed
        // TODO add your handling code here:
        if(tblCustomerFlights.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        int confirmation = JOptionPane.OK_CANCEL_OPTION;
        boolean seatAvailable = false;
        Flight flightSelected = (Flight) tblCustomerFlights.getValueAt(tblCustomerFlights.getSelectedRow(), 1);
        for (Seat seatOfFlight : flightSelected.getAllSeatsOfAFlight()) {
            if (seatOfFlight.getSeatAssigned().equalsIgnoreCase("no")) {
                seatAvailable = true;
                break;
            }

        }
        if (seatAvailable) {
            JOptionPane.showMessageDialog(null, "seat available on flight!");
            String input = JOptionPane.showInputDialog("Please enter the customer name");
            confirmation = JOptionPane.showConfirmDialog(null, "Please confirm booking");
            if (confirmation == JOptionPane.OK_OPTION) {
                ConfirmationPageJPanel panel = new ConfirmationPageJPanel(userProcessContainer, flightSelected, input);
                userProcessContainer.add("ConfirmationPageJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No seats available on the flight! :( ");
        }
    }//GEN-LAST:event_btnBookNowCustomerActionPerformed

    private void btnCustomerViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerViewDetailsActionPerformed
        // TODO add your handling code here:
        
        if(tblCustomerFlights.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        DefaultTableModel dtm = (DefaultTableModel) tblCustomerFlights.getModel();
        Flight flightSelected = (Flight) tblCustomerFlights.getValueAt(tblCustomerFlights.getSelectedRow(), 1);
        txtSerialNumberVCustomer.setText(flightSelected.getSerialNumber());
        txtDepartureVCustomer.setText(flightSelected.getDeparture());
        txtDestinationVCustomer.setText(flightSelected.getDestination());
        txtDateVCustomer.setText(flightSelected.getDate());
        txtTimeOfDayVCustomer.setText(flightSelected.getTimeOfDay());

    }//GEN-LAST:event_btnCustomerViewDetailsActionPerformed

    private void btnSearchFlightsCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchFlightsCustomerActionPerformed
        // TODO add your handling code here:
        
        
        DefaultTableModel dtm = (DefaultTableModel) tblCustomerFlights.getModel();
        
        String searchInputDeparture = txtDepartureSCustomer.getText();
        String searchInputDestination = txtDestinationSCustomer.getText();
        
        if(isInputInvalid(searchInputDeparture)){
            JOptionPane.showMessageDialog(null, "Departure cannot be empty or number");
            return;
        }
        if(isInputInvalid(searchInputDestination)){
            JOptionPane.showMessageDialog(null, "Destination cannot be empty or number");
            return;
        }
        
        //Empty the table
        dtm.setRowCount(0);
        ArrayList<Flight> returnedFlightsByAirIndia = masterTravelScheduler.searchFlightsByCustomerAirIndia(searchInputDeparture,searchInputDestination); 
        boolean flightsFoundForCustomer = false;
        for(Flight flt : returnedFlightsByAirIndia){
            Object row[] = new Object[2];
            row[0] = "AirIndia";
            row[1] = flt;
            dtm.addRow(row);
            flightsFoundForCustomer = true;
        }
        
        ArrayList<Flight> returnedFlightsByLuftansa = masterTravelScheduler.searchFlightsByCustomerLuftansa(searchInputDeparture,searchInputDestination); 
        for(Flight flt : returnedFlightsByLuftansa){
            Object row[] = new Object[2];
            row[0] = "Luftansa";
            row[1] = flt;
            dtm.addRow(row);
            flightsFoundForCustomer = true;
        }
        if(flightsFoundForCustomer == false){
            JOptionPane.showMessageDialog(null,"No Flights found!");
        }
    }//GEN-LAST:event_btnSearchFlightsCustomerActionPerformed

    public boolean isInputInvalid(String input){
       if(input.isEmpty()){
           return true;
       }
        try{
            Double.parseDouble(input);
        }catch(NullPointerException ne){
            return false;
        }
        catch(NumberFormatException ne){
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookNowCustomer;
    private javax.swing.JButton btnCustomerViewDetails;
    private javax.swing.JButton btnSearchFlightsCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomerFlights;
    private javax.swing.JTextField txtDateVCustomer;
    private javax.swing.JTextField txtDepartureSCustomer;
    private javax.swing.JTextField txtDepartureVCustomer;
    private javax.swing.JTextField txtDestinationSCustomer;
    private javax.swing.JTextField txtDestinationVCustomer;
    private javax.swing.JTextField txtSerialNumberVCustomer;
    private javax.swing.JTextField txtTimeOfDayVCustomer;
    // End of variables declaration//GEN-END:variables
}