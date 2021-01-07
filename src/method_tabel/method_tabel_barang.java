/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method_tabel;
import form_tabel.form_tabel_barang;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Muhammad Rydwan
 */
public class method_tabel_barang {
    Connection con = new kredit_laptop.Kredit_laptop().getCon();
    Statement stat = null;
    ResultSet res = null;
    String sql = "";
    
    public void tampil_data(form_tabel_barang td){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Barang");
        model.addColumn("Merk");
        model.addColumn("Tipe");
        model.addColumn("Harga");
        model.addColumn("Stok");
        
        try {
            sql = "SELECT kd_barang, merk, tipe, harga, stok FROM barang";
            stat = con.createStatement();
            res = stat.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{
                   res.getString(1),
                   res.getString(2),
                   res.getString(3),
                   res.getString(4),
                   res.getString(5)
                });
            }
            td.jtable.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void cari_data(form_tabel_barang cd){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Barang");
        model.addColumn("Merk");
        model.addColumn("Tipe");
        model.addColumn("Harga");
        model.addColumn("Stok");
        
        if (cd.jccari.getSelectedItem().equals("Kode Barang")){
            try {
                sql = "SELECT kd_barang, merk, tipe, harga, stok FROM barang WHERE kd_barang LIKE '%"+ cd.jtcari.getText() +"%' ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    model.addRow(new Object[]{
                       res.getString(1),
                       res.getString(2),
                       res.getString(3),
                       res.getString(4),
                       res.getString(5)
                    });
                }
                cd.jtable.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (cd.jccari.getSelectedItem().equals("Merk")){
            try {
                sql = "SELECT kd_barang, merk, tipe, harga, stok FROM barang WHERE merk LIKE '%"+ cd.jtcari.getText() +"%' ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    model.addRow(new Object[]{
                       res.getString(1),
                       res.getString(2),
                       res.getString(3),
                       res.getString(4),
                       res.getString(5)
                    });
                }
                cd.jtable.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (cd.jccari.getSelectedItem().equals("Tipe")){
            try {
                sql = "SELECT kd_barang, merk, tipe, harga, stok FROM barang WHERE tipe LIKE '%"+ cd.jtcari.getText() +"%' ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    model.addRow(new Object[]{
                       res.getString(1),
                       res.getString(2),
                       res.getString(3),
                       res.getString(4),
                       res.getString(5)
                    });
                }
                cd.jtable.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (cd.jccari.getSelectedItem().equals("Harga")){
            try {
                sql = "SELECT kd_barang, merk, tipe, harga, stok FROM barang WHERE harga LIKE '%"+ cd.jtcari.getText() +"%' ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    model.addRow(new Object[]{
                       res.getString(1),
                       res.getString(2),
                       res.getString(3),
                       res.getString(4),
                       res.getString(5)
                    });
                }
                cd.jtable.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (cd.jccari.getSelectedItem().equals("Stok")){
            try {
                sql = "SELECT kd_barang, merk, tipe, harga, stok FROM barang WHERE stok LIKE '%"+ cd.jtcari.getText() +"%' ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    model.addRow(new Object[]{
                       res.getString(1),
                       res.getString(2),
                       res.getString(3),
                       res.getString(4),
                       res.getString(5)
                    });
                }
                cd.jtable.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
