package parkir;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
public class frame extends JFrame  {
    java.util.Calendar x = java.util.Calendar.getInstance();
    String noplat[]= new String [8];
    String time ;
    Label lbJudul,no;
    TextField noPlat;
    JButton tampil,no0,no1,no2,no3,no4,no5,no6,no7,no8,no9,no10,no11,no12,no13,no14,no15;    
    public frame (){
        setLayout (null);
        lbJudul = new Label ("SISTEM PARKIR");
        lbJudul.setFont(new Font("Arial",1,24));
        add(lbJudul).setBounds(300,20,200,50);
        no = new Label ("Nomor Plat: ");
        add(no).setBounds(50,90,150,30);
        tampil = new JButton("Tampilkan Data");
        add(tampil).setBounds(500,100,130,20);
        tampil.addActionListener(new tampil());
        noPlat = new TextField("NoPlat ");
        add(noPlat).setBounds(150,95,300,20);
        no0 = new JButton("MASUK");
        add(no0).setBounds(50,200,100,80);
        no0.addActionListener(new no0());
        no1 = new JButton ("MASUK");
        add(no1).setBounds(200,200,100,80);
        no1.addActionListener(new no1());
        no2 = new JButton ("MASUK");
        add(no2).setBounds(400,200,100,80);
        no2.addActionListener(new no2());
        no3 = new JButton ("MASUK");
        add(no3).setBounds(560,200,100,80);
        no3.addActionListener(new no3());
        no4 = new JButton ("KELUAR");
        add(no4).setBounds(50,300,100,80);
        no4.addActionListener(new no4());
        no5 = new JButton ("KELUAR");
        add(no5).setBounds(200,300,100,80);
        no5.addActionListener(new no5());
        no6 = new JButton ("KELUAR");
        add(no6).setBounds(400,300,100,80);
        no6.addActionListener(new no6());
        no7 = new JButton ("KELUAR");
        add(no7).setBounds(560,300,100,80);
        no7.addActionListener(new no7());
         no8 = new JButton("MASUK");
        add(no8).setBounds(50,450,100,80);
        no8.addActionListener(new no8());
        no9 = new JButton ("MASUK"); 
        add(no9).setBounds(200,450,100,80);
        no9.addActionListener(new no9());
        no10 = new JButton ("MASUK");
        add(no10).setBounds(400,450,100,80);
        no10.addActionListener(new no10());
        no11 = new JButton ("MASUK");
        add(no11).setBounds(560,450,100,80);
        no11.addActionListener(new no11());
        no12 = new JButton ("KELUAR");
        add(no12).setBounds(50,550,100,80);
        no12.addActionListener(new no12());
        no13 = new JButton ("KELUAR");
        add(no13).setBounds(200,550,100,80);
        no13.addActionListener(new no13());
        no14 = new JButton ("KELUAR");
        add(no14).setBounds(400,550,100,80);
        no14.addActionListener(new no14());
        no15 = new JButton ("KELUAR");
        add(no15).setBounds(560,550,100,80);
        no15.addActionListener(new no15());
        show();   
    }
    class no0 implements ActionListener{
    public void actionPerformed(ActionEvent ae) {
       
       noplat[0]= noPlat.getText();
       w();
       no0.setVisible(false);
       no4.setVisible(true);
       noPlat.setText("Plat Nomor Kendaraan ");
        }
        
    }
     class no4 implements ActionListener{
    public void actionPerformed(ActionEvent ae) {
       
       noplat[0]= noPlat.getText();
       no4.setVisible(false);
       no0.setVisible(true);
       noPlat.setText("Plat Nomor Kendaraan ");
        }
        
    }
    class no1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
        noplat[1]= noPlat.getText();
        w();
        no1.setVisible(false);
        no5.setVisible(true);
        noPlat.setText("Plat Nomor Kendaraan" );
        }
        
    }
    class no5 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
        noplat[1]= noPlat.getText();
        no5.setVisible(false);
        no1.setVisible(true);
        noPlat.setText("Plat Nomor Kendaraan" );
        }
        
    }
    class no2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
        noplat[2]= noPlat.getText();
        w();
        no2.setVisible(false);
        no6.setVisible(true);
        noPlat.setText("Plat Nomor Kendaraan" );
        }
        
        
    }
    class no6 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
        noplat[2]= noPlat.getText();
        no6.setVisible(false);
        no2.setVisible(true);
        noPlat.setText("Plat Nomor Kendaraan" );
        }
        
        
    }
    class no3 implements ActionListener {
         public void actionPerformed(ActionEvent ae) {
        noplat[3]= noPlat.getText();
         w();
        no3.setVisible(false);
        no7.setVisible(true);
        noPlat.setText("Plat Nomor Kendaraan" );
        }
    }
    class no7 implements ActionListener {
         public void actionPerformed(ActionEvent ae) {
        noplat[3]= noPlat.getText();
        no7.setVisible(false);
        no3.setVisible(true);
        noPlat.setText("Plat Nomor Kendaraan" );
        }
    }
     class no8 implements ActionListener {
     public void actionPerformed(ActionEvent ae) {
        noplat[5]= noPlat.getText();
         w();
        no8.setVisible(false);
        no12.setVisible(true);
        noPlat.setText("Plat Nomor Kendaraan" );
        }
    }
      class no12 implements ActionListener {
     public void actionPerformed(ActionEvent ae) {
        noplat[5]= noPlat.getText();
        no12.setVisible(false);
        no8.setVisible(true);
        noPlat.setText("Plat Nomor Kendaraan" );
        }
    }
      class no9 implements ActionListener {
     public void actionPerformed(ActionEvent ae) {
        noplat[6]= noPlat.getText();
         w();
        no9.setVisible(false);
        no13.setVisible(true);
        noPlat.setText("Plat Nomor Kendaraan" );
        }
    }
      class no13 implements ActionListener {
     public void actionPerformed(ActionEvent ae) {
        noplat[6]= noPlat.getText();
        no13.setVisible(false);
        no9.setVisible(true);
        noPlat.setText("Plat Nomor Kendaraan" );
        }
    }
       class no10 implements ActionListener {
     public void actionPerformed(ActionEvent ae) {
        noplat[7]= noPlat.getText();
        w();
        no10.setVisible(false);
        no14.setVisible(true);
        noPlat.setText("Plat Nomor Kendaraan" );
        }
    }
       class no14 implements ActionListener {
     public void actionPerformed(ActionEvent ae) {
        noplat[7]= noPlat.getText();
        no14.setVisible(false);
        no10.setVisible(true);
        noPlat.setText("Plat Nomor Kendaraan" );
        }
    }
         class no11 implements ActionListener {
     public void actionPerformed(ActionEvent ae) {
        noplat[8]= noPlat.getText();
         w();
        no11.setVisible(false);
        no15.setVisible(true);
        noPlat.setText("Plat Nomor Kendaraan" );
        }
    }
       class no15 implements ActionListener {
     public void actionPerformed(ActionEvent ae) {
        noplat[8]= noPlat.getText();
        no15.setVisible(false);
        no11.setVisible(true);
        noPlat.setText("Plat Nomor Kendaraan" );
        }
    }
    class tampil implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
          Date a= new Date();
            JOptionPane.showMessageDialog(null, "Data plat no"+
                  noplat[0]+time+"\n"+noplat[1]+time+"\n"+noplat[2]+time+"\n"+noplat[3]+time+"\n"+noplat[4]+time+
                  "\n"+noplat[5]+time+"\n"+noplat[6]+time+"\n"+noplat[7]+time);
            
        }
        
    }
     private void w() {
         x.setTimeInMillis(System.currentTimeMillis());
         int j = x.get(x.HOUR_OF_DAY);
         int m = x.get(x.MINUTE);
         int s = x.get(x.SECOND);
         time = String.valueOf(j+":"+m+":"+s);
     }
}
