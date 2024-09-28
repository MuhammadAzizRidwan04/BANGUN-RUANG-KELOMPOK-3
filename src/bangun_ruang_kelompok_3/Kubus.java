/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang_kelompok_3;

/**
 *
 * @author ASUS
 */
public class Kubus {

    double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public double getLuasPermukaan() {
        return 6 * sisi * sisi;
    }

    public double getVolume() {
        return sisi * sisi * sisi;
    }
}
