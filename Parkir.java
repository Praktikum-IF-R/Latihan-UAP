package parkir;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Parkir {
    private String plat, slot;
    public Parkir(String x){
        this.plat="";
        this.slot=x;
    }
    public void setPlat (String plat){
        this.plat=plat;
    }
    public String getPlat(){
        return plat;
    }
    public String getslot(){
        return slot;
    }
    public String getTanggal() { 
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
        Date date = new Date(); 
        return dateFormat.format(date); 
    } 
}
