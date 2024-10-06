/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang_kelompok_3;

/**
 *
 * @author LENOVO
 */
public class Bola {

    double jari_jari, luas, volume;

    public void setjari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public double getjari_jari() {
        return jari_jari;
    }

    public void setluaspermukaan() {
        this.luas = 4 * Math.PI * Math.pow(jari_jari, 2);
    }

    public double getLuasPermukaan() {
        return luas;
    }

    public void setvolume() {
        this.volume = 4.0 / 3.0 * Math.PI * Math.pow(jari_jari, 3);
    }

    public double getVolume() {
        return volume;
    }
}

