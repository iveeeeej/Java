package pit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.awt.Color;

public class Log extends javax.swing.JFrame {

    public Log() {
        initComponents();
        Log_BG2.setBackground(new Color(153, 153, 153, 95));
        //Log_BG3.setBackground(new Color(255, 255, 255, 95));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Log_BG = new javax.swing.JPanel();
        Log_BG2 = new javax.swing.JPanel();
        logLOGO = new javax.swing.JLabel();
        Log_BG3 = new javax.swing.JPanel();
        logUSRNAME = new javax.swing.JLabel();
        logPASS = new javax.swing.JLabel();
        log_txtUSRNAME = new javax.swing.JTextField();
        logHIDE = new javax.swing.JLabel();
        logSHOW = new javax.swing.JLabel();
        log_txtPASS = new javax.swing.JPasswordField();
        logBTN = new javax.swing.JButton();
        dontHAVE = new javax.swing.JLabel();
        clickHERE = new javax.swing.JLabel();
        log_REGBTN = new javax.swing.JButton();
        logBKBTN = new javax.swing.JButton();
        Log_pizzaBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Log_BG.setBackground(new java.awt.Color(230, 230, 230));
        Log_BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Log_BG2.setBackground(new java.awt.Color(46, 46, 48));
        Log_BG2.setPreferredSize(new java.awt.Dimension(630, 650));
        Log_BG2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logLOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/CMOSlogo.png"))); // NOI18N
        Log_BG2.add(logLOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 38, 500, 500));

        Log_BG3.setBackground(new java.awt.Color(245, 245, 245));
        Log_BG3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logUSRNAME.setFont(new java.awt.Font("Lilita One", 1, 25)); // NOI18N
        logUSRNAME.setText("USERNAME");
        Log_BG3.add(logUSRNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        logPASS.setFont(new java.awt.Font("Lilita One", 1, 25)); // NOI18N
        logPASS.setText("PASSWORD");
        Log_BG3.add(logPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        log_txtUSRNAME.setBackground(new java.awt.Color(242, 242, 242));
        log_txtUSRNAME.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        log_txtUSRNAME.setPreferredSize(new java.awt.Dimension(520, 70));
        log_txtUSRNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_txtUSRNAMEActionPerformed(evt);
            }
        });
        Log_BG3.add(log_txtUSRNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 360, 50));

        logHIDE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logHIDE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Invisible.png"))); // NOI18N
        logHIDE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logHIDEMousePressed(evt);
            }
        });
        Log_BG3.add(logHIDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 188, 35, 35));

        logSHOW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logSHOW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Visible.png"))); // NOI18N
        logSHOW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logSHOWMouseReleased(evt);
            }
        });
        Log_BG3.add(logSHOW, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 188, 35, 35));

        log_txtPASS.setBackground(new java.awt.Color(242, 242, 242));
        log_txtPASS.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        log_txtPASS.setPreferredSize(new java.awt.Dimension(520, 70));
        log_txtPASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_txtPASSActionPerformed(evt);
            }
        });
        Log_BG3.add(log_txtPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 360, 50));

        logBTN.setBackground(new java.awt.Color(255, 0, 51));
        logBTN.setFont(new java.awt.Font("Lilita One", 1, 40)); // NOI18N
        logBTN.setForeground(new java.awt.Color(255, 255, 255));
        logBTN.setText("LOG IN");
        logBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logBTNActionPerformed(evt);
            }
        });
        Log_BG3.add(logBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 250, 70));

        dontHAVE.setFont(new java.awt.Font("Lilita One", 1, 20)); // NOI18N
        dontHAVE.setText("Don't have an Account?");
        Log_BG3.add(dontHAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        clickHERE.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        clickHERE.setText("Click here to");
        Log_BG3.add(clickHERE, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 437, -1, -1));

        log_REGBTN.setBackground(new java.awt.Color(46, 46, 48));
        log_REGBTN.setFont(new java.awt.Font("Lilita One", 1, 20)); // NOI18N
        log_REGBTN.setForeground(new java.awt.Color(255, 255, 255));
        log_REGBTN.setText("REGISTER");
        log_REGBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_REGBTNActionPerformed(evt);
            }
        });
        Log_BG3.add(log_REGBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 130, 40));

        logBKBTN.setBackground(new java.awt.Color(128, 128, 128));
        logBKBTN.setFont(new java.awt.Font("Amazing Views", 0, 18)); // NOI18N
        logBKBTN.setForeground(new java.awt.Color(255, 255, 255));
        logBKBTN.setText("X");
        logBKBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logBKBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logBKBTNActionPerformed(evt);
            }
        });
        Log_BG3.add(logBKBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 40, 30));

        Log_BG2.add(Log_BG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 32, 420, 525));

        Log_BG.add(Log_BG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 1000, 590));

        Log_pizzaBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/BG_3blur.png"))); // NOI18N
        Log_BG.add(Log_pizzaBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Log_BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Log_BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void log_txtUSRNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_txtUSRNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_log_txtUSRNAMEActionPerformed

    private void logBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logBTNActionPerformed
        String username = log_txtUSRNAME.getText();
        String password = new String(log_txtPASS.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All Input Fields are Required!");
            return;
        }

        // SQL query to check if the user exists with the entered username and password
        String query = "SELECT * FROM user_accounts WHERE username = ? AND password = ?";
    
        try (Connection con = Database.getConnection();
         PreparedStatement pst = con.prepareStatement(query)) {

        pst.setString(1, username);
        pst.setString(2, password);

        try (ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Log In Successfull!");
                UserChoice usr = new UserChoice();
                usr.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password.");
            }
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_logBTNActionPerformed

    private void log_txtPASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_txtPASSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_log_txtPASSActionPerformed

    private void log_REGBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_REGBTNActionPerformed
        Register reg = new Register();
        reg.setVisible(true);
        dispose();
    }//GEN-LAST:event_log_REGBTNActionPerformed

    private void logBKBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logBKBTNActionPerformed
        this.dispose();
        new Start().setVisible(true);
    }//GEN-LAST:event_logBKBTNActionPerformed

    private void logHIDEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logHIDEMousePressed
        logSHOW.setVisible(true);
        logHIDE.setVisible(false);
        log_txtPASS.setEchoChar((char)0);
    }//GEN-LAST:event_logHIDEMousePressed

    private void logSHOWMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logSHOWMouseReleased
        logSHOW.setVisible(false);
        logHIDE.setVisible(true);
        log_txtPASS.setEchoChar('*');
    }//GEN-LAST:event_logSHOWMouseReleased

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
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Log_BG;
    private javax.swing.JPanel Log_BG2;
    private javax.swing.JPanel Log_BG3;
    private javax.swing.JLabel Log_pizzaBG;
    private javax.swing.JLabel clickHERE;
    private javax.swing.JLabel dontHAVE;
    private javax.swing.JButton logBKBTN;
    private javax.swing.JButton logBTN;
    private javax.swing.JLabel logHIDE;
    private javax.swing.JLabel logLOGO;
    private javax.swing.JLabel logPASS;
    private javax.swing.JLabel logSHOW;
    private javax.swing.JLabel logUSRNAME;
    private javax.swing.JButton log_REGBTN;
    private javax.swing.JPasswordField log_txtPASS;
    private javax.swing.JTextField log_txtUSRNAME;
    // End of variables declaration//GEN-END:variables
}
