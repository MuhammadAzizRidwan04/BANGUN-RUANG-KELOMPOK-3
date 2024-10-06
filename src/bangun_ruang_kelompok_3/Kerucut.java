/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang_kelompok_3;

/**
 *
 * @author HP
 */
public class Kerucut {

    double garis_pelukis, jari_jari, tinggi, luas, volume;

    public void setGaris_pelukis(double garis_pelukis) {
        this.garis_pelukis = garis_pelukis;
    }

    public double getGaris_pelukis() {
        return garis_pelukis;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public double getJari_jari() {
        return jari_jari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setLuasPermukaan() {
        this.luas = Math.PI * jari_jari * (garis_pelukis + jari_jari);
    }

    public double getLuasPermukaan() {
        return luas;
    }

    public void setvolume() {
        this.volume = 1.0 / 3.0 * Math.PI * Math.pow(jari_jari, 2) * tinggi;
    }

    public double getVolume() {
        return volume;
    }

}

