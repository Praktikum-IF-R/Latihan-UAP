package latgui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class parkir extends Frame {
    JLabel lbJudul, lbPlat;
    JTextField plat;
    JButton data,masuk1,masuk2,masuk3,masuk4,masuk5,masuk6,masuk7,masuk8,keluar1,keluar2,keluar3,keluar4,keluar5,keluar6,keluar7,keluar8;
    String noPlat[]=new String[8];
    java.util.Calendar w= java.util.Calendar.getInstance();
    public parkir() {
        setLayout(null);
        lbJudul = new JLabel("Sistem Parkir");
        lbJudul.setFont(new Font("Arial", 1, 18));
        add(lbJudul).setBounds(180, 30, 200, 30);
        
        lbPlat = new JLabel("Nomor Plat :");
        this.add(lbPlat).setBounds(30, 90, 90, 20);
        plat = new JTextField("Plat Nomor...");
        this.add(plat).setBounds(120, 90, 200, 25);
        data = new JButton("Tampilkan Data");
        this.add(data).setBounds(330, 90, 140, 20);
        masuk1 = new JButton("Masuk");
        this.add(masuk1).setBounds(30, 140, 85, 45);
        masuk2 = new JButton("Masuk");
        this.add(masuk2).setBounds(130, 140, 85, 45);
        masuk3 = new JButton("Masuk");
        this.add(masuk3).setBounds(290, 140, 85, 45);
        masuk4 = new JButton("Masuk");
        this.add(masuk4).setBounds(390, 140, 85, 45);
        masuk5 = new JButton("Masuk");
        this.add(masuk5).setBounds(30, 270, 85, 45);
        masuk6 = new JButton("Masuk");
        this.add(masuk6).setBounds(130, 270, 85, 45);
        masuk7 = new JButton("Masuk");
        this.add(masuk7).setBounds(290, 270, 85, 45);
        masuk8 = new JButton("Masuk");
        this.add(masuk8).setBounds(390, 270, 85, 45);
        keluar1 = new JButton("Keluar");
        keluar1.setVisible(false);
        this.add(keluar1).setBounds(30, 200, 85, 45);
        keluar2 = new JButton("Keluar");
        keluar2.setVisible(false);
        this.add(keluar2).setBounds(130, 200, 85, 45);
        keluar3 = new JButton("Keluar");
        keluar3.setVisible(false);
        this.add(keluar3).setBounds(290, 200, 85, 45);
        keluar4 = new JButton("Keluar");
        keluar4.setVisible(false);
        this.add(keluar4).setBounds(390, 200, 85, 45);
        keluar5 = new JButton("Keluar");
        keluar5.setVisible(false);
        this.add(keluar5).setBounds(30, 330, 85, 45);        
        keluar6 = new JButton("Keluar");
        keluar6.setVisible(false);
        this.add(keluar6).setBounds(130, 330, 85, 45);       
        keluar7 = new JButton("Keluar");
        keluar7.setVisible(false);
        this.add(keluar7).setBounds(290, 330, 85, 45);
        keluar8 = new JButton("Keluar");
        keluar8.setVisible(false);
        this.add(keluar8).setBounds(390, 330, 85, 45);
        data.addActionListener(new hanoum());
        masuk1.addActionListener(new eva1());
        masuk2.addActionListener(new eva2());
        masuk3.addActionListener(new eva3());
        masuk4.addActionListener(new eva4());
        masuk5.addActionListener(new eva5());
        masuk6.addActionListener(new eva6());
        masuk7.addActionListener(new eva7());
        masuk8.addActionListener(new eva8());
        keluar1.addActionListener(new hayati1());
        keluar2.addActionListener(new hayati2());
        keluar3.addActionListener(new hayati3());
        keluar4.addActionListener(new hayati4());
        keluar5.addActionListener(new hayati5());
        keluar6.addActionListener(new hayati6());
        keluar7.addActionListener(new hayati7());
        keluar8.addActionListener(new hayati8());
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }});
    }
    class hanoum implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) { 
            JOptionPane.showMessageDialog(null, "Data Plat Nomor Kendaraan yang Parkir"+"\n\n1. "+noPlat[0]+" = "+waktu()+"\n2. "+noPlat[1]+" = "+waktu()+"\n3. "+noPlat[2]+" = "+waktu()
                    +"\n4. "+noPlat[3]+" = "+waktu()+"\n5. "+noPlat[4]+" = "+waktu()+"\n6. "+noPlat[5]+" = "+waktu()+"\n7. "+noPlat[6]+" = "+waktu()+"\n8. "+noPlat[7]+" = "+waktu());
        }
    }
    private String waktu(){
        w.setTimeInMillis(System.currentTimeMillis());
        int det = w.get(w.SECOND);
        int min = w.get(w.MINUTE);
        int jam = w.get(w.HOUR_OF_DAY);
        return jam+":"+min+":"+det; 
    }  
    class eva1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            noPlat[0]=plat.getText();
            waktu();
            masuk1.setVisible(false);
            keluar1.setVisible(true);
            plat.setText("Plat Nomor : ");        
        }
    }
    class eva2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            noPlat[1]=plat.getText();
            waktu();
            masuk2.setVisible(false);
            keluar2.setVisible(true);
            plat.setText("Plat Nomor : ");        
        }
    }
   class eva3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            noPlat[2]=plat.getText();
            waktu();
            masuk3.setVisible(false);
            keluar3.setVisible(true);
            plat.setText("Plat Nomor : ");        
        }
    }
    class eva4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            noPlat[3]=plat.getText();
            waktu();
            masuk4.setVisible(false);
            keluar4.setVisible(true);
            plat.setText("Plat Nomor : ");        
        }
    }
    class eva5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            noPlat[4]=plat.getText();
            waktu();
            masuk5.setVisible(false);
            keluar5.setVisible(true);
            plat.setText("Plat Nomor : ");        
        }
    }
    class eva6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            noPlat[5]=plat.getText();
            waktu();
            masuk6.setVisible(false);
            keluar6.setVisible(true);
            plat.setText("Plat Nomor : ");        
        }
    }
    class eva7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            noPlat[6]=plat.getText();
            waktu();
            masuk7.setVisible(false);
            keluar7.setVisible(true);
            plat.setText("Plat Nomor : ");        
        }
    }
    class eva8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            noPlat[7]=plat.getText();
            waktu();
            masuk8.setVisible(false);
            keluar8.setVisible(true);
            plat.setText("Plat Nomor : ");        
        }
    }
    class hayati1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            noPlat[0]=plat.getText();
            waktu();
            masuk1.setVisible(true);
            keluar1.setVisible(false);
            plat.setText("Plat Nomor : ");        
        }
    }
    class hayati2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            noPlat[1]=plat.getText();
            waktu();
            masuk2.setVisible(true);
            keluar2.setVisible(false);
            plat.setText("Plat Nomor : ");        
        }
    }
    class hayati3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            noPlat[2]=plat.getText();
            waktu();
            masuk3.setVisible(true);
            keluar3.setVisible(false);
            plat.setText("Plat Nomor : ");        
        }
    }
    class hayati4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            noPlat[3]=plat.getText();
            waktu();
            masuk4.setVisible(true);
            keluar4.setVisible(false);
            plat.setText("Plat Nomor : ");        
        }
    }class hayati5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            noPlat[4]=plat.getText();
            waktu();
            masuk5.setVisible(true);
            keluar5.setVisible(false);
            plat.setText("Plat Nomor : ");        
        }
    }
    class hayati6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            noPlat[5]=plat.getText();
            waktu();
            masuk6.setVisible(true);
            keluar6.setVisible(false);
            plat.setText("Plat Nomor : ");        
        }
    }class hayati7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            noPlat[6]=plat.getText();
            waktu();
            masuk7.setVisible(true);
            keluar7.setVisible(false);
            plat.setText("Plat Nomor : ");        
        }
    }
    class hayati8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            noPlat[7]=plat.getText();
            waktu();
            masuk8.setVisible(true);
            keluar8.setVisible(false);
            plat.setText("Plat Nomor : ");        
        }
    }        
}
