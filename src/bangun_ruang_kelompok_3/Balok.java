/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang_kelompok_3;

/**
 *
 * @author HP 14s
 */
public class Balok extends Bangun_ruang {

    double panjang, lebar, luas, volume;
    //

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLuasPermukaan() {
        super.luas = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    public void setVolume() {
        super.volume = panjang * lebar * tinggi;
    }

}
