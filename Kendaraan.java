/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prauap;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.Dimension;
import java.awt.Toolkit;
public class Kendaraan extends javax.swing.JFrame {
String no;
String tglmasuk;
String plat_no;
String jns;
String jmmasuk;
DefaultTableModel tabMode;
Connection koneksi;
    private Object jamMasuk;
public Kendaraan() {
        initComponents();
        Object[] row= {"No.Tiket","Tgl Masuk", "No Plat", "J.Kendaraan", "Jam Masuk"};
        tabMode=new DefaultTableModel(null,row);
        tabeldata.setModel(tabMode);
        tglskrg();
   
    }
public void tglskrg(){
Date skrg= new Date();
SimpleDateFormat format= new SimpleDateFormat("dd-MM-yyyy");
String tgl = format.format(skrg);
tftanggal.setText(format.format(skrg));
}
    public void konekdatabase(){
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
koneksi =DriverManager.getConnection("jdbc:mysql://localhost:3306/datalogin","root","");
}
catch (Exception e)
{
System.err.println("Exception: "+e.getMessage());
}
}
    public void hapustabel(){
int row=tabMode.getRowCount();
for(int i=0;i<row;i++){
tabMode.removeRow(0);
}
}
    public void tampildataketabel(){
hapustabel();
try{
String sql="Select * from parkirmasuk";
Statement stat=koneksi.createStatement();
ResultSet set=stat.executeQuery(sql);
while (set.next()){
no=set.getString("notiket");
tglmasuk=set.getString("tanggalmasuk");
plat_no=set.getString("noplat");
jns=set.getString("jeniskendaraan");
jmmasuk=set.getString("jammasuk");
String[] data={no,tglmasuk,plat_no,jns,jmmasuk};
tabMode.addRow(data);
}
}
catch(Exception e){
}
}
public void clear(){
noTiket.setText("");
platNomor.setText("");
jamMasuk.setText("");
}
    public void simpandata(){
no=noTiket.getText();
tglmasuk=tftanggal.getText();
plat_no=platNomor.getText();
jns=(String)jenis.getSelectedItem();
jmmasuk=jamMasuk.getText();
try{
konekdatabase();
Statement statement=koneksi.createStatement();
String sql="insert into parkirmasuk values ('"+no+"','"+tglmasuk+"','"+plat_no+
"','"+jns+"','"+jmmasuk+"');";
statement.executeUpdate(sql);
statement.close();
clear();
}
catch (Exception e){
}
}
    public void data(){
no=noTiket.getText();
tglmasuk=tftanggal.getText();
plat_no=platNomor.getText();
jns=(String)jenis.getSelectedItem();
jmmasuk=jamMasuk.getText();
}
    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {                                    

        // TODO add your handling code here:
         konekdatabase();
        data();
        if(no.equals("")||tglmasuk.equals("")||plat_no.equals("")||jns.equals("")||jmmasuk.equals(""))
        {
            JOptionPane.showMessageDialog(null, "HARAP MASUKAN DATA LENGKAP!");
        }
        else{
            simpandata();
            tampildataketabel();
        }
    }
    private void btcariActionPerformed(java.awt.event.ActionEvent evt) {                                  
        // TODO add your handling code here:
konekdatabase();
        try
        {
            String cari=noTiket.getText();
            Statement statement=koneksi.createStatement();
            String sql="select * from parkirmasuk where notiket like '"+cari+"'";
            ResultSet rs=statement.executeQuery(sql);
            if(rs.next())
            {
                noTiket.setText(rs.getString(1));
                tftanggal.setText(rs.getString(2));
                platNomor.setText(rs.getString(3));
                jenis.setSelectedItem(rs.getString(4));
                jamMasuk.setText(rs.getString(5));
                }
            else{
                JOptionPane.showMessageDialog(null, "DATA TIDAK ADA ");
            }
            statement.close();
            koneksi.close();
        }
        catch (Exception ex)
        {
            System.out.println("Error: "+ex);
        }     
}

    private void initComponents() {
       
    }

    private static class platNomor {

        private static void setText(String string) {
            
        }

        private static String getText() {
           return "";
        }

        public platNomor() {
        }
    }

    private static class tabeldata {

        private static void setModel(DefaultTableModel tabMode) {
            
        }

        public tabeldata() {
        }
    }
}