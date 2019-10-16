/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan37.objectoriented.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Guntur Maulana I
 * NAMA     : Guntur Maulana Ibrahim
 * KELAS    : IF-1
 * NIM      : 10118032
 * Deskripsi Program : Menampilkan rata-rata nilai
 */
public class PBO110118032Latihan37ObjectOrientedProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Mahasiswa mah = new Mahasiswa();
         Scanner scn = new Scanner(System.in);

         int n;
         System.out.print("Masukkan Banyaknya Mahasiswa : ");
         n = scn.nextInt();

         mah.HitungTotal(mah.nilaiMhs, n);
         mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "+mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs,n));
        System.out.println("Developed by : Guntur Maulana Ibrahim");
    }
    
}
