/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance_BangunDatar;

/**
 *
 * @author User
 */
public class Segitiga extends BangunDatar {
    
    float alas;
    float tinggi;

    @Override
    float luas() {
        float luas =(float) 0.5 * (alas * tinggi);
        System.out.println("Luas Segitiga: " + luas + "cm2");
        return luas;
    }   
    

    
}
