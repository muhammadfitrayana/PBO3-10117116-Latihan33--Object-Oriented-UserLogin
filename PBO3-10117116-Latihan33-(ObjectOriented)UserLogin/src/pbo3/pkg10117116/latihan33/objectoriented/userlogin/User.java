/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan33.objectoriented.userlogin;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program User Login berbasis objek
 *  
 */
public class User {
 
    private  String  userName;
    private  String  password;
    public   Boolean statusAkun;
     
    private boolean cekAkun (String parUsername,String parPassword){
     userName = "RizkiAdam";
     password = "terbaikselalu";
     statusAkun = parPassword.equals(password) && parUsername.equals(userName);
     return statusAkun;
    }
    
    private void hasilLogin (Boolean parStatusAkun,String parUsername ){
      if (parStatusAkun==true) {
          System.out.println("\n******HALLO "+parUsername.toUpperCase()
                             +"******");
          System.out.println("Selamat Datang di Aplikasi ini");
          } else {
          System.out.println("\nOoops, Username atau Password anda salah");
        }   
     }
      
    public void pengecekkanLogin (String parUsername,String parPassword){
        cekAkun(parUsername,parPassword);
        hasilLogin(statusAkun,parUsername);
     }
}
