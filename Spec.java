package pit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Spec extends javax.swing.JFrame {

    public Spec(String imagePath) {
        initComponents();
        setImage(imagePath);
    }

    //Do not touch
    private Spec() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    //Image gets Displayed
    private void setImage(String imagePath) {
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        IMGhere.setIcon(icon);
    }
    
    public void setFoodName(String foodName) {
    FoodNm.setText(foodName);
    }
    
    private int price;
    
    public void setPrice(int price) {
    this.price = price;
    No_Prc.setText("" + price);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Spec_BG = new javax.swing.JPanel();
        Price = new javax.swing.JLabel();
        QTY = new javax.swing.JLabel();
        noQTY = new javax.swing.JLabel();
        Minus = new javax.swing.JButton();
        Plus = new javax.swing.JButton();
        FoodNm = new javax.swing.JLabel();
        AddORD = new javax.swing.JButton();
        BackBTN = new javax.swing.JButton();
        OuterBG = new javax.swing.JPanel();
        InBG = new javax.swing.JPanel();
        IMGhere = new javax.swing.JLabel();
        blank = new javax.swing.JLabel();
        OuterPBG2 = new javax.swing.JPanel();
        Dollar = new javax.swing.JLabel();
        No_Prc = new javax.swing.JLabel();
        spec_pizzaBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Spec_BG.setBackground(new java.awt.Color(245, 245, 245));
        Spec_BG.setPreferredSize(new java.awt.Dimension(1540, 800));
        Spec_BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Price.setFont(new java.awt.Font("Lilita One", 1, 50)); // NOI18N
        Price.setText("PRICE:");
        Price.setPreferredSize(new java.awt.Dimension(120, 58));
        Spec_BG.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 150, 160, -1));

        QTY.setFont(new java.awt.Font("Lilita One", 1, 55)); // NOI18N
        QTY.setText("QTY:");
        QTY.setPreferredSize(new java.awt.Dimension(120, 58));
        Spec_BG.add(QTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 150, 130, 60));

        noQTY.setFont(new java.awt.Font("Lilita One", 1, 55)); // NOI18N
        noQTY.setText("1");
        Spec_BG.add(noQTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 150, 130, 60));

        Minus.setBackground(new java.awt.Color(46, 46, 48));
        Minus.setFont(new java.awt.Font("Wide Latin", 1, 90)); // NOI18N
        Minus.setForeground(new java.awt.Color(255, 255, 255));
        Minus.setText("-");
        Minus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Minus.setPreferredSize(new java.awt.Dimension(120, 80));
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusActionPerformed(evt);
            }
        });
        Spec_BG.add(Minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 250, -1, -1));

        Plus.setBackground(new java.awt.Color(46, 46, 48));
        Plus.setFont(new java.awt.Font("Arial Black", 1, 88)); // NOI18N
        Plus.setForeground(new java.awt.Color(255, 255, 255));
        Plus.setText("+");
        Plus.setPreferredSize(new java.awt.Dimension(120, 80));
        Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusActionPerformed(evt);
            }
        });
        Spec_BG.add(Plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 250, -1, -1));

        FoodNm.setFont(new java.awt.Font("Lilita One", 1, 60)); // NOI18N
        FoodNm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FoodNm.setPreferredSize(new java.awt.Dimension(350, 65));
        Spec_BG.add(FoodNm, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 500, 710, 90));

        AddORD.setBackground(new java.awt.Color(255, 0, 51));
        AddORD.setFont(new java.awt.Font("Lilita One", 1, 60)); // NOI18N
        AddORD.setForeground(new java.awt.Color(255, 255, 255));
        AddORD.setText("ADD ORDER");
        AddORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddORDActionPerformed(evt);
            }
        });
        Spec_BG.add(AddORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(1068, 578, 350, 100));

        BackBTN.setBackground(new java.awt.Color(128, 128, 128));
        BackBTN.setFont(new java.awt.Font("Lilita One", 1, 60)); // NOI18N
        BackBTN.setForeground(new java.awt.Color(255, 255, 255));
        BackBTN.setText("BACK");
        BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTNActionPerformed(evt);
            }
        });
        Spec_BG.add(BackBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 598, 190, 80));

        OuterBG.setBackground(new java.awt.Color(190, 190, 190));
        OuterBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IMGhere.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InBG.add(IMGhere, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 280));

        OuterBG.add(InBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 30, 340, 280));

        Spec_BG.add(OuterBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 110, 390, 340));

        blank.setFont(new java.awt.Font("Playbill", 1, 60)); // NOI18N
        blank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blank.setText("——————————————————————————————————");
        Spec_BG.add(blank, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 940, 40));

        OuterPBG2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dollar.setFont(new java.awt.Font("Lilita One", 1, 80)); // NOI18N
        Dollar.setText("P");
        OuterPBG2.add(Dollar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 80));

        No_Prc.setFont(new java.awt.Font("Lilita One", 1, 75)); // NOI18N
        OuterPBG2.add(No_Prc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, 80));

        Spec_BG.add(OuterPBG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 225, 230, 100));

        jPanel1.add(Spec_BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 50, 1440, 700));

        spec_pizzaBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pit/Image/BG_3blur.png"))); // NOI18N
        jPanel1.add(spec_pizzaBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Qty Buttons
    int qty = 1;
    int clickADD = 1;
    int clickMIN = 1;
    final String str = "";
    
    private void PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusActionPerformed
        qty = qty + clickADD;
        noQTY.setText(str + qty);
        No_Prc.setText(str + (price * qty));
    }//GEN-LAST:event_PlusActionPerformed

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusActionPerformed
        qty = qty - clickMIN;
        if(qty < 1)
        {
            qty = 1;
        }
        noQTY.setText(str + qty);
        No_Prc.setText(str + (price * qty));
    }//GEN-LAST:event_MinusActionPerformed

    private void AddORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddORDActionPerformed
        String productName = FoodNm.getText(); // Product name
        
        int productId = 0;

    switch (productName) {
        case "BURGER":
            productId = 1;
            break;
        case "SANDWICH":
            productId = 2;
            break;
        case "HOTDOG":
            productId = 3;
            break;
        case "PIZZA":
            productId = 4;
            break;
        case "NUGGETS":
            productId = 5;
            break;
        case "TEMPURA":
            productId = 6;
            break;
        case "SIOMAI":
            productId = 7;
            break;
        case "FISHBALL":
            productId = 8;
            break;
        case "FRIES":
            productId = 9;
            break;
        case "THIN BUTTER":
            productId = 10;
            break;
        case "SHORTBREAD":
            productId = 11;
            break;
        case "BROWN BUTTER":
            productId = 12;
            break;
        case "CHOCO CHIP":
            productId = 13;
            break;
        case "STRAWBERRY ICE CREAM":
            productId = 14;
            break;
        case "MANGO ICE CREAM":
            productId = 15;
            break;
        case "BLUEBERRY ICE CREAM":
            productId = 16;
            break;
        case "UBE ICE CREAM":
            productId = 17;
            break;
        case "VANILLA ICE CREAM":
            productId = 18;
            break;
        case "CHOCOLATE ICE CREAM":
            productId = 19;
            break;
        case "STRAWBERRY SHAKE":
            productId = 20;
            break;
        case "WATER":
            productId = 21;
            break;
        case "ORANGE JUICE":
            productId = 22;
            break;
        case "SODA":
            productId = 23;
            break;
        case "CHIPS REGULAR":
            productId = 24;
            break;
        case "CHIPS BBQ":
            productId = 25;
            break;
        case "CHIPS CHILI":
            productId = 26;
            break;
        case "CHIPS SOUR CREAM":
            productId = 27;
            break;
        case "CHIPS CHEESE":
            productId = 28;
            break;
           case "CHIPS GARLIC ONION":
            productId = 29;
            break;
           case "CHIPS SWEET CHILI":
            productId = 30;
            break;
        default:
            JOptionPane.showMessageDialog(this, "Invalid Product Name!");
            return;
    }
    
        int quantity = qty;
        int totalPrice = price * qty;

    // Insert data into the database
        String query = "INSERT INTO orders (id, fname, quantity, total_price) VALUES (?, ?, ?, ?)";

        try (Connection con = Database.getConnection();
            PreparedStatement pst = con.prepareStatement(query)) {
        
        // Set the values for the query
        pst.setInt(1, productId);
        pst.setString(2, productName);
        pst.setInt(3, quantity);
        pst.setInt(4, totalPrice);

        // Execute the query
        int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Order Added Successfully!");
            Menu2 menu = new Menu2();
            menu.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to Add Order.");
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_AddORDActionPerformed

    private void BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTNActionPerformed
        this.dispose();
        new Menu2().setVisible(true);
    }//GEN-LAST:event_BackBTNActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Spec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Spec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Spec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Spec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Label for Image
        java.awt.EventQueue.invokeLater(() -> {
            new Spec().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddORD;
    private javax.swing.JButton BackBTN;
    private javax.swing.JLabel Dollar;
    private javax.swing.JLabel FoodNm;
    private javax.swing.JLabel IMGhere;
    private javax.swing.JPanel InBG;
    private javax.swing.JButton Minus;
    private javax.swing.JLabel No_Prc;
    private javax.swing.JPanel OuterBG;
    private javax.swing.JPanel OuterPBG2;
    private javax.swing.JButton Plus;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel QTY;
    private javax.swing.JPanel Spec_BG;
    private javax.swing.JLabel blank;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel noQTY;
    private javax.swing.JLabel spec_pizzaBG;
    // End of variables declaration//GEN-END:variables

}
