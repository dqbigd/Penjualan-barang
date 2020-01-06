/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.*;
import javax.swing.*;
import model.Model;
/**
 *
 * @author kindreal
 */
public class Barangctrl {
    
    public void simpan(String id, String nama, int hrg_beli, int hrg_jual, int stok) {
        Model m = new Model(id, nama, hrg_beli, hrg_jual,stok);
        
        try {
            String sql = "INSERT INTO barang VALUES ('"+id+"','"+nama+"','"+hrg_beli+"','"+hrg_jual+"','"+stok+"')";
            java.sql.Connection conn=(Connection)config.configDB();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void update(String id, String nama, int hrg_beli, int hrg_jual, int stok) {
        Model m = new Model(id, nama, hrg_beli, hrg_jual,stok);
        
        try {
            String sql = "UPDATE barang SET nama = '"+nama+"', hrg_beli = '"+hrg_beli+"', hrg_jual = '"+hrg_jual+"', stock = '"+stok+"' WHERE id = '"+id+"'";
            java.sql.Connection conn=(Connection)config.configDB();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void hapus(String id) throws SQLException{
        try {
            String sql = "DELETE from barang WHERE id = '"+id+"' ";
            java.sql.Connection conn=(Connection)config.configDB();
            PreparedStatement statement = conn.prepareStatement(sql);
            //statement.setString(1, id);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
