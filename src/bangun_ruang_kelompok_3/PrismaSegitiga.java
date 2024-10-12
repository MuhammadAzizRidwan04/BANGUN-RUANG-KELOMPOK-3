/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang_kelompok_3;

/**
 *
 * @author M. Aziz Ridwan
 */
public class PrismaSegitiga extends Bangun_ruang {

    double alas, keliling_alas, tinggi_prisma, volume, luas;
//tinngi alas= variabel tinggi di bangun ruang

    public void setAlas(double alas) {
        this.alas = alas;
    }
    public double getAlas() {
        return alas;
    }
    public void setKeliling_alas(double keliling_alas) {
        this.keliling_alas = keliling_alas;
    }
    public double getKeliling_alas() {
        return keliling_alas;
    }
    public void setTinggi_prisma(double tinggi_prisma) {
        this.tinggi_prisma = tinggi_prisma;
    }
    public double getTinggi_prisma() {
        return tinggi_prisma;
    }
    public void setLuasPermukaan() {
        super.luas = (2 * 1 / 2 * alas * tinggi) + (keliling_alas * tinggi);
    }
    public void setvolume() {
        super.volume = 0.5 * alas * tinggi * tinggi_prisma;
    }
}
