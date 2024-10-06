/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang_kelompok_3;

/**
 *
 * @author Santri IT
 */

public class LimasSegitiga {

    double alas, tingi_alas, luas_sisi_tegak, tingi_limas_segitiga, luas, volume;

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getAlas() {
        return alas;
    }

    public void setTinggiAlas(double tinggi_alas) {
        this.tingi_alas = tinggi_alas;
    }

    public double getTinggiAlas() {
        return tingi_alas;
    }

    public void setLuasSisiTegak(double luas_sisi_tegak) {
        this.luas_sisi_tegak = luas_sisi_tegak;
    }

    public double getLuasSisiTegak() {
        return luas_sisi_tegak;
    }

    public void setTinggiLimasSegitiga(double tinggi_limas_segitiga) {
        this.tingi_limas_segitiga = tinggi_limas_segitiga;
    }

    public double getTinggiLimasSegitiga() {
        return tingi_limas_segitiga;
    }

    public void setLuasPermukaan() {
        this.luas = (1.0 / 2.0 * alas * tingi_alas) + (3 * luas_sisi_tegak);
    }
    public double getLuasPermukaan(){
        return luas;
    }

    public void setVolume() {
        this.volume = 1.0 / 3.0 * (1.0 / 2.0 * alas * tingi_alas) * tingi_limas_segitiga;
    }
    public double getVolume(){
        return volume;
    }
}