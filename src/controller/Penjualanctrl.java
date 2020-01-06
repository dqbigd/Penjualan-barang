/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author kindreal
 */
public class Penjualanctrl {
    
    public void simpan(String kode_jual, String tanggal, int total) {
        try {
            String sql = "INSERT INTO penjualan_header VALUES ('"+kode_jual+"','"+tanggal+"','"+total+"')";
            java.sql.Connection conn=(Connection)config.configDB();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Penjualan telah tersimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void simpan_detail(String kode_jual, String kode_barang, int hrg_jual, int beli, int subtotal){
        
        try {
            String sql = "INSERT INTO penjualan_detail VALUES ('"+kode_jual+"','"+kode_barang+"','"+hrg_jual+"','"+beli+"','"+subtotal+"')";
            java.sql.Connection conn=(Connection)config.configDB();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Penjualan telah ditambahkan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    
    
}
