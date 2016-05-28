/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraUAP;

/**
 *
 * @author wahyuridiansyah
 */
import java.io.*;

import java.util.*;

import java.text.*;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    private String fileName = "temp.txt";
    private String teks="";
    private String platParkir1,platParkir2,platParkir3,platParkir4,
                   platParkir5,platParkir6,platParkir7,platParkir8;
    
    public GUI() {
        initComponents();
        keluar_1.setVisible(false);
        keluar_2.setVisible(false);
        keluar_3.setVisible(false);
        keluar_4.setVisible(false);
        keluar_5.setVisible(false);
        keluar_6.setVisible(false);
        keluar_7.setVisible(false);
        keluar_8.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUtama = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        platField = new javax.swing.JTextField();
        tampilData = new javax.swing.JButton();
        subPanel_1 = new javax.swing.JPanel();
        keluar_1 = new javax.swing.JButton();
        masuk_1 = new javax.swing.JButton();
        subPanel_2 = new javax.swing.JPanel();
        keluar_2 = new javax.swing.JButton();
        masuk_2 = new javax.swing.JButton();
        subPanel_3 = new javax.swing.JPanel();
        keluar_3 = new javax.swing.JButton();
        masuk_3 = new javax.swing.JButton();
        subPanel_4 = new javax.swing.JPanel();
        keluar_4 = new javax.swing.JButton();
        masuk_4 = new javax.swing.JButton();
        subPanel_5 = new javax.swing.JPanel();
        keluar_5 = new javax.swing.JButton();
        masuk_5 = new javax.swing.JButton();
        subPanel_6 = new javax.swing.JPanel();
        keluar_6 = new javax.swing.JButton();
        masuk_6 = new javax.swing.JButton();
        subPanel_7 = new javax.swing.JPanel();
        keluar_7 = new javax.swing.JButton();
        masuk_7 = new javax.swing.JButton();
        subPanel_8 = new javax.swing.JPanel();
        keluar_8 = new javax.swing.JButton();
        masuk_8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelUtama.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SISTEM PARKIR");

        jLabel1.setText("Nomor Plat  :");

        platField.setText("Masukan Nomor Plat Anda");
        platField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platFieldActionPerformed(evt);
            }
        });

        tampilData.setText("Tampilkan Data");
        tampilData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilDataActionPerformed(evt);
            }
        });

        subPanel_1.setPreferredSize(new java.awt.Dimension(125, 120));

        keluar_1.setBackground(new java.awt.Color(255, 0, 0));
        keluar_1.setText("KELUAR");
        keluar_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar_1ActionPerformed(evt);
            }
        });

        masuk_1.setBackground(new java.awt.Color(51, 255, 0));
        masuk_1.setText("MASUK");
        masuk_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masuk_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanel_1Layout = new javax.swing.GroupLayout(subPanel_1);
        subPanel_1.setLayout(subPanel_1Layout);
        subPanel_1Layout.setHorizontalGroup(
            subPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masuk_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(keluar_1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        subPanel_1Layout.setVerticalGroup(
            subPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel_1Layout.createSequentialGroup()
                .addComponent(masuk_1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(keluar_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        subPanel_2.setPreferredSize(new java.awt.Dimension(125, 120));

        keluar_2.setBackground(new java.awt.Color(255, 0, 0));
        keluar_2.setText("KELUAR");
        keluar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar_2ActionPerformed(evt);
            }
        });

        masuk_2.setBackground(new java.awt.Color(51, 255, 0));
        masuk_2.setText("MASUK");
        masuk_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masuk_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanel_2Layout = new javax.swing.GroupLayout(subPanel_2);
        subPanel_2.setLayout(subPanel_2Layout);
        subPanel_2Layout.setHorizontalGroup(
            subPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masuk_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(keluar_2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        subPanel_2Layout.setVerticalGroup(
            subPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel_2Layout.createSequentialGroup()
                .addComponent(masuk_2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(keluar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        subPanel_3.setPreferredSize(new java.awt.Dimension(125, 120));

        keluar_3.setBackground(java.awt.Color.red);
        keluar_3.setText("KELUAR");
        keluar_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar_3ActionPerformed(evt);
            }
        });

        masuk_3.setBackground(new java.awt.Color(51, 255, 0));
        masuk_3.setText("MASUK");
        masuk_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masuk_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanel_3Layout = new javax.swing.GroupLayout(subPanel_3);
        subPanel_3.setLayout(subPanel_3Layout);
        subPanel_3Layout.setHorizontalGroup(
            subPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masuk_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(keluar_3, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        subPanel_3Layout.setVerticalGroup(
            subPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel_3Layout.createSequentialGroup()
                .addComponent(masuk_3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(keluar_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        subPanel_4.setPreferredSize(new java.awt.Dimension(125, 120));

        keluar_4.setBackground(java.awt.Color.red);
        keluar_4.setText("KELUAR");
        keluar_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar_4ActionPerformed(evt);
            }
        });

        masuk_4.setBackground(java.awt.Color.green);
        masuk_4.setText("MASUK");
        masuk_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masuk_4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanel_4Layout = new javax.swing.GroupLayout(subPanel_4);
        subPanel_4.setLayout(subPanel_4Layout);
        subPanel_4Layout.setHorizontalGroup(
            subPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masuk_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(keluar_4, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        subPanel_4Layout.setVerticalGroup(
            subPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel_4Layout.createSequentialGroup()
                .addComponent(masuk_4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(keluar_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        subPanel_5.setPreferredSize(new java.awt.Dimension(125, 120));

        keluar_5.setBackground(java.awt.Color.red);
        keluar_5.setText("KELUAR");
        keluar_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar_5ActionPerformed(evt);
            }
        });

        masuk_5.setBackground(java.awt.Color.green);
        masuk_5.setText("MASUK");
        masuk_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masuk_5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanel_5Layout = new javax.swing.GroupLayout(subPanel_5);
        subPanel_5.setLayout(subPanel_5Layout);
        subPanel_5Layout.setHorizontalGroup(
            subPanel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masuk_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(keluar_5, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        subPanel_5Layout.setVerticalGroup(
            subPanel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel_5Layout.createSequentialGroup()
                .addComponent(masuk_5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(keluar_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        subPanel_6.setPreferredSize(new java.awt.Dimension(125, 120));

        keluar_6.setBackground(java.awt.Color.red);
        keluar_6.setText("KELUAR");
        keluar_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar_6ActionPerformed(evt);
            }
        });

        masuk_6.setBackground(java.awt.Color.green);
        masuk_6.setText("MASUK");
        masuk_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masuk_6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanel_6Layout = new javax.swing.GroupLayout(subPanel_6);
        subPanel_6.setLayout(subPanel_6Layout);
        subPanel_6Layout.setHorizontalGroup(
            subPanel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masuk_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(keluar_6, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        subPanel_6Layout.setVerticalGroup(
            subPanel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel_6Layout.createSequentialGroup()
                .addComponent(masuk_6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(keluar_6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        subPanel_7.setPreferredSize(new java.awt.Dimension(125, 120));

        keluar_7.setBackground(java.awt.Color.red);
        keluar_7.setText("KELUAR");
        keluar_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar_7ActionPerformed(evt);
            }
        });

        masuk_7.setBackground(java.awt.Color.green);
        masuk_7.setText("MASUK");
        masuk_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masuk_7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanel_7Layout = new javax.swing.GroupLayout(subPanel_7);
        subPanel_7.setLayout(subPanel_7Layout);
        subPanel_7Layout.setHorizontalGroup(
            subPanel_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masuk_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(keluar_7, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        subPanel_7Layout.setVerticalGroup(
            subPanel_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel_7Layout.createSequentialGroup()
                .addComponent(masuk_7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(keluar_7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        subPanel_8.setPreferredSize(new java.awt.Dimension(125, 120));

        keluar_8.setBackground(java.awt.Color.red);
        keluar_8.setText("KELUAR");
        keluar_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar_8ActionPerformed(evt);
            }
        });

        masuk_8.setBackground(java.awt.Color.green);
        masuk_8.setText("MASUK");
        masuk_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masuk_8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanel_8Layout = new javax.swing.GroupLayout(subPanel_8);
        subPanel_8.setLayout(subPanel_8Layout);
        subPanel_8Layout.setHorizontalGroup(
            subPanel_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masuk_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(keluar_8, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        subPanel_8Layout.setVerticalGroup(
            subPanel_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel_8Layout.createSequentialGroup()
                .addComponent(masuk_8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(keluar_8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setText("SLOT 1");

        jLabel4.setText("SLOT 2");

        jLabel5.setText("SLOT 3");

        jLabel6.setText("SLOT 4");

        jLabel7.setText("SLOT 5");

        jLabel8.setText("SLOT 6");

        jLabel9.setText("SLOT 7");

        jLabel10.setText("SLOT 8");

        javax.swing.GroupLayout panelUtamaLayout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(panelUtamaLayout);
        panelUtamaLayout.setHorizontalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUtamaLayout.createSequentialGroup()
                                .addComponent(subPanel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(subPanel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(panelUtamaLayout.createSequentialGroup()
                                .addComponent(subPanel_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(subPanel_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelUtamaLayout.createSequentialGroup()
                                .addComponent(subPanel_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(subPanel_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelUtamaLayout.createSequentialGroup()
                                .addComponent(subPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(subPanel_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelUtamaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(platField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tampilData, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelUtamaLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel4)
                                .addGap(101, 101, 101)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(40, 40, 40)))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel7)
                .addGap(104, 104, 104)
                .addComponent(jLabel8)
                .addGap(100, 100, 100)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(63, 63, 63))
        );
        panelUtamaLayout.setVerticalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(platField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tampilData))
                .addGap(18, 18, 18)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUtamaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(subPanel_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(subPanel_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subPanel_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(subPanel_4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUtamaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(subPanel_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subPanel_7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subPanel_8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(subPanel_6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void masuk_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masuk_1ActionPerformed
        if(platField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(rootPane,"Nomor Plat Harus Diisi");
        }
        else{
            Date tanggal = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd '   ' hh:mm:ss");
            String date = String.valueOf(sdf.format(tanggal));
       
            teks = teks + "SLOT 1\t" +platField.getText()+"\t"+date+"\tMasuk"+"\n";
            masuk_1.setVisible(false);
            keluar_1.setVisible(true);
            platParkir1 = platField.getText();
            try {
            
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(teks);
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println("Error writing to file '"+ fileName + "'");
            }
            platField.setText("");   
        }
    }//GEN-LAST:event_masuk_1ActionPerformed

    private void keluar_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar_1ActionPerformed
        // TODO add your handling code here:
        Date tanggal = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd '   ' hh:mm:ss");
            String date = String.valueOf(sdf.format(tanggal));
       
            teks = teks + "SLOT 1\t" +platParkir1+"\t"+date+"\tKeluar"+"\n";
            masuk_1.setVisible(true);
            keluar_1.setVisible(false);

            try {
            
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(teks);
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println("Error writing to file '"+ fileName + "'");
            }
            platField.setText("");
        
    }//GEN-LAST:event_keluar_1ActionPerformed

    private void keluar_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar_2ActionPerformed
        // TODO add your handling code here:
        Date tanggal = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd '   ' hh:mm:ss");
            String date = String.valueOf(sdf.format(tanggal));
       
            teks = teks + "SLOT 2\t" +platParkir2+"\t"+date+"\tKeluar"+"\n";
            masuk_2.setVisible(true);
            keluar_2.setVisible(false);

            try {
            
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(teks);
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println("Error writing to file '"+ fileName + "'");
            }
            platField.setText("");
    }//GEN-LAST:event_keluar_2ActionPerformed

    private void masuk_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masuk_2ActionPerformed
        // TODO add your handling code here:
        if(platField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(rootPane,"Nomor Plat Harus Diisi");
        }
        else{
            Date tanggal = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd '   ' hh:mm:ss");
            String date = String.valueOf(sdf.format(tanggal));
       
            teks = teks + "SLOT 2\t" +platField.getText()+"\t"+date+"\tMasuk"+"\n";
            masuk_2.setVisible(false);
            keluar_2.setVisible(true);
            platParkir2 = platField.getText();
            try {
            
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(teks);
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println("Error writing to file '"+ fileName + "'");
            }
            platField.setText("");   
        }
        
    }//GEN-LAST:event_masuk_2ActionPerformed

    private void keluar_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar_3ActionPerformed
        // TODO add your handling code here:
        Date tanggal = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd '   ' hh:mm:ss");
            String date = String.valueOf(sdf.format(tanggal));
       
            teks = teks + "SLOT 3\t" +platParkir3+"\t"+date+"\tKeluar"+"\n";
            masuk_3.setVisible(true);
            keluar_3.setVisible(false);

            try {
            
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(teks);
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println("Error writing to file '"+ fileName + "'");
            }
            platField.setText("");
    }//GEN-LAST:event_keluar_3ActionPerformed

    private void masuk_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masuk_3ActionPerformed
        // TODO add your handling code here:
        if(platField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(rootPane,"Nomor Plat Harus Diisi");
        }
        else{
            Date tanggal = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd '   ' hh:mm:ss");
            String date = String.valueOf(sdf.format(tanggal));
       
            teks = teks + "SLOT 3\t" +platField.getText()+"\t"+date+"\tMasuk"+"\n";
            masuk_3.setVisible(false);
            keluar_3.setVisible(true);
            platParkir3 = platField.getText();
            try {
            
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(teks);
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println("Error writing to file '"+ fileName + "'");
            }
            platField.setText("");   
        }
    }//GEN-LAST:event_masuk_3ActionPerformed

    private void keluar_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar_4ActionPerformed
        // TODO add your handling code here:
        Date tanggal = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd '   ' hh:mm:ss");
            String date = String.valueOf(sdf.format(tanggal));
       
            
            teks = teks + "SLOT 4\t" +platParkir4+"\t"+date+"\tKeluar"+"\n";
            masuk_4.setVisible(true);
            keluar_4.setVisible(false);

            try {
            
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(teks);
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println("Error writing to file '"+ fileName + "'");
            }
            platField.setText("");
    }//GEN-LAST:event_keluar_4ActionPerformed

    private void masuk_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masuk_4ActionPerformed
        // TODO add your handling code here:
        if(platField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(rootPane,"Nomor Plat Harus Diisi");
        }
        else{
            Date tanggal = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd '   ' hh:mm:ss");
            String date = String.valueOf(sdf.format(tanggal));
       
            teks = teks + "SLOT 4\t" +platField.getText()+"\t"+date+"\tMasuk"+"\n";
            masuk_4.setVisible(false);
            keluar_4.setVisible(true);
            platParkir4 = platField.getText();
            try {
            
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(teks);
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println("Error writing to file '"+ fileName + "'");
            }
            platField.setText("");   
        }
    }//GEN-LAST:event_masuk_4ActionPerformed

    private void keluar_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar_5ActionPerformed
        // TODO add your handling code here:
        Date tanggal = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd '   ' hh:mm:ss");
            String date = String.valueOf(sdf.format(tanggal));
       
             teks = teks + "SLOT 5\t" +platParkir5+"\t"+date+"\tKeluar"+"\n";
            masuk_5.setVisible(true);
            keluar_5.setVisible(false);

            try {
            
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(teks);
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println("Error writing to file '"+ fileName + "'");
            }
            platField.setText("");
    }//GEN-LAST:event_keluar_5ActionPerformed

    private void masuk_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masuk_5ActionPerformed
        // TODO add your handling code here:
        if(platField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(rootPane,"Nomor Plat Harus Diisi");
        }
        else{
            Date tanggal = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd '   ' hh:mm:ss");
            String date = String.valueOf(sdf.format(tanggal));
       
            teks = teks + "SLOT 5\t" +platField.getText()+"\t"+date+"\tMasuk"+"\n";
            masuk_5.setVisible(false);
            keluar_5.setVisible(true);
            platParkir5 = platField.getText();
            try {
            
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(teks);
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println("Error writing to file '"+ fileName + "'");
            }
            platField.setText("");   
        }
    }//GEN-LAST:event_masuk_5ActionPerformed

    private void keluar_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar_6ActionPerformed
        // TODO add your handling code here:
        Date tanggal = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd '   ' hh:mm:ss");
            String date = String.valueOf(sdf.format(tanggal));
       
            teks = teks + "SLOT 6\t" +platParkir6+"\t"+date+"\tKeluar"+"\n";
            masuk_6.setVisible(true);
            keluar_6.setVisible(false);

            try {
            
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(teks);
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println("Error writing to file '"+ fileName + "'");
            }
            platField.setText("");
    }//GEN-LAST:event_keluar_6ActionPerformed

    private void masuk_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masuk_6ActionPerformed
        // TODO add your handling code here:
        if(platField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(rootPane,"Nomor Plat Harus Diisi");
        }
        else{
            Date tanggal = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd '   ' hh:mm:ss");
            String date = String.valueOf(sdf.format(tanggal));
       
            teks = teks + "SLOT 6\t" +platField.getText()+"\t"+date+"\tMasuk"+"\n";
            masuk_6.setVisible(false);
            keluar_6.setVisible(true);
            platParkir6 = platField.getText();
            try {
            
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(teks);
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println("Error writing to file '"+ fileName + "'");
            }
            platField.setText("");   
        }
    }//GEN-LAST:event_masuk_6ActionPerformed

    private void keluar_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar_7ActionPerformed
        // TODO add your handling code here:
            Date tanggal = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd '   ' hh:mm:ss");
            String date = String.valueOf(sdf.format(tanggal));
       
            teks = teks + "SLOT 7\t" +platParkir7+"\t"+date+"\tKeluar"+"\n";
            masuk_7.setVisible(true);
            keluar_7.setVisible(false);
            
            try {
            
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(teks);
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println("Error writing to file '"+ fileName + "'");
            }
            platField.setText("");
    }//GEN-LAST:event_keluar_7ActionPerformed

    private void masuk_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masuk_7ActionPerformed
        // TODO add your handling code here:
        if(platField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(rootPane,"Nomor Plat Harus Diisi");
        }
        else{
            Date tanggal = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd '   ' hh:mm:ss");
            String date = String.valueOf(sdf.format(tanggal));
       
            teks = teks + "SLOT 7\t" +platField.getText()+"\t"+date+"\tMasuk"+"\n";
            masuk_7.setVisible(false);
            keluar_7.setVisible(true);
            platParkir7 = platField.getText();
            try {
            
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(teks);
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println("Error writing to file '"+ fileName + "'");
            }
            platField.setText("");   
        }
    }//GEN-LAST:event_masuk_7ActionPerformed

    private void keluar_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar_8ActionPerformed
        // TODO add your handling code here:
       
            Date tanggal = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd '   ' hh:mm:ss");
            String date = String.valueOf(sdf.format(tanggal));
       
            teks = teks + "SLOT 8\t" +platParkir8+"\t"+date+"\tKeluar"+"\n";
            masuk_8.setVisible(true);
            keluar_8.setVisible(false);

            try {
            
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(teks);
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println("Error writing to file '"+ fileName + "'");
            }
            platField.setText("");   
    }//GEN-LAST:event_keluar_8ActionPerformed

    private void masuk_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masuk_8ActionPerformed
        // TODO add your handling code here:
        if(platField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(rootPane,"Nomor Plat Harus Diisi");
        }
        else{
            Date tanggal = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd '   ' hh:mm:ss");
            String date = String.valueOf(sdf.format(tanggal));
       
            teks = teks + "SLOT 8\t" +platField.getText()+"\t"+date+"\tMasuk"+"\n";
            masuk_8.setVisible(false);
            keluar_8.setVisible(true);
            platParkir8 = platField.getText();
            try {
            
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(teks);
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println("Error writing to file '"+ fileName + "'");
            }
            platField.setText("");   
        }
    }//GEN-LAST:event_masuk_8ActionPerformed

    private void tampilDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilDataActionPerformed
        // TODO add your handling code here:
        
        
        String line = null;
        String datas = "";
        
        GUIData data = new GUIData(line);
       
        try {
           
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                datas = datas+line+"\n";
                System.out.println(line);
            }   
            data = new GUIData(datas);
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" + fileName + "'");                  
        }
        data.setVisible(true);
        GUI gui = new GUI();
        gui.setEnabled(false);
        
    }//GEN-LAST:event_tampilDataActionPerformed

    private void platFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_platFieldActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton keluar_1;
    private javax.swing.JButton keluar_2;
    private javax.swing.JButton keluar_3;
    private javax.swing.JButton keluar_4;
    private javax.swing.JButton keluar_5;
    private javax.swing.JButton keluar_6;
    private javax.swing.JButton keluar_7;
    private javax.swing.JButton keluar_8;
    private javax.swing.JButton masuk_1;
    private javax.swing.JButton masuk_2;
    private javax.swing.JButton masuk_3;
    private javax.swing.JButton masuk_4;
    private javax.swing.JButton masuk_5;
    private javax.swing.JButton masuk_6;
    private javax.swing.JButton masuk_7;
    private javax.swing.JButton masuk_8;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JTextField platField;
    private javax.swing.JPanel subPanel_1;
    private javax.swing.JPanel subPanel_2;
    private javax.swing.JPanel subPanel_3;
    private javax.swing.JPanel subPanel_4;
    private javax.swing.JPanel subPanel_5;
    private javax.swing.JPanel subPanel_6;
    private javax.swing.JPanel subPanel_7;
    private javax.swing.JPanel subPanel_8;
    private javax.swing.JButton tampilData;
    // End of variables declaration//GEN-END:variables
}