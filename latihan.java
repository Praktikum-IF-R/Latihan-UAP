package latihanPrak;

import javax.swing.JOptionPane;

public class latihan extends javax.swing.JFrame {

    String masuk[] = new String[8];
    boolean a[] = new boolean[8];

    public latihan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textPlat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        MASUK1 = new javax.swing.JButton();
        MASUK2 = new javax.swing.JButton();
        MASUK3 = new javax.swing.JButton();
        MASUK4 = new javax.swing.JButton();
        MASUK5 = new javax.swing.JButton();
        MASUK6 = new javax.swing.JButton();
        MASUK7 = new javax.swing.JButton();
        MASUK8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textPlat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPlat.setText("No Plat");
        textPlat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPlatActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("NO PLAT :");

        jButton25.setText("TAMPILKAN DATA");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        MASUK1.setText("MASUK");
        MASUK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MASUK1ActionPerformed(evt);
            }
        });

        MASUK2.setText("MASUK");
        MASUK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MASUK2ActionPerformed(evt);
            }
        });

        MASUK3.setText("MASUK");
        MASUK3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MASUK3ActionPerformed(evt);
            }
        });

        MASUK4.setText("MASUK");
        MASUK4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MASUK4ActionPerformed(evt);
            }
        });

        MASUK5.setText("MASUK");
        MASUK5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MASUK5ActionPerformed(evt);
            }
        });

        MASUK6.setText("MASUK");
        MASUK6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MASUK6ActionPerformed(evt);
            }
        });

        MASUK7.setText("MASUK");
        MASUK7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MASUK7ActionPerformed(evt);
            }
        });

        MASUK8.setText("MASUK");
        MASUK8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MASUK8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MASUK5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MASUK6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MASUK1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MASUK2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MASUK3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MASUK4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MASUK7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MASUK8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {MASUK1, MASUK2, MASUK3, MASUK4, MASUK5, MASUK6, MASUK7, MASUK8});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25)
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MASUK1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(MASUK2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MASUK3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MASUK4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MASUK7, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(MASUK6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MASUK5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MASUK8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {MASUK1, MASUK2, MASUK3, MASUK4, MASUK5, MASUK6, MASUK7, MASUK8});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textPlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPlatActionPerformed


    }//GEN-LAST:event_textPlatActionPerformed

    private void MASUK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MASUK1ActionPerformed

        if (a[0] != true) {
            masuk[0] = textPlat.getText();
            MASUK1.setText("KELUAR");
            a[0] = true;
        } else {
            MASUK1.setText("MASUK");
            masuk[0] = null;
            a[0] = false;
        }
    }//GEN-LAST:event_MASUK1ActionPerformed

    private void MASUK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MASUK2ActionPerformed
        if (a[1] != true) {
            masuk[1] = textPlat.getText();
            MASUK2.setText("KELUAR");
            a[1] = true;
        } else {
            MASUK2.setText("MASUK");
            masuk[1] = null;
            a[1] = false;
        }
    }//GEN-LAST:event_MASUK2ActionPerformed

    private void MASUK3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MASUK3ActionPerformed
        if (a[2] != true) {
            masuk[2] = textPlat.getText();
            MASUK3.setText("KELUAR");
            a[2] = true;
        } else {
            MASUK3.setText("MASUK");
            masuk[2] = null;
            a[2] = false;
        }
    }//GEN-LAST:event_MASUK3ActionPerformed

    private void MASUK4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MASUK4ActionPerformed
        if (a[3] != true) {
            masuk[3] = textPlat.getText();
            MASUK4.setText("KELUAR");
            a[3] = true;
        } else {
            MASUK4.setText("MASUK");
            masuk[3] = null;
            a[3] = false;
        }
    }//GEN-LAST:event_MASUK4ActionPerformed

    private void MASUK5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MASUK5ActionPerformed
        if (a[4] != true) {
            masuk[4] = textPlat.getText();
            MASUK5.setText("KELUAR");
            a[4] = true;
        } else {
            MASUK5.setText("MASUK");
            masuk[4] = null;
            a[4] = false;
        }
    }//GEN-LAST:event_MASUK5ActionPerformed

    private void MASUK6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MASUK6ActionPerformed
        if (a[5] != true) {
            masuk[5] = textPlat.getText();
            MASUK6.setText("KELUAR");
            a[5] = true;
        } else {
            MASUK6.setText("MASUK");
            masuk[5] = null;
            a[5] = false;
        }
    }//GEN-LAST:event_MASUK6ActionPerformed

    private void MASUK7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MASUK7ActionPerformed
        if (a[6] != true) {
            masuk[6] = textPlat.getText();
            MASUK7.setText("KELUAR");
            a[6] = true;
        } else {
            MASUK7.setText("MASUK");
            masuk[6] = null;
            a[6] = false;
        }
    }//GEN-LAST:event_MASUK7ActionPerformed

    private void MASUK8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MASUK8ActionPerformed
        if (a[7] != true) {
            masuk[7] = textPlat.getText();
            MASUK8.setText("KELUAR");
            a[7] = true;
        } else {
            MASUK8.setText("MASUK");
            masuk[7] = null;
            a[7] = false;
        }
    }//GEN-LAST:event_MASUK8ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed

        JOptionPane.showMessageDialog(null, "parkiran 1 no plat : " + masuk[0] + "\nparkiran 2 no plat : " + masuk[1] + "\nparkiran 3 no plat : "
                + masuk[2] + "\nparkiran 4 no plat : " + masuk[3] + "\nparkiran 5 no plat : " + masuk[4] + "\nparkiran 6 no plat : " + masuk[5] + "\nparkiran 7 no plat : "
                + masuk[6] + "\nparkiran 8 no plat : " + masuk[7]);


    }//GEN-LAST:event_jButton25ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(latihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MASUK1;
    private javax.swing.JButton MASUK2;
    private javax.swing.JButton MASUK3;
    private javax.swing.JButton MASUK4;
    private javax.swing.JButton MASUK5;
    private javax.swing.JButton MASUK6;
    private javax.swing.JButton MASUK7;
    private javax.swing.JButton MASUK8;
    private javax.swing.JButton jButton25;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textPlat;
    // End of variables declaration//GEN-END:variables
}
