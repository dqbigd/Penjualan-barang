/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kindreal
 */
public class Model {
    private String id_brg;
    private String nama_brg;
    private int hrg_beli;
    private int hrg_jual;
    private int stok;
    
    public Model(String id_brg, String nama_brg, int hrg_beli, int hrg_jual, int stok) {
        this.id_brg = id_brg;
        this.nama_brg = nama_brg;
        this.hrg_beli = hrg_beli;
        this.hrg_jual = hrg_jual;
        this.stok = stok;
    }

    public String getId_brg() {
        return id_brg;
    }

    public String getNama_brg() {
        return nama_brg;
    }

    public int getHrg_beli() {
        return hrg_beli;
    }

    public int getHrg_jual() {
        return hrg_jual;
    }

    public int getStok() {
        return stok;
    }

    public void setId_brg(String id_brg) {
        this.id_brg = id_brg;
    }

    public void setNama_brg(String nama_brg) {
        this.nama_brg = nama_brg;
    }

    public void setHrg_beli(int hrg_beli) {
        this.hrg_beli = hrg_beli;
    }

    public void setHrg_jual(int hrg_jual) {
        this.hrg_jual = hrg_jual;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    
}
