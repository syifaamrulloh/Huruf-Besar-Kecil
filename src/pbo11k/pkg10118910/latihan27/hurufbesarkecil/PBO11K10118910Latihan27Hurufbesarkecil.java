/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author syifa
 * Nama :Muhamad Syifa Amruloh
 * Kelas:IF11K
 * NIM  :10118910
 * 
 * Description : Program Merubah ke Huruf besar dan Kecil
 */
public class PBO11K10118910Latihan27Hurufbesarkecil {

    /**
     * @param args the command line arguments
     */
    public static void besar(String kata){
        System.out.println("Huruf Besar\t: " + kata.toUpperCase());
    }
    
    public static void kecil(String kata){
        System.out.println("Huruf Kecil\t: " + kata.toLowerCase());
    }
    
    public static void main(String[] args) {
        //load Scanner
        Scanner scan = new Scanner(System.in);
        System.out.printf("Masukan Kalimat\t: ");
        //Input
        String kata = scan.nextLine();
        //Output
        System.out.println("\n" + "========== Hasil Formatting ==========");
        besar(kata);
        kecil(kata);
        System.out.println("(Developed : Muhamad Syifa Amruloh)");
    }
    
}
