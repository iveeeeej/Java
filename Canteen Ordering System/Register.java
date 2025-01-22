package pit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.awt.Color;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
        regBG2.setBackground(new Color(153, 153, 153, 95));
        //regBG3.setBackground(new Color(255, 255, 255, 95));
    }

    private void registerUser(){
        String user = reg_txtUSRNAME.getText();
        String password = reg_txtPASS.getText();
        String confpassword = reg_txtREPASS.getText();
        
        if (user.isEmpty() || password.isEmpty() || confpassword.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All Input Fields are Required!");
        return;
    }
        
        // Check if passwords match
        if (!password.equals(confpassword)) {
            JOptionPane.showMessageDialog(this, "Passwords Do Not Match!");
            return;
        }
        
        String checkQuery = "SELECT * FROM user_accounts WHERE username = ?";
    String insertQuery = "INSERT INTO user_accounts (username, password) VALUES (?, ?)";

    try (Connection con = Database.getConnection();
         PreparedStatement checkPst = con.prepareStatement(checkQuery)) {

        checkPst.setString(1, user);

        try (ResultSet rs = checkPst.executeQuery()) {
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Username Already Exists!");
            } else {
                try (PreparedStatement insertPst = con.prepareStatement(insertQuery)) {
                    insertPst.setString(1, user);
                    insertPst.setString(2, password);

                    int rowsInserted = insertPst.executeUpdate();
                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(this, "Account Registered Successfully!");
                        new Log().setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Account Registration Failed.");
                    }
                }
            }
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        ex.printStackTrace();
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regBG = new javax.swing.JPanel();
        regBG2 = new javax.swing.JPanel();
        regLOGO = new javax.swing.JLabel();
        regBG3 = new javax.swing.JPanel();
        regUSRNAME = new javax.swing.JLabel();
        regPASS = new javax.swing.JLabel();
        regCONPASS = new javax.swing.JLabel();
        reg_txtUSRNAME = new javax.swing.JTextField();
        regHIDE = new javax.swing.JLabel();
        regSHOW = new javax.swing.JLabel();
        reg_txtPASS = new javax.swing.JPasswordField();
        regHIDE2 = new javax.swing.JLabel();
        regSHOW2 = new javax.swing.JLabel();
        reg_txtREPASS = new javax.swing.JPasswordField();
        regBTN = new javax.swing.JButton();
        regBKBTN = new javax.swing.JButton();
        REG_pizzaBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regBG.setBackground(new java.awt.Color(230, 230, 230));
        regBG.setPreferredSize(new java.awt.Dimension(1540, 800));
        regBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regBG2.setBackground(new java.awt.Color(46, 46, 48));
        regBG2.setPreferredSize(new java.awt.Dimension(630, 650));
        regBG2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regLOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/CMOSlogo.png"))); // NOI18N
        regBG2.add(regLOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 500, 500));

        regBG3.setBackground(new java.awt.Color(245, 245, 245));
        regBG3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regUSRNAME.setFont(new java.awt.Font("Lilita One", 1, 25)); // NOI18N
        regUSRNAME.setText("USERNAME");
        regBG3.add(regUSRNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        regPASS.setFont(new java.awt.Font("Lilita One", 1, 25)); // NOI18N
        regPASS.setText("PASSWORD");
        regBG3.add(regPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        regCONPASS.setFont(new java.awt.Font("Lilita One", 1, 25)); // NOI18N
        regCONPASS.setText("CONFIRM PASSWORD");
        regBG3.add(regCONPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        reg_txtUSRNAME.setBackground(new java.awt.Color(242, 242, 242));
        reg_txtUSRNAME.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        reg_txtUSRNAME.setPreferredSize(new java.awt.Dimension(520, 70));
        reg_txtUSRNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_txtUSRNAMEActionPerformed(evt);
            }
        });
        regBG3.add(reg_txtUSRNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 360, 50));

        regHIDE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regHIDE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Invisible.png"))); // NOI18N
        regHIDE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                regHIDEMousePressed(evt);
            }
        });
        regBG3.add(regHIDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 188, 35, 35));

        regSHOW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regSHOW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Visible.png"))); // NOI18N
        regSHOW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                regSHOWMouseReleased(evt);
            }
        });
        regBG3.add(regSHOW, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 188, 35, 35));

        reg_txtPASS.setBackground(new java.awt.Color(242, 242, 242));
        reg_txtPASS.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        reg_txtPASS.setPreferredSize(new java.awt.Dimension(520, 70));
        reg_txtPASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_txtPASSActionPerformed(evt);
            }
        });
        regBG3.add(reg_txtPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 360, 50));

        regHIDE2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regHIDE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Invisible.png"))); // NOI18N
        regHIDE2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                regHIDE2MousePressed(evt);
            }
        });
        regBG3.add(regHIDE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 298, 35, 35));

        regSHOW2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regSHOW2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Visible.png"))); // NOI18N
        regSHOW2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                regSHOW2MouseReleased(evt);
            }
        });
        regBG3.add(regSHOW2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 298, 35, 35));

        reg_txtREPASS.setBackground(new java.awt.Color(242, 242, 242));
        reg_txtREPASS.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        reg_txtREPASS.setPreferredSize(new java.awt.Dimension(520, 70));
        reg_txtREPASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_txtREPASSActionPerformed(evt);
            }
        });
        regBG3.add(reg_txtREPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 360, 50));

        regBTN.setBackground(new java.awt.Color(255, 0, 51));
        regBTN.setFont(new java.awt.Font("Lilita One", 1, 40)); // NOI18N
        regBTN.setForeground(new java.awt.Color(255, 255, 255));
        regBTN.setText("REGISTER");
        regBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBTNActionPerformed(evt);
            }
        });
        regBG3.add(regBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 250, 70));

        regBKBTN.setBackground(new java.awt.Color(128, 128, 128));
        regBKBTN.setFont(new java.awt.Font("Amazing Views", 0, 18)); // NOI18N
        regBKBTN.setForeground(new java.awt.Color(255, 255, 255));
        regBKBTN.setText("X");
        regBKBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBKBTNActionPerformed(evt);
            }
        });
        regBG3.add(regBKBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 40, 30));

        regBG2.add(regBG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 32, 420, 525));

        regBG.add(regBG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 1000, 590));

        REG_pizzaBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/BG_3blur.png"))); // NOI18N
        regBG.add(REG_pizzaBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        getContentPane().add(regBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reg_txtUSRNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_txtUSRNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_txtUSRNAMEActionPerformed

    private void reg_txtREPASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_txtREPASSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_txtREPASSActionPerformed

    private void regBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBTNActionPerformed
        registerUser();
    }//GEN-LAST:event_regBTNActionPerformed

    
    private void reg_txtPASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_txtPASSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_txtPASSActionPerformed

    private void regBKBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBKBTNActionPerformed
        this.dispose();
        new Log().setVisible(true);
    }//GEN-LAST:event_regBKBTNActionPerformed

    private void regHIDEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regHIDEMousePressed
        regSHOW.setVisible(true);
        regHIDE.setVisible(false);
        reg_txtPASS.setEchoChar((char)0);
    }//GEN-LAST:event_regHIDEMousePressed

    private void regSHOWMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regSHOWMouseReleased
        regSHOW.setVisible(false);
        regHIDE.setVisible(true);
        reg_txtPASS.setEchoChar('*');
    }//GEN-LAST:event_regSHOWMouseReleased

    private void regSHOW2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regSHOW2MouseReleased
        regSHOW2.setVisible(false);
        regHIDE2.setVisible(true);
        reg_txtREPASS.setEchoChar('*');
    }//GEN-LAST:event_regSHOW2MouseReleased

    private void regHIDE2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regHIDE2MousePressed
        regSHOW2.setVisible(true);
        regHIDE2.setVisible(false);
        reg_txtREPASS.setEchoChar((char)0);
    }//GEN-LAST:event_regHIDE2MousePressed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel REG_pizzaBG;
    private javax.swing.JPanel regBG;
    private javax.swing.JPanel regBG2;
    private javax.swing.JPanel regBG3;
    private javax.swing.JButton regBKBTN;
    private javax.swing.JButton regBTN;
    private javax.swing.JLabel regCONPASS;
    private javax.swing.JLabel regHIDE;
    private javax.swing.JLabel regHIDE2;
    private javax.swing.JLabel regLOGO;
    private javax.swing.JLabel regPASS;
    private javax.swing.JLabel regSHOW;
    private javax.swing.JLabel regSHOW2;
    private javax.swing.JLabel regUSRNAME;
    private javax.swing.JPasswordField reg_txtPASS;
    private javax.swing.JPasswordField reg_txtREPASS;
    private javax.swing.JTextField reg_txtUSRNAME;
    // End of variables declaration//GEN-END:variables
}
