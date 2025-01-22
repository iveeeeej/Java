package pit;

import java.awt.Color;

public class Start extends javax.swing.JFrame {

    public Start() {
        initComponents();
        startBG2.setBackground(new Color(153, 153, 153, 95));
        //startBG3.setBackground(new Color(255, 255, 255, 95));
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startBG = new javax.swing.JPanel();
        startBG2 = new javax.swing.JPanel();
        Canteen = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        Ordering = new javax.swing.JLabel();
        System = new javax.swing.JLabel();
        startBG3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        start_pizzaBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Canteen Menu Ordering System");
        setMinimumSize(new java.awt.Dimension(1540, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startBG.setBackground(new java.awt.Color(255, 255, 255));
        startBG.setPreferredSize(new java.awt.Dimension(1540, 800));
        startBG.setRequestFocusEnabled(false);
        startBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startBG2.setBackground(new java.awt.Color(46, 46, 48));
        startBG2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Canteen.setFont(new java.awt.Font("Amazing Views", 1, 120)); // NOI18N
        Canteen.setForeground(new java.awt.Color(255, 0, 51));
        Canteen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Canteen.setText("CANTEEN");
        startBG2.add(Canteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 600, -1));

        Menu.setFont(new java.awt.Font("Amazing Views", 1, 120)); // NOI18N
        Menu.setForeground(new java.awt.Color(255, 0, 51));
        Menu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Menu.setText("MENU");
        startBG2.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 600, -1));

        Ordering.setFont(new java.awt.Font("Amazing Views", 1, 120)); // NOI18N
        Ordering.setForeground(new java.awt.Color(255, 0, 51));
        Ordering.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Ordering.setText("ORDERING");
        startBG2.add(Ordering, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 600, -1));

        System.setFont(new java.awt.Font("Amazing Views", 1, 120)); // NOI18N
        System.setForeground(new java.awt.Color(46, 46, 48));
        System.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        System.setText("SYSTEM");
        startBG2.add(System, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 600, -1));

        startBG3.setBackground(new java.awt.Color(245, 245, 245));
        startBG3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Lilita One", 1, 100)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ORDER");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        startBG3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 80, 410, 190));

        jLabel1.setFont(new java.awt.Font("Lilita One", 1, 40)); // NOI18N
        jLabel1.setText("ADMIN?");
        startBG3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lilita One", 1, 25)); // NOI18N
        jLabel2.setText("Click here to");
        startBG3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        jButton2.setBackground(new java.awt.Color(46, 46, 48));
        jButton2.setFont(new java.awt.Font("Lilita One", 1, 35)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SIGN UP");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        startBG3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 170, 70));

        startBG2.add(startBG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 600, 550));

        startBG.add(startBG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 50, 1440, 700));

        start_pizzaBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/BG_3blur.png"))); // NOI18N
        startBG.add(start_pizzaBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        getContentPane().add(startBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu2 menu = new Menu2();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Log log = new Log();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Canteen;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel Ordering;
    private javax.swing.JLabel System;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel startBG;
    private javax.swing.JPanel startBG2;
    private javax.swing.JPanel startBG3;
    private javax.swing.JLabel start_pizzaBG;
    // End of variables declaration//GEN-END:variables
}
