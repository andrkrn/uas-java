/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author kt-lap017
 */
public class UAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kelurahan kelurahan[] = new Kelurahan[5];
        prefetchKelurahan(kelurahan);
        
        JTextField nama = new JTextField();
        JTextField jenis_kelamin = new JTextField();
        JTextField tempat_lahir = new JTextField();
        JTextField tanggal_lahir = new JTextField();
        JTextField alamat = new JTextField();
        JTextField rt = new JTextField();
        JTextField rw = new JTextField();
        JTextField kode_kelurahan = new JTextField();

        Object[] message = {
            "Nama:", nama,
            "Jenis Kelamin (pria/wanita):", jenis_kelamin,
            "Tempat Lahir:", tempat_lahir,
            "Tanggal Lahir (dd/mm/yyyy):", tanggal_lahir,
            "Alamat:", alamat,
            "RT:", rt,
            "RW:", rw,
            "Kode Kelurahan", kode_kelurahan
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Penduduk", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            Penduduk penduduk = new Penduduk();
            penduduk.setNama(nama.getText());
            penduduk.setJk(jenis_kelamin.getText());
            penduduk.setTempat_lahir(tempat_lahir.getText());
            penduduk.setTanggal_lahir(tanggal_lahir.getText());
            penduduk.setAlamat(alamat.getText());
            penduduk.setRt(rt.getText());
            penduduk.setRw(rw.getText());
            penduduk.setKode_kelurahan(Integer.parseInt(kode_kelurahan.getText()));
            Kelurahan selectedKelurahan = getKelurahan(kelurahan, penduduk.getKode_kelurahan());
            
            JOptionPane.showMessageDialog(null, "PENDUDUK"
                + "\nNIK : " + penduduk.getNik()
                + "\nNAMA : " + penduduk.getNama()
                + "\nJENIS KELAMIN : " + penduduk.getJk()
                + "\nTEMPAT LAHIR : " + penduduk.getTempat_lahir()
                + "\nTANGGAL LAHIR : " + penduduk.getTanggal_lahir()
                + "\nRT : " + penduduk.getRt()
                + "\nRW : " + penduduk.getRw()
                + "\nKELURAHAN : " + selectedKelurahan.getNama_kelurahan()
                + "\nKABUPATEN/KOTA : " + selectedKelurahan.getKab_kota()
                + "\nKECAMATAN : " + selectedKelurahan.getKecamatan()
                + "\nPROVINSI : " + selectedKelurahan.getPropinsi()
            );
        }
    }
    
    private static Kelurahan getKelurahan(Kelurahan kelurahan[], Integer kode) {
        Integer i = 0;
        Kelurahan selectedKelurahan = null;
        
        while (i < 4) {
            if (kelurahan[i].getKode_kelurahan() == kode) {
                selectedKelurahan = kelurahan[i];
            }
            i++;
        }
        
        return selectedKelurahan;
    }
    
    private static void prefetchKelurahan(Kelurahan kelurahan[]) {
        List<String> lines = new ArrayList<String>();
        Integer i = 0;
        String line = null;
        String result = null;
        
        try {
            File f1 = new File("data/kelurahan.txt");
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            
            while ((line = br.readLine()) != null) {
                String data[] = line.split(",");
                kelurahan[i] = new Kelurahan();
                System.out.println(line);
                kelurahan[i].setKode_kelurahan(Integer.parseInt(data[0]));
                kelurahan[i].setNama_kelurahan(data[1]);
                kelurahan[i].setKecamatan(data[2]);
                kelurahan[i].setKab_kota(data[3]);
                kelurahan[i].setPropinsi(data[4]);
                i++;
            }
            
            fr.close();
            br.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
