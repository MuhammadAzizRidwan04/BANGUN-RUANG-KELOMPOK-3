/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang_kelompok_3;

/**
 *
 * @author M. Aziz Ridwan
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        Balok blk = new Balok();
        blk.setPanjang(2.8);
        blk.setLebar(4.7);
        blk.setTinggi(5.2);
        System.out.println("\n ______________________________");
        System.out.println("| Bathsyaba mukarromah : Balok |");
        System.out.println("|______________________________|");
        System.out.println("\nPanjang \t\t: " + blk.getPanjang());
        System.out.println("Lebar \t\t\t: "+blk.getLebar());
        System.out.println("Tinggi \t\t\t: "+blk.getTinggi());
        System.out.println("Rumus Luas Permukaan \t: 2 * (Panjang * Lebar + Panjang * Tinggi + Lebar * Tingi)");
        System.out.println("Rumus Volume \t\t: Panjang * Lebar * Tinggi ");
        System.out.println("Hasil Luas Permukaan \t: " + blk.getLuasPermukaan());
        System.out.println("Hasil Volume \t\t: " + blk.getVolume());
        System.out.println("=================================================================================");
    }
    
}
