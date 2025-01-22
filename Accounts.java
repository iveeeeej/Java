package pit;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Accounts extends javax.swing.JFrame {

    public Accounts() {
        initComponents();
        accTABLE.getTableHeader().setFont(new Font("Lilita One", Font.BOLD, 20));
        accTABLE.getTableHeader().setOpaque(false);
        accTABLE.getTableHeader().setBackground(new Color(0, 0, 0));
        accTABLE.getTableHeader().setForeground(new Color(0, 0, 0));
        accTABLE.setRowHeight(30);
        loadAccounts();
    }

    private void loadAccounts() {
    DefaultTableModel model = (DefaultTableModel) accTABLE.getModel();
    model.setRowCount(0); // Clear existing rows

    String query = "SELECT user_id, username FROM user_accounts";

    try (Connection con = Database.getConnection();
         PreparedStatement pst = con.prepareStatement(query);
         ResultSet rs = pst.executeQuery()) {

        while (rs.next()) {
            int accountId = rs.getInt("user_id");
            String username = rs.getString("username");

            // Add row to table model
            model.addRow(new Object[]{accountId, username});
        }

    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
    
    private void deleteAccount() {
    String accountId = delACCtxt.getText();
    if (accountId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Input Field is Empty!");
        return;
    }
    
    int confirmation = JOptionPane.showConfirmDialog(this, "Confirm Account Deletion?", "DELETE CONFIRMATION", JOptionPane.YES_NO_OPTION);
    
    if (confirmation == JOptionPane.YES_OPTION) {
        String query = "DELETE FROM user_accounts WHERE user_id = ?";
        try (Connection con = Database.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, Integer.parseInt(accountId));
            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Account Deleted Successfully");
                loadAccounts();
            } else {
                JOptionPane.showMessageDialog(this, "Account Not Found!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error Deleting Account!");
        }
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        accSCROLL = new javax.swing.JScrollPane();
        accTABLE = new javax.swing.JTable();
        acc_BackBTN = new javax.swing.JButton();
        delBTN = new javax.swing.JButton();
        enterACCid = new javax.swing.JLabel();
        delACCtxt = new javax.swing.JTextField();
        acc_pizzaBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(46, 46, 48));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accTABLE.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        accTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ACCOUNT ID", "USERNAME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        accTABLE.setFocusable(false);
        accTABLE.setRowHeight(25);
        accTABLE.setSelectionBackground(new java.awt.Color(255, 255, 255));
        accTABLE.setSelectionForeground(new java.awt.Color(255, 255, 255));
        accTABLE.setShowGrid(true);
        accSCROLL.setViewportView(accTABLE);

        jPanel2.add(accSCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1400, 550));

        acc_BackBTN.setBackground(new java.awt.Color(128, 128, 128));
        acc_BackBTN.setFont(new java.awt.Font("Lilita One", 1, 38)); // NOI18N
        acc_BackBTN.setForeground(new java.awt.Color(255, 255, 255));
        acc_BackBTN.setText("BACK");
        acc_BackBTN.setAlignmentY(0.0F);
        acc_BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc_BackBTNActionPerformed(evt);
            }
        });
        jPanel2.add(acc_BackBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 593, 170, 80));

        delBTN.setBackground(new java.awt.Color(46, 46, 48));
        delBTN.setFont(new java.awt.Font("Lilita One", 1, 17)); // NOI18N
        delBTN.setForeground(new java.awt.Color(255, 255, 255));
        delBTN.setText("DELETE ACCOUNT");
        delBTN.setAlignmentY(0.0F);
        delBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBTNActionPerformed(evt);
            }
        });
        jPanel2.add(delBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 593, 170, 80));

        enterACCid.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        enterACCid.setForeground(new java.awt.Color(255, 255, 255));
        enterACCid.setText("ENTER ACCOUNT ID");
        jPanel2.add(enterACCid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 593, 170, 30));

        delACCtxt.setBackground(new java.awt.Color(242, 242, 242));
        delACCtxt.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jPanel2.add(delACCtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 623, 230, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 50, 1440, 700));

        acc_pizzaBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/BG_3blur.png"))); // NOI18N
        jPanel1.add(acc_pizzaBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 1540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acc_BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc_BackBTNActionPerformed
        this.dispose();
        new UserChoice().setVisible(true);
    }//GEN-LAST:event_acc_BackBTNActionPerformed

    private void delBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBTNActionPerformed
        deleteAccount();
    }//GEN-LAST:event_delBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane accSCROLL;
    private javax.swing.JTable accTABLE;
    private javax.swing.JButton acc_BackBTN;
    private javax.swing.JLabel acc_pizzaBG;
    private javax.swing.JTextField delACCtxt;
    private javax.swing.JButton delBTN;
    private javax.swing.JLabel enterACCid;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
