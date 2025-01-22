package pit;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Chips extends javax.swing.JFrame {

    private Map<String, Products> productMap;
    
    public Chips() {
        initComponents();
        initializeProducts();
        //chpBG2.setBackground(new Color(153, 153, 153, 95));
    }
    
    private void initializeProducts() {
        productMap = new HashMap<>();
        productMap.put("CHIPS REGULAR", new Products("/pit/Image/ChipsRED.png", 12));
        productMap.put("CHIPS BBQ", new Products("/pit/Image/ChipsMAROON.png", 12));
        productMap.put("CHIPS CHILI", new Products("/pit/Image/ChipsORANGE.png", 12));
        productMap.put("CHIPS SOUR CREAM", new Products("/pit/Image/ChipsGREEN.png", 12));
        productMap.put("CHIPS CHEESE", new Products("/pit/Image/ChipsBLUE.png", 12));
        productMap.put("CHIPS GARLIC ONION", new Products("/pit/Image/ChipsPURPLE.png", 12));
        productMap.put("CHIPS SWEET CHILI", new Products("/pit/Image/ChipsGRAY.png", 12));
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

        chpBG = new javax.swing.JPanel();
        chpBG2 = new javax.swing.JPanel();
        chpBG3 = new javax.swing.JPanel();
        mRED = new javax.swing.JLabel();
        mMAROON = new javax.swing.JLabel();
        mORANGE = new javax.swing.JLabel();
        mGREEN = new javax.swing.JLabel();
        mBLUE = new javax.swing.JLabel();
        mPURPLE = new javax.swing.JLabel();
        mGRAY = new javax.swing.JLabel();
        mbRED = new javax.swing.JButton();
        mbMAROON = new javax.swing.JButton();
        mbORANGE = new javax.swing.JButton();
        mbGREEN = new javax.swing.JButton();
        mbBLUE = new javax.swing.JButton();
        mbPURPLE = new javax.swing.JButton();
        mbGRAY = new javax.swing.JButton();
        chp_BackBTN = new javax.swing.JButton();
        chppizzaBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chpBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chpBG2.setBackground(new java.awt.Color(46, 46, 48));
        chpBG2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chpBG3.setBackground(new java.awt.Color(235, 235, 235));
        chpBG3.setLayout(new java.awt.GridBagLayout());

        mRED.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mRED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/ChipsRED.png"))); // NOI18N
        mRED.setPreferredSize(new java.awt.Dimension(200, 200));
        chpBG3.add(mRED, new java.awt.GridBagConstraints());

        mMAROON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mMAROON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/ChipsMAROON.png"))); // NOI18N
        mMAROON.setPreferredSize(new java.awt.Dimension(200, 200));
        chpBG3.add(mMAROON, new java.awt.GridBagConstraints());

        mORANGE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mORANGE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/ChipsORANGE.png"))); // NOI18N
        mORANGE.setPreferredSize(new java.awt.Dimension(200, 200));
        chpBG3.add(mORANGE, new java.awt.GridBagConstraints());

        mGREEN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mGREEN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/ChipsGREEN.png"))); // NOI18N
        mGREEN.setPreferredSize(new java.awt.Dimension(200, 200));
        chpBG3.add(mGREEN, new java.awt.GridBagConstraints());

        mBLUE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mBLUE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/ChipsBLUE.png"))); // NOI18N
        mBLUE.setPreferredSize(new java.awt.Dimension(200, 200));
        chpBG3.add(mBLUE, new java.awt.GridBagConstraints());

        mPURPLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mPURPLE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/ChipsPURPLE.png"))); // NOI18N
        mPURPLE.setPreferredSize(new java.awt.Dimension(200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        chpBG3.add(mPURPLE, gridBagConstraints);

        mGRAY.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mGRAY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/ChipsGRAY.png"))); // NOI18N
        mGRAY.setPreferredSize(new java.awt.Dimension(200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        chpBG3.add(mGRAY, gridBagConstraints);

        mbRED.setBackground(new java.awt.Color(255, 0, 51));
        mbRED.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbRED.setForeground(new java.awt.Color(255, 255, 255));
        mbRED.setText("REGULAR");
        mbRED.setPreferredSize(new java.awt.Dimension(140, 60));
        mbRED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbREDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        chpBG3.add(mbRED, gridBagConstraints);

        mbMAROON.setBackground(new java.awt.Color(255, 0, 51));
        mbMAROON.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbMAROON.setForeground(new java.awt.Color(255, 255, 255));
        mbMAROON.setText("BBQ");
        mbMAROON.setPreferredSize(new java.awt.Dimension(140, 60));
        mbMAROON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbMAROONActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        chpBG3.add(mbMAROON, gridBagConstraints);

        mbORANGE.setBackground(new java.awt.Color(255, 0, 51));
        mbORANGE.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbORANGE.setForeground(new java.awt.Color(255, 255, 255));
        mbORANGE.setText("CHILI");
        mbORANGE.setPreferredSize(new java.awt.Dimension(140, 60));
        mbORANGE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbORANGEActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        chpBG3.add(mbORANGE, gridBagConstraints);

        mbGREEN.setBackground(new java.awt.Color(255, 0, 51));
        mbGREEN.setFont(new java.awt.Font("Lilita One", 1, 17)); // NOI18N
        mbGREEN.setForeground(new java.awt.Color(255, 255, 255));
        mbGREEN.setText("SOUR CREAM");
        mbGREEN.setPreferredSize(new java.awt.Dimension(140, 60));
        mbGREEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbGREENActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        chpBG3.add(mbGREEN, gridBagConstraints);

        mbBLUE.setBackground(new java.awt.Color(255, 0, 51));
        mbBLUE.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbBLUE.setForeground(new java.awt.Color(255, 255, 255));
        mbBLUE.setText("CHEESE");
        mbBLUE.setPreferredSize(new java.awt.Dimension(140, 60));
        mbBLUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbBLUEActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        chpBG3.add(mbBLUE, gridBagConstraints);

        mbPURPLE.setBackground(new java.awt.Color(255, 0, 51));
        mbPURPLE.setFont(new java.awt.Font("Lilita One", 1, 15)); // NOI18N
        mbPURPLE.setForeground(new java.awt.Color(255, 255, 255));
        mbPURPLE.setText("GARLIC ONION");
        mbPURPLE.setPreferredSize(new java.awt.Dimension(140, 60));
        mbPURPLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbPURPLEActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        chpBG3.add(mbPURPLE, gridBagConstraints);

        mbGRAY.setBackground(new java.awt.Color(255, 0, 51));
        mbGRAY.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbGRAY.setForeground(new java.awt.Color(255, 255, 255));
        mbGRAY.setText("SWEET CHILI");
        mbGRAY.setPreferredSize(new java.awt.Dimension(140, 60));
        mbGRAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbGRAYActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        chpBG3.add(mbGRAY, gridBagConstraints);

        chpBG2.add(chpBG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1400, 550));

        chp_BackBTN.setBackground(new java.awt.Color(128, 128, 128));
        chp_BackBTN.setFont(new java.awt.Font("Lilita One", 1, 38)); // NOI18N
        chp_BackBTN.setForeground(new java.awt.Color(255, 255, 255));
        chp_BackBTN.setText("BACK");
        chp_BackBTN.setAlignmentY(0.0F);
        chp_BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chp_BackBTNActionPerformed(evt);
            }
        });
        chpBG2.add(chp_BackBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 593, 170, 80));

        chpBG.add(chpBG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 50, 1440, 700));

        chppizzaBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/BG_3blur.png"))); // NOI18N
        chpBG.add(chppizzaBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        getContentPane().add(chpBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chp_BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chp_BackBTNActionPerformed
        this.dispose();
        new Menu2().setVisible(true);
    }//GEN-LAST:event_chp_BackBTNActionPerformed

    private void mbREDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbREDActionPerformed
        handleButtonClick("CHIPS REGULAR");
    }//GEN-LAST:event_mbREDActionPerformed

    private void mbMAROONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbMAROONActionPerformed
        handleButtonClick("CHIPS BBQ");
    }//GEN-LAST:event_mbMAROONActionPerformed

    private void mbORANGEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbORANGEActionPerformed
        handleButtonClick("CHIPS CHILI");
    }//GEN-LAST:event_mbORANGEActionPerformed

    private void mbGREENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbGREENActionPerformed
        handleButtonClick("CHIPS SOUR CREAM");
    }//GEN-LAST:event_mbGREENActionPerformed

    private void mbBLUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbBLUEActionPerformed
        handleButtonClick("CHIPS CHEESE");
    }//GEN-LAST:event_mbBLUEActionPerformed

    private void mbPURPLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbPURPLEActionPerformed
        handleButtonClick("CHIPS GARLIC ONION");
    }//GEN-LAST:event_mbPURPLEActionPerformed

    private void mbGRAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbGRAYActionPerformed
        handleButtonClick("CHIPS SWEET CHILI");
    }//GEN-LAST:event_mbGRAYActionPerformed

    
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
            java.util.logging.Logger.getLogger(Chips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chips().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chpBG;
    private javax.swing.JPanel chpBG2;
    private javax.swing.JPanel chpBG3;
    private javax.swing.JButton chp_BackBTN;
    private javax.swing.JLabel chppizzaBG;
    private javax.swing.JLabel mBLUE;
    private javax.swing.JLabel mGRAY;
    private javax.swing.JLabel mGREEN;
    private javax.swing.JLabel mMAROON;
    private javax.swing.JLabel mORANGE;
    private javax.swing.JLabel mPURPLE;
    private javax.swing.JLabel mRED;
    private javax.swing.JButton mbBLUE;
    private javax.swing.JButton mbGRAY;
    private javax.swing.JButton mbGREEN;
    private javax.swing.JButton mbMAROON;
    private javax.swing.JButton mbORANGE;
    private javax.swing.JButton mbPURPLE;
    private javax.swing.JButton mbRED;
    // End of variables declaration//GEN-END:variables
}
