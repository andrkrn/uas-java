/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author kt-lap017
 */
public class Penduduk {
    private int id;
    private String nama;
    private String jk;
    private String tempat_lahir;
    private String tanggal_lahir;
    private String alamat;
    private String rt;
    private String rw;
    private int kode_kelurahan;

    public String getNik() {
        String result = "" + kode_kelurahan + "" + CustomTanggalLahir() + "" + id ;
        return result;
    }
    
    public Integer CustomTanggalLahir() {
        int result = Integer.parseInt(tanggal_lahir.replace("/", ""));
        
        if (jk.equals("wanita")) {
            result = result + 40;
        }
        
        return result;
    }

    public String getNama() {
        return nama;
    }

    public String getJk() {
        return jk;
    }

    public String getTempat_lahir() {
        return tempat_lahir;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getRt() {
        return rt;
    }

    public String getRw() {
        return rw;
    }

    public int getKode_kelurahan() {
        return kode_kelurahan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public void setRw(String rw) {
        this.rw = rw;
    }

    public void setKode_kelurahan(int kode_kelurahan) {
        this.kode_kelurahan = kode_kelurahan;
    }
    
}
