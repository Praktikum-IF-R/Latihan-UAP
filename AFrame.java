package parkir;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class AFrame extends JFrame {

    private JButton in1, in2, in3, in4, in5, in6, in7, in8, out1, out2, out3, out4, out5, out6, out7, out8, showdata;
    private JLabel lnomor, lTitle;
    private JTextField txtnomor ;
    private JTextArea txtdata1,txtdata2,txtdata3,txtdata4,txtdata5,txtdata6,txtdata7,txtdata8;
    private List<Parkir> parkir;
    private int c;

    AFrame() {
        parkir = new ArrayList();
        parkir.add(new Parkir("P1"));
        parkir.add(new Parkir("P2"));
        parkir.add(new Parkir("P3"));
        parkir.add(new Parkir("P4"));
        parkir.add(new Parkir("P5"));
        parkir.add(new Parkir("P6"));
        parkir.add(new Parkir("P7"));
        parkir.add(new Parkir("P8"));
        c = 0;
        initComponents();
    }

    private void initComponents() {
        setLayout(null);
        lTitle = new JLabel("funny Parking System");
        txtnomor = new JTextField();
        lnomor = new JLabel("plat nomor");
        in1 = new JButton("masuk P1");
        in2 = new JButton("masuk P2");
        in3 = new JButton("masuk P3");
        in4 = new JButton("masuk P4");
        in5 = new JButton("masuk P5");
        in6 = new JButton("masuk P6");
        in7 = new JButton("masuk P7");
        in8 = new JButton("masuk P8");
        out1 = new JButton("keluar");
        out2 = new JButton("keluar");
        out3 = new JButton("keluar");
        out4 = new JButton("keluar");
        out5 = new JButton("keluar");
        out6 = new JButton("keluar");
        out7 = new JButton("keluar");
        out8 = new JButton("keluar");
        showdata = new JButton("Tampilkan data");
        txtdata1 = new JTextArea();
        txtdata2 = new JTextArea();
        txtdata3 = new JTextArea();
        txtdata4 = new JTextArea();
        txtdata5 = new JTextArea();
        txtdata6 = new JTextArea();
        txtdata7 = new JTextArea();
        txtdata8 = new JTextArea();
        //
        lTitle.setFont(new java.awt.Font("Arial", 1, 24));
        lnomor.setFont(new java.awt.Font("Times New Roman", 1, 14));
        setTextField();
        //
        add(lTitle).setBounds(200, 20, 500, 75);
        add(lnomor).setBounds(100, 100, 100, 20);
        add(txtnomor).setBounds(175, 100, 200, 20);
        add(showdata).setBounds(440, 100, 100, 20);
        add(in1).setBounds(100, 150, 100, 50);
        add(in2).setBounds(210, 150, 100, 50);
        add(in3).setBounds(330, 150, 100, 50);
        add(in4).setBounds(440, 150, 100, 50);
        add(out1).setBounds(100, 210, 100, 50);out1.setVisible(false);
        add(out2).setBounds(210, 210, 100, 50);out2.setVisible(false);
        add(out3).setBounds(330, 210, 100, 50);out3.setVisible(false);
        add(out4).setBounds(440, 210, 100, 50);out4.setVisible(false);
        add(in5).setBounds(100, 300, 100, 50);
        add(in6).setBounds(210, 300, 100, 50);
        add(in7).setBounds(330, 300, 100, 50);
        add(in8).setBounds(440, 300, 100, 50);
        add(out5).setBounds(100, 360, 100, 50);out5.setVisible(false);
        add(out6).setBounds(210, 360, 100, 50);out6.setVisible(false);
        add(out7).setBounds(330, 360, 100, 50);out7.setVisible(false);
        add(out8).setBounds(440, 360, 100, 50);out8.setVisible(false);
        add(txtdata1).setBounds(100,440 ,150 ,150 );
        add(txtdata2).setBounds(210,440 ,150 ,150 );
        add(txtdata3).setBounds(330,440 ,150 ,150 );
        add(txtdata4).setBounds(440,440 ,150 ,150 );
        add(txtdata5).setBounds(100,510 ,150 ,150 );
        add(txtdata6).setBounds(210,510 ,150 ,150 );
        add(txtdata7).setBounds(330,510 ,150 ,150 );
        add(txtdata8).setBounds(440,510 ,150 ,150 );
        in1.addActionListener(new mainAction());
        in2.addActionListener(new mainAction());
        in3.addActionListener(new mainAction());
        in4.addActionListener(new mainAction());
        in5.addActionListener(new mainAction());
        in6.addActionListener(new mainAction());
        in7.addActionListener(new mainAction());
        in8.addActionListener(new mainAction());
        out1.addActionListener(new mainAction());
        out2.addActionListener(new mainAction());
        out3.addActionListener(new mainAction());
        out4.addActionListener(new mainAction());
        out5.addActionListener(new mainAction());
        out6.addActionListener(new mainAction());
        out7.addActionListener(new mainAction());
        out8.addActionListener(new mainAction());
        
        showdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                showdataMouseClicked(evt);
            }
        });
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    private void setTextField() {
        txtnomor.setText(parkir.get(c).getPlat());
    }
    private void showdataMouseClicked(java.awt.event.MouseEvent evt) {
        parkir.get(c).setPlat(txtnomor.getText());
        setTextField();
        txtdata1.setText(String.format("Plat nomor: %s\nWaktu     : \n%s\nSlot      : %s\n",parkir.get(1).getPlat(),parkir.get(1).getTanggal(),parkir.get(1).getslot()));
        txtdata2.setText(String.format("Plat nomor: %s\nWaktu     : \n%s\nSlot      : %s\n",parkir.get(2).getPlat(),parkir.get(2).getTanggal(),parkir.get(2).getslot()));
        txtdata3.setText(String.format("Plat nomor: %s\nWaktu     : \n%s\nSlot      : %s\n",parkir.get(3).getPlat(),parkir.get(3).getTanggal(),parkir.get(3).getslot()));
        txtdata4.setText(String.format("Plat nomor: %s\nWaktu     : \n%s\nSlot      : %s\n",parkir.get(4).getPlat(),parkir.get(4).getTanggal(),parkir.get(4).getslot()));
        txtdata5.setText(String.format("Plat nomor: %s\nWaktu     : \n%s\nSlot      : %s\n",parkir.get(7).getPlat(),parkir.get(6).getTanggal(),parkir.get(5).getslot()));
        txtdata6.setText(String.format("Plat nomor: %s\nWaktu     : \n%s\nSlot      : %s\n",parkir.get(6).getPlat(),parkir.get(6).getTanggal(),parkir.get(6).getslot()));
        txtdata7.setText(String.format("Plat nomor: %s\nWaktu     : \n%s\nSlot      : %s\n",parkir.get(7).getPlat(),parkir.get(7).getTanggal(),parkir.get(7).getslot()));
        txtdata8.setText(String.format("Plat nomor: %s\nWaktu     : \n%s\nSlot      : %s\n",parkir.get(8).getPlat(),parkir.get(8).getTanggal(),parkir.get(8).getslot()));
    }
    
    class mainAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()== in1) {
                c = 0;out1.setVisible(true);in1.setVisible(false);
            parkir.get(c).setPlat(txtnomor.getText());
            } else if (e.getSource() == in2) {
                c = 1;out2.setVisible(true);in2.setVisible(false);
                parkir.get(c).setPlat(txtnomor.getText());
            } else if (e.getSource() == in3) {
                c = 2;out3.setVisible(true);in3.setVisible(false);
                parkir.get(c).setPlat(txtnomor.getText());
            } else if (e.getSource() == in4) {
                c = 3;out4.setVisible(true);in4.setVisible(false);
                parkir.get(c).setPlat(txtnomor.getText());
            } else if (e.getSource() == in5) {
                c = 4;out5.setVisible(true);in5.setVisible(false);
                parkir.get(c).setPlat(txtnomor.getText());
            } else if (e.getSource() == in6) {
                c = 5;out6.setVisible(true);in6.setVisible(false);
                parkir.get(c).setPlat(txtnomor.getText());
            } else if (e.getSource() == in7) {
                c = 6;out7.setVisible(true);in7.setVisible(false);
                parkir.get(c).setPlat(txtnomor.getText());
            } else if (e.getSource() == in8) {
                c = 7;out8.setVisible(true);in8.setVisible(false);
                parkir.get(c).setPlat(txtnomor.getText());
            } else if (e.getSource() == out1) {
                c = 0;out1.setVisible(false);in1.setVisible(true);
                parkir.get(c).setPlat("kosong");
            } else if (e.getSource() == out2) {
                c = 1;out2.setVisible(false);in2.setVisible(true);
                parkir.get(c).setPlat("kosong");
            } else if (e.getSource() == out3) {
                c = 2;out3.setVisible(false);in3.setVisible(true);
                parkir.get(c).setPlat("kosong");
            } else if (e.getSource() == out4) {
                c = 3;out4.setVisible(false);in4.setVisible(true);
                parkir.get(c).setPlat("kosong");
            } else if (e.getSource() == out5) {
                c = 4;out5.setVisible(false);in5.setVisible(true);
                parkir.get(c).setPlat("kosong");
            } else if (e.getSource() == out6) {
                c = 5;out6.setVisible(false);in6.setVisible(true);
                parkir.get(c).setPlat("kosong");
            } else if (e.getSource() == out7) {
                c = 6;out7.setVisible(false);in7.setVisible(true);
                parkir.get(c).setPlat("kosong");
            } else if (e.getSource() == out8) {
                c = 7;out8.setVisible(false);in8.setVisible(true);
                parkir.get(c).setPlat("kosong");
            }
        }
    }
}