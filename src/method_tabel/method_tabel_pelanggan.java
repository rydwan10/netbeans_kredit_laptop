/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method_tabel;
import form_tabel.form_tabel_pelanggan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Muhammad Rydwan
 */
public class method_tabel_pelanggan {
    Connection con = new kredit_laptop.Kredit_laptop().getCon();
    Statement stat = null;
    ResultSet res = null;
    String sql = "";
    
    public void tampil_data(form_tabel_pelanggan cd){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIK");
        model.addColumn("Nama Pelanggan");
        
        try {
            sql = "SELECT nik, nama FROM pelanggan";
            stat = con.createStatement();
            res = stat.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[] {
                    res.getString(1),
                    res.getString(2)
                });
            }
            cd.jtable.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
