/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SalesPersonRole;

import Business.*;
import Business.Customer;
import Business.Market;
import Business.Market.MarketType;
import Business.MarketOffer;
import Business.Person;
import Business.Product;
import Business.Supplier;
import java.awt.CardLayout;
import static java.lang.Math.abs;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nidhisarode
 */
public class BookCustomerOrderJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
    Person person;
    Customer customer;
    ArrayList<OrderItem> cartItems =new ArrayList<>();
    int initialavailability;

    /**
     * Creates new form BookCustomerOrderJPanel
     */
    public BookCustomerOrderJPanel() {
        initComponents();
    }

    BookCustomerOrderJPanel(JPanel userProcessContainer, Business business, Person person, Customer customer) {
        initComponents();

        this.business = business;
        this.userProcessContainer = userProcessContainer;
        this.person = person;
        this.customer = customer;
        customerNameTextField.setText(customer.toString());
//        cartItems = new ArrayList<>();
        initSupplierComboBox();
        initProdtable();
        refreshOrderTable();
        myCommissionTextField.setText(String.valueOf(person.getMyCommision()));
    }

    public void refreshOrderTable() {
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        model.setRowCount(0);
    }

    public void updateCart() {
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        model.setRowCount(0);

        for (OrderItem orderItem : cartItems) {
            Object row[] = new Object[5];
            row[0] = orderItem;
            row[1] = orderItem.getProduct();
            row[2] = orderItem.getProduct().getProdName();
            row[3] = orderItem.getQuantity();
            row[4] = orderItem.getSalesPrice();

            model.addRow(row);
        }
    }

    public void initSupplierComboBox() {

        for (Supplier s : business.getSupplierDirectory().getSupplierlist()) {

            suppComboBox.addItem(s);
        }

    }

    public MarketOffer getMarketOfferNum(Supplier supplier, Product product, Market.MarketType marketType) {

        for (Supplier s : business.getSupplierDirectory().getSupplierlist()) {
            if (supplier.equals(s)) {
                for (Product p : s.getProductCatalog().getProductList()) {
                    if (product.equals(p)) {
                        for (MarketOffer mo : business.getMarketOfferCatalog().getMarketOfferList()) {
                            if ((mo.getMarket().equals(marketType)) && (mo.getProduct().equals(product))) {
                                return mo;
                            }
                        }
                    }
                }
            }
        }
        return null;

    }

    public void initProdtable() {
        Supplier s = business.getSupplierDirectory().getSupplierlist().get(0);

        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.setRowCount(0);

        Market.MarketType markettype = customer.getMarket();

        for (Product p
                : s.getProductCatalog()
                        .getProductList()) {

            MarketOffer marketOffer = getMarketOfferNum(s, p, markettype);

            Object row[] = new Object[6];
            row[0] = p;
            row[1] = p.getProdName();
            if (marketOffer == null) {
                row[2] = 0;
                row[3] = 0;
                row[4] = 0;
                row[5] = 0;
            } else {
                row[2] = marketOffer.getFloorPrice();
                row[3] = marketOffer.getTargetPrice();
                row[4] = marketOffer.getCeilingPrice();
                row[5] = p.getAvailability();
            }

            model.addRow(row);
        }

    }

    public void refreshProductTable() {
        Supplier s = (Supplier) suppComboBox.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.setRowCount(0);

        MarketType markettype = customer.getMarket();

        for (Product p
                : s.getProductCatalog()
                        .getProductList()) {

            MarketOffer marketOffer = getMarketOfferNum(s, p, markettype);

            Object row[] = new Object[6];
            row[0] = p;
            row[1] = p.getProdName();
            if (marketOffer == null) {
                row[2] = 0;
                row[3] = 0;
                row[4] = 0;
                row[5] = 0;
            } else {
                row[2] = marketOffer.getFloorPrice();
                row[3] = marketOffer.getTargetPrice();
                row[4] = marketOffer.getCeilingPrice();
                row[5] = p.getAvailability();
            }

            model.addRow(row);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        customerNameTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        myCommissionTextField = new javax.swing.JTextField();
        btnCancelOrder = new javax.swing.JButton();
        btnSubmitOrder = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        suppComboBox = new javax.swing.JComboBox();
        addtoCartButton6 = new javax.swing.JButton();
        quantitySpinner = new javax.swing.JSpinner();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        btnRemoveOrderItem = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lastOrderCommTxtFld = new javax.swing.JTextField();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Customer Info");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Book Customer Order ");

        jLabel3.setText("Customer Name:");

        customerNameTextField.setEnabled(false);
        customerNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Total Commission:");

        myCommissionTextField.setEnabled(false);

        btnCancelOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelOrder.setText("Cancel Order");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });

        btnSubmitOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSubmitOrder.setText("Submit Order");
        btnSubmitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitOrderActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Item in cart");

        suppComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppComboBoxActionPerformed(evt);
            }
        });

        addtoCartButton6.setText("ADD TO CART");
        addtoCartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartButton6ActionPerformed(evt);
            }
        });

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");

        btnRemoveOrderItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Sales Price");

        productTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Name", "Floor Price", "Target Price", "Ceiling Price ", "Avail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Supplier Product Catalog");

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderItem Num", "Product Id", "Product Name", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(orderTable);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Supplier");

        jLabel9.setText("Commission for last order:");

        lastOrderCommTxtFld.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1)
                .addContainerGap(284, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelOrder)
                .addGap(26, 26, 26)
                .addComponent(btnSubmitOrder)
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastOrderCommTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myCommissionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(suppComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(448, 448, 448)
                            .addComponent(btnRemoveOrderItem))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(210, 210, 210)
                            .addComponent(jLabel12)
                            .addGap(17, 17, 17)
                            .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(addtoCartButton6))
                        .addComponent(jScrollPane1)
                        .addComponent(jScrollPane4))
                    .addContainerGap(67, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(myCommissionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lastOrderCommTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(557, 557, 557)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelOrder)
                    .addComponent(btnSubmitOrder)
                    .addComponent(btnBack))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(148, 148, 148)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(suppComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)
                    .addComponent(jLabel13)
                    .addGap(8, 8, 8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addtoCartButton6))
                    .addGap(22, 22, 22)
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(btnRemoveOrderItem)
                    .addContainerGap(186, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void customerNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameTextFieldActionPerformed

    private void suppComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppComboBoxActionPerformed
        // TODO add your handling code here:

        refreshProductTable();
    }//GEN-LAST:event_suppComboBoxActionPerformed


    private void addtoCartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoCartButton6ActionPerformed
        // TODO add your handling code here:

        int selectedRow = productTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a product");
            return;
        }
        Product p = (Product) productTable.getValueAt(selectedRow, 0);
        int availability = (int) productTable.getValueAt(selectedRow, 5);
        double targetPrice = (double) productTable.getValueAt(selectedRow, 3);
        double floorPrice = (double) productTable.getValueAt(selectedRow, 2);

        if (availability == 0) {
            JOptionPane.showMessageDialog(null, "Sorry this product isnt available");
            return;
        }
        double salesPrice = 0;
        int quantity;
        try {
            salesPrice = Double.parseDouble(txtSalesPrice.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter valid price!");
            return;
        }
        if (salesPrice <= 0) {
            JOptionPane.showMessageDialog(null, "This product can not be sold for free!!");
            return;
        }

        if (salesPrice < (double) (productTable.getValueAt(selectedRow, 2))) {
            JOptionPane.showMessageDialog(null, "This product can not be sold for that price!!");
            return;
        }
        try {
            quantity = (Integer) quantitySpinner.getValue();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter valid price!");
            return;
        }
        if ((quantity <= 0)) {
            JOptionPane.showMessageDialog(null, "Please enter valid quantity!");
            return;
        }
        initialavailability = p.getAvailability();
        int remaining = (initialavailability) - quantity;
        if (remaining < 0) {
            JOptionPane.showMessageDialog(null, "Quantity not available!");
            return;
        }
        double totalSellingPrice = (double) (salesPrice * quantity);
        double totaltargetPrice = (double) (targetPrice * quantity);
        double totalfloorPrice = (double) (floorPrice * quantity);

        p.setAvailability(remaining);
        addToCart(p, totalSellingPrice, quantity, totaltargetPrice, totalfloorPrice);


    }//GEN-LAST:event_addtoCartButton6ActionPerformed

