/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Barangctrl;
import controller.config;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kindreal
 */
public class PengelolaanBrg extends javax.swing.JFrame{

    /**
     * Creates new form PengelolaanBrg
     */
    public PengelolaanBrg() {
        initComponents();
        load_table();
    }
    
    Barangctrl bc = new Barangctrl();
    int getrow, hrg_beli, hrg_jual, stok;
    String id, nama;
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnTambahBrg = new javax.swing.JButton();
        btnUbahBrg = new javax.swing.JButton();
        btnHapusBrg = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 20)); // NOI18N
        jLabel1.setText("Pengelolaan Barang");

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        btnTambahBrg.setText("Tambah Barang");
        btnTambahBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBrgActionPerformed(evt);
            }
        });

        btnUbahBrg.setText("Ubah Barang");
        btnUbahBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahBrgActionPerformed(evt);
            }
        });

        btnHapusBrg.setText("Hapus Barang");
        btnHapusBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusBrgActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambahBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUbahBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapusBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahBrg)
                    .addComponent(btnUbahBrg)
                    .addComponent(btnHapusBrg)
                    .addComponent(btnClose))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        Main mn = new Main();
        mn.setVisible(true);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnTambahBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBrgActionPerformed

        TambahBrg tb = new TambahBrg();
        tb.setVisible(true);
        load_table();
    }//GEN-LAST:event_btnTambahBrgActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked

        DefaultTableModel model = (DefaultTableModel)tabel.getModel();

        getrow = tabel.getSelectedRow();
        
        id = model.getValueAt(getrow, 1).toString();
        nama = model.getValueAt(getrow, 2).toString();
        hrg_beli = Integer.parseInt((String)model.getValueAt(getrow, 3));
        hrg_jual = Integer.parseInt((String)model.getValueAt(getrow, 4));
        stok = Integer.parseInt((String)model.getValueAt(getrow, 5));
    }//GEN-LAST:event_tabelMouseClicked

    private void btnUbahBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahBrgActionPerformed
        if (tabel.isEditing()) {
            tabel.getCellEditor().stopCellEditing();
        }
        
        DefaultTableModel model = (DefaultTableModel)tabel.getModel();
        
        id = model.getValueAt(getrow, 1).toString();
        nama = model.getValueAt(getrow, 2).toString();
        hrg_beli = Integer.parseInt((String)model.getValueAt(getrow, 3));
        hrg_jual = Integer.parseInt((String)model.getValueAt(getrow, 4));
        stok = Integer.parseInt((String)model.getValueAt(getrow, 5));
        bc.update(id, nama, hrg_beli, hrg_jual, stok);
    }//GEN-LAST:event_btnUbahBrgActionPerformed

    private void btnHapusBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusBrgActionPerformed
        try {
            bc.hapus(id);
        } catch (SQLException ex) {
            Logger.getLogger(PengelolaanBrg.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        load_table();
    }//GEN-LAST:event_btnHapusBrgActionPerformed
    
    private void load_table(){
        
        DefaultTableModel model = new DefaultTableModel();
        model.fireTableDataChanged();
        model.addColumn("No");
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Harga Beli");
        model.addColumn("Harga Jual");
        model.addColumn("Stock");
        
        try {
            int no=1;
            String sql = "select * from barang";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString("id"),res.getString("nama"),res.getString("hrg_beli"),res.getString("hrg_jual"),res.getString("stock")});
            }
            tabel.setModel(model);

        } catch (Exception e) {
        }
    }
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
            java.util.logging.Logger.getLogger(PengelolaanBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PengelolaanBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PengelolaanBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PengelolaanBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PengelolaanBrg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnHapusBrg;
    private javax.swing.JButton btnTambahBrg;
    private javax.swing.JButton btnUbahBrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
