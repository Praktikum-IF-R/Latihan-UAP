/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latuap;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.util.SimpleTimeZone;
import javax.swing.JOptionPane;

/**
 *
 * @author Anita Rizky A
 */

public class ParkirFrame extends javax.swing.JFrame {
    //Parkir p = new Parkir();
    /**
     * Creates new form ParkirFrame
     */
       
    String plat[] = {"null","null","null","null","null","null","null","null"};
    String tanggalmasuk[] = {"null","null","null","null","null","null","null","null"};
    String tanggalkeluar[] = {"null","null","null","null","null","null","null","null"};
    String waktumasuk[] = {"null","null","null","null","null","null","null","null"};
    String waktukeluar[] = {"null","null","null","null","null","null","null","null"};
    
    public ParkirFrame() {
        initComponents();
        b5.setVisible(false);
        b6.setVisible(false);
        b7.setVisible(false);
        b8.setVisible(false);
        b13.setVisible(false);
        b14.setVisible(false);
        b15.setVisible(false);
        b16.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbjudul = new javax.swing.JLabel();
        lbplat = new javax.swing.JLabel();
        tfplat = new javax.swing.JTextField();
        bttampil = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setEnabled(false);

        lbjudul.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbjudul.setText("SISTEM PARKIR");

        lbplat.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbplat.setText("Nomor Plat");

        tfplat.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        bttampil.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        bttampil.setText("Tampilkan Data");
        bttampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttampilActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        b1.setText("Masuk I");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        b2.setText("Masuk II");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        b3.setText("Masuk III");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        b4.setText("Masuk IV");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        b6.setText("Keluar");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        b7.setText("Keluar");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        b8.setText("Keluar");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        b5.setText("Keluar");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        b10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        b10.setText("Masuk VI");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        b11.setText("Masuk VII");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        b12.setText("Masuk VIII");
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        b13.setText("Keluar");
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });

        b14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        b14.setText("Keluar");
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });

        b15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        b15.setText("Keluar");
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });

        b16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        b16.setText("Keluar");
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        b9.setText("Masuk V");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(b12, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(b11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(b10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbplat)
                        .addGap(53, 53, 53)
                        .addComponent(tfplat, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttampil))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(lbjudul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbjudul)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttampil)
                    .addComponent(tfplat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbplat))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        Date date = new Date();
        Date waktu = new Date();
        String jam = (""+ (String.format("%1$tH:%1$tM:%1$tS", waktu)));
        String tanggal = (""+ (String.format("%1$td-%1$tb-%1$tY", date)));
        tanggalkeluar[7] = tanggal;
        waktukeluar[7] = jam;
        b12.setVisible(true);
        b16.setVisible(false);
        JOptionPane.showMessageDialog(null, plat[7]+" Keluar");
    }//GEN-LAST:event_b16ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        Date date = new Date();
        Date waktu = new Date();
        String jam = (""+ (String.format("%1$tH:%1$tM:%1$tS", waktu)));
        String tanggal = (""+ (String.format("%1$td-%1$tb-%1$tY", date)));
        tanggalkeluar[6] = tanggal;
        waktukeluar[6] = jam;
        b11.setVisible(true);
        b15.setVisible(false);
        JOptionPane.showMessageDialog(null, plat[6]+" Keluar");
    }//GEN-LAST:event_b15ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        Date date = new Date();
        Date waktu = new Date();
        String jam = (""+ (String.format("%1$tH:%1$tM:%1$tS", waktu)));
        String tanggal = (""+ (String.format("%1$td-%1$tb-%1$tY", date)));
        tanggalkeluar[5] = tanggal;
        waktukeluar[5] = jam;
        b10.setVisible(true);
        b14.setVisible(false);
        JOptionPane.showMessageDialog(null, plat[5]+" Keluar");
    }//GEN-LAST:event_b14ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        Date date = new Date();
        Date waktu = new Date();
        String jam = (""+ (String.format("%1$tH:%1$tM:%1$tS", waktu)));
        String tanggal = (""+ (String.format("%1$td-%1$tb-%1$tY", date)));
        tanggalkeluar[4] = tanggal;
        waktukeluar[4] = jam;
        b9.setVisible(true);
        b13.setVisible(false);
        JOptionPane.showMessageDialog(null, plat[4]+" Keluar");
    }//GEN-LAST:event_b13ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        Date date = new Date();
        Date waktu = new Date();
        String jam = (""+ (String.format("%1$tH:%1$tM:%1$tS", waktu)));
        String tanggal = (""+ (String.format("%1$td-%1$tb-%1$tY", date)));
        plat[7] = tfplat.getText();
        tanggalmasuk[7] = tanggal;
        waktumasuk[7] = jam;
        b12.setVisible(false);
        b16.setVisible(true);
        JOptionPane.showMessageDialog(null, plat[7]+" Masuk");
    }//GEN-LAST:event_b12ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        Date date = new Date();
        Date waktu = new Date();
        String jam = (""+ (String.format("%1$tH:%1$tM:%1$tS", waktu)));
        String tanggal = (""+ (String.format("%1$td-%1$tb-%1$tY", date)));
        plat[6] = tfplat.getText();
        tanggalmasuk[6] = tanggal;
        waktumasuk[6] = jam;
        b11.setVisible(false);
        b15.setVisible(true);
        JOptionPane.showMessageDialog(null, plat[6]+" Masuk");
    }//GEN-LAST:event_b11ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        Date date = new Date();
        Date waktu = new Date();
        String jam = (""+ (String.format("%1$tH:%1$tM:%1$tS", waktu)));
        String tanggal = (""+ (String.format("%1$td-%1$tb-%1$tY", date)));
        plat[5] = tfplat.getText();
        tanggalmasuk[5] = tanggal;
        waktumasuk[5] = jam;
        b10.setVisible(false);
        b14.setVisible(true);
        JOptionPane.showMessageDialog(null, plat[5]+" Masuk");
    }//GEN-LAST:event_b10ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        Date date = new Date();
        Date waktu = new Date();
        String jam = (""+ (String.format("%1$tH:%1$tM:%1$tS", waktu)));
        String tanggal = (""+ (String.format("%1$td-%1$tb-%1$tY", date)));
        tanggalkeluar[3] = tanggal;
        waktukeluar[3] = jam;
        b4.setVisible(true);
        b8.setVisible(false);
        JOptionPane.showMessageDialog(null, plat[3]+" Keluar");
    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        Date date = new Date();
        Date waktu = new Date();
        String jam = (""+ (String.format("%1$tH:%1$tM:%1$tS", waktu)));
        String tanggal = (""+ (String.format("%1$td-%1$tb-%1$tY", date)));
        tanggalkeluar[2] = tanggal;
        waktukeluar[2] = jam;
        b3.setVisible(true);
        b7.setVisible(false);
        JOptionPane.showMessageDialog(null, plat[2]+" Keluar");
    }//GEN-LAST:event_b7ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        Date date = new Date();
        Date waktu = new Date();
        String jam = (""+ (String.format("%1$tH:%1$tM:%1$tS", waktu)));
        String tanggal = (""+ (String.format("%1$td-%1$tb-%1$tY", date)));
        tanggalkeluar[1] = tanggal;
        waktukeluar[1] = jam;
        b2.setVisible(true);
        b6.setVisible(false);
        JOptionPane.showMessageDialog(null, plat[1]+" Keluar");
    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        Date date = new Date();
        Date waktu = new Date();
        String jam = (""+ (String.format("%1$tH:%1$tM:%1$tS", waktu)));
        String tanggal = (""+ (String.format("%1$td-%1$tb-%1$tY", date)));
        tanggalkeluar[0] = tanggal;
        waktukeluar[0] = jam;
        b1.setVisible(true);
        b5.setVisible(false);
        JOptionPane.showMessageDialog(null, plat[0]+" Keluar");
    }//GEN-LAST:event_b5ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        Date date = new Date();
        Date waktu = new Date();
        String jam = (""+ (String.format("%1$tH:%1$tM:%1$tS", waktu)));
        String tanggal = (""+ (String.format("%1$td-%1$tb-%1$tY", date)));
        plat[3] = tfplat.getText();
        tanggalmasuk[3] = tanggal;
        waktumasuk[3] = jam;
        b4.setVisible(false);
        b8.setVisible(true);
        JOptionPane.showMessageDialog(null, plat[3]+" Masuk");
    }//GEN-LAST:event_b4ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        Date date = new Date();
        Date waktu = new Date();
        String jam = (""+ (String.format("%1$tH:%1$tM:%1$tS", waktu)));
        String tanggal = (""+ (String.format("%1$td-%1$tb-%1$tY", date)));
        plat[2] = tfplat.getText();
        tanggalmasuk[2] = tanggal;
        waktumasuk[2] = jam;
        b3.setVisible(false);
        b7.setVisible(true);
        JOptionPane.showMessageDialog(null, plat[2]+" Masuk");
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        Date date = new Date();
        Date waktu = new Date();
        String jam = (""+ (String.format("%1$tH:%1$tM:%1$tS", waktu)));
        String tanggal = (""+ (String.format("%1$td-%1$tb-%1$tY", date)));
        plat[1] = tfplat.getText();
        tanggalmasuk[1] = tanggal;
        waktumasuk[1] = jam;
        b2.setVisible(false);
        b6.setVisible(true);
        JOptionPane.showMessageDialog(null, plat[1]+" Masuk");
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        Date date = new Date();
        Date waktu = new Date();
        String jam = (""+ (String.format("%1$tH:%1$tM:%1$tS", waktu)));
        String tanggal = (""+ (String.format("%1$td-%1$tb-%1$tY", date)));
        plat[0] = tfplat.getText();
        tanggalmasuk[0] = tanggal;
        waktumasuk[0] = jam;
        b1.setVisible(false);
        b5.setVisible(true);
        JOptionPane.showMessageDialog(null, plat[0]+" Masuk");
    }//GEN-LAST:event_b1ActionPerformed

    private void bttampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttampilActionPerformed
        JOptionPane.showMessageDialog(null,
            "P1 -- Plat Nomor "+plat[0]+" Masuk "+waktumasuk[0]+" "+tanggalmasuk[0]+" Keluar "+waktukeluar[0]+" "+tanggalmasuk[0]
            +"\nP2 -- Plat Nomor "+plat[1]+" Masuk "+waktumasuk[1]+" "+tanggalmasuk[1]+" Keluar "+waktukeluar[1]+" "+tanggalmasuk[1]
            +"\nP3 -- Plat Nomor "+plat[2]+" Masuk "+waktumasuk[2]+" "+tanggalmasuk[2]+" Keluar "+waktukeluar[2]+" "+tanggalmasuk[2]
            +"\nP4 -- Plat Nomor "+plat[3]+" Masuk "+waktumasuk[3]+" "+tanggalmasuk[3]+" Keluar "+waktukeluar[3]+" "+tanggalmasuk[3]
            +"\nP5 -- Plat Nomor "+plat[4]+" Masuk "+waktumasuk[4]+" "+tanggalmasuk[4]+" Keluar "+waktukeluar[4]+" "+tanggalmasuk[4]
            +"\nP6 -- Plat Nomor "+plat[5]+" Masuk "+waktumasuk[5]+" "+tanggalmasuk[5]+" Keluar "+waktukeluar[5]+" "+tanggalmasuk[5]
            +"\nP7 -- Plat Nomor "+plat[6]+" Masuk "+waktumasuk[6]+" "+tanggalmasuk[6]+" Keluar "+waktukeluar[6]+" "+tanggalmasuk[6]
            +"\nP8 -- Plat Nomor "+plat[7]+" Masuk "+waktumasuk[7]+" "+tanggalmasuk[7]+" Keluar "+waktukeluar[7]+" "+tanggalmasuk[7]);
    }//GEN-LAST:event_bttampilActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        Date date = new Date();
        Date waktu = new Date();
        String jam = (""+ (String.format("%1$tH:%1$tM:%1$tS", waktu)));
        String tanggal = (""+ (String.format("%1$td-%1$tb-%1$tY", date)));
        plat[4] = tfplat.getText();
        tanggalmasuk[4] = tanggal;
        waktumasuk[4] = jam;
        b9.setVisible(false);
        b13.setVisible(true);
        JOptionPane.showMessageDialog(null, plat[4]+" Masuk");
    }//GEN-LAST:event_b9ActionPerformed

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
            java.util.logging.Logger.getLogger(ParkirFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParkirFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParkirFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParkirFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParkirFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bttampil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbjudul;
    private javax.swing.JLabel lbplat;
    private javax.swing.JTextField tfplat;
    // End of variables declaration//GEN-END:variables
}