//    public OrderItem searchCartItem(Product p){
//        
//        }
    public void addToCart(Product p, double totalSellingPrice, int quantity, double totaltargetPrice, double totalfloorPrice) {

        for (OrderItem o : cartItems) {
            if (o.getProduct().equals(p)) {
                int q = o.getQuantity();
                q += quantity;
                double ttp = o.getTargetPrice();
                ttp += totaltargetPrice;
                double tfp = o.getFloorPrice();
                tfp += totalfloorPrice;
                OrderItem orderItem = new OrderItem();
                orderItem.setProduct(o.getProduct());
                orderItem.setQuantity(q);
//                orderItem.setSalesPrice(o.getSalesPrice());
                double price = o.getSalesPrice();
                price += totalSellingPrice;
                orderItem.setSalesPrice(price);
                orderItem.setTargetPrice(ttp);
                orderItem.setFloorPrice(tfp);
                orderItem.setMarket(o.getMarket());
                cartItems.remove(o);
                cartItems.add(orderItem);
                updateCart();
                refreshProductTable();
                return;

            }
        }

        OrderItem orderItem = new OrderItem();
        orderItem.setProduct(p);
        orderItem.setQuantity(quantity);
        orderItem.setSalesPrice(totalSellingPrice);
        orderItem.setMarket(customer.getMarket());
        orderItem.setTargetPrice(totaltargetPrice);
        orderItem.setFloorPrice(totalfloorPrice);
        cartItems.add(orderItem);

        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();

        Object row[] = new Object[5];
        row[0] = orderItem;
        row[1] = orderItem.getProduct();
        row[2] = orderItem.getProduct().getProdName();
        row[3] = orderItem.getQuantity();
        row[4] = orderItem.getSalesPrice();

        model.addRow(row);

        refreshProductTable();
    }


    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed
        int s = orderTable.getSelectedRow();
        if (s < 0) {
            JOptionPane.showMessageDialog(null, "Please select an order to remove");
            return;
        }
        OrderItem oi = (OrderItem) orderTable.getValueAt(s, 0);
        int avail = oi.getQuantity();
        int prodavail = oi.getProduct().getAvailability();
        oi.getProduct().setAvailability(avail + prodavail);
        cartItems.remove(oi);
