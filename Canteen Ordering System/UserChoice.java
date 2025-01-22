package pit;

import java.awt.Color;

public class UserChoice extends javax.swing.JFrame {

    public UserChoice() {
        initComponents();
        usrchoiceBG2.setBackground(new Color(153, 153, 153, 95));
        //usrchoiceBG3.setBackground(new Color(255, 255, 255, 95));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usrchoiceBG = new javax.swing.JPanel();
        usrchoiceBG2 = new javax.swing.JPanel();
        usrchoiceLOGO = new javax.swing.JLabel();
        usrchoiceBG3 = new javax.swing.JPanel();
        viewSALESBTN = new javax.swing.JButton();
        viewACCBTN = new javax.swing.JButton();
        greet = new javax.swing.JLabel();
        usr_greet = new javax.swing.JLabel();
        usrchcBKBTN = new javax.swing.JButton();
        usrchoice_pizzaBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usrchoiceBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usrchoiceBG2.setBackground(new java.awt.Color(46, 46, 48));
        usrchoiceBG2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usrchoiceLOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/CMOSlogo.png"))); // NOI18N
        usrchoiceBG2.add(usrchoiceLOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 38, 500, 500));

        usrchoiceBG3.setBackground(new java.awt.Color(245, 245, 245));
        usrchoiceBG3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewSALESBTN.setBackground(new java.awt.Color(255, 0, 51));
        viewSALESBTN.setFont(new java.awt.Font("Lilita One", 1, 25)); // NOI18N
        viewSALESBTN.setForeground(new java.awt.Color(255, 255, 255));
        viewSALESBTN.setText("VIEW SALES");
        viewSALESBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSALESBTNActionPerformed(evt);
            }
        });
        usrchoiceBG3.add(viewSALESBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 250, 70));

        viewACCBTN.setBackground(new java.awt.Color(255, 0, 51));
        viewACCBTN.setFont(new java.awt.Font("Lilita One", 1, 25)); // NOI18N
        viewACCBTN.setForeground(new java.awt.Color(255, 255, 255));
        viewACCBTN.setText("VIEW ACCOUNTS");
        viewACCBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewACCBTNActionPerformed(evt);
            }
        });
        usrchoiceBG3.add(viewACCBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 250, 70));

        greet.setFont(new java.awt.Font("Lilita One", 1, 65)); // NOI18N
        greet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greet.setText("GREETINGS");
        usrchoiceBG3.add(greet, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 40, -1, 70));

        usr_greet.setFont(new java.awt.Font("Lilita One", 1, 65)); // NOI18N
        usr_greet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usr_greet.setText("USER!");
        usrchoiceBG3.add(usr_greet, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 130, -1, 70));

        usrchcBKBTN.setBackground(new java.awt.Color(128, 128, 128));
        usrchcBKBTN.setFont(new java.awt.Font("Amazing Views", 0, 18)); // NOI18N
        usrchcBKBTN.setForeground(new java.awt.Color(255, 255, 255));
        usrchcBKBTN.setText("X");
        usrchcBKBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrchcBKBTNActionPerformed(evt);
            }
        });
        usrchoiceBG3.add(usrchcBKBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 40, 30));

        usrchoiceBG2.add(usrchoiceBG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 32, 420, 525));

        usrchoiceBG.add(usrchoiceBG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 1000, 590));

        usrchoice_pizzaBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/BG_3blur.png"))); // NOI18N
        usrchoiceBG.add(usrchoice_pizzaBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        getContentPane().add(usrchoiceBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 1540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewSALESBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSALESBTNActionPerformed
        Sales sales = new Sales();
        sales.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewSALESBTNActionPerformed

    private void viewACCBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewACCBTNActionPerformed
        Accounts acc = new Accounts();
        acc.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewACCBTNActionPerformed

    private void usrchcBKBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrchcBKBTNActionPerformed
        this.dispose();
        new Log().setVisible(true);
    }//GEN-LAST:event_usrchcBKBTNActionPerformed

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
            java.util.logging.Logger.getLogger(UserChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserChoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel greet;
    private javax.swing.JLabel usr_greet;
    private javax.swing.JButton usrchcBKBTN;
    private javax.swing.JPanel usrchoiceBG;
    private javax.swing.JPanel usrchoiceBG2;
    private javax.swing.JPanel usrchoiceBG3;
    private javax.swing.JLabel usrchoiceLOGO;
    private javax.swing.JLabel usrchoice_pizzaBG;
    private javax.swing.JButton viewACCBTN;
    private javax.swing.JButton viewSALESBTN;
    // End of variables declaration//GEN-END:variables

}
