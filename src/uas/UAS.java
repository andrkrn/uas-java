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

/**
 *
 * @author kt-lap017
 */
public class UAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kelurahan kelurahan[] = new Kelurahan[4];
        prefetchKelurahan(kelurahan);
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
                String[] data = line.split(",");
                kelurahan[i] = new Kelurahan();
                kelurahan[i].setKode_kelurahan(Integer.parseInt(data[0]));
                kelurahan[i].setNama_kelurahan(data[0]);
                kelurahan[i].setKecamatan(data[0]);
                kelurahan[i].setKab_kota(data[0]);
                kelurahan[i].setPropinsi(data[0]);
                i++;
            }
            
            fr.close();
            br.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
