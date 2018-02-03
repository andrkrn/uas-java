/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author kt-lap017
 */
public class Kelurahan {
    private int kode_kelurahan;
    private String nama_kelurahan;
    private String kecamatan;
    private String kab_kota;
    private String propinsi;

    public int getKode_kelurahan() {
        return kode_kelurahan;
    }

    public String getNama_kelurahan() {
        return nama_kelurahan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public String getKab_kota() {
        return kab_kota;
    }

    public String getPropinsi() {
        return propinsi;
    }

    public void setKode_kelurahan(int kode_kelurahan) {
        this.kode_kelurahan = kode_kelurahan;
    }

    public void setNama_kelurahan(String nama_kelurahan) {
        this.nama_kelurahan = nama_kelurahan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public void setKab_kota(String kab_kota) {
        this.kab_kota = kab_kota;
    }

    public void setPropinsi(String propinsi) {
        this.propinsi = propinsi;
    }
}
