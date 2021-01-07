/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;
import form.daftar_cicilan;
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
public class method_daftar_cicilan {
    Connection con = new kredit_laptop.Kredit_laptop().getCon();
    Statement stat = null;
    ResultSet res = null;
    String sql = "";
    
    public void kunci(daftar_cicilan k){
        // Fields
        k.jtnik.setEnabled(false);
        k.jtnamapelanggan.setEnabled(false);
        k.jtkodebarang.setEnabled(false);
        k.jtnamabarang.setEnabled(false);
        k.jthargabarang.setEnabled(false);
        k.jtuangmuka.setEnabled(false);
        k.jtsisaharga.setEnabled(false);
        k.jtlamanagsuran.setEnabled(false);
        k.jtangsuran.setEnabled(false);
        k.jdtanggaldaftar.setEnabled(false);
        k.jcstatus.setEnabled(false);
        
        //Buttons
        k.jbtambah.setEnabled(true);
        k.jbbatal.setEnabled(false);
        k.jbsimpan.setEnabled(false);
        k.jbubah.setEnabled(false);
        k.jbhapus.setEnabled(false);
        
        k.jbcaripelanggan.setEnabled(false);
        k.jbcaribarang.setEnabled(false);
    }
    public void buka_kunci(daftar_cicilan bk){
        // Fields
        bk.jtnik.setEnabled(false);
        bk.jtnamapelanggan.setEnabled(true);
        bk.jtkodebarang.setEnabled(false);
        bk.jtnamabarang.setEnabled(true);
        bk.jthargabarang.setEnabled(true);
        bk.jtuangmuka.setEnabled(true);
        bk.jtsisaharga.setEnabled(true);
        bk.jtlamanagsuran.setEnabled(true);
        bk.jtangsuran.setEnabled(true);
        bk.jdtanggaldaftar.setEnabled(true);
        bk.jcstatus.setEnabled(true);
        
        // JButton
        bk.jbtambah.setEnabled(false);
        bk.jbbatal.setEnabled(true);
        bk.jbsimpan.setEnabled(true);
        bk.jbubah.setEnabled(false);
        bk.jbhapus.setEnabled(false);
        
        bk.jbcaripelanggan.setEnabled(true);
        bk.jbcaribarang.setEnabled(true);
    }
    public void bersih(daftar_cicilan b){
        b.jtnik.setText("");
        b.jtnamapelanggan.setText("");
        b.jtkodebarang.setText("");
        b.jtnamabarang.setText("");
        b.jthargabarang.setText("");
        b.jtuangmuka.setText("");
        b.jtsisaharga.setText("");
        b.jtlamanagsuran.setText("");
        b.jtangsuran.setText("");
        b.jdtanggaldaftar.setDate(null);
    }
    public void tampil_data(daftar_cicilan td){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Cicilan");
        model.addColumn("Nama Pelanggan");
        model.addColumn("Merk");
        model.addColumn("Tipe");
        model.addColumn("Uang Muka");
        model.addColumn("Sisa Harga");
        model.addColumn("Lama Angsuran");
        model.addColumn("Angsuran");
        model.addColumn("Tanggal Daftar");
        model.addColumn("Status");
        try {
            sql = "SELECT cicilan.kd_cicilan, pelanggan.nama, barang.merk, barang.tipe, cicilan.uang_muka, cicilan.sisa_harga, cicilan.lama_angsuran, cicilan.angsuran, cicilan.tanggal_daftar, cicilan.status FROM cicilan, pelanggan, barang WHERE pelanggan.nik = cicilan.nik AND barang.kd_barang = cicilan.kd_barang";
            stat = con.createStatement();
            res = stat.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{
                    res.getString("kd_cicilan"),
                    res.getString("nama"),
                    res.getString("merk"),
                    res.getString("tipe"),
                    res.getString("uang_muka"),
                    res.getString("sisa_harga"),
                    res.getString("lama_angsuran"),
                    res.getString("angsuran"),
                    res.getString("tanggal_daftar"),
                    res.getString("status")
                });
            }
            td.jtable.setModel(model);
        } catch (SQLException e) {
//            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void kd_oto(daftar_cicilan ko){
        try {
            sql = "SELECT * FROM cicilan ORDER BY kd_cicilan DESC";
            stat = con.createStatement();
            res = stat.executeQuery(sql);
            
            if(res.next()){
                String kd_cicilan = res.getString("kd_cicilan").substring(1);
                String an = "" + (Integer.parseInt(kd_cicilan)+1);
                String nol = "";
                
                if(an.length() == 1){
                    nol = "0000";
                } else if(an.length() == 2){
                    nol = "000";
                } else if(an.length() == 3){
                    nol = "00";
                } else if(an.length() == 4){
                    nol = "0";
                } else if(an.length() == 5){
                    nol = "";
                }
                ko.jtkode.setText("C" + nol + an);
            } else {
                ko.jtkode.setText("C00001");
            }
            }
         catch (Exception e) {
             JOptionPane.showMessageDialog(null, e, "Kesalahan terjadi pada Kode Otomatis!", JOptionPane.ERROR_MESSAGE);
             System.out.println(e);
        }
    }
    public static Date getTanggal(JTable table, int kolom){
        
        JTable tabel = table;
        String str_tanggal = String.valueOf(tabel.getValueAt(tabel.getSelectedRow(), kolom));
        Date tanggal = null;
        
        try {
            tanggal = new SimpleDateFormat("yyyy-MM-dd").parse(str_tanggal);
        } catch (Exception e) {
        }
        
        return tanggal;
    }
    public void klik_table(daftar_cicilan kt){
        int row = kt.jtable.getSelectedRow(); 
        try {
            sql = "SELECT * FROM cicilan WHERE kd_cicilan = '"+ kt.jtable.getModel().getValueAt(row, 0) +"' ";
            stat = con.createStatement();
            res = stat.executeQuery(sql);
            
            if(res.next()){
                kt.jtkode.setText(res.getString("kd_cicilan"));
                kt.jtnik.setText(res.getString("nik"));
                kt.jtkodebarang.setText(res.getString("kd_barang"));
                kt.jtuangmuka.setText(res.getString("uang_muka"));
                kt.jtsisaharga.setText(res.getString("sisa_harga"));
                kt.jtlamanagsuran.setText(res.getString("lama_angsuran"));
                kt.jtangsuran.setText(res.getString("angsuran"));
                kt.jcstatus.setSelectedItem(res.getString("status"));
                
                String tanggal = res.getString("tanggal_daftar");
                Date tanggalDaftar = new SimpleDateFormat("yyyy-MM-dd").parse(tanggal);
                
                kt.jdtanggaldaftar.setDate(tanggalDaftar);
            }
                // Ambil data spesifik dari tabel pelanggan berdasasrkan NIK dari JTextField
                try {
                    sql = "SELECT * FROM pelanggan WHERE nik = '"+ kt.jtnik.getText() +"' ";
                    stat = con.createStatement();
                    res = stat.executeQuery(sql);
                    
                    if(res.next()){
                        kt.jtnamapelanggan.setText(res.getString("nama"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                try {
                    sql = "SELECT * FROM barang WHERE kd_barang = '"+ kt.jtkodebarang.getText() +"' ";
                    stat = con.createStatement();
                    res = stat.executeQuery(sql);
                    
                    if(res.next()){
                        kt.jtnamabarang.setText((res.getString("merk") + " " + res.getString("tipe")));
                        kt.jthargabarang.setText(res.getString("harga"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        kt.jbcaripelanggan.setEnabled(true);
        kt.jtnamapelanggan.setEnabled(true);
        kt.jbcaribarang.setEnabled(true);
        kt.jtnamabarang.setEnabled(true);
        kt.jthargabarang.setEnabled(true);
        kt.jtuangmuka.setEnabled(true);
        kt.jtsisaharga.setEnabled(true);
        kt.jtlamanagsuran.setEnabled(true);
        kt.jtangsuran.setEnabled(true);
        kt.jdtanggaldaftar.setEnabled(true);
        kt.jcstatus.setEnabled(true);
        
            kt.jbtambah.setEnabled(false);
            kt.jbbatal.setEnabled(true);
            kt.jbsimpan.setEnabled(false);
            kt.jbhapus.setEnabled(true);
            kt.jbubah.setEnabled(true);
    }
    
    
    // CRUD OPERATION BELOW//
    public void cari_data(daftar_cicilan cd){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Cicilan");
        model.addColumn("Nama Pelanggan");
        model.addColumn("Merk");
        model.addColumn("Tipe");
        model.addColumn("Uang Muka");
        model.addColumn("Sisa Harga");
        model.addColumn("Lama Angsuran");
        model.addColumn("Angsuran");
        model.addColumn("Tanggal Daftar");
        model.addColumn("Status");
        
        if(cd.jccari.getSelectedItem().equals("Kode")){
            try {
                sql = "SELECT cicilan.kd_cicilan, pelanggan.nama, barang.merk, barang.tipe, cicilan.uang_muka, cicilan.sisa_harga, cicilan.lama_angsuran, cicilan.angsuran, cicilan.tanggal_daftar, cicilan.status FROM cicilan, pelanggan, barang WHERE pelanggan.nik = cicilan.nik AND barang.kd_barang = cicilan.kd_barang "
                        + "AND cicilan.kd_cicilan LIKE '%"+ cd.jtcari.getText() +"%'  ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    model.addRow(new Object[]{
                        res.getString("kd_cicilan"),
                        res.getString("nama"),
                        res.getString("merk"),
                        res.getString("tipe"),
                        res.getString("uang_muka"),
                        res.getString("sisa_harga"),
                        res.getString("lama_angsuran"),
                        res.getString("angsuran"),
                        res.getString("tanggal_daftar"),
                        res.getString("status")
                    });
                }
                cd.jtable.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (cd.jccari.getSelectedItem().equals("Nama")){
            try {
                sql = "SELECT cicilan.kd_cicilan, pelanggan.nama, barang.merk, barang.tipe, cicilan.uang_muka, cicilan.sisa_harga, cicilan.lama_angsuran, cicilan.angsuran, cicilan.tanggal_daftar, cicilan.status FROM cicilan, pelanggan, barang WHERE pelanggan.nik = cicilan.nik AND barang.kd_barang = cicilan.kd_barang "
                        + "AND pelanggan.nama LIKE '%"+ cd.jtcari.getText() +"%'  ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    model.addRow(new Object[]{
                        res.getString("kd_cicilan"),
                        res.getString("nama"),
                        res.getString("merk"),
                        res.getString("tipe"),
                        res.getString("uang_muka"),
                        res.getString("sisa_harga"),
                        res.getString("lama_angsuran"),
                        res.getString("angsuran"),
                        res.getString("tanggal_daftar"),
                        res.getString("status")
                    });
                }
                cd.jtable.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (cd.jccari.getSelectedItem().equals("Merk")){
            try {
                sql = "SELECT cicilan.kd_cicilan, pelanggan.nama, barang.merk, barang.tipe, cicilan.uang_muka, cicilan.sisa_harga, cicilan.lama_angsuran, cicilan.angsuran, cicilan.tanggal_daftar, cicilan.status FROM cicilan, pelanggan, barang WHERE pelanggan.nik = cicilan.nik AND barang.kd_barang = cicilan.kd_barang "
                        + "AND barang.merk LIKE '%"+ cd.jtcari.getText() +"%'  ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    model.addRow(new Object[]{
                        res.getString("kd_cicilan"),
                        res.getString("nama"),
                        res.getString("merk"),
                        res.getString("tipe"),
                        res.getString("uang_muka"),
                        res.getString("sisa_harga"),
                        res.getString("lama_angsuran"),
                        res.getString("angsuran"),
                        res.getString("tanggal_daftar"),
                        res.getString("status")
                    });
                }
                cd.jtable.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (cd.jccari.getSelectedItem().equals("Tipe")){
            try {
                sql = "SELECT cicilan.kd_cicilan, pelanggan.nama, barang.merk, barang.tipe, cicilan.uang_muka, cicilan.sisa_harga, cicilan.lama_angsuran, cicilan.angsuran, cicilan.tanggal_daftar, cicilan.status FROM cicilan, pelanggan, barang WHERE pelanggan.nik = cicilan.nik AND barang.kd_barang = cicilan.kd_barang "
                        + "AND barang.tipe LIKE '%"+ cd.jtcari.getText() +"%'  ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    model.addRow(new Object[]{
                        res.getString("kd_cicilan"),
                        res.getString("nama"),
                        res.getString("merk"),
                        res.getString("tipe"),
                        res.getString("uang_muka"),
                        res.getString("sisa_harga"),
                        res.getString("lama_angsuran"),
                        res.getString("angsuran"),
                        res.getString("tanggal_daftar"),
                        res.getString("status")
                    });
                }
                cd.jtable.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (cd.jccari.getSelectedItem().equals("Uang Muka")){
            try {
                sql = "SELECT cicilan.kd_cicilan, pelanggan.nama, barang.merk, barang.tipe, cicilan.uang_muka, cicilan.sisa_harga, cicilan.lama_angsuran, cicilan.angsuran, cicilan.tanggal_daftar, cicilan.status FROM cicilan, pelanggan, barang WHERE pelanggan.nik = cicilan.nik AND barang.kd_barang = cicilan.kd_barang "
                        + "AND cicilan.uang_muka LIKE '%"+ cd.jtcari.getText() +"%'  ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    model.addRow(new Object[]{
                        res.getString("kd_cicilan"),
                        res.getString("nama"),
                        res.getString("merk"),
                        res.getString("tipe"),
                        res.getString("uang_muka"),
                        res.getString("sisa_harga"),
                        res.getString("lama_angsuran"),
                        res.getString("angsuran"),
                        res.getString("tanggal_daftar"),
                        res.getString("status")
                    });
                }
                cd.jtable.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (cd.jccari.getSelectedItem().equals("Sisa Harga")){
            try {
                sql = "SELECT cicilan.kd_cicilan, pelanggan.nama, barang.merk, barang.tipe, cicilan.uang_muka, cicilan.sisa_harga, cicilan.lama_angsuran, cicilan.angsuran, cicilan.tanggal_daftar, cicilan.status FROM cicilan, pelanggan, barang WHERE pelanggan.nik = cicilan.nik AND barang.kd_barang = cicilan.kd_barang "
                        + "AND cicilan.sisa_harga LIKE '%"+ cd.jtcari.getText() +"%'  ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    model.addRow(new Object[]{
                        res.getString("kd_cicilan"),
                        res.getString("nama"),
                        res.getString("merk"),
                        res.getString("tipe"),
                        res.getString("uang_muka"),
                        res.getString("sisa_harga"),
                        res.getString("lama_angsuran"),
                        res.getString("angsuran"),
                        res.getString("tanggal_daftar"),
                        res.getString("status")
                    });
                }
                cd.jtable.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (cd.jccari.getSelectedItem().equals("Lama Angsuran")){
            try {
                sql = "SELECT cicilan.kd_cicilan, pelanggan.nama, barang.merk, barang.tipe, cicilan.uang_muka, cicilan.sisa_harga, cicilan.lama_angsuran, cicilan.angsuran, cicilan.tanggal_daftar, cicilan.status FROM cicilan, pelanggan, barang WHERE pelanggan.nik = cicilan.nik AND barang.kd_barang = cicilan.kd_barang "
                        + "AND cicilan.lama_angsuran LIKE '%"+ cd.jtcari.getText() +"%'  ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    model.addRow(new Object[]{
                        res.getString("kd_cicilan"),
                        res.getString("nama"),
                        res.getString("merk"),
                        res.getString("tipe"),
                        res.getString("uang_muka"),
                        res.getString("sisa_harga"),
                        res.getString("lama_angsuran"),
                        res.getString("angsuran"),
                        res.getString("tanggal_daftar"),
                        res.getString("status")
                    });
                }
                cd.jtable.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (cd.jccari.getSelectedItem().equals("Angsuran")){
            try {
                sql = "SELECT cicilan.kd_cicilan, pelanggan.nama, barang.merk, barang.tipe, cicilan.uang_muka, cicilan.sisa_harga, cicilan.lama_angsuran, cicilan.angsuran, cicilan.tanggal_daftar, cicilan.status FROM cicilan, pelanggan, barang WHERE pelanggan.nik = cicilan.nik AND barang.kd_barang = cicilan.kd_barang "
                        + "AND cicilan.angsuran LIKE '%"+ cd.jtcari.getText() +"%'  ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    model.addRow(new Object[]{
                        res.getString("kd_cicilan"),
                        res.getString("nama"),
                        res.getString("merk"),
                        res.getString("tipe"),
                        res.getString("uang_muka"),
                        res.getString("sisa_harga"),
                        res.getString("lama_angsuran"),
                        res.getString("angsuran"),
                        res.getString("tanggal_daftar"),
                        res.getString("status")
                    });
                }
                cd.jtable.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (cd.jccari.getSelectedItem().equals("Tanggal Daftar")){
            try {
                sql = "SELECT cicilan.kd_cicilan, pelanggan.nama, barang.merk, barang.tipe, cicilan.uang_muka, cicilan.sisa_harga, cicilan.lama_angsuran, cicilan.angsuran, cicilan.tanggal_daftar, cicilan.status FROM cicilan, pelanggan, barang WHERE pelanggan.nik = cicilan.nik AND barang.kd_barang = cicilan.kd_barang "
                        + "AND cicilan.tanggal_daftar LIKE '%"+ cd.jtcari.getText() +"%'  ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    model.addRow(new Object[]{
                        res.getString("kd_cicilan"),
                        res.getString("nama"),
                        res.getString("merk"),
                        res.getString("tipe"),
                        res.getString("uang_muka"),
                        res.getString("sisa_harga"),
                        res.getString("lama_angsuran"),
                        res.getString("angsuran"),
                        res.getString("tanggal_daftar"),
                        res.getString("status")
                    });
                }
                cd.jtable.setModel(model);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Pilih Metode Pencarian!", "Informasi", JOptionPane.WARNING_MESSAGE);
        }
    }
    public void simpan(daftar_cicilan s){
        if (s.jtkode.getText().equals("") || s.jtnik.getText().equals("") || s.jtnamapelanggan.getText().equals("")
            || s.jtkodebarang.getText().equals("") || s.jtnamabarang.getText().equals("") || s.jthargabarang.getText().equals("")
            || s.jtuangmuka.getText().equals("") || s.jtsisaharga.getText().equals("") || s.jtlamanagsuran.getText().equals("")
            || s.jtangsuran.getText().equals("") || s.jdtanggaldaftar.getDate().equals("")){
            JOptionPane.showMessageDialog(null, "Tolong isi semua Field!", "Manajemen Barang", JOptionPane.WARNING_MESSAGE);
        } else {
           
            try {
                String kode = s.jtkode.getText();
                String nik = s.jtnik.getText();
                String kode_barang = s.jtkodebarang.getText();
                String uang_muka = s.jtuangmuka.getText();
                String sisa_harga = s.jtsisaharga.getText();
                String lama_angsuran = s.jtlamanagsuran.getText();
                String angsuran = s.jtangsuran.getText();
                String status = (String) s.jcstatus.getSelectedItem();
               
                
                SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
                String tanggal_daftar = date_format.format(s.jdtanggaldaftar.getDate());
                
               
                
                sql = "INSERT INTO cicilan (kd_cicilan, nik, kd_barang, uang_muka, sisa_harga, lama_angsuran, angsuran, tanggal_daftar, status) "
                        + " VALUES ('"+ kode +"', '"+ nik +"', '"+ kode_barang +"', '"+ uang_muka +"', '"+ sisa_harga +"', '"+ lama_angsuran +"', '"+ angsuran +"', '"+ tanggal_daftar +"', '"+ status +"')";
                stat = con.createStatement();
                stat.execute(sql);
                
                // Ask user after insertin data into table
                int pesan = JOptionPane.showConfirmDialog(null, "Data berhasil disimpan, tambah lagi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (pesan == JOptionPane.YES_OPTION){
                    bersih(s);
                    kd_oto(s);
                    tampil_data(s);
                    // s.jt.requestFocus();
                }else if(pesan == JOptionPane.NO_OPTION){
                    kunci(s);
                    bersih(s);
                    kd_oto(s);
                    tampil_data(s);
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Kesalahan terjadi pada Method Simpan!", JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
            
        }
    }
    public void ubah(daftar_cicilan u){
        int pesan = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan mengubah Data Cicilan ini?", "Konfirmasi Ubah Data", JOptionPane.YES_NO_OPTION);
        if(pesan == JOptionPane.YES_OPTION){
            
            try {
                String kode = u.jtkode.getText();
                String nik = u.jtnik.getText();
                String kode_barang = u.jtkodebarang.getText();
                String uang_muka = u.jtuangmuka.getText();
                String sisa_harga = u.jtsisaharga.getText();
                String lama_angsuran = u.jtlamanagsuran.getText();
                String angsuran = u.jtangsuran.getText();
                String status = (String) u.jcstatus.getSelectedItem();
               
                
                SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
                String tanggal_daftar = date_format.format(u.jdtanggaldaftar.getDate());
                
                sql = " UPDATE cicilan SET nik = '"+ nik +"', kd_barang = '"+ kode_barang +"', uang_muka = '"+ uang_muka +"', sisa_harga = '"+ sisa_harga +"', lama_angsuran = '"+ lama_angsuran +"', angsuran = '"+ angsuran +"', tanggal_daftar = '"+ tanggal_daftar +"', status = '"+ status +"' WHERE kd_cicilan = '"+ kode +"' ";
                stat = con.createStatement();
                stat.execute(sql);
                
                bersih(u);
                tampil_data(u);
                JOptionPane.showMessageDialog(null, "Data berhasil diubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                kd_oto(u);
                kunci(u);
                u.jbhapus.setEnabled(false);
                u.jbubah.setEnabled(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Kesalahan terjadi pada Method Ubah!", JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
            
        }else if(pesan == JOptionPane.NO_OPTION){
            bersih(u);
            kd_oto(u);
            kunci(u);
            u.jbhapus.setEnabled(false);
            u.jbubah.setEnabled(false);
        }
    }
    public void hapus(daftar_cicilan h){
        int pesan = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus Data Cicilan ini?", "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
        if(pesan == JOptionPane.YES_OPTION){
            
            try {
                sql = "DELETE FROM cicilan WHERE kd_cicilan = '"+ h.jtkode.getText() +"' ";
                stat = con.createStatement();
                stat.execute(sql);
                
                bersih(h);
                tampil_data(h);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                kd_oto(h);
                kunci(h);
                h.jbhapus.setEnabled(false);
                h.jbubah.setEnabled(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Kesalahan terjadi pada Method Hapus!", JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
            
        }else if(pesan == JOptionPane.NO_OPTION){
            bersih(h);
            kd_oto(h);
            kunci(h);
            h.jbhapus.setEnabled(false);
            h.jbubah.setEnabled(false);
        }
    }
}
