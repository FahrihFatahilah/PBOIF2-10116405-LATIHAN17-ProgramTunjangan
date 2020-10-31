/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Fahrih Fatahilah
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116405
 * 
 */
public class Programtunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String status;
        double gajiPokok, totalGaji, tunjangan;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--------Program Tunjangan------------");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp ");
        gajiPokok = scanner.nextDouble();
        System.out.print("Status Anda? (menikah/belum)\t: ");
        status = scanner.next();
        
        tunjangan = (status.equals("menikah"))? 0.35 * gajiPokok : 0;
        totalGaji = tunjangan + gajiPokok;
        
        System.out.println("=====Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok  : Rp " + gajiPokok);
        System.out.println("Tunjangan   : RP " + tunjangan);
        System.out.println("Total Gaji  : Rp " + totalGaji);
        System.out.println("(Developed by : Fahrih Fatahilah");
    }
    
}
