/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan33.objectoriented.userlogin;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program User Login berbasis objek
 *  
 */
public class PBO310117116Latihan33ObjectOrientedUserLogin {

    /**
     * @param args the command line arguments
     */
    
    private static String userName;
    private static String pw;
    
    
    public static void main(String[] args) {
       
    Scanner baca = new Scanner(System.in);

    System.out.print("Masukkan Username = ");
    userName = baca.next();

    System.out.print("Masukkan Password = ");
    pw = baca.next();

    User cek = new User();
    cek.pengecekkanLogin(userName,pw);
    
    }
    
}
