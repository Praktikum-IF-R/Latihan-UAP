package LatihanUAP;
import java.util.Date;
import java.text.*;
public class Tanggal {
    public String getTime(){
        DateFormat dateFormat = new SimpleDateFormat("yyy/mm/dd HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
}