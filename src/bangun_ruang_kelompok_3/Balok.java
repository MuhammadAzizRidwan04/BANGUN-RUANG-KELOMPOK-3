/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang_kelompok_3;

/**
 *
 * @author HP 14s
 */
public class Balok {
    double panjang, lebar, tinggi, luas , volume;

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

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public  void setLuasPermukaan() {
        this.luas = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
    public double getLuasPermukaan(){
        return luas;
    }

    public void setVolume() {
        this.volume = panjang * lebar * tinggi;
    }
    public double getVolume(){
        return volume;
    }
    
}

