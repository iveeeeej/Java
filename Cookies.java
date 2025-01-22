package pit;

import java.util.HashMap;
import java.util.Map;

public class Cookies extends javax.swing.JFrame {

    private Map<String, Products> productMap;
    
    public Cookies() {
        initComponents();
        initializeProducts();
    }
    
    private void initializeProducts() {
        productMap = new HashMap<>();
        productMap.put("THIN BUTTER", new Products("/pit/Image/Cookie1.png", 10));
        productMap.put("SHORTBREAD", new Products("/pit/Image/Cookie2.png", 10));
        productMap.put("BROWN BUTTER", new Products("/pit/Image/Cookie3.png", 10));
        productMap.put("CHOCO CHIP", new Products("/pit/Image/Cookie4.png", 10));
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

        cooBG = new javax.swing.JPanel();
        cooBG2 = new javax.swing.JPanel();
        cooBG3 = new javax.swing.JPanel();
        mCookie1 = new javax.swing.JLabel();
        mCookie2 = new javax.swing.JLabel();
        mCookie3 = new javax.swing.JLabel();
        mCookie4 = new javax.swing.JLabel();
        mbCookie1 = new javax.swing.JButton();
        mbCookie2 = new javax.swing.JButton();
        mbCookie3 = new javax.swing.JButton();
        mbCookie4 = new javax.swing.JButton();
        coo_BackBTN = new javax.swing.JButton();
        coopizzaBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cooBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cooBG2.setBackground(new java.awt.Color(46, 46, 48));
        cooBG2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cooBG3.setBackground(new java.awt.Color(235, 235, 235));
        cooBG3.setLayout(new java.awt.GridBagLayout());

        mCookie1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mCookie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Cookie1.png"))); // NOI18N
        mCookie1.setPreferredSize(new java.awt.Dimension(200, 200));
        cooBG3.add(mCookie1, new java.awt.GridBagConstraints());

        mCookie2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mCookie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Cookie2.png"))); // NOI18N
        mCookie2.setPreferredSize(new java.awt.Dimension(200, 200));
        cooBG3.add(mCookie2, new java.awt.GridBagConstraints());

        mCookie3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mCookie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Cookie3.png"))); // NOI18N
        mCookie3.setPreferredSize(new java.awt.Dimension(200, 200));
        cooBG3.add(mCookie3, new java.awt.GridBagConstraints());

        mCookie4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mCookie4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Cookie4.png"))); // NOI18N
        mCookie4.setPreferredSize(new java.awt.Dimension(200, 200));
        cooBG3.add(mCookie4, new java.awt.GridBagConstraints());

        mbCookie1.setBackground(new java.awt.Color(255, 0, 51));
        mbCookie1.setFont(new java.awt.Font("Lilita One", 1, 17)); // NOI18N
        mbCookie1.setForeground(new java.awt.Color(255, 255, 255));
        mbCookie1.setText("THIN BUTTER");
        mbCookie1.setPreferredSize(new java.awt.Dimension(140, 60));
        mbCookie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbCookie1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        cooBG3.add(mbCookie1, gridBagConstraints);

        mbCookie2.setBackground(new java.awt.Color(255, 0, 51));
        mbCookie2.setFont(new java.awt.Font("Lilita One", 1, 17)); // NOI18N
        mbCookie2.setForeground(new java.awt.Color(255, 255, 255));
        mbCookie2.setText("SHORTBREAD");
        mbCookie2.setPreferredSize(new java.awt.Dimension(140, 60));
        mbCookie2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbCookie2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        cooBG3.add(mbCookie2, gridBagConstraints);

        mbCookie3.setBackground(new java.awt.Color(255, 0, 51));
        mbCookie3.setFont(new java.awt.Font("Lilita One", 1, 14)); // NOI18N
        mbCookie3.setForeground(new java.awt.Color(255, 255, 255));
        mbCookie3.setText("BROWN BUTTER");
        mbCookie3.setPreferredSize(new java.awt.Dimension(140, 60));
        mbCookie3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbCookie3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        cooBG3.add(mbCookie3, gridBagConstraints);

        mbCookie4.setBackground(new java.awt.Color(255, 0, 51));
        mbCookie4.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbCookie4.setForeground(new java.awt.Color(255, 255, 255));
        mbCookie4.setText("CHOCO CHIP");
        mbCookie4.setPreferredSize(new java.awt.Dimension(140, 60));
        mbCookie4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbCookie4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        cooBG3.add(mbCookie4, gridBagConstraints);

        cooBG2.add(cooBG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1400, 550));

        coo_BackBTN.setBackground(new java.awt.Color(128, 128, 128));
        coo_BackBTN.setFont(new java.awt.Font("Lilita One", 1, 38)); // NOI18N
        coo_BackBTN.setForeground(new java.awt.Color(255, 255, 255));
        coo_BackBTN.setText("BACK");
        coo_BackBTN.setAlignmentY(0.0F);
        coo_BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coo_BackBTNActionPerformed(evt);
            }
        });
        cooBG2.add(coo_BackBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 593, 170, 80));

        cooBG.add(cooBG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 50, 1440, 700));

        coopizzaBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/BG_3blur.png"))); // NOI18N
        cooBG.add(coopizzaBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        getContentPane().add(cooBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coo_BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coo_BackBTNActionPerformed
        this.dispose();
        new Menu2().setVisible(true);
    }//GEN-LAST:event_coo_BackBTNActionPerformed

    private void mbCookie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbCookie1ActionPerformed
        handleButtonClick("THIN BUTTER");
    }//GEN-LAST:event_mbCookie1ActionPerformed

    private void mbCookie2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbCookie2ActionPerformed
        handleButtonClick("SHORTBREAD");
    }//GEN-LAST:event_mbCookie2ActionPerformed

    private void mbCookie3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbCookie3ActionPerformed
        handleButtonClick("BROWN BUTTER");
    }//GEN-LAST:event_mbCookie3ActionPerformed

    private void mbCookie4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbCookie4ActionPerformed
        handleButtonClick("CHOCO CHIP");
    }//GEN-LAST:event_mbCookie4ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Cookies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cookies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cookies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cookies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cookies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cooBG;
    private javax.swing.JPanel cooBG2;
    private javax.swing.JPanel cooBG3;
    private javax.swing.JButton coo_BackBTN;
    private javax.swing.JLabel coopizzaBG;
    private javax.swing.JLabel mCookie1;
    private javax.swing.JLabel mCookie2;
    private javax.swing.JLabel mCookie3;
    private javax.swing.JLabel mCookie4;
    private javax.swing.JButton mbCookie1;
    private javax.swing.JButton mbCookie2;
    private javax.swing.JButton mbCookie3;
    private javax.swing.JButton mbCookie4;
    // End of variables declaration//GEN-END:variables
}
