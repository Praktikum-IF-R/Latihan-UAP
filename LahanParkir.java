import java.awt.event.*;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class LahanParkir extends javax.swing.JFrame {

    /**
     * Creates new form LahanParkir
     */
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat date = new SimpleDateFormat("d-MMM-yyy");
    String time;
    String noPlat[] = {"-","-","-","-","-","-","-","-"};
    String tanggal[] = {"-","-","-","-","-","-","-","-"};
    String waktu [] = {"-","-","-","-","-","-","-","-"};
    public LahanParkir() {
        initComponents();
        setTitle("Program Parkir");
        jButton1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jButton1Action(e);
            }
        });
        jButton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jButton2Action(e);
            }
        });
        jButton3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jButton3Action(e);
            }
        });
        jButton4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jButton4Action(e);
            }
        });
        jButton5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jButton5Action(e);
            }
        });
        jButton6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jButton6Action(e);
            }
        });
        jButton7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jButton7Action(e);
            }
        });
        jButton8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jButton8Action(e);
            }
        });
        jButton9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jButton9Action(e);
            }
        });
        jButton10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jButton10Action(e);
            }
        });
        jButton11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jButton11Action(e);
            }
        });
        jButton12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jButton12Action(e);
            }
        });
        jButton13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jButton13Action(e);
            }
        });
        jButton14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jButton14Action(e);
            }
        });
        jButton15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jButton15Action(e);
            }
        });
        jButton16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jButton16Action(e);
            }
        });
        jButton17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton17Action(e);
            }
        });
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Masuk");

        jButton2.setText("Keluar");

        jButton3.setText("Masuk");

        jButton4.setText("Keluar");

        jButton5.setText("Masuk");

        jButton6.setText("Keluar");

        jButton7.setText("Masuk");

        jButton8.setText("Keluar");

        jButton9.setText("Masuk");

        jButton10.setText("Keluar");

        jButton11.setText("Masuk");

        jButton12.setText("Keluar");

        jButton13.setText("Masuk");

        jButton14.setText("Keluar");

        jButton15.setText("Masuk");

        jButton16.setText("Keluar");

        jLabel1.setText("Sistem Parkir");

        jLabel2.setText("Nomor Plat:");

        jTextField1.setText("Plat Nomor..");

        jButton17.setText("Tampilkan Data");

        jLabel3.setText("Lahan 1");

        jLabel4.setText("Lahan 2");

        jLabel5.setText("Lahan 3");

        jLabel6.setText("Lahan 4");

        jLabel7.setText("Lahan 5");

        jLabel8.setText("Lahan 6");

        jLabel9.setText("Lahan 7");

        jLabel10.setText("Lahan 8");

        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton9)
                                    .addComponent(jButton10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton12)
                                    .addComponent(jButton11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel8)))))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(12, 12, 12)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton7)
                                            .addComponent(jButton8)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel6))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton15)
                                    .addComponent(jButton16)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel10))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton10, jButton11, jButton12, jButton13, jButton14, jButton15, jButton16, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1Action(java.awt.event.ActionEvent e){
        noPlat[0] = jTextField1.getText();
        tanggal[0] = date.format(calendar.getTime());
        refreshClocks();
        waktu [0] = time + " (in)";
    }
    private void jButton2Action(java.awt.event.ActionEvent e){
        refreshClocks();
        waktu [0] = time+ " (out)";
    }
    private void jButton3Action(java.awt.event.ActionEvent e){
        noPlat[1] = jTextField1.getText();
        tanggal[1] = date.format(calendar.getTime());
        refreshClocks();
        waktu [1] = time + " (in)";
    }
    private void jButton4Action(java.awt.event.ActionEvent e){
        refreshClocks();
        waktu [1] = time+ " (out)";
    }
    private void jButton5Action(java.awt.event.ActionEvent e){
        noPlat[2] = jTextField1.getText();
        tanggal[2] = date.format(calendar.getTime());
        refreshClocks();
        waktu [2] = time + " (in)";
    }
    private void jButton6Action(java.awt.event.ActionEvent e){
        refreshClocks();
        waktu [2] = time+ " (out)";
    }
    private void jButton7Action(java.awt.event.ActionEvent e){
        noPlat[3] = jTextField1.getText();
        tanggal[3] = date.format(calendar.getTime());
        refreshClocks();
        waktu [3] = time + " (in)";
    }
    private void jButton8Action(java.awt.event.ActionEvent e){
        refreshClocks();
        waktu [3] = time+ " (out)";
    }
    private void jButton9Action(java.awt.event.ActionEvent e){
        noPlat[4] = jTextField1.getText();
        tanggal[4] = date.format(calendar.getTime());
        refreshClocks();
        waktu [4] = time + " (in)";
    }
    private void jButton10Action(java.awt.event.ActionEvent e){
        refreshClocks();
        waktu [4] = time+ " (out)";
    }
    private void jButton11Action(java.awt.event.ActionEvent e){
        noPlat[5] = jTextField1.getText();
        tanggal[5] = date.format(calendar.getTime());
        refreshClocks();
        waktu [5] = time + " (in)";
    }
    private void jButton12Action(java.awt.event.ActionEvent e){
        refreshClocks();
        waktu [5] = time+ " (out)";
    }
    private void jButton13Action(java.awt.event.ActionEvent e){
        noPlat[6] = jTextField1.getText();
        tanggal[6] = date.format(calendar.getTime());
        refreshClocks();
        waktu [6] = time + " (in)";
    }
    private void jButton14Action(java.awt.event.ActionEvent e){
        refreshClocks();
        waktu [6] = time+ " (out)";
    }
    private void jButton15Action(java.awt.event.ActionEvent e){
        noPlat[7] = jTextField1.getText();
        tanggal[7] = date.format(calendar.getTime());
        refreshClocks();
        waktu [7] = time + " (in)";
    }
    private void jButton16Action(java.awt.event.ActionEvent e){
        refreshClocks();
        waktu [7] = time+ " (out)";
    }
    private void jButton17Action(java.awt.event.ActionEvent e){
        jTextPane1.setText(jLabel3.getText()+"\nNomor Plat : "+noPlat[0]+"\nDate : "+tanggal[0]+"\nTime : "+waktu[0]
                +"\n\n"+jLabel4.getText()+"\nNomor Plat : "+noPlat[1]+"\nDate : "+tanggal[1]+"\nTime : "+waktu[1]
                +"\n\n"+jLabel5.getText()+"\nNomor Plat : "+noPlat[2]+"\nDate : "+tanggal[2]+"\nTime : "+waktu[2]
                +"\n\n"+jLabel6.getText()+"\nNomor Plat : "+noPlat[3]+"\nDate : "+tanggal[3]+"\nTime : "+waktu[3]
                +"\n\n"+jLabel7.getText()+"\nNomor Plat : "+noPlat[4]+"\nDate : "+tanggal[4]+"\nTime : "+waktu[4]
                +"\n\n"+jLabel8.getText()+"\nNomor Plat : "+noPlat[5]+"\nDate : "+tanggal[5]+"\nTime : "+waktu[5]
                +"\n\n"+jLabel9.getText()+"\nNomor Plat : "+noPlat[6]+"\nDate : "+tanggal[6]+"\nTime : "+waktu[6]
                +"\n\n"+jLabel10.getText()+"\nNomor Plat : "+noPlat[7]+"\nDate : "+tanggal[7]+"\nTime : "+waktu[7]);
    }
    private void refreshClocks() {
        calendar.setTimeInMillis(System.currentTimeMillis());
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);
        time = String.valueOf(hours+":"+minutes+":"+seconds);
    }
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
            java.util.logging.Logger.getLogger(LahanParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LahanParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LahanParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LahanParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LahanParkir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}