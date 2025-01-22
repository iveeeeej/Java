package pit;

import java.awt.Color;

public class Menu2 extends javax.swing.JFrame {

    
    public Menu2() {
        initComponents();
        menu2BG2.setBackground(new Color(153, 153, 153, 95));
        //menu2BG3.setBackground(new Color(255, 255, 255, 95));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu2BG = new javax.swing.JPanel();
        menu2BG2 = new javax.swing.JPanel();
        menu2BG3 = new javax.swing.JPanel();
        m2FOOD = new javax.swing.JButton();
        m2COOKIE = new javax.swing.JButton();
        m2CHIPS = new javax.swing.JButton();
        m2DESSERT = new javax.swing.JButton();
        m2DRINK = new javax.swing.JButton();
        m2VIEW = new javax.swing.JButton();
        m2BACK = new javax.swing.JButton();
        m2LOGO = new javax.swing.JLabel();
        Canteen = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        Ordering = new javax.swing.JLabel();
        System = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu2BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu2BG2.setBackground(new java.awt.Color(46, 46, 48));
        menu2BG2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu2BG3.setBackground(new java.awt.Color(245, 245, 245));
        menu2BG3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        m2FOOD.setBackground(new java.awt.Color(255, 0, 51));
        m2FOOD.setFont(new java.awt.Font("Lilita One", 1, 30)); // NOI18N
        m2FOOD.setForeground(new java.awt.Color(255, 255, 255));
        m2FOOD.setText("FOODS");
        m2FOOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2FOODActionPerformed(evt);
            }
        });
        menu2BG3.add(m2FOOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 27, 160, 60));

        m2COOKIE.setBackground(new java.awt.Color(255, 0, 51));
        m2COOKIE.setFont(new java.awt.Font("Lilita One", 1, 30)); // NOI18N
        m2COOKIE.setForeground(new java.awt.Color(255, 255, 255));
        m2COOKIE.setText("COOKIES");
        m2COOKIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2COOKIEActionPerformed(evt);
            }
        });
        menu2BG3.add(m2COOKIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 117, 160, 60));

        m2CHIPS.setBackground(new java.awt.Color(255, 0, 51));
        m2CHIPS.setFont(new java.awt.Font("Lilita One", 1, 30)); // NOI18N
        m2CHIPS.setForeground(new java.awt.Color(255, 255, 255));
        m2CHIPS.setText("CHIPS");
        m2CHIPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2CHIPSActionPerformed(evt);
            }
        });
        menu2BG3.add(m2CHIPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 207, 160, 60));

        m2DESSERT.setBackground(new java.awt.Color(255, 0, 51));
        m2DESSERT.setFont(new java.awt.Font("Lilita One", 1, 29)); // NOI18N
        m2DESSERT.setForeground(new java.awt.Color(255, 255, 255));
        m2DESSERT.setText("DESSERTS");
        m2DESSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2DESSERTActionPerformed(evt);
            }
        });
        menu2BG3.add(m2DESSERT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 297, 160, 60));

        m2DRINK.setBackground(new java.awt.Color(255, 0, 51));
        m2DRINK.setFont(new java.awt.Font("Lilita One", 1, 30)); // NOI18N
        m2DRINK.setForeground(new java.awt.Color(255, 255, 255));
        m2DRINK.setText("DRINKS");
        m2DRINK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2DRINKActionPerformed(evt);
            }
        });
        menu2BG3.add(m2DRINK, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 387, 160, 60));

        m2VIEW.setBackground(new java.awt.Color(46, 46, 48));
        m2VIEW.setFont(new java.awt.Font("Lilita One", 1, 25)); // NOI18N
        m2VIEW.setForeground(new java.awt.Color(255, 255, 255));
        m2VIEW.setText("CHECKOUT");
        m2VIEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2VIEWActionPerformed(evt);
            }
        });
        menu2BG3.add(m2VIEW, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 477, 160, 60));

        m2BACK.setBackground(new java.awt.Color(128, 128, 128));
        m2BACK.setFont(new java.awt.Font("Lilita One", 1, 30)); // NOI18N
        m2BACK.setForeground(new java.awt.Color(255, 255, 255));
        m2BACK.setText("BACK");
        m2BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2BACKActionPerformed(evt);
            }
        });
        menu2BG3.add(m2BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 567, 160, 60));

        menu2BG2.add(menu2BG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 660));

        m2LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/CMOSlogo.png"))); // NOI18N
        menu2BG2.add(m2LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 500, 500));

        Canteen.setFont(new java.awt.Font("Amazing Views", 1, 120)); // NOI18N
        Canteen.setForeground(new java.awt.Color(255, 0, 51));
        Canteen.setText("CANTEEN");
        menu2BG2.add(Canteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 600, -1));

        Menu.setFont(new java.awt.Font("Amazing Views", 1, 120)); // NOI18N
        Menu.setForeground(new java.awt.Color(255, 0, 51));
        Menu.setText("MENU");
        menu2BG2.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 600, -1));

        Ordering.setFont(new java.awt.Font("Amazing Views", 1, 120)); // NOI18N
        Ordering.setForeground(new java.awt.Color(255, 0, 51));
        Ordering.setText("ORDERING");
        menu2BG2.add(Ordering, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 600, -1));

        System.setFont(new java.awt.Font("Amazing Views", 1, 120)); // NOI18N
        System.setForeground(new java.awt.Color(46, 46, 48));
        System.setText("SYSTEM");
        menu2BG2.add(System, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 600, -1));

        menu2BG.add(menu2BG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 50, 1440, 700));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/BG_3blur.png"))); // NOI18N
        menu2BG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        getContentPane().add(menu2BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void m2BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2BACKActionPerformed
        this.dispose();
        new Start().setVisible(true);
    }//GEN-LAST:event_m2BACKActionPerformed

    private void m2FOODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2FOODActionPerformed
        Foods foods = new Foods();
        foods.setVisible(true);
        dispose();
    }//GEN-LAST:event_m2FOODActionPerformed

    private void m2VIEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2VIEWActionPerformed
        OrderList ord = new OrderList();
        ord.setVisible(true);
        dispose();
    }//GEN-LAST:event_m2VIEWActionPerformed

    private void m2COOKIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2COOKIEActionPerformed
        Cookies cookies = new Cookies();
        cookies.setVisible(true);
        dispose();
    }//GEN-LAST:event_m2COOKIEActionPerformed

    private void m2CHIPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2CHIPSActionPerformed
        Chips chips = new Chips();
        chips.setVisible(true);
        dispose();
    }//GEN-LAST:event_m2CHIPSActionPerformed

    private void m2DESSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2DESSERTActionPerformed
        Desserts desserts = new Desserts();
        desserts.setVisible(true);
        dispose();
    }//GEN-LAST:event_m2DESSERTActionPerformed

    private void m2DRINKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2DRINKActionPerformed
        Drinks drinks = new Drinks();
        drinks.setVisible(true);
        dispose();
    }//GEN-LAST:event_m2DRINKActionPerformed

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
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Canteen;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel Ordering;
    private javax.swing.JLabel System;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton m2BACK;
    private javax.swing.JButton m2CHIPS;
    private javax.swing.JButton m2COOKIE;
    private javax.swing.JButton m2DESSERT;
    private javax.swing.JButton m2DRINK;
    private javax.swing.JButton m2FOOD;
    private javax.swing.JLabel m2LOGO;
    private javax.swing.JButton m2VIEW;
    private javax.swing.JPanel menu2BG;
    private javax.swing.JPanel menu2BG2;
    private javax.swing.JPanel menu2BG3;
    // End of variables declaration//GEN-END:variables
}
