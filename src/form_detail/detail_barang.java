/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form_detail;

import form.daftar_cicilan;
import form_tabel.form_tabel_barang;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Rydwan
 */
public class detail_barang extends javax.swing.JFrame {

    /**
     * Creates new form detail_barang
     */
   
    
    public detail_barang() {
        initComponents();
    }
    public daftar_cicilan daftar_cicilan;
    public form_tabel_barang formTableBarang;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jlkodebarang = new javax.swing.JLabel();
        jlmerk = new javax.swing.JLabel();
        jltipe = new javax.swing.JLabel();
        jlram = new javax.swing.JLabel();
        jlprosesor = new javax.swing.JLabel();
        jlvga = new javax.swing.JLabel();
        jlstorage = new javax.swing.JLabel();
        jlstok = new javax.swing.JLabel();
        jlharga = new javax.swing.JLabel();
        jltahunrilis = new javax.swing.JLabel();
        jlbaterai = new javax.swing.JLabel();
        jbproses = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setText("Stok");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Detail Barang");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel3.setText("Kode Barang");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel4.setText("Merk");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel5.setText("Tipe");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel6.setText("RAM");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel7.setText("Prosesor");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel8.setText("VGA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel9.setText("Storage");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel10.setText("Kapasitas Baterai");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel11.setText("Tahun Rilis");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel12.setText("Harga");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel13.setText(":");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel14.setText(":");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel15.setText(":");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel16.setText(":");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel17.setText(":");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel18.setText(":");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel19.setText(":");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel20.setText(":");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel21.setText(":");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel22.setText(":");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel23.setText(":");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, -1));

        jlkodebarang.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jlkodebarang.setText("[Kode]");
        getContentPane().add(jlkodebarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jlmerk.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jlmerk.setText("[Merk]");
        getContentPane().add(jlmerk, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jltipe.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jltipe.setText("[Tipe]");
        getContentPane().add(jltipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jlram.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jlram.setText("[RAM]");
        getContentPane().add(jlram, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jlprosesor.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jlprosesor.setText("[Prosesor]");
        getContentPane().add(jlprosesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jlvga.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jlvga.setText("[VGA]");
        getContentPane().add(jlvga, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        jlstorage.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jlstorage.setText("[Storage]");
        getContentPane().add(jlstorage, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        jlstok.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jlstok.setText("[Stok]");
        getContentPane().add(jlstok, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, -1));

        jlharga.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jlharga.setText("[Harga]");
        getContentPane().add(jlharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, -1, -1));

        jltahunrilis.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jltahunrilis.setText("[Tahun Rilis]");
        getContentPane().add(jltahunrilis, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, -1, -1));

        jlbaterai.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jlbaterai.setText("[Baterai]");
        getContentPane().add(jlbaterai, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, -1, -1));

        jbproses.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbproses.setText("Kembali");
        jbproses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbprosesActionPerformed(evt);
            }
        });
        getContentPane().add(jbproses, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 340, 40));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/bg-pattern-detail-barang.png"))); // NOI18N
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbprosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbprosesActionPerformed
        // TODO add your handling code here:
//        daftar_cicilan daftar_cicilan = new daftar_cicilan();
//        daftar_cicilan.detailBarang = this;
//        daftar_cicilan.jtkodebarang.setText(jlkodebarang.getText());
//        this.dispose();
        
//             daftar_cicilan.jtkodebarang.setText(jlkodebarang.getText());
this.dispose();
        
    }//GEN-LAST:event_jbprosesActionPerformed

    /**des
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
            java.util.logging.Logger.getLogger(detail_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detail_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detail_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detail_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detail_barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JButton jbproses;
    public javax.swing.JLabel jlbaterai;
    public javax.swing.JLabel jlharga;
    public javax.swing.JLabel jlkodebarang;
    public javax.swing.JLabel jlmerk;
    public javax.swing.JLabel jlprosesor;
    public javax.swing.JLabel jlram;
    public javax.swing.JLabel jlstok;
    public javax.swing.JLabel jlstorage;
    public javax.swing.JLabel jltahunrilis;
    public javax.swing.JLabel jltipe;
    public javax.swing.JLabel jlvga;
    // End of variables declaration//GEN-END:variables
}
