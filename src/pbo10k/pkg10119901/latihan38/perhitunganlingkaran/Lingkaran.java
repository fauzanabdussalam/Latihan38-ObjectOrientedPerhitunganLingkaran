/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan38.perhitunganlingkaran;

/**
 *
 * @author User
 */
public class Lingkaran 
{
    private static double hitungJariJari(double diameter)
    {
        return diameter / 2;
    }
    
    private static double hitungLuas(double phi, double jariJari)
    {
        return phi * jariJari * jariJari;
    }
    
    private static double hitungKeliling(double phi, double jariJari)
    {
        return 2 * phi * jariJari;
    }
    
    public static void hitungLingkaran(double diameter)
    {
        double phi = 3.14, jariJari;
        
        jariJari = hitungJariJari(diameter);
        
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran \t\t= %s cm %n", jariJari);
        System.out.printf("Luas Lingkaran \t\t\t= %s cm %n", hitungLuas(phi, jariJari));
        System.out.printf("Keliling lingkaran \t\t= %s cm %n", hitungKeliling(phi, jariJari));
    }
}
