/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan38.perhitunganlingkaran;

/**
 *
 * @author ENDOG
 *  Nama      : Muhamad Ramadan
 *  NIM       : 10119004
 *  Kelas     : IF1
 *  Deskripsi : menampilkan perhitungan lingkaran
 */
class PerhitunganLingkaran {
    private static double jarijari, luas, keliling;
    public static double diameter;
    private static final double PHI = 3.14;
        
    public static double hitungJariJari() {
        jarijari = diameter /2 ;
        return jarijari;    
    }
    
    public static double hitungLuas() {
        luas = PHI * jarijari * jarijari;
        return luas;
    }
    
    public static double hitungKeliling() {
        keliling = PHI * diameter;
        return keliling;
    
    }
    
}
