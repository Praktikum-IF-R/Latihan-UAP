package LatihanUAP;
import java.io.*;
import javax.swing.JOptionPane;
public class lahanParkir extends Lahan{
    public String data, timeOut, In, Out;
    public String status = "Belum Keluar";
    
    Tanggal tgl = new Tanggal();
    
    public lahanParkir(String a, String b){
        super(a, b);
    }
    public String setTime(){
        return tgl.getTime();
    }
   public void tampilData(String a){
       
        data = String.format("Nomor Plat Kendaraan\t: "+plat+"\t"+
                            "Masuk\t\t: "+In+"\t"+
                            "Lahan Parkir\t: "+lahanParkir+"\t"+
                            "Status\t\t: "+status);
        timeOut = String.format("Keluar\t\t: "+Out);
        try{
           File data_parkir = new File("data_parkir.txt");
           PrintWriter pr = new PrintWriter(new FileWriter(data_parkir, true));
           
           if(a.equalsIgnoreCase("Belum Keluar")){
               pr.println(data);
               pr.println();
               pr.close();
           }
           else{
               pr.println(data);
               pr.println(timeOut);
               pr.println();
               pr.close();
           }
           
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, "Data tidak bisa disimpan!");
        }
    }
}
