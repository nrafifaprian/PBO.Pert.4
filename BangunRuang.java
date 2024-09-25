/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PerhitunganBangunRuang;

/**
 *
 * @author NaufalRafif
 */
public class BangunRuang {
    public double Volume(double panjang, double lebar, double tinggi){
        return panjang*lebar*tinggi;
    }
    public int Volume(int sisi){
        return sisi*sisi*sisi;
    }
    public double Luas_Permukaan(double panjang, double lebar, double tinggi){
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
    public int Luas_Permukaan(int sisi){
        return 6*sisi*sisi;
    }
}
