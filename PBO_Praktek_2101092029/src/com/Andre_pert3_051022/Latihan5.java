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
import javax.swing.JOptionPane;
public class Latihan5 {
    public static void main(String[] args){
        String word1,word2,word3,msg;
        
        word1=JOptionPane.showInputDialog("Word 1");
        word2=JOptionPane.showInputDialog("Word 2");
        word3=JOptionPane.showInputDialog("Word 3");
        
        msg=word1+" "+word2+" "+word3;
        
        JOptionPane.showMessageDialog(null, msg);
    }
}
