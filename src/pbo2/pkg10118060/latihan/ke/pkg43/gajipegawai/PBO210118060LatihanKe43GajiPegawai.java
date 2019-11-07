/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg43.gajipegawai;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama     : Permai Ramadhan
 * Kelas    : PBO2
 * NIM      : 10118060
 * Latihan ini berisi tentang bagaimana menampilkan total gaji yang diterima
 * dalam sebuah program
 */
public class PBO210118060LatihanKe43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static int totalGaji;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GajiPegawai gapeg = new GajiPegawai();
        gapeg.setNama("Rizki Adam Kurniawan");
        gapeg.setAlamat("Jalan Semar dlm 4 No 72/66");
        gapeg.setUangTransport(250000);
        gapeg.setUangTunjangan(300000);
        gapeg.setGajiPokok(4500000);
        
        totalGaji = gapeg.totalGaji(gapeg.getUangTunjangan(),
                    gapeg.getUangTransport(), gapeg.getGajiPokok());
        
        
        gapeg.tampilData(gapeg.getNama(), gapeg.getAlamat(), 
                gapeg.getUangTunjangan() , gapeg.getUangTransport(),
                gapeg.getGajiPokok(), totalGaji);
    }
    
}
