/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang_kelompok_3;

/**
 *
 * @author DELL
 */
public class Tabung extends Bangun_ruang {

    double luas, volume;

    public void setLuasPermukaan() {
        super.luas = 2 * Math.PI * jari_jari * (jari_jari + tinggi);
    }

    public void setVolume() {
        super.volume = Math.PI * Math.pow(jari_jari, 2) * tinggi;
    }

}
