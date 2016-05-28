package prauap;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        Date date = new Date();
        ParkingSystem ps = new ParkingSystem();
        ps.setTitle("Sistem Parkir");
        ps.setSize(680, 600);
        ps.show();
    }  
}