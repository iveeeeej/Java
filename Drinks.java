package pit;

import java.util.HashMap;
import java.util.Map;

public class Drinks extends javax.swing.JFrame {

    private Map<String, Products> productMap;
    
    public Drinks() {
        initComponents();
        initializeProducts();
    }
    
    private void initializeProducts() {
        productMap = new HashMap<>();
        productMap.put("WATER", new Products("/pit/Image/Water.png", 15));
        productMap.put("ORANGE JUICE", new Products("/pit/Image/Juice.png", 15));
        productMap.put("SODA", new Products("/pit/Image/Soda.png", 20));
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

        drBG = new javax.swing.JPanel();
        drBG2 = new javax.swing.JPanel();
        drBG3 = new javax.swing.JPanel();
        mWATER = new javax.swing.JLabel();
        mJUICCE = new javax.swing.JLabel();
        mSODA = new javax.swing.JLabel();
        mbWATER = new javax.swing.JButton();
        mbJUICE = new javax.swing.JButton();
        mbSODA = new javax.swing.JButton();
        dr_BackBTN = new javax.swing.JButton();
        drpizzaBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drBG2.setBackground(new java.awt.Color(46, 46, 48));
        drBG2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drBG3.setBackground(new java.awt.Color(235, 235, 235));
        drBG3.setLayout(new java.awt.GridBagLayout());

        mWATER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mWATER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Water.png"))); // NOI18N
        mWATER.setPreferredSize(new java.awt.Dimension(200, 200));
        drBG3.add(mWATER, new java.awt.GridBagConstraints());

        mJUICCE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mJUICCE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Juice.png"))); // NOI18N
        mJUICCE.setPreferredSize(new java.awt.Dimension(200, 200));
        drBG3.add(mJUICCE, new java.awt.GridBagConstraints());

        mSODA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mSODA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Soda.png"))); // NOI18N
        mSODA.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        mSODA.setPreferredSize(new java.awt.Dimension(200, 200));
        drBG3.add(mSODA, new java.awt.GridBagConstraints());

        mbWATER.setBackground(new java.awt.Color(255, 0, 51));
        mbWATER.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbWATER.setForeground(new java.awt.Color(255, 255, 255));
        mbWATER.setText("WATER");
        mbWATER.setPreferredSize(new java.awt.Dimension(140, 60));
        mbWATER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbWATERActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        drBG3.add(mbWATER, gridBagConstraints);

        mbJUICE.setBackground(new java.awt.Color(255, 0, 51));
        mbJUICE.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbJUICE.setForeground(new java.awt.Color(255, 255, 255));
        mbJUICE.setText("JUICE");
        mbJUICE.setPreferredSize(new java.awt.Dimension(140, 60));
        mbJUICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbJUICEActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        drBG3.add(mbJUICE, gridBagConstraints);

        mbSODA.setBackground(new java.awt.Color(255, 0, 51));
        mbSODA.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbSODA.setForeground(new java.awt.Color(255, 255, 255));
        mbSODA.setText("SODA");
        mbSODA.setPreferredSize(new java.awt.Dimension(140, 60));
        mbSODA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbSODAActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        drBG3.add(mbSODA, gridBagConstraints);

        drBG2.add(drBG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1400, 550));

        dr_BackBTN.setBackground(new java.awt.Color(128, 128, 128));
        dr_BackBTN.setFont(new java.awt.Font("Lilita One", 1, 38)); // NOI18N
        dr_BackBTN.setForeground(new java.awt.Color(255, 255, 255));
        dr_BackBTN.setText("BACK");
        dr_BackBTN.setAlignmentY(0.0F);
        dr_BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dr_BackBTNActionPerformed(evt);
            }
        });
        drBG2.add(dr_BackBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 593, 170, 80));

        drBG.add(drBG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 50, 1440, 700));

        drpizzaBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/BG_3blur.png"))); // NOI18N
        drBG.add(drpizzaBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        getContentPane().add(drBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dr_BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dr_BackBTNActionPerformed
        this.dispose();
        new Menu2().setVisible(true);
    }//GEN-LAST:event_dr_BackBTNActionPerformed

    private void mbWATERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbWATERActionPerformed
        handleButtonClick("WATER");
    }//GEN-LAST:event_mbWATERActionPerformed

    private void mbJUICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbJUICEActionPerformed
        handleButtonClick("ORANGE JUICE");
    }//GEN-LAST:event_mbJUICEActionPerformed

    private void mbSODAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbSODAActionPerformed
        handleButtonClick("SODA");
    }//GEN-LAST:event_mbSODAActionPerformed

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Drinks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel drBG;
    private javax.swing.JPanel drBG2;
    private javax.swing.JPanel drBG3;
    private javax.swing.JButton dr_BackBTN;
    private javax.swing.JLabel drpizzaBG;
    private javax.swing.JLabel mJUICCE;
    private javax.swing.JLabel mSODA;
    private javax.swing.JLabel mWATER;
    private javax.swing.JButton mbJUICE;
    private javax.swing.JButton mbSODA;
    private javax.swing.JButton mbWATER;
    // End of variables declaration//GEN-END:variables
}
