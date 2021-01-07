/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kredit_laptop;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Rydwan
 */
public class Kredit_laptop {
    Connection con;
    
    public Connection getCon(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_kredit_laptop","root","");
        } catch (Exception e) {
            try {
                // Buka XAMPP jika koneksi ke server gagal
                JOptionPane.showMessageDialog(null, e + "\n" + "Koneksi ke Server gagal! Buka XAMPP Control Panel?", "Aplikasi Kredit Laptop", JOptionPane.ERROR_MESSAGE);
                Runtime.getRuntime().exec("C:\\xampp\\xampp-control.exe");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        return con;
    }

    /**
     * @param args the command line arguments
     */
//    private String getTanggal() {
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//        Date date = new Date();
//       
//        return dateFormat.format(date);
//    }
//    private String getWaktu() {
//        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//        Date date = new Date();
//       
//        return dateFormat.format(date);
//    }
    public static void main(String[] args) {
        // TODO code application logic here
          new form.login().setVisible(true);
//        Kredit_laptop tanggal = new Kredit_laptop();
//        System.out.println(tanggal.getTanggal());
//        System.out.println(tanggal.getWaktu());
    }
    
}
