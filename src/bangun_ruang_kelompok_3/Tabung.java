/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_ruang_kelompok_3;

/**
 *
 * @author DELL
 */
public class Tabung {
    
    double jari_jari,tinggi;
    
    public void setJari_jari (double jari_jari){
        this.jari_jari = jari_jari;
    }
    public double getJari_jari(){
        return jari_jari;
    }
    public void setTinggi (double tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double getLuasPermukaan(){
      return  2 * Math.PI * jari_jari * (jari_jari + tinggi);
    }
    public double getVolume(){
        return Math.PI * Math.pow(jari_jari, 2)* tinggi;
    }
    
}
