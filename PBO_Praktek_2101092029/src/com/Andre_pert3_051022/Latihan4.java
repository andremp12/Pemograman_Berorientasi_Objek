/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Andre_pert3_051022;

/**
 *
 * @author user
 */

import java.io.*;
public class Latihan4 {
    public static void main(String[] args){
        BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
        
        String word1,word2,word3;
        word1="";
        word2="";
        word3="";
        
        try{
           System.out.print("Word 1 : ");
           word1=dataIn.readLine();
           System.out.print("Word 2 : ");
           word2=dataIn.readLine();
           System.out.print("Word 3 : ");
           word3=dataIn.readLine();
        }
        catch(IOException e){
           System.out.println("Error!");
        }
        System.out.println(word1+" "+word2+" "+word3);
        }
    }

