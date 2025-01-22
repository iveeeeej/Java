package pit;

import java.util.HashMap;
import java.util.Map;

public class Desserts extends javax.swing.JFrame {

    private Map<String, Products> productMap;
    
    public Desserts() {
        initComponents();
        initializeProducts();
    }
    
    private void initializeProducts() {
        productMap = new HashMap<>();
        productMap.put("STRAWBERRY ICE CREAM", new Products("/pit/Image/IceRED.png", 10));
        productMap.put("MANGO ICE CREAM", new Products("/pit/Image/IceYELLOW.png", 10));
        productMap.put("BLUEBERRY ICE CREAM", new Products("/pit/Image/IceBLUE.png", 10));
        productMap.put("UBE ICE CREAM", new Products("/pit/Image/IcePURPLE.png", 10));
        productMap.put("VANILLA ICE CREAM", new Products("/pit/Image/IceWHITE.png", 10));
        productMap.put("CHOCOLATE ICE CREAM", new Products("/pit/Image/IceWOOD.png", 10));
        productMap.put("STRAWBERRY SHAKE", new Products("/pit/Image/Shake.png", 30));
    }

    public static class Products {
        public String imagePath;
        public int price;

        public Products(String imagePath, int price) {
            this.imagePath = imagePath;
            this.price = price;
        }
    }
    
    private void handleButtonClick(String productName) {
    Products product = productMap.get(productName);
    if (product != null) {
        Spec spec = new Spec(product.imagePath);
        spec.setFoodName(productName);
        spec.setPrice(product.price);
        spec.setVisible(true);
        dispose();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        dessBG = new javax.swing.JPanel();
        dessBG2 = new javax.swing.JPanel();
        dessBG3 = new javax.swing.JPanel();
        mICEred = new javax.swing.JLabel();
        mICEyellow = new javax.swing.JLabel();
        mICEblue = new javax.swing.JLabel();
        mICEpurple = new javax.swing.JLabel();
        mShake = new javax.swing.JLabel();
        mICEwhite = new javax.swing.JLabel();
        mICEwood = new javax.swing.JLabel();
        mbICEred = new javax.swing.JButton();
        mbICEyellow = new javax.swing.JButton();
        mbICEblue = new javax.swing.JButton();
        mbICEpurple = new javax.swing.JButton();
        mbICEwhite = new javax.swing.JButton();
        mbICEwood = new javax.swing.JButton();
        mbShake = new javax.swing.JButton();
        dess_BackBTN = new javax.swing.JButton();
        desspizzaBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dessBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dessBG2.setBackground(new java.awt.Color(46, 46, 48));
        dessBG2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dessBG3.setBackground(new java.awt.Color(235, 235, 235));
        dessBG3.setLayout(new java.awt.GridBagLayout());

        mICEred.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mICEred.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/IceRED.png"))); // NOI18N
        mICEred.setPreferredSize(new java.awt.Dimension(200, 200));
        dessBG3.add(mICEred, new java.awt.GridBagConstraints());

        mICEyellow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mICEyellow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/IceYELLOW.png"))); // NOI18N
        mICEyellow.setPreferredSize(new java.awt.Dimension(200, 200));
        dessBG3.add(mICEyellow, new java.awt.GridBagConstraints());

        mICEblue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mICEblue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/IceBLUE.png"))); // NOI18N
        mICEblue.setPreferredSize(new java.awt.Dimension(200, 200));
        dessBG3.add(mICEblue, new java.awt.GridBagConstraints());

        mICEpurple.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mICEpurple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/IcePURPLE.png"))); // NOI18N
        mICEpurple.setPreferredSize(new java.awt.Dimension(200, 200));
        dessBG3.add(mICEpurple, new java.awt.GridBagConstraints());

        mShake.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mShake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Shake.png"))); // NOI18N
        mShake.setPreferredSize(new java.awt.Dimension(200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        dessBG3.add(mShake, gridBagConstraints);

        mICEwhite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mICEwhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/IceWHITE.png"))); // NOI18N
        mICEwhite.setPreferredSize(new java.awt.Dimension(200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        dessBG3.add(mICEwhite, gridBagConstraints);

        mICEwood.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mICEwood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/IceWOOD.png"))); // NOI18N
        mICEwood.setPreferredSize(new java.awt.Dimension(200, 200));
        dessBG3.add(mICEwood, new java.awt.GridBagConstraints());

        mbICEred.setBackground(new java.awt.Color(255, 0, 51));
        mbICEred.setFont(new java.awt.Font("Lilita One", 1, 17)); // NOI18N
        mbICEred.setForeground(new java.awt.Color(255, 255, 255));
        mbICEred.setText("STRAWBERRY");
        mbICEred.setPreferredSize(new java.awt.Dimension(140, 60));
        mbICEred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbICEredActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        dessBG3.add(mbICEred, gridBagConstraints);

        mbICEyellow.setBackground(new java.awt.Color(255, 0, 51));
        mbICEyellow.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbICEyellow.setForeground(new java.awt.Color(255, 255, 255));
        mbICEyellow.setText("MANGO");
        mbICEyellow.setPreferredSize(new java.awt.Dimension(140, 60));
        mbICEyellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbICEyellowActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        dessBG3.add(mbICEyellow, gridBagConstraints);

        mbICEblue.setBackground(new java.awt.Color(255, 0, 51));
        mbICEblue.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbICEblue.setForeground(new java.awt.Color(255, 255, 255));
        mbICEblue.setText("BLUEBERRY");
        mbICEblue.setPreferredSize(new java.awt.Dimension(140, 60));
        mbICEblue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbICEblueActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        dessBG3.add(mbICEblue, gridBagConstraints);

        mbICEpurple.setBackground(new java.awt.Color(255, 0, 51));
        mbICEpurple.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbICEpurple.setForeground(new java.awt.Color(255, 255, 255));
        mbICEpurple.setText("UBE");
        mbICEpurple.setPreferredSize(new java.awt.Dimension(140, 60));
        mbICEpurple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbICEpurpleActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        dessBG3.add(mbICEpurple, gridBagConstraints);

        mbICEwhite.setBackground(new java.awt.Color(255, 0, 51));
        mbICEwhite.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbICEwhite.setForeground(new java.awt.Color(255, 255, 255));
        mbICEwhite.setText("VANILLA");
        mbICEwhite.setPreferredSize(new java.awt.Dimension(140, 60));
        mbICEwhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbICEwhiteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        dessBG3.add(mbICEwhite, gridBagConstraints);

        mbICEwood.setBackground(new java.awt.Color(255, 0, 51));
        mbICEwood.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbICEwood.setForeground(new java.awt.Color(255, 255, 255));
        mbICEwood.setText("CHOCOLATE");
        mbICEwood.setPreferredSize(new java.awt.Dimension(140, 60));
        mbICEwood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbICEwoodActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        dessBG3.add(mbICEwood, gridBagConstraints);

        mbShake.setBackground(new java.awt.Color(255, 0, 51));
        mbShake.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbShake.setForeground(new java.awt.Color(255, 255, 255));
        mbShake.setText("SHAKE");
        mbShake.setPreferredSize(new java.awt.Dimension(140, 60));
        mbShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbShakeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        dessBG3.add(mbShake, gridBagConstraints);

        dessBG2.add(dessBG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1400, 550));

        dess_BackBTN.setBackground(new java.awt.Color(128, 128, 128));
        dess_BackBTN.setFont(new java.awt.Font("Lilita One", 1, 38)); // NOI18N
        dess_BackBTN.setForeground(new java.awt.Color(255, 255, 255));
        dess_BackBTN.setText("BACK");
        dess_BackBTN.setAlignmentY(0.0F);
        dess_BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dess_BackBTNActionPerformed(evt);
            }
        });
        dessBG2.add(dess_BackBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 593, 170, 80));

        dessBG.add(dessBG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 50, 1440, 700));

        desspizzaBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/BG_3blur.png"))); // NOI18N
        dessBG.add(desspizzaBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        getContentPane().add(dessBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dess_BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dess_BackBTNActionPerformed
        this.dispose();
        new Menu2().setVisible(true);
    }//GEN-LAST:event_dess_BackBTNActionPerformed

    private void mbICEredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbICEredActionPerformed
        handleButtonClick("STRAWBERRY ICE CREAM");
    }//GEN-LAST:event_mbICEredActionPerformed

    private void mbICEyellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbICEyellowActionPerformed
        handleButtonClick("MANGO ICE CREAM");
    }//GEN-LAST:event_mbICEyellowActionPerformed

    private void mbICEblueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbICEblueActionPerformed
        handleButtonClick("BLUEBERRY ICE CREAM");
    }//GEN-LAST:event_mbICEblueActionPerformed

    private void mbICEpurpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbICEpurpleActionPerformed
        handleButtonClick("UBE ICE CREAM");
    }//GEN-LAST:event_mbICEpurpleActionPerformed

    private void mbShakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbShakeActionPerformed
        handleButtonClick("STRAWBERRY SHAKE");
    }//GEN-LAST:event_mbShakeActionPerformed

    private void mbICEwhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbICEwhiteActionPerformed
        handleButtonClick("VANILLA ICE CREAM");
    }//GEN-LAST:event_mbICEwhiteActionPerformed

    private void mbICEwoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbICEwoodActionPerformed
        handleButtonClick("CHOCOLATE ICE CREAM");
    }//GEN-LAST:event_mbICEwoodActionPerformed

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
            java.util.logging.Logger.getLogger(Desserts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desserts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desserts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desserts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desserts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dessBG;
    private javax.swing.JPanel dessBG2;
    private javax.swing.JPanel dessBG3;
    private javax.swing.JButton dess_BackBTN;
    private javax.swing.JLabel desspizzaBG;
    private javax.swing.JLabel mICEblue;
    private javax.swing.JLabel mICEpurple;
    private javax.swing.JLabel mICEred;
    private javax.swing.JLabel mICEwhite;
    private javax.swing.JLabel mICEwood;
    private javax.swing.JLabel mICEyellow;
    private javax.swing.JLabel mShake;
    private javax.swing.JButton mbICEblue;
    private javax.swing.JButton mbICEpurple;
    private javax.swing.JButton mbICEred;
    private javax.swing.JButton mbICEwhite;
    private javax.swing.JButton mbICEwood;
    private javax.swing.JButton mbICEyellow;
    private javax.swing.JButton mbShake;
    // End of variables declaration//GEN-END:variables
}
