/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118040.latihan59.detectiveconan;

/**
 *
 * @author asus
 */
public class PBO110118040Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     *  * NAMA  : Moch Yudha Rusdian
 * KELAS : IF 1
 * NIM   : 10118040
 * Deskripsi Program : Program ini untuk membuat objek dari anime detective 
 *                     conan.
     */
    public static void main(String[] args) {
        // TODO code application logic here
           MainCharacter conan = new MainCharacter("Investigator", "Menyelesaikan Kasus","Conan Edogawa","Tokyo",true);
        MainCharacter ran = new MainCharacter("Karate", "Sama seperti Shinichi","Ran Mouri","Osaka",false);
        SupportCharacter eisuke = new SupportCharacter("Teman Sekelas Ran Mouri","Eisuke Hondo","Osaka",false);
        conan.displayCharacter();
        ran.displayCharacter();
        eisuke.displayCharacter();
    }
    
}
