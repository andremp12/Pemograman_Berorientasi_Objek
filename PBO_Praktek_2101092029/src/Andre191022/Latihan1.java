/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Andre191022;

/**
 *
 * @author user
 */

import java.io.*;
public class Latihan1 {
    public static void main(String[] args){
        BufferedReader gradeIn = new BufferedReader(new InputStreamReader(System.in));
        double grade=0;
        
        try{
            System.out.print("Masukkan grade : ");
            grade=Integer.parseInt(gradeIn.readLine());
        }
        catch(IOException e){
            System.out.println("Error!");
        }
        
        if(grade>90){
            System.out.println("Excellent");
        }
        else if(grade<=90 && grade>=80){
            System.out.println("Good Job");
        }
        else if(grade<80 && grade>=60){
            System.out.println("Study harder!");
        }
        else{
            System.out.println("Sorry, you failed");
        }
    }
    
}
