/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Steven Danesswaralay
 * Kelas    : PBO2
 * Nim      : 10118078
 * Deskripsi Program : Huruf Besar Kecil
 */
public class PBO2_10118078_Latihan27_HurufBesarKecil {
    public static String kalimat;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Kalimat : ");
        kalimat = scanner.next();
        
        System.out.println("======= Hasil Formatting =======");
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());
    }
}
