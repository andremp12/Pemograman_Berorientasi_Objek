/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_4;

/**
 *
 * @author user
 */
public class Latihan_3 {
    public static void main(String[] args){
        int num1=10;
        int num2=23;
        int num3=5;
        
        int max;
        
        max=(num2>num1)?num2:num1;
        max=(num2>num3)?num2:num3;
        
        System.out.println("Nilai tertinggi : " +max);
    }
}
