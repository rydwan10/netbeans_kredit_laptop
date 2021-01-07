/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;
import form.login;
import form.menu_utama;
import kredit_laptop.Kredit_laptop;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author Muhammad Rydwan
 */
public class method_login {
    Connection con = new Kredit_laptop().getCon();
    Statement stat = null;
    ResultSet res = null;
    String sql = "";
    
    public void login(login l){
         if (l.jtusername.getText().isEmpty() || l.jppassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Username dan Password tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                sql = "SELECT * FROM user WHERE username = '"+ l.jtusername.getText() +"' ";
                stat = con.createStatement();
                res = stat.executeQuery(sql);
                
                if (res.next()){
                    if(l.jppassword.getText().equals(res.getString("password"))){
                        
                        String status = res.getString("status");
                        String nama = res.getString("nama_lengkap");
                        
                        JOptionPane.showMessageDialog(null, "Selamat Datang");
                        new menu_utama(status, nama).setVisible(true);
                        l.dispose();
                        
                    }else{
                        int pesan = JOptionPane.showConfirmDialog(null, "Username atau Password salah! Ulangi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                        
                        if (pesan == JOptionPane.YES_OPTION){
                            l.jppassword.setText("");
                            l.jppassword.requestFocus();
                        }else{
                            System.exit(0);
                        }
                    }
                }else{
                    int pesan = JOptionPane.showConfirmDialog(null, "Username atau Password tidak ditemukan! Ulangi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                        
                        if (pesan == JOptionPane.YES_OPTION){
                            l.jtusername.setText("");
                            l.jppassword.setText("");
                            l.jtusername.requestFocus();
                        }else{
                            System.exit(0);
                        }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }
  }
