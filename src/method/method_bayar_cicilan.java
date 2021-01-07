/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;
import form.bayar_cicilan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Muhammad Rydwan
 */
public class method_bayar_cicilan {
    Connection con = new kredit_laptop.Kredit_laptop().getCon();
    Statement stat = null;
    ResultSet res = null;
    String sql = "";
    
    // AMBIL DATA DINAMIS SETELAH JTEXTFIELD TERISI DARI FORM_TABEL
    public void tampilDataField(bayar_cicilan bc){
        try {
            String kode_cicilan = bc.jtkode.getText();
            sql = "SELECT * FROM cicilan WHERE kd_cicilan = '"+ kode_cicilan +"' ";
            stat = con.createStatement();
            res = stat.executeQuery(sql);
            
            if(res.next()){
                bc.jtkodebarang.setText(res.getString("kd_barang"));
                bc.jtuangmuka.setText(res.getString("uang_muka"));
                bc.jtsisaharga.setText(res.getString("sisa_harga"));
                bc.jtlamanagsuran.setText(res.getString("lama_angsuran"));
                bc.jtangsuran.setText(res.getString("angsuran"));
                bc.jttanggaldaftar.setText(res.getString("tanggal_daftar"));
                bc.jcstatus.setSelectedItem(res.getString("status"));
            }
            
            try {
                String kode_barang = bc.jtkodebarang.getText();
                sql = "SELECT CONCAT(merk,' ',tipe) AS nama_barang, harga FROM barang WHERE kd_barang = '"+ kode_barang +"' ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);
                
                if(res.next()){
                    bc.jtnamabarang.setText(res.getString("nama_barang"));
                    bc.jthargabarang.setText(res.getString("harga"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Tampil data riwayat pembayaran berdasarkan kode cicilan
    public void tampilRiwayatCicilan(bayar_cicilan bc){
       DefaultTableModel tabel_detail = new DefaultTableModel();
       tabel_detail.addColumn("ID");
       tabel_detail.addColumn("Kode Cicilan");
       tabel_detail.addColumn("Stor");
       tabel_detail.addColumn("Sisa Cicilan");
       tabel_detail.addColumn("Tanggal Menyicil");
       
        try {
            
            sql = "SELECT * FROM detail_cicilan WHERE kd_cicilan = '"+ bc.jtkode.getText() +"' ORDER BY tanggal_menyicil DESC ";
            stat = con.createStatement();
            res = stat.executeQuery(sql);
            
            while(res.next()){
                tabel_detail.addRow(new Object[] {
                    res.getString("id"),
                    res.getString("kd_cicilan"),
                    res.getString("stor"),
                    res.getString("sisa_cicilan"),
                    res.getString("tanggal_menyicil")
                });
            }
            bc.jtable.setModel(tabel_detail);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Simpan Data
    public void simpan(bayar_cicilan s){
        
        if ( s.jtkode.getText().equals("") || s.jtstor.getText().equals("") || s.jtsisacicilan.getText().equals("") || s.jdtanggalmenyicil.getDate().equals(null) ) {
            JOptionPane.showMessageDialog(null, "Field tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            
            try {
                String kode_cicilan = s.jtkode.getText();
                String stor = s.jtstor.getText();
                String sisa_cicilan = s.jtsisacicilan.getText();
                
                SimpleDateFormat format_tanggal = new SimpleDateFormat("yyyy-MM-dd");
                String tanggal_menyicil = format_tanggal.format(s.jdtanggalmenyicil.getDate());
                
                sql = "INSERT INTO detail_cicilan (kd_cicilan, stor, sisa_cicilan, tanggal_menyicil)"
                        + "VALUES ('"+ kode_cicilan +"', '"+ stor +"', '"+ sisa_cicilan +"', '"+ tanggal_menyicil +"')";
                stat = con.createStatement();
                stat.execute(sql);
                
                // update sisa harga pada cicilan
                try {
                    sql = "UPDATE cicilan SET sisa_harga = (sisa_harga - '"+ s.jtstor.getText() +"') WHERE kd_cicilan = '"+ s.jtkode.getText() +"' ";
                    stat = con.createStatement();
                    stat.execute(sql);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e, "Kesalahan terjadi pada Method Simpan(Update Cicilan)!", JOptionPane.ERROR_MESSAGE);
                }
                
                if (Integer.parseInt(s.jtsisacicilan.getText()) == 0){
                    try {
                        sql = "UPDATE cicilan SET status = 'LUNAS', sisa_harga = '0' WHERE kd_cicilan = '"+ s.jtkode.getText() +"' ";
                        stat = con.createStatement();
                        stat.execute(sql);

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e, "Kesalahan terjadi pada Method Simpan(Update update status pada cicilan)!", JOptionPane.ERROR_MESSAGE);
                    }
                    
                }
                // Ask user after insertin data into table
                int pesan = JOptionPane.showConfirmDialog(null, "Data berhasil disimpan, tambah lagi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (pesan == JOptionPane.YES_OPTION){
                    bersih(s);
                    tampilRiwayatCicilan(s);
                }else if(pesan == JOptionPane.NO_OPTION){
                    bersih(s);
                    tampilRiwayatCicilan(s);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Kesalahan terjadi pada Method Simpan!", JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
            
            
            
        }
    }
    // Klik Tabel
    public void klik_table(bayar_cicilan kt){
        int row = kt.jtable.getSelectedRow();
        try {
            sql = "SELECT * FROM detail";
        } catch (Exception e) {
        }
    }
    
    public void bersih(bayar_cicilan b){
        b.jtkode.setText("");
        b.jtnik.setText("");
        b.jtnamapelanggan.setText("");
        b.jtkodebarang.setText("");
        b.jtnamabarang.setText("");
        b.jthargabarang.setText("");
        b.jtuangmuka.setText("");
        b.jtsisaharga.setText("");
        b.jtlamanagsuran.setText("");
        b.jtangsuran.setText("");
        b.jttanggaldaftar.setText("");
        
        b.jtstor.setText("");
        b.jtsisacicilan.setText("");
        // b.jdtanggalmenyicil.setDate(null);
    }
   
    
}
