/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;
import form.pelanggan;
import java.sql.Connection;
import java.sql.ResultSet;
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
public class method_pelanggan {
    Connection con = new kredit_laptop.Kredit_laptop().getCon();
    Statement stat = null;
    ResultSet res = null;
    String sql = "";
    
    public void kunci(pelanggan k){
        // JTextBox Field
        k.jtnik.setEnabled(false);
        k.jtnama.setEnabled(false);
        k.jttelepon.setEnabled(false);
        k.jtemail.setEnabled(false);
        k.jtalamat.setEnabled(false);
        k.jtpekerjaan.setEnabled(false);
        k.jtketerangan.setEnabled(false);
        
        // JButton
        k.jbtambah.setEnabled(true);
        k.jbbatal.setEnabled(false);
        k.jbsimpan.setEnabled(false);
        k.jbubah.setEnabled(false);
        k.jbhapus.setEnabled(false);
    }
    public void buka_kunci(pelanggan bk){
        // JTextBox Field
        bk.jtnik.setEnabled(true);
        bk.jtnik.requestFocus();
        bk.jtnama.setEnabled(true);
        bk.jttelepon.setEnabled(true);
        bk.jtemail.setEnabled(true);
        bk.jtalamat.setEnabled(true);
        bk.jtpekerjaan.setEnabled(true);
        bk.jtketerangan.setEnabled(true);
        
        // JButton
        bk.jbtambah.setEnabled(false);
        bk.jbbatal.setEnabled(true);
        bk.jbsimpan.setEnabled(true);
        bk.jbubah.setEnabled(false);
        bk.jbhapus.setEnabled(false);
    }
    public void bersih(pelanggan b){
        b.jtnik.setText("");
        b.jtnama.setText("");
        b.jttelepon.setText("");
        b.jtemail.setText("");
        b.jtalamat.setText("");
        b.jtpekerjaan.setText("");
        b.jtketerangan.setText("");
    }
    public void tampil_data(pelanggan td){
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("NIK");
        table.addColumn("Nama");
        table.addColumn("Telepon");
        table.addColumn("Email");
        table.addColumn("Alamat");
        table.addColumn("Pekerjaan");
        table.addColumn("Keterangan");
        
        
        try {
            sql = "SELECT * FROM pelanggan";
            stat = con.createStatement();
            res = stat.executeQuery(sql);
            
            while(res.next()){
                table.addRow(new Object[] {
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getString(5),
                    res.getString(6),
                    res.getString(7)
                });
            }
            
            td.jtable.setModel(table);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void klik_table(pelanggan kt){
        try {
            int row = kt.jtable.getSelectedRow();
            
            kt.jtnik.setText(kt.jtable.getModel().getValueAt(row, 0).toString());
            kt.jtnama.setText(kt.jtable.getModel().getValueAt(row, 1).toString());
            kt.jttelepon.setText(kt.jtable.getModel().getValueAt(row, 2).toString());
            kt.jtemail.setText(kt.jtable.getModel().getValueAt(row, 3).toString());
            kt.jtalamat.setText(kt.jtable.getModel().getValueAt(row, 4).toString());
            kt.jtpekerjaan.setText(kt.jtable.getModel().getValueAt(row, 5).toString());
            kt.jtketerangan.setText(kt.jtable.getModel().getValueAt(row, 6).toString());
            
            kt.jtnik.setEnabled(true);
            kt.jtnik.requestFocus();
            kt.jtnama.setEnabled(true);
            kt.jttelepon.setEnabled(true);
            kt.jtemail.setEnabled(true);
            kt.jtalamat.setEnabled(true);
            kt.jtpekerjaan.setEnabled(true);
            kt.jtketerangan.setEnabled(true);
            
            kt.jbtambah.setEnabled(false);
            kt.jbbatal.setEnabled(true);
            kt.jbsimpan.setEnabled(false);
            kt.jbhapus.setEnabled(true);
            kt.jbubah.setEnabled(true);
            
        } catch (Exception e) {
        }
    }
    
    // CRUD OPERATION
    
    public void simpan(pelanggan s){
        if (s.jtnik.getText().equals("") || s.jtnama.getText().equals("") || s.jttelepon.getText().equals("")
            || s.jtemail.getText().equals("") || s.jtalamat.getText().equals("") || s.jtpekerjaan.getText().equals("") || s.jtketerangan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Tolong isi semua Field!", "Manajemen Pelanggan", JOptionPane.WARNING_MESSAGE);
        } else {
           
            try {
                String nik = s.jtnik.getText();
                String nama = s.jtnama.getText();
                String telepon = s.jttelepon.getText();
                String email = s.jtemail.getText();
                String alamat = s.jtalamat.getText();
                String pekerjaan = s.jtpekerjaan.getText();
                String keterangan = s.jtketerangan.getText();
                
                
                sql = "INSERT INTO pelanggan (nik, nama, telepon, email, alamat, pekerjaan, keterangan) "
                        + " VALUES ('"+ nik +"', '"+ nama +"', '"+ telepon +"', '"+ email +"', '"+ alamat +"', '"+ pekerjaan +"', '"+ keterangan +"')";
                stat = con.createStatement();
                stat.execute(sql);
                
                // Ask user after insertin data into table
                int pesan = JOptionPane.showConfirmDialog(null, "Data berhasil disimpan, tambah lagi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (pesan == JOptionPane.YES_OPTION){
                    bersih(s);
                    tampil_data(s);
                    s.jtnik.requestFocus();
                }else if(pesan == JOptionPane.NO_OPTION){
                    kunci(s);
                    bersih(s);
                    tampil_data(s);
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Kesalahan terjadi pada Method Simpan!", JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
            
        }
    }
    public void hapus(pelanggan h){
        int pesan = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus Data pelanggan ini?", "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
        if(pesan == JOptionPane.YES_OPTION){
            
            try {
                sql = "DELETE FROM pelanggan WHERE nik = '"+ h.jtnik.getText() +"' ";
                stat = con.createStatement();
                stat.execute(sql);
                
                bersih(h);
                tampil_data(h);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                kunci(h);
                h.jbhapus.setEnabled(false);
                h.jbubah.setEnabled(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Kesalahan terjadi pada Method Hapus!", JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
            
        }else if(pesan == JOptionPane.NO_OPTION){
            bersih(h);
            kunci(h);
            h.jbhapus.setEnabled(false);
            h.jbubah.setEnabled(false);
        }
    }
    public void ubah(pelanggan u){
        int pesan = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan mengubah Data pelanggan ini?", "Konfirmasi Ubah Data", JOptionPane.YES_NO_OPTION);
        if(pesan == JOptionPane.YES_OPTION){
            
            try {
                String nik = u.jtnik.getText();
                String nama = u.jtnama.getText();
                String telepon = u.jttelepon.getText();
                String email = u.jtemail.getText();
                String alamat = u.jtalamat.getText();
                String pekerjaan = u.jtpekerjaan.getText();
                String keterangan = u.jtketerangan.getText();
                
                int row = u.jtable.getSelectedRow();
                String nik_table = u.jtable.getModel().getValueAt(row, 0).toString();
                
                sql = " UPDATE pelanggan SET nik = '"+ nik +"', nama = '"+ nama +"', telepon = '"+ telepon +"', email = '"+ email +"', alamat = '"+ alamat +"', pekerjaan = '"+ pekerjaan +"', keterangan = '"+ keterangan +"' WHERE nik = '"+ nik_table +"' ";
                stat = con.createStatement();
                stat.execute(sql);
                
                bersih(u);
                tampil_data(u);
                JOptionPane.showMessageDialog(null, "Data berhasil diubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                kunci(u);
                u.jbhapus.setEnabled(false);
                u.jbubah.setEnabled(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Kesalahan terjadi pada Method Ubah!", JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
            
        }else if(pesan == JOptionPane.NO_OPTION){
            bersih(u);
            kunci(u);
            u.jbhapus.setEnabled(false);
            u.jbubah.setEnabled(false);
        }
    }
    
    // SEARCHING DATA
    public void cari_data(pelanggan cd){
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("NIK");
        table.addColumn("Nama");
        table.addColumn("Telepon");
        table.addColumn("Email");
        table.addColumn("Alamat");
        table.addColumn("Pekerjaan");
        table.addColumn("Keterangan");
        
        
        if (cd.jccari.getSelectedItem().equals("NIK")){
            try {
                sql = "SELECT * FROM pelanggan WHERE nik LIKE '%"+ cd.jtcari.getText() +"%' ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    table.addRow(new Object[] {
                        res.getString(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4),
                        res.getString(5),
                        res.getString(6),
                        res.getString(7)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(cd.jccari.getSelectedItem().equals("Nama")){
            try {
                sql = "SELECT * FROM pelanggan WHERE nama LIKE '%"+ cd.jtcari.getText() +"%' ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    table.addRow(new Object[] {
                        res.getString(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4),
                        res.getString(5),
                        res.getString(6),
                        res.getString(7)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(cd.jccari.getSelectedItem().equals("Telepon")){
            try {
                sql = "SELECT * FROM pelanggan WHERE telepon LIKE '%"+ cd.jtcari.getText() +"%' ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    table.addRow(new Object[] {
                        res.getString(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4),
                        res.getString(5),
                        res.getString(6),
                        res.getString(7)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(cd.jccari.getSelectedItem().equals("Email")){
            try {
                sql = "SELECT * FROM pelanggan WHERE email LIKE '%"+ cd.jtcari.getText() +"%' ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    table.addRow(new Object[] {
                        res.getString(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4),
                        res.getString(5),
                        res.getString(6),
                        res.getString(7)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(cd.jccari.getSelectedItem().equals("Alamat")){
            try {
                sql = "SELECT * FROM pelanggan WHERE alamat LIKE '%"+ cd.jtcari.getText() +"%' ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    table.addRow(new Object[] {
                        res.getString(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4),
                        res.getString(5),
                        res.getString(6),
                        res.getString(7)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(cd.jccari.getSelectedItem().equals("Pekerjaan")){
            try {
                sql = "SELECT * FROM pelanggan WHERE pekerjaan LIKE '%"+ cd.jtcari.getText() +"%' ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    table.addRow(new Object[] {
                        res.getString(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4),
                        res.getString(5),
                        res.getString(6),
                        res.getString(7)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(cd.jccari.getSelectedItem().equals("Keterangan")){
            try {
                sql = "SELECT * FROM pelanggan WHERE keterangan LIKE '%"+ cd.jtcari.getText() +"%' ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    table.addRow(new Object[] {
                        res.getString(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4),
                        res.getString(5),
                        res.getString(6),
                        res.getString(7)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
