/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang_kelompok_3;

/**
 *
 * @author LENOVO
 */
public class Bola extends Bangun_ruang {

    double luas, volume;

    public void setluaspermukaan() {
        super.luas = 4 * Math.PI * Math.pow(jari_jari, 2);
    }

    public void setvolume() {
        super.volume = 4.0 / 3.0 * Math.PI * Math.pow(jari_jari, 3);
    }

}
