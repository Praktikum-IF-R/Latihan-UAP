package prauap;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
public class ParkingSystem extends Frame {
    JLabel label, noplat;
    JTextField nomorplat;
    JButton showData, choose1, choose2, choose3, choose4, choose5, choose6, choose7, choose8, choose9, choose10, choose11, choose12, choose13, choose14, choose15, choose16;
    public String nomorplat2[] = new String[8];
    public int tanggal[] = new int[16];
    public int bulan []= new int[16];
    public int tahun[]= new int[16];
    public int jam[]= new int[16];
    public String tanggal2[] = new String [16];
    public String jam2[]= new String [16];
    public int menit [] = new int[16];
    int count = 0;
    public ParkingSystem() {
        setLayout(null);
        label = new JLabel("Sistem Parkir");
        add(label).setBounds(300, 20, 150, 50);
        label.setFont(new Font("Times New Roman", 1, 18));
        noplat = new JLabel("Nomor Plat: ");
        add(noplat).setBounds(50, 90, 150, 30);
        showData = new JButton("Tampilkan Data");
        add(showData).setBounds(450, 93, 130, 20);
        showData.addActionListener(new ShowMetheData());
        nomorplat = new JTextField("Plat Nomor...");
        add(nomorplat).setBounds(150, 95, 150, 20);
        choose1 = new JButton("Masuk");
        add(choose1).setBounds(50, 150, 138, 57);
        choose1.addActionListener(new Choose1());
        choose2 = new JButton("Masuk");
        add(choose2).setBounds(200, 150, 138, 57);
        choose2.addActionListener(new Choose2());
        choose3 = new JButton("Masuk");
        add(choose3).setBounds(350, 150, 138, 57);
        choose3.addActionListener(new Choose3());
        choose4 = new JButton("Masuk");
        add(choose4).setBounds(500, 150, 138, 57);
        choose4.addActionListener(new Choose4());
        choose5 = new JButton("Keluar");
        add(choose5).setBounds(50, 250, 138, 57);
        choose5.addActionListener(new Choose5());
        choose5.setVisible(false);
        choose6 = new JButton("Keluar");
        add(choose6).setBounds(200, 250, 138, 57);
        choose6.addActionListener(new Choose6());
        choose6.setVisible(false);
        choose7 = new JButton("Keluar");
        add(choose7).setBounds(350, 250, 138, 57);
        choose7.addActionListener(new Choose7());
        choose7.setVisible(false);
        choose8 = new JButton("Keluar");
        add(choose8).setBounds(500, 250, 138, 57);
        choose8.addActionListener(new Choose8());
        choose8.setVisible(false);
        choose9 = new JButton("Masuk");
        add(choose9).setBounds(50, 350, 138, 57);
        choose9.addActionListener(new Choose9());
        choose10 = new JButton("Masuk");
        add(choose10).setBounds(200, 350, 138, 57);
        choose10.addActionListener(new Choose10());
        choose11 = new JButton("Masuk");
        add(choose11).setBounds(350, 350, 138, 57);
        choose11.addActionListener(new Choose11());
        choose12 = new JButton("Masuk");
        add(choose12).setBounds(500, 350, 138, 57);
        choose12.addActionListener(new Choose12());
        choose13 = new JButton("Keluar");
        add(choose13).setBounds(50, 450, 138, 57);
        choose13.addActionListener(new Choose13());
        choose13.setVisible(false);
        choose14 = new JButton("Keluar");
        add(choose14).setBounds(200, 450, 138, 57);
        choose14.addActionListener(new Choose14());
        choose14.setVisible(false);
        choose15 = new JButton("Keluar");
        add(choose15).setBounds(350, 450, 138, 57);
        choose15.addActionListener(new Choose15());
        choose15.setVisible(false);
        choose16 = new JButton("Keluar");
        add(choose16).setBounds(500, 450, 138, 57);
        choose16.addActionListener(new Choose16());
        choose16.setVisible(false);
        addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    });
    }
    class Choose1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Date date = new Date();
            jam2[0]= (""+String.format("%1$tH:%1$tM", date));
            tanggal2[0]= (""+String.format("%1$td %1$tb %1$tY", date));
            jam2[4]= ("-");
            tanggal2[4]= ("-");
                nomorplat2[0] = nomorplat.getText();
                choose1.setVisible(false);
                choose5.setVisible(true);
                nomorplat.setText("Plat Nomor...");
                
            }
        }
    class Choose2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Date date = new Date();
            jam2[1]= (""+String.format("%1$tH:%1$tM", date));
            tanggal2[1]= (""+String.format("%1$td %1$tb %1$tY", date));
            jam2[5]= ("-");
            tanggal2[5]= ("-");
            nomorplat2[1] = nomorplat.getText();
                choose2.setVisible(false);
                choose6.setVisible(true);
                nomorplat.setText("Plat Nomor...");
            }
    }
    class Choose3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Date date = new Date();
            jam2[2]= (""+String.format("%1$tH:%1$tM", date));
            tanggal2[2]= (""+String.format("%1$td %1$tb %1$tY", date));
            jam2[6]= ("-");
            tanggal2[6]= ("-");
            nomorplat2[2] = nomorplat.getText();
                choose3.setVisible(false);
                choose7.setVisible(true);
                nomorplat.setText("Plat Nomor...");
            }
    }
    class Choose4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Date date = new Date();
            jam2[3]= (""+String.format("%1$tH:%1$tM", date));
            tanggal2[3]= (""+String.format("%1$td %1$tb %1$tY", date));
            jam2[7]= ("-");
            tanggal2[7]= ("-");
            nomorplat2[3] = nomorplat.getText();
                choose4.setVisible(false);
                choose8.setVisible(true);
                nomorplat.setText("Plat Nomor...");
            }
    }
    class Choose5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Date date = new Date();
            jam2[4]= (""+String.format("%1$tH:%1$tM", date));
            tanggal2[4]= (""+String.format("%1$td %1$tb %1$tY", date));
            choose1.setVisible(true);
            choose5.setVisible(false);
        }
    }
    class Choose6 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Date date = new Date();
            jam2[5]= (""+String.format("%1$tH:%1$tM", date));
            tanggal2[5]= (""+String.format("%1$td %1$tb %1$tY", date));
            choose2.setVisible(true);
            choose6.setVisible(false);
        }
    }
    class Choose7 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                Date date = new Date();
           jam2[6]= (""+String.format("%1$tH:%1$tM", date));
            tanggal2[6]= (""+String.format("%1$td %1$tb %1$tY", date));
            choose3.setVisible(true);
            choose7.setVisible(false);
        }
    }
    class Choose8 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                Date date = new Date();
            jam2[7]= (""+String.format("%1$tH:%1$tM", date));
            tanggal2[7]= (""+String.format("%1$td %1$tb %1$tY", date));
            choose4.setVisible(true);
            choose8.setVisible(false);
        }
    }
    class Choose9 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                Date date = new Date();
            jam2[8]= (""+String.format("%1$tH:%1$tM", date));
            tanggal2[8]= (""+String.format("%1$td %1$tb %1$tY", date));
            jam2[12]= ("-");
            tanggal2[12]= ("-");
                nomorplat2[4] = nomorplat.getText();
                choose9.setVisible(false);
                choose13.setVisible(true);
                nomorplat.setText("Plat Nomor...");
            }
        }
    class Choose10 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                Date date = new Date();
            jam2[9]= (""+String.format("%1$tH:%1$tM", date));
            tanggal2[9]= (""+String.format("%1$td %1$tb %1$tY", date));
            jam2[13]= ("-");
            tanggal2[13]= ("-");
            nomorplat2[5] = nomorplat.getText();
                choose10.setVisible(false);
                choose14.setVisible(true);
                nomorplat.setText("Plat Nomor...");
            }
    }
    class Choose11 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                Date date = new Date();
            jam2[10]= (""+String.format("%1$tH:%1$tM", date));
            tanggal2[10]= (""+String.format("%1$td %1$tb %1$tY", date));
            jam2[14]= ("-");
            tanggal2[14]= ("-");
            nomorplat2[6] = nomorplat.getText();
                choose11.setVisible(false);
                choose15.setVisible(true);
                nomorplat.setText("Plat Nomor...");
            }
    }
    class Choose12 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Date date = new Date();
            jam2[11]= (""+String.format("%1$tH:%1$tM", date));
            tanggal2[11]= (""+String.format("%1$td %1$tb %1$tY", date));
            jam2[15]= ("-");
            tanggal2[15]= ("-");
            nomorplat2[7] = nomorplat.getText();
                choose12.setVisible(false);
                choose16.setVisible(true);
                nomorplat.setText("Plat Nomor...");
            }
    }
    class Choose13 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Date date = new Date();
            jam2[12]= (""+String.format("%1$tH:%1$tM", date));
            tanggal2[12]= (""+String.format("%1$td %1$tb %1$tY", date));
            choose9.setVisible(true);
            choose13.setVisible(false);
        }
    }
    class Choose14 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Date date = new Date();
            jam2[13]= (""+String.format("%1$tH:%1$tM", date));
            tanggal2[13]= (""+String.format("%1$td %1$tb %1$tY", date));
            choose10.setVisible(true);
            choose14.setVisible(false);
        }
    }
    class Choose15 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Date date = new Date();
            jam2[14]= (""+String.format("%1$tH:%1$tM", date));
            tanggal2[14]= (""+String.format("%1$td %1$tb %1$tY", date));
            choose11.setVisible(true);
            choose15.setVisible(false);
        }
    }
    class Choose16 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Date date = new Date();
            jam2[15]= (""+String.format("%1$tH:%1$tM", date));
            tanggal2[15]= (""+String.format("%1$td %1$tb %1$tY", date));
            choose12.setVisible(true);
            choose16.setVisible(false);
        }
    }
    class ShowMetheData implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            Date date = new Date();
            JOptionPane.showMessageDialog(null, "Data Plat Nomor yang parkir: \n1. "+nomorplat2[0]+" "+tanggal2[0]+" jam "+jam2[0]
                    +" sampai "+tanggal2[4]+" jam "+jam2[4]
                    +"\n2. "+nomorplat2[1]+" "+tanggal2[1]+" jam "+jam2[1]
                    +" sampai "+tanggal2[5]+" jam "+jam2[5]
                    +"\n3. "+nomorplat2[2]+" "+tanggal2[2]+" jam "+jam2[2]
                    +" sampai "+tanggal2[6]+" jam "+jam2[6]
                    +"\n4. "+nomorplat2[3]+" "+tanggal2[3]+" jam "+jam2[3]
                    +" sampai "+tanggal2[7]+" jam "+jam2[7]
                    +"\n5. "+nomorplat2[4]+" "+tanggal2[8]+" jam "+jam2[8]
                    +" sampai "+tanggal2[12]+" jam "+jam2[12]
                    +"\n6. "+nomorplat2[5]+" "+tanggal2[9]+" jam "+jam2[9]
                    +" sampai "+tanggal2[13]+" jam "+jam2[13]
                    +"\n7. "+nomorplat2[6]+" "+tanggal2[10]+" jam "+jam2[10]
                    +" sampai "+tanggal2[14]+" jam "+jam2[14]
                    +"\n8. "+nomorplat2[7]+" "+tanggal2[11]+" jam "+jam2[11]
                    +" sampai "+tanggal2[15]+" jam "+jam2[15]);
        }      
    }
}