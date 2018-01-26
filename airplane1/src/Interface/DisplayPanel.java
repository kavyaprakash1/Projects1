/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import Business.Airplanes;
import Business.FleetCatalog;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author kavyaprakash
 */

public class DisplayPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayPanel
     */
    private FleetCatalog ctg;

    public DisplayPanel(FleetCatalog ctg, int buttonType) {
        initComponents();
        this.ctg = ctg;
        DefaultTableModel tableModel = (DefaultTableModel) tblResult.getModel();
//For finding by Boeing ,buttonType is 1
        boolean boeingFound = false;
        if (buttonType == 1) {
            for (Airplanes airplane : ctg.fleetCatalog) {
                if (airplane.getAirliner().equalsIgnoreCase("boeing")) {
                    Object[] eachRow = new Object[2];
                    eachRow[0] = airplane;
                    eachRow[1] = airplane.getAirliner();
                    tableModel.addRow(eachRow);
                    boeingFound = true;

                }

            }
            if (!boeingFound) {
                JOptionPane.showMessageDialog(null, "No Boeing airplanes found");

            }
        }
    }

    //Constructor with three parameters with one of them being the input from pop-up
    private String byAirport;
    private String byYearManufactured;
    private String byModelNumber;
    private String bySerialNumber;

    public DisplayPanel(FleetCatalog ctg, int buttonType, String userInput) {

        initComponents();
        this.ctg = ctg;
        //For finding by airport , button type is 2
        if (buttonType == 2) {

            byAirport = userInput;
            DefaultTableModel tableModel = (DefaultTableModel) tblResult.getModel();

            boolean noAirports = true;
            for (Airplanes airplane : ctg.fleetCatalog) {
                if (airplane.getAirport().equalsIgnoreCase(byAirport)) {
                    Object[] eachRow = new Object[2];
                    eachRow[0] = airplane;
                    eachRow[1] = airplane.getAirliner();
                    tableModel.addRow(eachRow);
                    noAirports = false;
                }

            }
            if (noAirports) {
                JOptionPane.showMessageDialog(null, "No airplanes found in the given airport");

            }
        }

        //For listing by Model number, buttonType is 3 
        if (buttonType == 3) {
            byModelNumber = userInput;
            DefaultTableModel tableModel = (DefaultTableModel) tblResult.getModel();

            boolean noFlights = true;
            for (Airplanes airplane : ctg.fleetCatalog) {
                if (airplane.getModelNumber().equals(byModelNumber)) {
                    Object[] eachRow = new Object[2];
                    eachRow[0] = airplane;
                    eachRow[1] = airplane.getAirliner();
                    tableModel.addRow(eachRow);
                    noFlights = false;

                }
            }
            if (noFlights) {
                JOptionPane.showMessageDialog(null, "No flights found");
            }
        }
        // For listing by year manufactured the button type is 4
        if (buttonType == 4) {
            byYearManufactured = userInput;
            DefaultTableModel tableModel = (DefaultTableModel) tblResult.getModel();
            boolean noFlights = true;
            for (Airplanes airplane : ctg.fleetCatalog) {
                if (airplane.getYearManufactured().equalsIgnoreCase(byYearManufactured)) {
                    Object[] eachRow = new Object[2];
                    eachRow[0] = airplane;
                    eachRow[1] = airplane.getAirliner();
                    tableModel.addRow(eachRow);
                    noFlights = false;
                }
            }
            if (noFlights) {
                JOptionPane.showMessageDialog(null, "No Flights found");
            }
        }
        //For listing by serial number button type is 5
        if (buttonType == 5){
            bySerialNumber = userInput;
            DefaultTableModel tableModel = (DefaultTableModel) tblResult.getModel();
            boolean noFlights = true;
            for (Airplanes airplane : ctg.fleetCatalog) {
                if (airplane.getSerialNumber().equalsIgnoreCase(bySerialNumber)) {
                    Object[] eachRow = new Object[2];
                    eachRow[0] = airplane;
                    eachRow[1] = airplane.getAirliner();
                    tableModel.addRow(eachRow);
                    noFlights = false;
                
                }
            }
        }
        //For listing of flights when minimun and maximum seats are given the button type is 6
        
        
    }

    DisplayPanel(ArrayList<Airplanes> filteredResult){
       initComponents();
       DefaultTableModel tableModel = (DefaultTableModel) tblResult.getModel();
       for(Airplanes airplane : filteredResult){
                   Object[] eachRow = new Object[2];
                    eachRow[0] = airplane;
                    eachRow[1] = airplane.getAirliner();
                    tableModel.addRow(eachRow);
       }             
    }
    DisplayPanel(Airplanes airplane) {
        initComponents();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        rAirliner.setText(airplane.getAirliner());
        rSerialNumber.setText(airplane.getSerialNumber());
        rModelNumber.setText(airplane.getModelNumber());
        rAvailableSeats.setText(airplane.getAvailableSeats());
        rManufacturer.setText(airplane.getManufacturer());
        rNumberOfSeats.setText(airplane.getNumberOfSeats());
        rTakeOffTime.setText(airplane.getTakeOffTime());
        rAirport.setText(airplane.getAirport());
        rMaintainanceExpiry.setText(airplane.getMaintainanceCertificateDate());
        rManufacturedYear.setText(airplane.getYearManufactured());
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
        tblResult = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rSerialNumber = new javax.swing.JTextField();
        rNumberOfSeats = new javax.swing.JTextField();
        rAvailableSeats = new javax.swing.JTextField();
        rAirliner = new javax.swing.JTextField();
        rManufacturer = new javax.swing.JTextField();
        rModelNumber = new javax.swing.JTextField();
        rTakeOffTime = new javax.swing.JTextField();
        rAirport = new javax.swing.JTextField();
        rMaintainanceExpiry = new javax.swing.JTextField();
        btnViewDetails = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        rManufacturedYear = new javax.swing.JTextField();

        tblResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Number", "Airliner"
            }
        ));
        jScrollPane1.setViewportView(tblResult);

        jLabel1.setText("Serial Number: ");

        jLabel2.setText("Take off time:");

        jLabel3.setText("Airport:");

        jLabel4.setText("Manufacturer:");

        jLabel5.setText("No of seats:");

        jLabel6.setText("Available seats:");

        jLabel7.setText("Airliner:");

        jLabel8.setText("Maintainance expiry:");

        jLabel9.setText("Model Number:");

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        jLabel10.setText("Manufactured year: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rAirliner))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rAvailableSeats))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rNumberOfSeats))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(12, 12, 12))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnViewDetails)
                                .addGap(12, 12, 12)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rMaintainanceExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rTakeOffTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                        .addComponent(rModelNumber, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rAirport, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rManufacturedYear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewDetails)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(rSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(rTakeOffTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rNumberOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rAirport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rAvailableSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rMaintainanceExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(rManufacturedYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblResult.getSelectedRow();

        if (selectedRow >= 0) {
            Airplanes airplane = (Airplanes) tblResult.getValueAt(selectedRow, 0);
            rAirliner.setText(airplane.getAirliner());
            rSerialNumber.setText(airplane.getSerialNumber());
            rModelNumber.setText(airplane.getModelNumber());
            rAvailableSeats.setText(airplane.getAvailableSeats());
            rManufacturer.setText(airplane.getManufacturer());
            rNumberOfSeats.setText(airplane.getNumberOfSeats());
            rTakeOffTime.setText(airplane.getTakeOffTime());
            rAirport.setText(airplane.getAirport());
            rMaintainanceExpiry.setText(airplane.getMaintainanceCertificateDate());
            rManufacturedYear.setText(airplane.getYearManufactured());
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }

    }//GEN-LAST:event_btnViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rAirliner;
    private javax.swing.JTextField rAirport;
    private javax.swing.JTextField rAvailableSeats;
    private javax.swing.JTextField rMaintainanceExpiry;
    private javax.swing.JTextField rManufacturedYear;
    private javax.swing.JTextField rManufacturer;
    private javax.swing.JTextField rModelNumber;
    private javax.swing.JTextField rNumberOfSeats;
    private javax.swing.JTextField rSerialNumber;
    private javax.swing.JTextField rTakeOffTime;
    private javax.swing.JTable tblResult;
    // End of variables declaration//GEN-END:variables
}
