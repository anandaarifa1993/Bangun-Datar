/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance_BangunDatar;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Menghitung luas dan keliling bangun datar");
         System.out.println("==================================================");
        
        
        BangunDatar bangunDatar = new BangunDatar();
        
        
        Persegi persegi = new Persegi();
        persegi.sisi = 5;
        
       
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 29;
        
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 5;
        persegiPanjang.lebar = 2;
        
        
        Segitiga Segitiga = new Segitiga();
        Segitiga.alas = 19;
        Segitiga.tinggi = 7;
        
        
        
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        System.out.println();
        
        lingkaran.luas();
        lingkaran.keliling();
        System.out.println();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        System.out.println();
        
        Segitiga.luas();
        System.out.println();
        
    }
}