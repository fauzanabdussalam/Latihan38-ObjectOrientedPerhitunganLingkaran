/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan38.perhitunganlingkaran;

import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : Menghitung Luas dan Keliling Lingkaran
 *
 */
public class PBO10K10119901Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran lkr   = new Lingkaran();
        Scanner scanner = new Scanner(System.in);
        
        double diameter;

        System.out.println("======Perhitungan Lingkaran======");
        System.out.print("Masukkan nilai diameter lingkaran : ");

        while(true) 
        {
            try 
            {
                diameter = Double.parseDouble(scanner.next());
                break;
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Nilai diameter tidak sesuai\n");
                System.out.print("Masukkan nilai diameter lingkaran : ");
                continue;
            }
        }
        
        System.out.println();
        
        lkr.hitungLingkaran(diameter);     
    }
    
}
