/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;
import form.user;
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
public class method_user {
    Connection con = new kredit_laptop.Kredit_laptop().getCon();
    Statement stat = null;
    ResultSet res = null;
    String sql = "";
    
    public void kunci(user k){
        // JTextBox Field
        k.jtkode.setEnabled(false);
        k.jtnamalengkap.setEnabled(false);
        k.jtusername.setEnabled(false);
        k.jppassword.setEnabled(false);
        k.jpkonfirmasipassword.setEnabled(false);
        k.jcstatus.setEnabled(false);
        
        // JButton
        k.jbtambah.setEnabled(true);
        k.jbbatal.setEnabled(false);
        k.jbsimpan.setEnabled(false);
        k.jbubah.setEnabled(false);
        k.jbhapus.setEnabled(false);
    }
    public void buka_kunci(user bk){
        // JTextBox Field
        bk.jtnamalengkap.requestFocus();
        bk.jtnamalengkap.setEnabled(true);
        bk.jtusername.setEnabled(true);
        bk.jppassword.setEnabled(true);
        bk.jpkonfirmasipassword.setEnabled(true);
        bk.jcstatus.setEnabled(true);
        
        // JButton
        bk.jbtambah.setEnabled(false);
        bk.jbbatal.setEnabled(true);
        bk.jbsimpan.setEnabled(true);
        bk.jbubah.setEnabled(false);
        bk.jbhapus.setEnabled(false);
    }
    public void bersih(user b){
        b.jtnamalengkap.setText("");
        b.jtusername.setText("");
        b.jppassword.setText("");
        b.jpkonfirmasipassword.setText("");
        b.jcstatus.setSelectedItem("--PILIHAN--");
    }
    public void tampil_data(user td){
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Kode User");
        table.addColumn("Nama Lengkap");
        table.addColumn("Username");
        table.addColumn("Status");
        
        try {
            sql = "SELECT kd_user, nama_lengkap, username, status FROM user";
            stat = con.createStatement();
            res = stat.executeQuery(sql);
            
            while(res.next()){
                table.addRow(new Object[] {
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4)
                });
            }
            
            td.jtable.setModel(table);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void klik_table(user kt){
        int row = kt.jtable.getSelectedRow();
        try {
            sql = "SELECT * FROM user WHERE kd_user = '"+ kt.jtable.getModel().getValueAt(row, 0) +"' ";
            stat = con.createStatement();
            res = stat.executeQuery(sql);
            
            if(res.next()){
                kt.jtkode.setText(res.getString(1));
                kt.jtnamalengkap.setText(res.getString(2));
                kt.jtusername.setText(res.getString(3));
                kt.jppassword.setText(res.getString(4));
                kt.jpkonfirmasipassword.setText(res.getString(4));
                kt.jcstatus.setSelectedItem(res.getString(5));
            }
            // JTextBox Field
            kt.jtnamalengkap.requestFocus();
            kt.jtnamalengkap.setEnabled(true);
            kt.jtusername.setEnabled(true);
            kt.jppassword.setEnabled(true);
            kt.jpkonfirmasipassword.setEnabled(true);
            kt.jcstatus.setEnabled(true);

            // JButton
            kt.jbtambah.setEnabled(false);
            kt.jbbatal.setEnabled(true);
            kt.jbsimpan.setEnabled(false);
            kt.jbhapus.setEnabled(true);
            kt.jbubah.setEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void kd_oto(user ko){
        try {
            sql = "SELECT * FROM user ORDER BY kd_user DESC";
            stat = con.createStatement();
            res = stat.executeQuery(sql);
            
            if(res.next()){
                String kd_user = res.getString("kd_user").substring(1);
                String an = "" + (Integer.parseInt(kd_user)+1);
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
                ko.jtkode.setText("U" + nol + an);
            } else {
                ko.jtkode.setText("U00001");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Kesalahan terjadi pada Kode Otomatis!", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
    // CRUD OPERATION
    
    public void simpan(user s){
        if (s.jtkode.getText().equals("") || s.jtnamalengkap.getText().equals("") || s.jtusername.getText().equals("")
            || s.jppassword.getText().equals("") || s.jpkonfirmasipassword.getText().equals("") || s.jcstatus.getSelectedItem().equals("--PILIHAN--")){
            JOptionPane.showMessageDialog(null, "Tolong isi semua Field!", "Manajemen User", JOptionPane.WARNING_MESSAGE);
        } else if( !(s.jppassword.getText().equals(s.jpkonfirmasipassword.getText())) ){
               JOptionPane.showMessageDialog(null, "Password dan Konfirmasi Password harus sama!", "Manajemen User", JOptionPane.WARNING_MESSAGE);
        } else {
           
            try {
                String kode = s.jtkode.getText();
                String nama_lengkap = s.jtnamalengkap.getText();
                String username = s.jtusername.getText();
                String password = s.jppassword.getText();
                String status = (String) s.jcstatus.getSelectedItem();
                
                
                
                sql = "INSERT INTO user (kd_user, nama_lengkap, username, password, status) "
                        + " VALUES ('"+ kode +"', '"+ nama_lengkap +"', '"+ username +"', '"+ password +"', '"+ status +"')";
                stat = con.createStatement();
                stat.execute(sql);
                
                // Ask user after insertin data into table
                int pesan = JOptionPane.showConfirmDialog(null, "Data berhasil disimpan, tambah lagi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (pesan == JOptionPane.YES_OPTION){
                    bersih(s);
                    tampil_data(s);
                    kd_oto(s);
                    s.jtnamalengkap.requestFocus();
                }else if(pesan == JOptionPane.NO_OPTION){
                    kunci(s);
                    bersih(s);
                    tampil_data(s);
                    kd_oto(s);
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Kesalahan terjadi pada Method Simpan!", JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
            
        }
    }
    public void hapus(user h){
        int pesan = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus Data User ini?", "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
        if(pesan == JOptionPane.YES_OPTION){
            
            try {
                sql = "DELETE FROM user WHERE kd_user = '"+ h.jtkode.getText() +"' ";
                stat = con.createStatement();
                stat.execute(sql);
                
                bersih(h);
                tampil_data(h);
                kd_oto(h);
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
            kd_oto(h);
            h.jbhapus.setEnabled(false);
            h.jbubah.setEnabled(false);
        }
    }
    public void ubah(user u){
        int pesan = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan mengubah Data user ini?", "Konfirmasi Ubah Data", JOptionPane.YES_NO_OPTION);
        if(pesan == JOptionPane.YES_OPTION){
            
            if( !(u.jppassword.getText().equals(u.jpkonfirmasipassword.getText())) ){
               JOptionPane.showMessageDialog(null, "Password dan Konfirmasi Password harus sama!", "Manajemen User", JOptionPane.WARNING_MESSAGE);
            }else{
                    try {
                    String kode = u.jtkode.getText();
                    String nama_lengkap = u.jtnamalengkap.getText();
                    String username = u.jtusername.getText();
                    String password = u.jppassword.getText();
                    String status = (String) u.jcstatus.getSelectedItem();


                    sql = " UPDATE user SET nama_lengkap = '"+ nama_lengkap +"', username = '"+ username +"', password = '"+ password +"', status = '"+ status +"' WHERE kd_user = '"+ kode +"' ";
                    stat = con.createStatement();
                    stat.execute(sql);

                    bersih(u);
                    tampil_data(u);
                    kd_oto(u);
                    JOptionPane.showMessageDialog(null, "Data berhasil diubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    kunci(u);
                    u.jbhapus.setEnabled(false);
                    u.jbubah.setEnabled(false);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e, "Kesalahan terjadi pada Method Ubah!", JOptionPane.ERROR_MESSAGE);
                    System.out.println(e);
                }
            }
            
        }else if(pesan == JOptionPane.NO_OPTION){
            bersih(u);
            kunci(u);
            kd_oto(u);
            u.jbhapus.setEnabled(false);
            u.jbubah.setEnabled(false);
        }
    }
    // SEARCHING DATA
    public void cari_data(user cd){
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Kode User");
        table.addColumn("Nama Lengkap");
        table.addColumn("Username");
        table.addColumn("Status");
        
        if (cd.jccari.getSelectedItem().equals("Kode")){
            try {
                    sql = "SELECT kd_user, nama_lengkap, username, status FROM user WHERE kd_user LIKE '%"+ cd.jtcari.getText() +"%' ";
                    stat = con.createStatement();
                    res = stat.executeQuery(sql);

                while(res.next()){
                    table.addRow(new Object[] {
                        res.getString(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(cd.jccari.getSelectedItem().equals("Nama")){
                try {
                    sql = "SELECT kd_user, nama_lengkap, username, status FROM user WHERE nama_lengkap LIKE '%"+ cd.jtcari.getText() +"%' ";
                    stat = con.createStatement();
                    res = stat.executeQuery(sql);

                while(res.next()){
                    table.addRow(new Object[] {
                        res.getString(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(cd.jccari.getSelectedItem().equals("Username")){
            try {
                sql = "SELECT kd_user, nama_lengkap, username, status FROM user WHERE username LIKE '%"+ cd.jtcari.getText() +"%' ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    table.addRow(new Object[] {
                        res.getString(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(cd.jccari.getSelectedItem().equals("Status")){
            try {
                sql = "SELECT kd_user, nama_lengkap, username, status FROM user WHERE status LIKE '%"+ cd.jtcari.getText() +"%' ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);

                while(res.next()){
                    table.addRow(new Object[] {
                        res.getString(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
