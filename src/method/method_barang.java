/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import form.barang;
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
public class method_barang {
    Connection con = new kredit_laptop.Kredit_laptop().getCon();
    Statement stat = null;
    ResultSet res = null;
    String sql = "";
    
    public void kunci(barang k){
        // JTextBox Field
        k.jtmerk.setEnabled(false);
        k.jttipe.setEnabled(false);
        k.jtram.setEnabled(false);
        k.jtprosesor.setEnabled(false);
        k.jtvga.setEnabled(false);
        k.jtstorage.setEnabled(false);
        k.jtbaterai.setEnabled(false);
        k.jdtahunrilis.setEnabled(false);
        k.jtharga.setEnabled(false);
        k.jtstok.setEnabled(false);
        
        // JButton
        k.jbtambah.setEnabled(true);
        k.jbbatal.setEnabled(false);
        k.jbsimpan.setEnabled(false);
        k.jbubah.setEnabled(false);
        k.jbhapus.setEnabled(false);
    }
    public void buka_kunci(barang bk){
        // JTextField
        bk.jtmerk.setEnabled(true);
        bk.jtmerk.requestFocus();
        bk.jttipe.setEnabled(true);
        bk.jtram.setEnabled(true);
        bk.jtprosesor.setEnabled(true);
        bk.jtvga.setEnabled(true);
        bk.jtstorage.setEnabled(true);
        bk.jtbaterai.setEnabled(true);
        bk.jdtahunrilis.setEnabled(true);
        bk.jtharga.setEnabled(true);
        bk.jtstok.setEnabled(true);
        
        // JButton
        bk.jbtambah.setEnabled(false);
        bk.jbbatal.setEnabled(true);
        bk.jbsimpan.setEnabled(true);
        bk.jbubah.setEnabled(false);
        bk.jbhapus.setEnabled(false);
    }
    public void bersih(barang b){
        // JTextField
        b.jtmerk.setText("");
        b.jttipe.setText("");
        b.jtram.setText("");
        b.jtprosesor.setText("");
        b.jtvga.setText("");
        b.jtstorage.setText("");
        b.jtbaterai.setText("");
        b.jdtahunrilis.setDate(null);
        b.jtharga.setText("");
        b.jtstok.setText("");
    }
    public void tampil_data(barang td){
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Kode Barang");
        table.addColumn("Merk");
        table.addColumn("Tipe");
        table.addColumn("RAM");
        table.addColumn("Prosesor");
        table.addColumn("VGA");
        table.addColumn("Storage");
        table.addColumn("Baterai");
        table.addColumn("Tahun Rilis");
        table.addColumn("Harga");
        table.addColumn("Stok");
        
        try {
            sql = "SELECT * FROM barang";
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
                    res.getString(7),
                    res.getString(8),
                    res.getString(9),
                    res.getString(10),
                    res.getString(11)
                });
            }
            
            td.jtable.setModel(table);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void kd_oto(barang ko){
        try {
            sql = "SELECT * FROM barang ORDER BY kd_barang DESC";
            stat = con.createStatement();
            res = stat.executeQuery(sql);
            
            if(res.next()){
                String kd_barang = res.getString("kd_barang").substring(1);
                String an = "" + (Integer.parseInt(kd_barang)+1);
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
                ko.jtkode.setText("B" + nol + an);
            } else {
                ko.jtkode.setText("B00001");
            }
        } catch (Exception e) {
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
    public void klik_table(barang kt){
        try {
            int row = kt.jtable.getSelectedRow();
            
            kt.jtkode.setText(kt.jtable.getModel().getValueAt(row, 0).toString());
            kt.jtmerk.setText(kt.jtable.getModel().getValueAt(row, 1).toString());
            kt.jttipe.setText(kt.jtable.getModel().getValueAt(row, 2).toString());
            kt.jtram.setText(kt.jtable.getModel().getValueAt(row, 3).toString());
            kt.jtprosesor.setText(kt.jtable.getModel().getValueAt(row, 4).toString());
            kt.jtvga.setText(kt.jtable.getModel().getValueAt(row, 5).toString());
            kt.jtstorage.setText(kt.jtable.getModel().getValueAt(row, 6).toString());
            kt.jtbaterai.setText(kt.jtable.getModel().getValueAt(row, 7).toString());
            kt.jdtahunrilis.setDate(getTanggal(kt.jtable, 8));
            kt.jtharga.setText(kt.jtable.getModel().getValueAt(row, 9).toString());
            kt.jtstok.setText(kt.jtable.getModel().getValueAt(row, 10).toString());
            
            kt.jtmerk.setEnabled(true);
            kt.jtmerk.requestFocus();
            kt.jttipe.setEnabled(true);
            kt.jtram.setEnabled(true);
            kt.jtprosesor.setEnabled(true);
            kt.jtvga.setEnabled(true);
            kt.jtstorage.setEnabled(true);
            kt.jtbaterai.setEnabled(true);
            kt.jdtahunrilis.setEnabled(true);
            kt.jtharga.setEnabled(true);
            kt.jtstok.setEnabled(true);
            
            kt.jbtambah.setEnabled(false);
            kt.jbbatal.setEnabled(true);
            kt.jbsimpan.setEnabled(false);
            kt.jbhapus.setEnabled(true);
            kt.jbubah.setEnabled(true);
            
        } catch (Exception e) {
        }
    }
    
    // CRUD OPERATION
    public void simpan(barang s){
        if (s.jtmerk.getText().equals("") || s.jttipe.getText().equals("") || s.jtram.getText().equals("")
            || s.jtprosesor.getText().equals("") || s.jtvga.getText().equals("") || s.jtstorage.getText().equals("")
            || s.jtbaterai.getText().equals("") || s.jdtahunrilis.getDate().equals("") || s.jtharga.getText().equals("")
            || s.jtharga.getText().equals("") || s.jtstok.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Tolong isi semua Field!", "Manajemen Barang", JOptionPane.WARNING_MESSAGE);
        } else {
           
            try {
                String kode = s.jtkode.getText();
                String merk = s.jtmerk.getText();
                String tipe = s.jttipe.getText();
                String ram = s.jtram.getText();
                String prosesor = s.jtprosesor.getText();
                String vga = s.jtvga.getText();
                String storage = s.jtstorage.getText();
                String baterai = s.jtbaterai.getText();
                
                SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
                String tahun_rilis = date_format.format(s.jdtahunrilis.getDate());
                
                String harga = s.jtharga.getText();
                String stok = s.jtstok.getText();
                
                sql = "INSERT INTO barang (kd_barang, merk, tipe, ram, prosesor, vga, storage, baterai, tahun_rilis, harga, stok) "
                        + " VALUES ('"+ kode +"', '"+ merk +"', '"+ tipe +"', '"+ ram +"', '"+ prosesor +"', '"+ vga +"', '"+ storage +"', '"+ baterai +"', '"+ tahun_rilis +"', '"+ harga +"','"+ stok +"')";
                stat = con.createStatement();
                stat.execute(sql);
                
                // Ask user after insertin data into table
                int pesan = JOptionPane.showConfirmDialog(null, "Data berhasil disimpan, tambah lagi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (pesan == JOptionPane.YES_OPTION){
                    bersih(s);
                    kd_oto(s);
                    tampil_data(s);
                    s.jtmerk.requestFocus();
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
    public void hapus(barang h){
        int pesan = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus Data barang ini?", "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
        if(pesan == JOptionPane.YES_OPTION){
            
            try {
                sql = "DELETE FROM barang WHERE kd_barang = '"+ h.jtkode.getText() +"' ";
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
    public void ubah(barang u){
        int pesan = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan mengubah Data barang ini?", "Konfirmasi Ubah Data", JOptionPane.YES_NO_OPTION);
        if(pesan == JOptionPane.YES_OPTION){
            
            try {
                String kode = u.jtkode.getText();
                String merk = u.jtmerk.getText();
                String tipe = u.jttipe.getText();
                String ram = u.jtram.getText();
                String prosesor = u.jtprosesor.getText();
                String vga = u.jtvga.getText();
                String storage = u.jtstorage.getText();
                String baterai = u.jtbaterai.getText();
                
                SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
                String tahun_rilis = date_format.format(u.jdtahunrilis.getDate());
                
                String harga = u.jtharga.getText();
                String stok = u.jtstok.getText();
                
                sql = " UPDATE barang SET merk = '"+ merk +"', tipe = '"+ tipe +"', ram = '"+ ram +"', prosesor = '"+ prosesor +"', vga = '"+ vga +"', storage = '"+ storage +"', baterai = '"+ baterai +"', tahun_rilis = '"+ tahun_rilis +"', harga = '"+ harga +"', stok = '"+  stok+"' WHERE kd_barang = '"+ kode +"' ";
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
    
    //SEARCHING DATA
    public void cari_data(barang cd){
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Kode Barang");
        table.addColumn("Merk");
        table.addColumn("Tipe");
        table.addColumn("RAM");
        table.addColumn("Prosesor");
        table.addColumn("VGA");
        table.addColumn("Storage");
        table.addColumn("Baterai");
        table.addColumn("Tahun Rilis");
        table.addColumn("Harga");
        table.addColumn("Stok");
        
        if (cd.jccari.getSelectedItem().equals("Kode")){
            try {
                sql = "SELECT * FROM barang WHERE kd_barang LIKE '%"+ cd.jtcari.getText() +"%' ";
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
                        res.getString(7),
                        res.getString(8),
                        res.getString(9),
                        res.getString(10),
                        res.getString(11)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if (cd.jccari.getSelectedItem().equals("Merk")){
            try {
                sql = "SELECT * FROM barang WHERE merk LIKE '%"+ cd.jtcari.getText() +"%' ";
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
                        res.getString(7),
                        res.getString(8),
                        res.getString(9),
                        res.getString(10),
                        res.getString(11)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if (cd.jccari.getSelectedItem().equals("Tipe")){
            try {
                sql = "SELECT * FROM barang WHERE tipe LIKE '%"+ cd.jtcari.getText() +"%' ";
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
                        res.getString(7),
                        res.getString(8),
                        res.getString(9),
                        res.getString(10),
                        res.getString(11)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if (cd.jccari.getSelectedItem().equals("RAM")){
            try {
                sql = "SELECT * FROM barang WHERE ram LIKE '%"+ cd.jtcari.getText() +"%' ";
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
                        res.getString(7),
                        res.getString(8),
                        res.getString(9),
                        res.getString(10),
                        res.getString(11)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if (cd.jccari.getSelectedItem().equals("Prosesor")){
            try {
                sql = "SELECT * FROM barang WHERE prosesor LIKE '%"+ cd.jtcari.getText() +"%' ";
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
                        res.getString(7),
                        res.getString(8),
                        res.getString(9),
                        res.getString(10),
                        res.getString(11)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if (cd.jccari.getSelectedItem().equals("VGA")){
            try {
                sql = "SELECT * FROM barang WHERE vga LIKE '%"+ cd.jtcari.getText() +"%' ";
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
                        res.getString(7),
                        res.getString(8),
                        res.getString(9),
                        res.getString(10),
                        res.getString(11)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if (cd.jccari.getSelectedItem().equals("Storage")){
            try {
                sql = "SELECT * FROM barang WHERE storage LIKE '%"+ cd.jtcari.getText() +"%' ";
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
                        res.getString(7),
                        res.getString(8),
                        res.getString(9),
                        res.getString(10),
                        res.getString(11)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if (cd.jccari.getSelectedItem().equals("Baterai")){
            try {
                sql = "SELECT * FROM barang WHERE baterai LIKE '%"+ cd.jtcari.getText() +"%' ";
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
                        res.getString(7),
                        res.getString(8),
                        res.getString(9),
                        res.getString(10),
                        res.getString(11)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if (cd.jccari.getSelectedItem().equals("Tahun Rilis")){
            try {
                sql = "SELECT * FROM barang WHERE tahun_rilis LIKE '%"+ cd.jtcari.getText() +"%' ";
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
                        res.getString(7),
                        res.getString(8),
                        res.getString(9),
                        res.getString(10),
                        res.getString(11)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if (cd.jccari.getSelectedItem().equals("Harga")){
            try {
                sql = "SELECT * FROM barang WHERE harga LIKE '%"+ cd.jtcari.getText() +"%' ";
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
                        res.getString(7),
                        res.getString(8),
                        res.getString(9),
                        res.getString(10),
                        res.getString(11)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if (cd.jccari.getSelectedItem().equals("Stok")){
            try {
                sql = "SELECT * FROM barang WHERE stok LIKE '%"+ cd.jtcari.getText() +"%' ";
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
                        res.getString(7),
                        res.getString(8),
                        res.getString(9),
                        res.getString(10),
                        res.getString(11)
                    });
                }

                cd.jtable.setModel(table);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
