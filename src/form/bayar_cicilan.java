/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import form_tabel.form_tabel_penyicil;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;

import java.util.Date;
import javax.swing.JOptionPane;
import method.method_bayar_cicilan;

/**
 *
 * @author Muhammad Rydwan
 */
public class bayar_cicilan extends javax.swing.JFrame {

    /**
     * Creates new form bayar_cicilan
     */
    public bayar_cicilan() {
        initComponents();
        new method_bayar_cicilan().bersih(this);
        
        
        this.jbubah.setEnabled(false);
        this.jbhapus.setEnabled(false);
        this.jtstor.setEnabled(false);
        this.jdtanggalmenyicil.setEnabled(false);
        
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        Date tanggal_sekarang = 
//        
//        this.jdtanggalmenyicil.setDate();
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtkode = new javax.swing.JTextField();
        jbdaftarpenyicil = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtnamapelanggan = new javax.swing.JTextField();
        jtnik = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtkodebarang = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtnamabarang = new javax.swing.JTextField();
        jthargabarang = new javax.swing.JTextField();
        jtuangmuka = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jtsisaharga = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jtlamanagsuran = new javax.swing.JTextField();
        jtangsuran = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jcstatus = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jtstor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jtsisacicilan = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jdtanggalmenyicil = new com.toedter.calendar.JDateChooser();
        jLabel30 = new javax.swing.JLabel();
        jbsimpan = new javax.swing.JButton();
        jbubah = new javax.swing.JButton();
        jbhapus = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jtkembalian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jttanggaldaftar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 34)); // NOI18N
        jLabel1.setText("Bayar Cicilan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setText("Kode Cicilan");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jtkode.setEditable(false);
        jtkode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtkode.setText("jTextField1");
        jtkode.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtkodeCaretUpdate(evt);
            }
        });
        jtkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtkodeActionPerformed(evt);
            }
        });
        jtkode.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtkodePropertyChange(evt);
            }
        });
        jtkode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtkodeKeyReleased(evt);
            }
        });
        getContentPane().add(jtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 170, -1));

        jbdaftarpenyicil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbdaftarpenyicil.setText("Daftar Penyicil");
        jbdaftarpenyicil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbdaftarpenyicilActionPerformed(evt);
            }
        });
        getContentPane().add(jbdaftarpenyicil, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("NIK");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel12.setText("Nama");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jtnamapelanggan.setEditable(false);
        jtnamapelanggan.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtnamapelanggan.setText("jTextField5");
        getContentPane().add(jtnamapelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 230, -1));

        jtnik.setEditable(false);
        jtnik.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtnik.setText("jTextField5");
        getContentPane().add(jtnik, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 230, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel14.setText("Kode Barang");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jtkodebarang.setEditable(false);
        jtkodebarang.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtkodebarang.setText("jTextField5");
        getContentPane().add(jtkodebarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 230, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel15.setText("Nama Barang");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel16.setText("Harga Barang");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel17.setText("Uang Muka");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel18.setText("Rp.");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jtnamabarang.setEditable(false);
        jtnamabarang.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtnamabarang.setText("jTextField5");
        getContentPane().add(jtnamabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 230, -1));

        jthargabarang.setEditable(false);
        jthargabarang.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jthargabarang.setText("jTextField5");
        getContentPane().add(jthargabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 200, -1));

        jtuangmuka.setEditable(false);
        jtuangmuka.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtuangmuka.setText("jTextField5");
        jtuangmuka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtuangmukaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtuangmukaKeyTyped(evt);
            }
        });
        getContentPane().add(jtuangmuka, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 200, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel26.setText("Rp.");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel19.setText("Sisa Harga");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, -1, -1));

        jtsisaharga.setEditable(false);
        jtsisaharga.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtsisaharga.setText("jTextField5");
        getContentPane().add(jtsisaharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 110, 190, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel25.setText("Rp.");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel20.setText("Lama Angsuran");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, -1, -1));

        jtlamanagsuran.setEditable(false);
        jtlamanagsuran.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtlamanagsuran.setText("jTextField5");
        jtlamanagsuran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtlamanagsuranKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtlamanagsuranKeyTyped(evt);
            }
        });
        getContentPane().add(jtlamanagsuran, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 150, 190, -1));

        jtangsuran.setEditable(false);
        jtangsuran.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtangsuran.setText("jTextField5");
        jtangsuran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtangsuranKeyTyped(evt);
            }
        });
        getContentPane().add(jtangsuran, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 180, 190, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel24.setText("Rp.");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel23.setText("Angsuran");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel27.setText("Tanggal Daftar");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel21.setText("Status");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, -1, -1));

        jcstatus.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jcstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BELUM LUNAS", "LUNAS" }));
        getContentPane().add(jcstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 240, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transaksi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtstor.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtstor.setText("jTextField5");
        jtstor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtstorKeyPressed(evt);
            }
        });
        jPanel1.add(jtstor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 230, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel13.setText("Stor");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel22.setText("Tanggal Menyicil");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jtsisacicilan.setEditable(false);
        jtsisacicilan.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtsisacicilan.setText("jTextField5");
        jPanel1.add(jtsisacicilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 230, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel28.setText("Rp.");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel29.setText("Rp.");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));
        jPanel1.add(jdtanggalmenyicil, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 160, 30));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel30.setText("Sisa Cicilan");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jbsimpan.setBackground(new java.awt.Color(184, 47, 32));
        jbsimpan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbsimpan.setForeground(new java.awt.Color(255, 255, 255));
        jbsimpan.setText("Simpan");
        jbsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(jbsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 90, 40));

        jbubah.setBackground(new java.awt.Color(184, 47, 32));
        jbubah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbubah.setForeground(new java.awt.Color(255, 255, 255));
        jbubah.setText("Ubah");
        jbubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbubahActionPerformed(evt);
            }
        });
        jPanel1.add(jbubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 90, 40));

        jbhapus.setBackground(new java.awt.Color(184, 47, 32));
        jbhapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbhapus.setForeground(new java.awt.Color(255, 255, 255));
        jbhapus.setText("Hapus");
        jbhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbhapusActionPerformed(evt);
            }
        });
        jPanel1.add(jbhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 90, 40));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel31.setText("Kembalian");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel32.setText("Rp.");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        jtkembalian.setEditable(false);
        jtkembalian.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(jtkembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 230, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 1120, 150));

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
        jScrollPane1.setViewportView(jtable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 1100, 240));

        jttanggaldaftar.setEditable(false);
        jttanggaldaftar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jttanggaldaftar.setText("jTextField5");
        jttanggaldaftar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jttanggaldaftarKeyTyped(evt);
            }
        });
        getContentPane().add(jttanggaldaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, 190, -1));

        jButton2.setBackground(new java.awt.Color(184, 47, 32));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 90, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbdaftarpenyicilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbdaftarpenyicilActionPerformed
        // TODO add your handling code here:
        form_tabel_penyicil formTabelPenyicil = new form_tabel_penyicil();
        formTabelPenyicil.bayarCicilan = this;
        formTabelPenyicil.setVisible(true);
    }//GEN-LAST:event_jbdaftarpenyicilActionPerformed

    private void jtuangmukaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtuangmukaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == KeyEvent.VK_ENTER){
            getToolkit().beep();

            int harga_barang = Integer.parseInt(this.jthargabarang.getText());
            int uang_muka = Integer.parseInt(this.jtuangmuka.getText());

            int sisa_harga = harga_barang - uang_muka;

            this.jtsisaharga.setText(String.valueOf(sisa_harga));
            this.jtlamanagsuran.requestFocus();
        }
    }//GEN-LAST:event_jtuangmukaKeyPressed

    private void jtuangmukaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtuangmukaKeyTyped
        char karakter = evt.getKeyChar();
        if(!(  (karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)  )){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jtuangmukaKeyTyped

    private void jtlamanagsuranKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtlamanagsuranKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER){
            this.jtangsuran.requestFocus();
        }
    }//GEN-LAST:event_jtlamanagsuranKeyPressed

    private void jtlamanagsuranKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtlamanagsuranKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtlamanagsuranKeyTyped

    private void jtangsuranKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtangsuranKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        //        if ( !( (karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)  )){
            //            evt.consume();
            //            getToolkit().beep();
            //        }
    }//GEN-LAST:event_jtangsuranKeyTyped

    private void jbubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbubahActionPerformed
        // TODO add your handling code here:
       // new method_bayar_cicilan().ubah(this);
    }//GEN-LAST:event_jbubahActionPerformed

    private void jbhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbhapusActionPerformed
        // TODO add your handling code here:
       // new method_bayar_cicilan().hapus(this);
    }//GEN-LAST:event_jbhapusActionPerformed

    private void jbsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsimpanActionPerformed
        // TODO add your handling code here:
         new method_bayar_cicilan().simpan(this);
    }//GEN-LAST:event_jbsimpanActionPerformed

    private void jtkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtkodeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtkodeActionPerformed

    private void jttanggaldaftarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jttanggaldaftarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jttanggaldaftarKeyTyped

    private void jtkodePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtkodePropertyChange
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jtkodePropertyChange

    private void jtkodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtkodeKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jtkodeKeyReleased

    private void jtkodeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtkodeCaretUpdate
    new method_bayar_cicilan().tampilDataField(this);
    new method_bayar_cicilan().tampilRiwayatCicilan(this);
    }//GEN-LAST:event_jtkodeCaretUpdate

    private void jtstorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtstorKeyPressed
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            if(this.jtstor.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Masukkan Nominal Stor!","Peringatan", JOptionPane.WARNING_MESSAGE);
                this.jtsisacicilan.setText("");
                this.jtkembalian.setText("");
            }else{
                int sisa_harga = Integer.parseInt(this.jtsisaharga.getText());
                int stor = Integer.parseInt(this.jtstor.getText());

                int sisa_cicilan = sisa_harga - stor;

                this.jtsisacicilan.setText(String.valueOf(sisa_cicilan));
                if (Integer.parseInt(this.jtsisacicilan.getText()) <= 0){
                    this.jtsisacicilan.setText("0");

                    int kembalian = stor - sisa_harga;
                    this.jtkembalian.setText(String.valueOf(kembalian));
                }else if (Integer.parseInt(this.jtsisacicilan.getText()) > 0){
                    this.jtkembalian.setText("0");
                }
            
            }
        }
    }//GEN-LAST:event_jtstorKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(bayar_cicilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bayar_cicilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bayar_cicilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bayar_cicilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bayar_cicilan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbdaftarpenyicil;
    public javax.swing.JButton jbhapus;
    public javax.swing.JButton jbsimpan;
    public javax.swing.JButton jbubah;
    public javax.swing.JComboBox<String> jcstatus;
    public com.toedter.calendar.JDateChooser jdtanggalmenyicil;
    public javax.swing.JTable jtable;
    public javax.swing.JTextField jtangsuran;
    public javax.swing.JTextField jthargabarang;
    public javax.swing.JTextField jtkembalian;
    public javax.swing.JTextField jtkode;
    public javax.swing.JTextField jtkodebarang;
    public javax.swing.JTextField jtlamanagsuran;
    public javax.swing.JTextField jtnamabarang;
    public javax.swing.JTextField jtnamapelanggan;
    public javax.swing.JTextField jtnik;
    public javax.swing.JTextField jtsisacicilan;
    public javax.swing.JTextField jtsisaharga;
    public javax.swing.JTextField jtstor;
    public javax.swing.JTextField jttanggaldaftar;
    public javax.swing.JTextField jtuangmuka;
    // End of variables declaration//GEN-END:variables
}
