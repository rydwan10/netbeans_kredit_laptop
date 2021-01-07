/*\
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method_tabel;
import form_tabel.form_tabel_penyicil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Muhammad Rydwan
 */
public class method_tabel_penyicil {
     Connection con = new kredit_laptop.Kredit_laptop().getCon();
     Statement stat = null;
     ResultSet res = null;
     String sql = "";
     
     public void tampil_data(form_tabel_penyicil td){
         DefaultTableModel model = new DefaultTableModel();
         model.addColumn("Kode Cicilan");
         model.addColumn("NIK");
         model.addColumn("Nama Pelanggan");
         
         try {
             sql = "SELECT c.kd_cicilan, c.nik, p.nama FROM cicilan c, pelanggan p WHERE c.nik = p.nik ORDER BY c.kd_cicilan ASC";
             stat = con.createStatement();
             res = stat.executeQuery(sql);
             
             while(res.next()){
                 model.addRow(new Object[] {
                     res.getString(1),
                     res.getString(2),
                     res.getString(3)
                 });
             }
             
             td.jtable.setModel(model);
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
}
