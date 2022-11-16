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

import javax.swing.JOptionPane;
public class ContohJOption {
    public static void main(String[] args){
        String name,msg1,msg2;
        int nilai;
        
        name=JOptionPane.showInputDialog("Masukkan Nama");
        nilai=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai"));
             
        msg1="Hello " +name+ "!";
        
        if(nilai>90){
            msg2="Excellent";
        }
        else if(nilai>70){
            msg2="Good job";
        }
        else{
            msg2="Good";
        }
        
        JOptionPane.showMessageDialog(null,msg1);
        JOptionPane.showMessageDialog(null,msg2);
    }
}
