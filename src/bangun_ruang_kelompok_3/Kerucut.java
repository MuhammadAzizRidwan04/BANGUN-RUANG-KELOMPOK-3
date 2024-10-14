/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang_kelompok_3;

/**
 *
 * @author HP
 */
public class Kerucut extends Bangun_ruang {

    double garis_pelukis, luas, volume;
    //

    public void setGaris_pelukis(double garis_pelukis) {
        this.garis_pelukis = garis_pelukis;
    }

    public double getGaris_pelukis() {
        return garis_pelukis;
    }

    public void setLuasPermukaan() {
        super.luas = Math.PI * jari_jari * (garis_pelukis + jari_jari);
    }

    public void setvolume() {
        super.volume = 1.0 / 3.0 * Math.PI * Math.pow(jari_jari, 2) * tinggi;
    }

}
