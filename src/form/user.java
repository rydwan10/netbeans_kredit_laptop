/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;
import method.method_user;
/**
 *
 * @author Muhammad Rydwan
 */
public class user extends javax.swing.JFrame {

    /**
     * Creates new form user
     */
    public user() {
        initComponents();
        this.jtkode.setEnabled(false);
        new method_user().kunci(this);
        new method_user().tampil_data(this);
        new method_user().bersih(this);
        new method_user().kd_oto(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jbtambah = new javax.swing.JButton();
        jbbatal = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jtkode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtnamalengkap = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtusername = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jbsimpan = new javax.swing.JButton();
        jbubah = new javax.swing.JButton();
        jbhapus = new javax.swing.JButton();
        jccari = new javax.swing.JComboBox<>();
        jtcari = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jpkonfirmasipassword = new javax.swing.JPasswordField();
        jppassword = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        jcstatus = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jblaporan = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel10.setText("Manajemen User");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jbtambah.setBackground(new java.awt.Color(217, 197, 5));
        jbtambah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtambah.setForeground(new java.awt.Color(255, 255, 255));
        jbtambah.setText("Tambah");
        jbtambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtambahActionPerformed(evt);
            }
        });
        getContentPane().add(jbtambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 90, 30));

        jbbatal.setBackground(new java.awt.Color(217, 197, 5));
        jbbatal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbbatal.setForeground(new java.awt.Color(255, 255, 255));
        jbbatal.setText("Batal");
        jbbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbatalActionPerformed(evt);
            }
        });
        getContentPane().add(jbbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 90, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setText("Kode User");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jtkode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtkode.setText("jTextField1");
        getContentPane().add(jtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 126, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Nama Lengkap");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jtnamalengkap.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtnamalengkap.setText("jTextField5");
        jtnamalengkap.setNextFocusableComponent(jtusername);
        getContentPane().add(jtnamalengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 210, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel12.setText("Username");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jtusername.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtusername.setText("jTextField5");
        jtusername.setNextFocusableComponent(jppassword);
        getContentPane().add(jtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 210, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel14.setText("Password");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 1110, 360));

        jButton2.setBackground(new java.awt.Color(217, 197, 5));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 90, 30));

        jbsimpan.setBackground(new java.awt.Color(217, 197, 5));
        jbsimpan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbsimpan.setForeground(new java.awt.Color(255, 255, 255));
        jbsimpan.setText("Simpan");
        jbsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(jbsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 90, 40));

        jbubah.setBackground(new java.awt.Color(217, 197, 5));
        jbubah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbubah.setForeground(new java.awt.Color(255, 255, 255));
        jbubah.setText("Ubah");
        jbubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbubahActionPerformed(evt);
            }
        });
        getContentPane().add(jbubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, 90, 40));

        jbhapus.setBackground(new java.awt.Color(217, 197, 5));
        jbhapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbhapus.setForeground(new java.awt.Color(255, 51, 51));
        jbhapus.setText("Hapus");
        jbhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbhapusActionPerformed(evt);
            }
        });
        getContentPane().add(jbhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 210, 90, 40));

        jccari.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jccari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIHAN--", "Kode", "Nama", "Username", "Status" }));
        getContentPane().add(jccari, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 130, -1));

        jtcari.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcariActionPerformed(evt);
            }
        });
        getContentPane().add(jtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 290, 210, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel22.setText("Cari");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, -1, -1));

        jpkonfirmasipassword.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jpkonfirmasipassword.setText("jPasswordField1");
        jpkonfirmasipassword.setNextFocusableComponent(jcstatus);
        getContentPane().add(jpkonfirmasipassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 210, -1));

        jppassword.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jppassword.setText("jPasswordField1");
        jppassword.setNextFocusableComponent(jpkonfirmasipassword);
        getContentPane().add(jppassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 210, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel16.setText("Konfirmasi Password");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jcstatus.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jcstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIHAN--", "admin", "user", " " }));
        getContentPane().add(jcstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 150, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel17.setText("Status / Level");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        jblaporan.setBackground(new java.awt.Color(217, 197, 5));
        jblaporan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jblaporan.setForeground(new java.awt.Color(255, 255, 255));
        jblaporan.setText("Laporan");
        jblaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblaporanActionPerformed(evt);
            }
        });
        getContentPane().add(jblaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 100, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/bt-pattern-user.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtambahActionPerformed
        // TODO add your handling code here:
        new method_user().buka_kunci(this);
        new method_user().kd_oto(this);
    }//GEN-LAST:event_jbtambahActionPerformed

    private void jbbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbatalActionPerformed
        // TODO add your handling code here:
        new method_user().kunci(this);
        new method_user().bersih(this);
        new method_user().kd_oto(this);
        this.jtnamalengkap.requestFocus();
    }//GEN-LAST:event_jbbatalActionPerformed

    private void jtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableMouseClicked
        // TODO add your handling code here:
        new method_user().klik_table(this);
    }//GEN-LAST:event_jtableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsimpanActionPerformed
        // TODO add your handling code here:
        new method_user().simpan(this);
    }//GEN-LAST:event_jbsimpanActionPerformed

    private void jbubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbubahActionPerformed
        // TODO add your handling code here:
        new method_user().ubah(this);
    }//GEN-LAST:event_jbubahActionPerformed

    private void jbhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbhapusActionPerformed
        // TODO add your handling code here:
        new method_user().hapus(this);
    }//GEN-LAST:event_jbhapusActionPerformed

    private void jtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcariActionPerformed
        // TODO add your handling code here:
        new method_user().cari_data(this);
    }//GEN-LAST:event_jtcariActionPerformed

    private void jblaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblaporanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jblaporanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbbatal;
    public javax.swing.JButton jbhapus;
    public javax.swing.JButton jblaporan;
    public javax.swing.JButton jbsimpan;
    public javax.swing.JButton jbtambah;
    public javax.swing.JButton jbubah;
    public javax.swing.JComboBox<String> jccari;
    public javax.swing.JComboBox<String> jcstatus;
    public javax.swing.JPasswordField jpkonfirmasipassword;
    public javax.swing.JPasswordField jppassword;
    public javax.swing.JTable jtable;
    public javax.swing.JTextField jtcari;
    public javax.swing.JTextField jtkode;
    public javax.swing.JTextField jtnamalengkap;
    public javax.swing.JTextField jtusername;
    // End of variables declaration//GEN-END:variables
}
