package pit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Sales extends javax.swing.JFrame {

    public Sales() {
        initComponents();
        slTABLE.getTableHeader().setFont(new Font("Lilita One", Font.BOLD, 20));
        slTABLE.getTableHeader().setOpaque(false);
        slTABLE.getTableHeader().setBackground(new Color(0, 0, 0));
        slTABLE.getTableHeader().setForeground(new Color(0, 0, 0));
        slTABLE.setRowHeight(30);
        populateSalesTable();
    }

    public void populateSalesTable() {
    ArrayList<Products> productList = getSalesData();
    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) slTABLE.getModel();

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
    // Update total amount label
    totAMS.setText(String.valueOf(getTotalAmount()));
}

public ArrayList<Products> getSalesData() {
    ArrayList<Products> productList = new ArrayList<>();
    Connection con = null;
    String query = "SELECT * FROM sales";

    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/foods_db", "root", "");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            productList.add(new Products(
                rs.getInt("order_id"),
                rs.getInt("id"),
                rs.getString("fname"),
                rs.getInt("total_price"),
                rs.getInt("quantity")
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
    int totalAmount = 0;
    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) slTABLE.getModel();

    for (int i = 0; i < model.getRowCount(); i++) {
        int price = (int) model.getValueAt(i, 3); // Assumes column 3 is the 'total_price'
        totalAmount += price;
    }

    return totalAmount;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SALES_BG = new javax.swing.JPanel();
        SLtableBG = new javax.swing.JPanel();
        SL_Scroll = new javax.swing.JScrollPane();
        slTABLE = new javax.swing.JTable();
        SALES_BackBTN = new javax.swing.JButton();
        clearBTN = new javax.swing.JButton();
        totAMTsl = new javax.swing.JLabel();
        ofSLsl = new javax.swing.JLabel();
        totAMS = new javax.swing.JLabel();
        dollORD = new javax.swing.JLabel();
        sales_pizzaBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SALES_BG.setBackground(new java.awt.Color(230, 230, 230));
        SALES_BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SLtableBG.setBackground(new java.awt.Color(46, 46, 48));
        SLtableBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slTABLE.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        slTABLE.setModel(new javax.swing.table.DefaultTableModel(
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
        slTABLE.setFocusable(false);
        slTABLE.setRowHeight(25);
        slTABLE.setSelectionBackground(new java.awt.Color(255, 255, 255));
        slTABLE.setSelectionForeground(new java.awt.Color(255, 255, 255));
        slTABLE.setShowGrid(true);
        SL_Scroll.setViewportView(slTABLE);

        SLtableBG.add(SL_Scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1400, 550));

        SALES_BackBTN.setBackground(new java.awt.Color(128, 128, 128));
        SALES_BackBTN.setFont(new java.awt.Font("Lilita One", 1, 38)); // NOI18N
        SALES_BackBTN.setForeground(new java.awt.Color(255, 255, 255));
        SALES_BackBTN.setText("BACK");
        SALES_BackBTN.setAlignmentY(0.0F);
        SALES_BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALES_BackBTNActionPerformed(evt);
            }
        });
        SLtableBG.add(SALES_BackBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 593, 170, 80));

        clearBTN.setBackground(new java.awt.Color(255, 0, 51));
        clearBTN.setFont(new java.awt.Font("Lilita One", 1, 38)); // NOI18N
        clearBTN.setForeground(new java.awt.Color(255, 255, 255));
        clearBTN.setText("CLEAR");
        clearBTN.setAlignmentY(0.0F);
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });
        SLtableBG.add(clearBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 593, 170, 80));

        totAMTsl.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        totAMTsl.setForeground(new java.awt.Color(255, 255, 255));
        totAMTsl.setText("TOTAL AMOUNT");
        SLtableBG.add(totAMTsl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 593, 140, 30));

        ofSLsl.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        ofSLsl.setForeground(new java.awt.Color(255, 255, 255));
        ofSLsl.setText("OF SALES");
        SLtableBG.add(ofSLsl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 593, 80, 30));

        totAMS.setFont(new java.awt.Font("Lilita One", 1, 50)); // NOI18N
        totAMS.setForeground(new java.awt.Color(255, 255, 255));
        totAMS.setText("0");
        SLtableBG.add(totAMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 623, 180, 50));

        dollORD.setFont(new java.awt.Font("Lilita One", 1, 60)); // NOI18N
        dollORD.setForeground(new java.awt.Color(255, 255, 255));
        dollORD.setText("P");
        SLtableBG.add(dollORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 623, 40, 50));

        SALES_BG.add(SLtableBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 50, 1440, 700));

        sales_pizzaBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/BG_3blur.png"))); // NOI18N
        SALES_BG.add(sales_pizzaBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        getContentPane().add(SALES_BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SALES_BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALES_BackBTNActionPerformed
        this.dispose();
        new UserChoice().setVisible(true);
    }//GEN-LAST:event_SALES_BackBTNActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
    Connection con = null;
    Statement stmt = null;
    
    int confirmation = JOptionPane.showConfirmDialog(this, "Clear Table?", "CONFIRMATION", JOptionPane.YES_NO_OPTION);
    
    if (confirmation == JOptionPane.YES_OPTION) {
    String deleteQuery = "DELETE FROM sales"; // Ensure the correct table name is used.
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost/foods_db", "root", "");
        stmt = con.createStatement();
        int rowsDeleted = stmt.executeUpdate(deleteQuery); // Get the number of affected rows.

        // Clear the table model.
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) slTABLE.getModel();
        model.setRowCount(0);
        
        // Reset the total amount label
        totAMS.setText("0");

        // Provide user feedback.
        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(this, "All Sales Records Cleared Successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "No Records to Clear!");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        ex.printStackTrace();
    } finally {
        try {
            if (stmt != null) stmt.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }
    }//GEN-LAST:event_clearBTNActionPerformed

    
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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SALES_BG;
    private javax.swing.JButton SALES_BackBTN;
    private javax.swing.JScrollPane SL_Scroll;
    private javax.swing.JPanel SLtableBG;
    private javax.swing.JButton clearBTN;
    private javax.swing.JLabel dollORD;
    private javax.swing.JLabel ofSLsl;
    private javax.swing.JLabel sales_pizzaBG;
    private javax.swing.JTable slTABLE;
    private javax.swing.JLabel totAMS;
    private javax.swing.JLabel totAMTsl;
    // End of variables declaration//GEN-END:variables
}