//        oi.getProduct().setAvailability(initialavailability);
        updateCart();
        refreshProductTable();


    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void btnSubmitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitOrderActionPerformed
        // TODO add your handling code here:
        Order order = new Order();
        
        for (OrderItem oi : cartItems) {
            order.addOrderItemList(oi);
        }
        
        person.addOrders(order);
        //System.out.println(person.getOrderCatalog().;

        double salesComm = person.getMyCommision();
        for (OrderItem o : cartItems) {

            if (o.getSalesPrice() >= o.getTargetPrice()) {
                double c = (0.2) * (o.getSalesPrice());
                salesComm += c;
                person.setMyCommision(salesComm);
              

            } else {
                double c = (0.05) * (o.getSalesPrice());
                salesComm += c;
                person.setMyCommision(salesComm);
                int b = person.getBelowTargetSales();
                person.setBelowTargetSales(++b);
            }
            

        }
        JOptionPane.showMessageDialog(null, "Order Successfully placed!");

        double a = Double.parseDouble(myCommissionTextField.getText());
        double b = abs(a - person.getMyCommision());
        lastOrderCommTxtFld.setText(String.valueOf(b));
        myCommissionTextField.setText(String.valueOf(person.getMyCommision()));
        
        cartItems.clear();
        
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        model.setRowCount(0);
        refreshProductTable();


    }//GEN-LAST:event_btnSubmitOrderActionPerformed

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        model.setRowCount(0);

        for (OrderItem oi : cartItems) {
            int avail = oi.getQuantity();
            int prodavail = oi.getProduct().getAvailability();
            oi.getProduct().setAvailability(avail + prodavail);
        }

        cartItems.clear();
        refreshProductTable();
    }//GEN-LAST:event_btnCancelOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtoCartButton6;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JButton btnSubmitOrder;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField lastOrderCommTxtFld;
    private javax.swing.JTextField myCommissionTextField;
    private javax.swing.JTable orderTable;
    private javax.swing.JTable productTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JComboBox suppComboBox;
    private javax.swing.JTextField txtSalesPrice;
    // End of variables declaration//GEN-END:variables
}
