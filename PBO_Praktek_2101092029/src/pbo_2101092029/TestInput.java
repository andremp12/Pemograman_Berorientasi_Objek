/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_2101092029;

/**
 *
 * @author user
 */
 import javax.swing.JOptionPane;

public class TestInput {
 public static void main( String[] args ){
 String name,msg;
 
 name = JOptionPane.showInputDialog("Please enter your name");

 msg = "Hello " + name + "!";

 JOptionPane.showMessageDialog(null, msg);

 }
} 

