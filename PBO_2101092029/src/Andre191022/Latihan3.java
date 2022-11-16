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
public class Latihan3 {
    public static void main(String[] args){
        int i;
        String names[]={"Beah","Bianca","Lance","Belle"
                        ,"Nico","yza","Gem"};
        String searchName="Yza";
        boolean found=false;
        
        for(i=0;i<names.length;i++){
            if(names[i].equals(searchName)){
                found=true;
                break;
            }
        }
        
        if(found=true){
            System.out.println(searchName+ " Found!");
        }
        else{
            System.out.println(searchName+ " Not Found!");
        }
    }
}
