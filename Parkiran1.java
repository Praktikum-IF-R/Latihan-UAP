/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuap;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;

public class Parkiran1 extends Frame {

    JLabel judul, plat;
    JTextField noplat;
    JButton data, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16;
    String noplat1[] = new String[8];
    String jam1[] = new String[16];
    String tanggal1[] = new String[16];

    public Parkiran1() {
        setLayout(null);
        judul = new JLabel("Sistem Parkir");
        plat = new JLabel("Nomor Plat : ");
        noplat = new JTextField("Plat Nomor ...");
        data = new JButton("Tampilkan Data");
        bt1 = new JButton("Masuk");
        bt2 = new JButton("Keluar");
        bt3 = new JButton("Masuk");
        bt4 = new JButton("Keluar");
        bt5 = new JButton("Masuk");
        bt6 = new JButton("Keluar");
        bt7 = new JButton("Masuk");
        bt8 = new JButton("Keluar");
        bt9 = new JButton("Masuk");
        bt10 = new JButton("Keluar");
        bt11 = new JButton("Masuk");
        bt12 = new JButton("Keluar");
        bt13 = new JButton("Masuk");
        bt14 = new JButton("Keluar");
        bt15 = new JButton("Masuk");
        bt16 = new JButton("Keluar");
        add(judul).setBounds(286, 40, 80, 20);
        add(plat).setBounds(50, 80, 80, 20);
        add(noplat).setBounds(130, 80, 190, 20);
        add(data).setBounds(460, 80, 140, 20);
        add(bt1).setBounds(40, 160, 120, 60);
        add(bt3).setBounds(180, 160, 120, 60);
        add(bt5).setBounds(40, 260, 120, 60);
        add(bt7).setBounds(180, 260, 120, 60);
        add(bt2).setBounds(40, 160, 120, 60);
        bt2.setVisible(false);
        add(bt4).setBounds(180, 160, 120, 60);
        bt4.setVisible(false);
        add(bt6).setBounds(40, 260, 120, 60);
        bt6.setVisible(false);
        add(bt8).setBounds(180, 260, 120, 60);
        bt8.setVisible(false);
        add(bt9).setBounds(350, 160, 120, 60);
        add(bt11).setBounds(490, 160, 120, 60);
        add(bt13).setBounds(350, 260, 120, 60);
        add(bt15).setBounds(490, 260, 120, 60);
        add(bt10).setBounds(350, 160, 120, 60);
        bt10.setVisible(false);
        add(bt12).setBounds(490, 160, 120, 60);
        bt12.setVisible(false);
        add(bt14).setBounds(350, 260, 120, 60);
        bt14.setVisible(false);
        add(bt16).setBounds(490, 260, 120, 60);
        bt16.setVisible(false);
        bt1.addActionListener(new bt1());
        bt2.addActionListener(new bt2());
        bt3.addActionListener(new bt3());
        bt4.addActionListener(new bt4());
        bt5.addActionListener(new bt5());
        bt6.addActionListener(new bt6());
        bt7.addActionListener(new bt7());
        bt8.addActionListener(new bt8());
        bt9.addActionListener(new bt9());
        bt10.addActionListener(new bt10());
        bt11.addActionListener(new bt11());
        bt12.addActionListener(new bt12());
        bt13.addActionListener(new bt13());
        bt14.addActionListener(new bt14());
        bt15.addActionListener(new bt15());
        bt16.addActionListener(new bt16());
        data.addActionListener(new data());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    class bt1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date d1 = new Date();
            jam1[0] = ("" + String.format("%1$tH:%1$tM", d1));
            tanggal1[0] = ("" + String.format("%1$td %1$tb %1$tY", d1));
            tanggal1[1] = ("-");
            jam1[1] = ("-");
            noplat1[0] = noplat.getText();
            bt1.setVisible(false);
            bt2.setVisible(true);
            noplat.setText("Plat Nomor ...");
        }
    }

    class bt2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date d1 = new Date();
            jam1[1] = ("" + String.format("%1$tH:%1$tM", d1));
            tanggal1[1] = ("" + String.format("%1$td %1$tb %1$tY", d1));
            bt2.setVisible(false);
            bt1.setVisible(true);
        }
    }

    class bt3 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date d1 = new Date();
            jam1[2] = ("" + String.format("%1$tH:%1$tM", d1));
            tanggal1[2] = ("" + String.format("%1$td %1$tb %1$tY", d1));
            tanggal1[3] = ("-");
            jam1[3] = ("-");
            noplat1[1] = noplat.getText();
            bt3.setVisible(false);
            bt4.setVisible(true);
            noplat.setText("Plat Nomor ...");
        }
    }

    class bt4 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date d1 = new Date();
            jam1[3] = ("" + String.format("%1$tH:%1$tM", d1));
            tanggal1[3] = ("" + String.format("%1$td %1$tb %1$tY", d1));
            bt4.setVisible(false);
            bt3.setVisible(true);
        }
    }

    class bt5 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date d1 = new Date();
            jam1[4] = ("" + String.format("%1$tH:%1$tM", d1));
            tanggal1[4] = ("" + String.format("%1$td %1$tb %1$tY", d1));
            tanggal1[5] = ("-");
            jam1[5] = ("-");
            noplat1[2] = noplat.getText();
            bt5.setVisible(false);
            bt6.setVisible(true);
            noplat.setText("Plat Nomor ...");
        }
    }

    class bt6 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date d1 = new Date();
            jam1[5] = ("" + String.format("%1$tH:%1$tM", d1));
            tanggal1[5] = ("" + String.format("%1$td %1$tb %1$tY", d1));
            bt6.setVisible(false);
            bt5.setVisible(true);
        }
    }

    class bt7 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date d1 = new Date();
            jam1[6] = ("" + String.format("%1$tH:%1$tM", d1));
            tanggal1[6] = ("" + String.format("%1$td %1$tb %1$tY", d1));
            tanggal1[7] = ("-");
            jam1[7] = ("-");
            noplat1[3] = noplat.getText();
            bt7.setVisible(false);
            bt8.setVisible(true);
            noplat.setText("Plat Nomor ...");
        }
    }

    class bt8 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date d1 = new Date();
            jam1[7] = ("" + String.format("%1$tH:%1$tM", d1));
            tanggal1[7] = ("" + String.format("%1$td %1$tb %1$tY", d1));
            bt8.setVisible(false);
            bt7.setVisible(true);
        }
    }

    class bt9 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date d1 = new Date();
            jam1[8] = ("" + String.format("%1$tH:%1$tM", d1));
            tanggal1[8] = ("" + String.format("%1$td %1$tb %1$tY", d1));
            tanggal1[9] = ("-");
            jam1[9] = ("-");
            noplat1[4] = noplat.getText();
            bt9.setVisible(false);
            bt10.setVisible(true);
            noplat.setText("Plat Nomor ...");
        }
    }

    class bt10 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date d1 = new Date();
            jam1[9] = ("" + String.format("%1$tH:%1$tM", d1));
            tanggal1[9] = ("" + String.format("%1$td %1$tb %1$tY", d1));
            bt10.setVisible(false);
            bt9.setVisible(true);
        }
    }

    class bt11 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date d1 = new Date();
            jam1[10] = ("" + String.format("%1$tH:%1$tM", d1));
            tanggal1[10] = ("" + String.format("%1$td %1$tb %1$tY", d1));
            tanggal1[11] = ("-");
            jam1[11] = ("-");
            noplat1[5] = noplat.getText();
            bt11.setVisible(false);
            bt12.setVisible(true);
            noplat.setText("Plat Nomor ...");
        }
    }

    class bt12 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date d1 = new Date();
            jam1[11] = ("" + String.format("%1$tH:%1$tM", d1));
            tanggal1[11] = ("" + String.format("%1$td %1$tb %1$tY", d1));
            bt12.setVisible(false);
            bt11.setVisible(true);
        }
    }

    class bt13 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date d1 = new Date();
            jam1[12] = ("" + String.format("%1$tH:%1$tM", d1));
            tanggal1[12] = ("" + String.format("%1$td %1$tb %1$tY", d1));
            tanggal1[13] = ("-");
            jam1[13] = ("-");
            noplat1[6] = noplat.getText();
            bt13.setVisible(false);
            bt14.setVisible(true);
            noplat.setText("Plat Nomor ...");
        }
    }

    class bt14 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date d1 = new Date();
            jam1[13] = ("" + String.format("%1$tH:%1$tM", d1));
            tanggal1[13] = ("" + String.format("%1$td %1$tb %1$tY", d1));
            bt14.setVisible(false);
            bt13.setVisible(true);
        }
    }

    class bt15 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date d1 = new Date();
            jam1[14] = ("" + String.format("%1$tH:%1$tM", d1));
            tanggal1[14] = ("" + String.format("%1$td %1$tb %1$tY", d1));
            tanggal1[15] = ("-");
            jam1[15] = ("-");
            noplat1[7] = noplat.getText();
            bt15.setVisible(false);
            bt16.setVisible(true);
            noplat.setText("Plat Nomor ...");
        }
    }

    class bt16 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date d1 = new Date();
            jam1[15] = ("" + String.format("%1$tH:%1$tM", d1));
            tanggal1[15] = ("" + String.format("%1$td %1$tb %1$tY", d1));
            bt1.setVisible(false);
            bt2.setVisible(true);
        }
    }

    class data implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date d1 = new Date();
            JOptionPane.showMessageDialog(null, "Data Parkir\n1. " + noplat1[0] + " " + tanggal1[0] + " jam " + jam1[0] + " sampai " + tanggal1[1] + " jam " + jam1[1]
                    + "\n2. " + noplat1[1] + " " + tanggal1[2] + " jam " + jam1[2] + " sampai " + tanggal1[3] + " jam " + jam1[3]
                    + "\n3. " + noplat1[2] + " " + tanggal1[4] + " jam " + jam1[4] + " sampai " + tanggal1[5] + " jam " + jam1[5]
                    + "\n4. " + noplat1[3] + " " + tanggal1[6] + " jam " + jam1[6] + " sampai " + tanggal1[7] + " jam " + jam1[7]
                    + "\n5. " + noplat1[4] + " " + tanggal1[8] + " jam " + jam1[8] + " sampai " + tanggal1[9] + " jam " + jam1[9]
                    + "\n6. " + noplat1[5] + " " + tanggal1[10] + " jam " + jam1[10] + " sampai " + tanggal1[11] + " jam " + jam1[11]
                    + "\n7. " + noplat1[6] + " " + tanggal1[12] + " jam " + jam1[12] + " sampai " + tanggal1[13] + " jam " + jam1[13]
                    + "\n8. " + noplat1[7] + " " + tanggal1[14] + " jam " + jam1[14] + " sampai " + tanggal1[15] + " jam " + jam1[15]);
        }
    }
}
