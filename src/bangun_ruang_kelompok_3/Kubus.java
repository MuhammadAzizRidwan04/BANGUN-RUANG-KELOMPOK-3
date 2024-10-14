/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang_kelompok_3;

/**
 *
 * @author ASUS
 */
public class Kubus extends Bangun_ruang {

    double sisi, luas, volume;
    //

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setLuasPermukaan() {
        super.luas = 6 * sisi * sisi;
    }

    public void setVolume() {
        super.volume = sisi * sisi * sisi;
    }

}
