/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PerhitunganBangunRuang;

/**
 *
 * @author NaufalRafif
 */
public class BangunRuangMain {
    public static void main(String[] args) {
        int sisi = 4;
        BangunRuang kubus = new BangunRuang();
        System.out.println("Volume Kubus\t\t: " + kubus.Volume(sisi)+ "cm3");
        System.out.println("Luas Permukaan Kubus\t: " + kubus.Luas_Permukaan(sisi)+ "cm2");
        double panjang = 5.0;
        double lebar = 3.5;
        double tinggi = 10.0;
        BangunRuang balok = new BangunRuang();
        System.out.println("Volume Balok\t\t: " + balok.Volume(sisi)+ "cm3");
        System.out.println("Luas Permukaan Balok\t: " + balok.Luas_Permukaan(panjang, lebar, tinggi)+ "cm2");
    }
}
