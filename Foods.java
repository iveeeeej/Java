package pit;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Foods extends javax.swing.JFrame {

    private Map<String, Products> productMap;
    
    public Foods() {
        initComponents();
        initializeProducts();
        //foodsBG3.setBackground(new Color(153, 153, 153, 80));
    }

    private void initializeProducts() {
        productMap = new HashMap<>();
        productMap.put("BURGER", new Products("/pit/Image/Burger.png", 25));
        productMap.put("SANDWICH", new Products("/pit/Image/Sandwich.png", 25));
        productMap.put("HOTDOG", new Products("/pit/Image/Hotdog.png", 25));
        productMap.put("PIZZA", new Products("/pit/Image/Pizza.png", 25));
        productMap.put("NUGGETS", new Products("/pit/Image/Nuggets.png", 25));
        productMap.put("TEMPURA", new Products("/pit/Image/Tempura.png", 15));
        productMap.put("SIOMAI", new Products("/pit/Image/Siomai.png", 5));
        productMap.put("FISHBALL", new Products("/pit/Image/Fishball.png", 5));
        productMap.put("FRIES", new Products("/pit/Image/Fries.png", 20));
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

        foodsBG = new javax.swing.JPanel();
        foodsBG2 = new javax.swing.JPanel();
        foodsBG3 = new javax.swing.JPanel();
        mBurger = new javax.swing.JLabel();
        mSandwich = new javax.swing.JLabel();
        mHotdog = new javax.swing.JLabel();
        mPizza = new javax.swing.JLabel();
        mNuggets = new javax.swing.JLabel();
        mTempura = new javax.swing.JLabel();
        mSiomai = new javax.swing.JLabel();
        mFishball = new javax.swing.JLabel();
        mFries = new javax.swing.JLabel();
        mbBurger = new javax.swing.JButton();
        mbSandwich = new javax.swing.JButton();
        mbHotdog = new javax.swing.JButton();
        mbPizza = new javax.swing.JButton();
        mbNuggets = new javax.swing.JButton();
        mbTempura = new javax.swing.JButton();
        mbSiomai = new javax.swing.JButton();
        mbFishball = new javax.swing.JButton();
        mbFries = new javax.swing.JButton();
        foods_BackBTN = new javax.swing.JButton();
        foodspizzaBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foodsBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foodsBG2.setBackground(new java.awt.Color(46, 46, 48));
        foodsBG2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foodsBG3.setBackground(new java.awt.Color(235, 235, 235));
        foodsBG3.setLayout(new java.awt.GridBagLayout());

        mBurger.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mBurger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Burger.png"))); // NOI18N
        mBurger.setPreferredSize(new java.awt.Dimension(200, 200));
        foodsBG3.add(mBurger, new java.awt.GridBagConstraints());

        mSandwich.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mSandwich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Sandwich.png"))); // NOI18N
        mSandwich.setPreferredSize(new java.awt.Dimension(200, 200));
        foodsBG3.add(mSandwich, new java.awt.GridBagConstraints());

        mHotdog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mHotdog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Hotdog.png"))); // NOI18N
        mHotdog.setPreferredSize(new java.awt.Dimension(200, 200));
        foodsBG3.add(mHotdog, new java.awt.GridBagConstraints());

        mPizza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mPizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Pizza.png"))); // NOI18N
        mPizza.setPreferredSize(new java.awt.Dimension(200, 200));
        foodsBG3.add(mPizza, new java.awt.GridBagConstraints());

        mNuggets.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mNuggets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Nuggets.png"))); // NOI18N
        mNuggets.setPreferredSize(new java.awt.Dimension(200, 200));
        foodsBG3.add(mNuggets, new java.awt.GridBagConstraints());

        mTempura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mTempura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Tempura.png"))); // NOI18N
        mTempura.setPreferredSize(new java.awt.Dimension(200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        foodsBG3.add(mTempura, gridBagConstraints);

        mSiomai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mSiomai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Siomai.png"))); // NOI18N
        mSiomai.setPreferredSize(new java.awt.Dimension(200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        foodsBG3.add(mSiomai, gridBagConstraints);

        mFishball.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mFishball.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Fishball.png"))); // NOI18N
        mFishball.setPreferredSize(new java.awt.Dimension(200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        foodsBG3.add(mFishball, gridBagConstraints);

        mFries.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mFries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/Fries.png"))); // NOI18N
        mFries.setPreferredSize(new java.awt.Dimension(200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        foodsBG3.add(mFries, gridBagConstraints);

        mbBurger.setBackground(new java.awt.Color(255, 0, 51));
        mbBurger.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbBurger.setForeground(new java.awt.Color(255, 255, 255));
        mbBurger.setText("BURGER");
        mbBurger.setPreferredSize(new java.awt.Dimension(140, 60));
        mbBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbBurgerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        foodsBG3.add(mbBurger, gridBagConstraints);

        mbSandwich.setBackground(new java.awt.Color(255, 0, 51));
        mbSandwich.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbSandwich.setForeground(new java.awt.Color(255, 255, 255));
        mbSandwich.setText("SANDWICH");
        mbSandwich.setPreferredSize(new java.awt.Dimension(140, 60));
        mbSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbSandwichActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        foodsBG3.add(mbSandwich, gridBagConstraints);

        mbHotdog.setBackground(new java.awt.Color(255, 0, 51));
        mbHotdog.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbHotdog.setForeground(new java.awt.Color(255, 255, 255));
        mbHotdog.setText("HOTDOG");
        mbHotdog.setPreferredSize(new java.awt.Dimension(140, 60));
        mbHotdog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbHotdogActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        foodsBG3.add(mbHotdog, gridBagConstraints);

        mbPizza.setBackground(new java.awt.Color(255, 0, 51));
        mbPizza.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbPizza.setForeground(new java.awt.Color(255, 255, 255));
        mbPizza.setText("PIZZA");
        mbPizza.setPreferredSize(new java.awt.Dimension(140, 60));
        mbPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbPizzaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        foodsBG3.add(mbPizza, gridBagConstraints);

        mbNuggets.setBackground(new java.awt.Color(255, 0, 51));
        mbNuggets.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbNuggets.setForeground(new java.awt.Color(255, 255, 255));
        mbNuggets.setText("NUGGETS");
        mbNuggets.setPreferredSize(new java.awt.Dimension(140, 60));
        mbNuggets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbNuggetsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        foodsBG3.add(mbNuggets, gridBagConstraints);

        mbTempura.setBackground(new java.awt.Color(255, 0, 51));
        mbTempura.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbTempura.setForeground(new java.awt.Color(255, 255, 255));
        mbTempura.setText("TEMPURA");
        mbTempura.setPreferredSize(new java.awt.Dimension(140, 60));
        mbTempura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbTempuraActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        foodsBG3.add(mbTempura, gridBagConstraints);

        mbSiomai.setBackground(new java.awt.Color(255, 0, 51));
        mbSiomai.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbSiomai.setForeground(new java.awt.Color(255, 255, 255));
        mbSiomai.setText("SIOMAI");
        mbSiomai.setPreferredSize(new java.awt.Dimension(140, 60));
        mbSiomai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbSiomaiActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        foodsBG3.add(mbSiomai, gridBagConstraints);

        mbFishball.setBackground(new java.awt.Color(255, 0, 51));
        mbFishball.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbFishball.setForeground(new java.awt.Color(255, 255, 255));
        mbFishball.setText("FISHBALL");
        mbFishball.setPreferredSize(new java.awt.Dimension(140, 60));
        mbFishball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbFishballActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        foodsBG3.add(mbFishball, gridBagConstraints);

        mbFries.setBackground(new java.awt.Color(255, 0, 51));
        mbFries.setFont(new java.awt.Font("Lilita One", 1, 18)); // NOI18N
        mbFries.setForeground(new java.awt.Color(255, 255, 255));
        mbFries.setText("FRIES");
        mbFries.setPreferredSize(new java.awt.Dimension(140, 60));
        mbFries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbFriesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        foodsBG3.add(mbFries, gridBagConstraints);

        foodsBG2.add(foodsBG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1400, 550));

        foods_BackBTN.setBackground(new java.awt.Color(128, 128, 128));
        foods_BackBTN.setFont(new java.awt.Font("Lilita One", 1, 38)); // NOI18N
        foods_BackBTN.setForeground(new java.awt.Color(255, 255, 255));
        foods_BackBTN.setText("BACK");
        foods_BackBTN.setAlignmentY(0.0F);
        foods_BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foods_BackBTNActionPerformed(evt);
            }
        });
        foodsBG2.add(foods_BackBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 593, 170, 80));

        foodsBG.add(foodsBG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 50, 1440, 700));

        foodspizzaBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/BG_3blur.png"))); // NOI18N
        foodsBG.add(foodspizzaBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        getContentPane().add(foodsBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void foods_BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foods_BackBTNActionPerformed
        this.dispose();
        new Menu2().setVisible(true);
    }//GEN-LAST:event_foods_BackBTNActionPerformed

    private void mbBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbBurgerActionPerformed
        handleButtonClick("BURGER");
    }//GEN-LAST:event_mbBurgerActionPerformed

    private void mbSandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbSandwichActionPerformed
        handleButtonClick("SANDWICH");
    }//GEN-LAST:event_mbSandwichActionPerformed

    private void mbHotdogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbHotdogActionPerformed
        handleButtonClick("HOTDOG");
    }//GEN-LAST:event_mbHotdogActionPerformed

    private void mbPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbPizzaActionPerformed
        handleButtonClick("PIZZA");
    }//GEN-LAST:event_mbPizzaActionPerformed

    private void mbNuggetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbNuggetsActionPerformed
        handleButtonClick("NUGGETS");
    }//GEN-LAST:event_mbNuggetsActionPerformed

    private void mbTempuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbTempuraActionPerformed
        handleButtonClick("TEMPURA");
    }//GEN-LAST:event_mbTempuraActionPerformed

    private void mbSiomaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbSiomaiActionPerformed
        handleButtonClick("SIOMAI");
    }//GEN-LAST:event_mbSiomaiActionPerformed

    private void mbFishballActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbFishballActionPerformed
        handleButtonClick("FISHBALL");
    }//GEN-LAST:event_mbFishballActionPerformed

    private void mbFriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbFriesActionPerformed
        handleButtonClick("FRIES");
    }//GEN-LAST:event_mbFriesActionPerformed

    
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Foods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel foodsBG;
    private javax.swing.JPanel foodsBG2;
    private javax.swing.JPanel foodsBG3;
    private javax.swing.JButton foods_BackBTN;
    private javax.swing.JLabel foodspizzaBG;
    private javax.swing.JLabel mBurger;
    private javax.swing.JLabel mFishball;
    private javax.swing.JLabel mFries;
    private javax.swing.JLabel mHotdog;
    private javax.swing.JLabel mNuggets;
    private javax.swing.JLabel mPizza;
    private javax.swing.JLabel mSandwich;
    private javax.swing.JLabel mSiomai;
    private javax.swing.JLabel mTempura;
    private javax.swing.JButton mbBurger;
    private javax.swing.JButton mbFishball;
    private javax.swing.JButton mbFries;
    private javax.swing.JButton mbHotdog;
    private javax.swing.JButton mbNuggets;
    private javax.swing.JButton mbPizza;
    private javax.swing.JButton mbSandwich;
    private javax.swing.JButton mbSiomai;
    private javax.swing.JButton mbTempura;
    // End of variables declaration//GEN-END:variables
}
