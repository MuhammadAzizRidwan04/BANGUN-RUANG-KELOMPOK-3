/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang_kelompok_3;

/**
 *
 * @author Santri IT
 */
public class LimasSegitiga extends Bangun_ruang {

    double luas_sisi_tegak, tingi_limas_segitiga, luas, volume;
    //tinggi alas = variabel tinggi di kelas bangun ruang/

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
        super.luas = (1.0 / 2.0 * alas * tinggi) + (3 * luas_sisi_tegak);
    }

    public void setVolume() {
        super.volume = 1.0 / 3.0 * (1.0 / 2.0 * alas * tinggi) * tingi_limas_segitiga;
    }

}
