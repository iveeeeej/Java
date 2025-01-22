package pit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OrderList extends javax.swing.JFrame {

    public OrderList() {
        initComponents();
        ordTABLE.getTableHeader().setFont(new Font("Lilita One", Font.BOLD, 20));
        ordTABLE.getTableHeader().setOpaque(false);
        ordTABLE.getTableHeader().setBackground(new Color(0, 0, 0));
        ordTABLE.getTableHeader().setForeground(new Color(0, 0, 0));
        ordTABLE.setRowHeight(30);
        populateTable();
    }
    
    private void removeOrderById(int orderId) {
    Connection con = null;
    try {
        // Connect to the database
        con = DriverManager.getConnection("jdbc:mysql://localhost/foods_db", "root", "");
        
        // Delete query
        String deleteQuery = "DELETE FROM orders WHERE order_id = ?";
        PreparedStatement pst = con.prepareStatement(deleteQuery);
        pst.setInt(1, orderId);

        // Execute the delete statement
        int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Order Removed Successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Unavailable Order ID: " + orderId);
        }

        // Refresh the table
        populateTable();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        ex.printStackTrace();
    } finally {
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OrdL_BG = new javax.swing.JPanel();
        ORDtableBG = new javax.swing.JPanel();
        ORDScroll = new javax.swing.JScrollPane();
        ordTABLE = new javax.swing.JTable();
        OrdBTN = new javax.swing.JButton();
        UpBTN = new javax.swing.JButton();
        OrdL_BackBTN = new javax.swing.JButton();
        RmvItemBTN = new javax.swing.JButton();
        enterORDid = new javax.swing.JLabel();
        RMVtxt = new javax.swing.JTextField();
        totAMT = new javax.swing.JLabel();
        dollORD = new javax.swing.JLabel();
        totAMTord = new javax.swing.JLabel();
        order_pizzaBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OrdL_BG.setBackground(new java.awt.Color(230, 230, 230));
        OrdL_BG.setPreferredSize(new java.awt.Dimension(1540, 800));
        OrdL_BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ORDtableBG.setBackground(new java.awt.Color(46, 46, 48));
        ORDtableBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ordTABLE.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        ordTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ORDER ID", "FOOD ID", "FOOD NAME", "PRICE", "QUANTITY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ordTABLE.setFocusable(false);
        ordTABLE.setRowHeight(25);
        ordTABLE.setSelectionBackground(new java.awt.Color(255, 0, 51));
        ordTABLE.setSelectionForeground(new java.awt.Color(255, 255, 255));
        ordTABLE.setShowGrid(true);
        ordTABLE.getTableHeader().setReorderingAllowed(false);
        ORDScroll.setViewportView(ordTABLE);

        ORDtableBG.add(ORDScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1400, 550));

        OrdBTN.setBackground(new java.awt.Color(255, 0, 51));
        OrdBTN.setFont(new java.awt.Font("Lilita One", 1, 38)); // NOI18N
        OrdBTN.setForeground(new java.awt.Color(255, 255, 255));
        OrdBTN.setText("ORDER");
        OrdBTN.setAlignmentY(0.0F);
        OrdBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdBTNActionPerformed(evt);
            }
        });
        ORDtableBG.add(OrdBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 593, 170, 80));

        UpBTN.setBackground(new java.awt.Color(46, 46, 48));
        UpBTN.setFont(new java.awt.Font("Lilita One", 1, 22)); // NOI18N
        UpBTN.setForeground(new java.awt.Color(255, 255, 255));
        UpBTN.setText("UPDATE QTY");
        UpBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpBTNActionPerformed(evt);
            }
        });
        ORDtableBG.add(UpBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 593, 170, 80));

        OrdL_BackBTN.setBackground(new java.awt.Color(128, 128, 128));
        OrdL_BackBTN.setFont(new java.awt.Font("Lilita One", 1, 38)); // NOI18N
        OrdL_BackBTN.setForeground(new java.awt.Color(255, 255, 255));
        OrdL_BackBTN.setText("BACK");
        OrdL_BackBTN.setAlignmentY(0.0F);
        OrdL_BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdL_BackBTNActionPerformed(evt);
            }
        });
        ORDtableBG.add(OrdL_BackBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 593, 170, 80));

        RmvItemBTN.setBackground(new java.awt.Color(46, 46, 48));
        RmvItemBTN.setFont(new java.awt.Font("Lilita One", 1, 20)); // NOI18N
        RmvItemBTN.setForeground(new java.awt.Color(255, 255, 255));
        RmvItemBTN.setText("REMOVE ITEM");
        RmvItemBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RmvItemBTNActionPerformed(evt);
            }
        });
        ORDtableBG.add(RmvItemBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 593, 170, 80));

        enterORDid.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        enterORDid.setForeground(new java.awt.Color(255, 255, 255));
        enterORDid.setText("ENTER ORDER ID");
        ORDtableBG.add(enterORDid, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 593, 140, 30));

        RMVtxt.setBackground(new java.awt.Color(242, 242, 242));
        RMVtxt.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ORDtableBG.add(RMVtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 623, 230, 50));

        totAMT.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        totAMT.setForeground(new java.awt.Color(255, 255, 255));
        totAMT.setText("TOTAL AMOUNT");
        ORDtableBG.add(totAMT, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 593, 140, 30));

        dollORD.setFont(new java.awt.Font("Lilita One", 1, 60)); // NOI18N
        dollORD.setForeground(new java.awt.Color(255, 255, 255));
        dollORD.setText("P");
        ORDtableBG.add(dollORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 623, 40, 50));

        totAMTord.setFont(new java.awt.Font("Lilita One", 1, 50)); // NOI18N
        totAMTord.setForeground(new java.awt.Color(255, 255, 255));
        totAMTord.setText("0");
        ORDtableBG.add(totAMTord, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 623, 140, 50));

        OrdL_BG.add(ORDtableBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 50, 1440, 700));

        order_pizzaBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/BG_3blur.png"))); // NOI18N
        OrdL_BG.add(order_pizzaBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(OrdL_BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(OrdL_BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrdL_BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdL_BackBTNActionPerformed
        this.dispose();
        new Menu2().setVisible(true);
    }//GEN-LAST:event_OrdL_BackBTNActionPerformed

    private void OrdBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdBTNActionPerformed
        if (ordTABLE.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "No orders were made!", "Order Error", JOptionPane.WARNING_MESSAGE);
        return; // Exit the method if the table is empty
    }
        
        int confirmation = JOptionPane.showConfirmDialog(this, "Confirm Order?", "ORDER CONFIRMATION", JOptionPane.YES_NO_OPTION);
        
    
    if (confirmation == JOptionPane.YES_OPTION) {
        Connection con = null;
        try {
            // Connect to the database
            con = DriverManager.getConnection("jdbc:mysql://localhost/foods_db", "root", "");
            
            ArrayList<Products> orderData = getProductList();

            // Insert the order data into the 'sales' table
            String insertQuery = "INSERT INTO sales (order_id, id, fname, quantity, total_price) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(insertQuery);

            for (Products product : orderData) {
                pst.setInt(1, product.getOrderId());
                pst.setInt(2, product.getId());
                pst.setString(3, product.getprd_NAME());
                pst.setInt(4, product.getQty());
                pst.setInt(5, product.getPrice());

                pst.addBatch(); // Add to batch for efficient insertion
            }

            // Execute the batch insert
            pst.executeBatch();
            
            // Clear the 'orders' table in the database
            String deleteQuery = "DELETE FROM orders";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(deleteQuery);

            // Clear the JTable
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) ordTABLE.getModel();
            model.setRowCount(0);

            // Display success message
            JOptionPane.showMessageDialog(this, "Order Placed Successfully! Proceed to Counter");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // Close the current frame and return to the Menu
        this.dispose();
        new Menu2().setVisible(true);
    }
    }//GEN-LAST:event_OrdBTNActionPerformed

    private void RmvItemBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RmvItemBTNActionPerformed
        String orderIdText = RMVtxt.getText();
    
    // Validate input
    if (orderIdText.isEmpty()) {
        JOptionPane.showMessageDialog(OrderList.this, "Please Enter an Order ID!");
        return;
    }

    try {
        int orderId = Integer.parseInt(orderIdText);
        removeOrderById(orderId);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(OrderList.this, "Invalid Order ID!");
    }
    }//GEN-LAST:event_RmvItemBTNActionPerformed

    private void UpBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpBTNActionPerformed
        int selectedRow = ordTABLE.getSelectedRow(); // Get the selected row in the table

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please Select a Row to Update!");
        return;
    }

    try {
        // Get the order ID and new quantity from the table and user
        int orderId = (int) ordTABLE.getValueAt(selectedRow, 0); // Assuming column 0 holds order ID
        String newQuantityStr = JOptionPane.showInputDialog(this, "Enter New Quantity:");

        if (newQuantityStr == null || newQuantityStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Quantity Cannot be Empty!");
            return;
        }

        int newQuantity = Integer.parseInt(newQuantityStr);

        // Validate the quantity
        if (newQuantity <= 0) {
            JOptionPane.showMessageDialog(this, "Quantity must be Greater than 0!");
            return;
        }

        // Update the quantity and calculate the new price in the database
        Connection con = Database.getConnection();
        String updateQuery = "UPDATE orders SET quantity = ?, total_price = quantity * (SELECT price FROM products WHERE products.id = orders.id) WHERE order_id = ?";
        PreparedStatement pst = con.prepareStatement(updateQuery);
        pst.setInt(1, newQuantity);
        pst.setInt(2, orderId);

        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Product Quantity Updated Successfully!");
            populateTable(); // Refresh the table
        } else {
            JOptionPane.showMessageDialog(this, "Failed to Update Product Quantity. Please Try Again!");
        }

        con.close();
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid Input for Quantity!");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_UpBTNActionPerformed

    public ArrayList<Products> getProductList() {
    ArrayList<Products> productList = new ArrayList<>();
    Connection con = null;
    String query = "SELECT * FROM orders";

    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/foods_db", "root", "");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            productList.add(new Products(
                rs.getInt("order_id"), 
                rs.getInt("id"),       
                rs.getString("fname"),
                rs.getInt("quantity"),
                rs.getInt("total_price")
            ));
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        ex.printStackTrace();
    } finally {
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return productList;
}
    
    private int getTotalAmount() {
    int total = 0;
    Connection con = null;
    String query = "SELECT SUM(total_price) AS total FROM orders";

    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/foods_db", "root", "");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        if (rs.next()) {
            total = rs.getInt("total");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        ex.printStackTrace();
    } finally {
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return total;
}

    
    public void populateTable() {
    ArrayList<Products> productList = getProductList();
    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) ordTABLE.getModel();

    // Clear existing rows
    model.setRowCount(0);

    // Add rows to the table
    for (Products product : productList) {
        model.addRow(new Object[]{
            product.getOrderId(),
            product.getId(),
            product.getprd_NAME(),
            product.getQty(),
            product.getPrice()
        });
    }
    totAMTord.setText(String.valueOf(getTotalAmount()));
}
    
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
            java.util.logging.Logger.getLogger(OrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ORDScroll;
    private javax.swing.JPanel ORDtableBG;
    private javax.swing.JButton OrdBTN;
    private javax.swing.JPanel OrdL_BG;
    private javax.swing.JButton OrdL_BackBTN;
    private javax.swing.JTextField RMVtxt;
    private javax.swing.JButton RmvItemBTN;
    private javax.swing.JButton UpBTN;
    private javax.swing.JLabel dollORD;
    private javax.swing.JLabel enterORDid;
    private javax.swing.JTable ordTABLE;
    private javax.swing.JLabel order_pizzaBG;
    private javax.swing.JLabel totAMT;
    private javax.swing.JLabel totAMTord;
    // End of variables declaration//GEN-END:variables
}
