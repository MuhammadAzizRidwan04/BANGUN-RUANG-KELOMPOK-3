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
        
        System.out.println("\t\t\tLUAS PERMUKAAN & VOLUME BANGUN RUANG");
        
        System.out.println("\n=================================================================================");
        PrismaSegitiga ps = new PrismaSegitiga();
        ps.setAlas(3.8);
        ps.setTinggi_alas(3.7);
        ps.setKeliling_alas(4.1);
        ps.setTinggi_prisma(2.3);
        ps.setLuasPermukaan();
        ps.setvolume();
        System.out.println("\n ____________________________________________");
        System.out.println("| Muhammad Aziz Ridwan : Prisma Segitiga     |");
        System.out.println("|____________________________________________|");
        System.out.println("\nAlas \t\t\t: " + ps.getAlas());
        System.out.println("Tinggi alas \t\t: "+ps.getTinggi_alas());
        System.out.println("Kelilinhg alas \t\t: "+ps.getKeliling_alas());
        System.out.println("Tingi prisma \t\t: "+ps.getTinggi_prisma());
        System.out.println("Rumus Luas Permukaan \t: (2 * 1/2 * Alas * Tingi alas) + (Keliling alas * Tingi alas)");
        System.out.println("Rumus Volume \t\t: (1/2 * Alas * Tinggi alas) * Tingi prisma");
        System.out.println("Hasil Luas Permukaan \t: " + ps.getLuasPermukaan());
        System.out.println("Hasil Volume \t\t: " + ps.getvolume());
        System.out.println("=================================================================================");
        
        Balok blk = new Balok();
        blk.setPanjang(2.8);
        blk.setLebar(4.7);
        blk.setTinggi(5.2);
        blk.setLuasPermukaan();
        blk.setVolume();
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
        
        Kubus kbs = new Kubus();
        kbs.setSisi(3.7);
        kbs.setLuasPermukaan();
        kbs.setVolume();
        System.out.println("\n _____________________________________");
        System.out.println("| M yusuf bahtiar nur saputra : Kubus |");
        System.out.println("|_____________________________________|");
        System.out.println("\nSisi \t\t\t: " + kbs.getSisi());
        System.out.println("Rumus Luas Permukaan \t: 6 * Sisi^2 ");
        System.out.println("Rumus Volume \t\t: sisi^3");
        System.out.println("Hasil Luas Permukaan \t: " + kbs.getLuasPermukaan());
        System.out.println("Hasil Volume \t\t: " + kbs.getVolume());
        System.out.println("=================================================================================");
        
        Bola bl = new Bola();
        bl.setjari_jari(8.7);
        bl.setluaspermukaan();
        bl.setvolume();
        System.out.println("\n ________________________");
        System.out.println("| Anisa urdatun n : Bola |");
        System.out.println("|________________________|");
        System.out.println("\nJari-jari \t\t: " + bl.getjari_jari());
        System.out.println("PHI \t\t\t: 3.14");
        System.out.println("Rumus Luas Permukaan \t: 4 * PHI * Jari-jari^2");
        System.out.println("Rumus Volume \t\t: 4/3 * PHI * Jari-jari^3");
        System.out.println("Hasil Luas Permukaan \t: " + bl.getLuasPermukaan());
        System.out.println("Hasil Volume \t\t: " + bl.getVolume());
        System.out.println("=================================================================================");
        
        Kerucut krc = new Kerucut();
        krc.setGaris_pelukis(3.5);
        krc.setJari_jari(3.2);
        krc.setTinggi(4.9);
        System.out.println("\n ___________________________");
        System.out.println("| Andoko saifudin : Kerucut |");
        System.out.println("|___________________________|");
        System.out.println("\nGaris pelukis \t\t: " + krc.getGaris_pelukis());
        System.out.println("Jari-jari \t\t: "+krc.getJari_jari());
        System.out.println("Tinggi \t\t\t: "+krc.getTinggi());
        System.out.println("PHI \t\t\t: 3.14");
        System.out.println("Rumus Luas Permukaan \t: PHI * Jari-jari * (Garis pelukis + Jari-jari)  ");
        System.out.println("Rumus Volume \t\t: 1/3 * PHI * Jari-jari^2 * Tinggi ");
        System.out.println("Hasil Luas Permukaan \t: " + krc.getLuasPermukaan());
        System.out.println("Hasil Volume \t\t: " + krc.getvolume());
        System.out.println("=================================================================================");
        
        Tabung tb = new Tabung();
        tb.setJari_jari(4.5);
        tb.setTinggi(9.8);
        System.out.println("\n ___________________________________");
        System.out.println("| Muhammad Fahmi Zulfikar  : Tabung |");
        System.out.println("|___________________________________|");
        System.out.println("\nJari-jari \t\t: " + tb.getJari_jari());
        System.out.println("Tingi \t\t\t: "+tb.getTinggi());
        System.out.println("PHI \t\t\t: 3.14");
        System.out.println("Rumus Luas Permukaan \t: 2 * PHI * Jari-jari *(Jari-jari + Tinggi)");
        System.out.println("Rumus Volume \t\t: PHI * Jari-jari^2 * Tinggi ");
        System.out.println("Hasil Luas Permukaan \t: " + tb.getLuasPermukaan());
        System.out.println("Hasil Volume \t\t: " + tb.getVolume());
        System.out.println("=================================================================================");
        
        LimasSegitiga lms  = new LimasSegitiga();
        lms.setAlas(9.8);
        lms.setTinggiAlas(7.1);
        lms.setLuasSisiTegak(2.6);
        lms.setTinggiLimasSegitiga(5.1);
        System.out.println("\n __________________________________________");
        System.out.println("| Muhammad Alfian Nur Aziz : Limas Segitiga |");
        System.out.println("|___________________________________________|");
        System.out.println("\nAlas \t\t\t: " + lms.getAlas());
        System.out.println("Tinggi alas \t\t: "+lms.getTinggiAlas());
        System.out.println("Luas sisi tegak \t: "+lms.getLuasSisiTegak());
        System.out.println("Tingi limas segitiga \t: "+lms.getTinggiLimasSegitiga());
        System.out.println("Rumus Luas Permukaan \t: (1/2 * Alas * Tinggi alas) + (3 * Luas sisi tegak)");
        System.out.println("Rumus Volume \t\t: 1/3 *(1/2 * Alas * Tinggi alas) * Tinggi limas segitiga");
        System.out.println("Hasil Luas Permukaan \t: " + lms.getLuasPermukaan());
        System.out.println("Hasil Volume \t\t: " + lms.getVolume());
        System.out.println("=================================================================================");
    }
    
}
